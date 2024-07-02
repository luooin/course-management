package cn.ca.study.controller;

import cn.ca.basics.baseVo.PageVo;
import cn.ca.basics.baseVo.Result;
import cn.ca.basics.utils.PageUtil;
import cn.ca.basics.utils.ResultUtil;
import cn.ca.data.utils.ZwzNullUtils;
import cn.ca.study.entity.CourseResources;
import cn.ca.study.entity.Curriculum;
import cn.ca.study.service.ICourseResourcesService;
import cn.ca.study.service.ICurriculumService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 */
@Slf4j
@RestController
@Api(tags = "资源管理接口")
@RequestMapping("/zwz/courseResources")
@Transactional
public class CourseResourcesController {

    @Autowired
    private ICourseResourcesService iCourseResourcesService;

    @Autowired
    private ICurriculumService iCurriculumService;

    @RequestMapping(value = "/getOne", method = RequestMethod.GET)
    @ApiOperation(value = "查询单条资源")
    public Result<CourseResources> get(@RequestParam String id){
        return new ResultUtil<CourseResources>().setData(iCourseResourcesService.getById(id));
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @ApiOperation(value = "查询全部资源个数")
    public Result<Long> getCount(){
        return new ResultUtil<Long>().setData(iCourseResourcesService.count());
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ApiOperation(value = "查询全部资源")
    public Result<List<CourseResources>> getAll(@RequestParam String curriculumId){
        QueryWrapper<CourseResources> qw = new QueryWrapper<>();
        qw.eq("curriculum_id",curriculumId);
        return new ResultUtil<List<CourseResources>>().setData(iCourseResourcesService.list(qw));
    }

    @RequestMapping(value = "/getByPage", method = RequestMethod.GET)
    @ApiOperation(value = "查询资源")
    public Result<IPage<CourseResources>> getByPage(@ModelAttribute CourseResources courseResources ,@ModelAttribute PageVo page){
        QueryWrapper<CourseResources> qw = new QueryWrapper<>();
        if(!ZwzNullUtils.isNull(courseResources.getCurriculumName())) {
            qw.like("curriculum_name",courseResources.getCurriculumName());
        }
        if(!ZwzNullUtils.isNull(courseResources.getTitle())) {
            qw.like("title",courseResources.getTitle());
        }
        IPage<CourseResources> data = iCourseResourcesService.page(PageUtil.initMpPage(page),qw);
        return new ResultUtil<IPage<CourseResources>>().setData(data);
    }

    @RequestMapping(value = "/insertOrUpdate", method = RequestMethod.POST)
    @ApiOperation(value = "增改资源")
    public Result<CourseResources> saveOrUpdate(CourseResources courseResources){
        if(iCourseResourcesService.saveOrUpdate(courseResources)){
            return new ResultUtil<CourseResources>().setData(courseResources);
        }
        return ResultUtil.error();
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ApiOperation(value = "新增资源")
    public Result<CourseResources> insert(CourseResources courseResources){
        Curriculum c = iCurriculumService.getById(courseResources.getCurriculumId());
        if(c == null) {
            return ResultUtil.error("课程不存在");
        }
        courseResources.setCurriculumName(c.getTitle());
        iCourseResourcesService.saveOrUpdate(courseResources);
        return new ResultUtil<CourseResources>().setData(courseResources);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ApiOperation(value = "编辑资源")
    public Result<CourseResources> update(CourseResources courseResources){
        Curriculum c = iCurriculumService.getById(courseResources.getCurriculumId());
        if(c == null) {
            return ResultUtil.error("课程不存在");
        }
        courseResources.setCurriculumName(c.getTitle());
        iCourseResourcesService.saveOrUpdate(courseResources);
        return new ResultUtil<CourseResources>().setData(courseResources);
    }

    @RequestMapping(value = "/delByIds", method = RequestMethod.POST)
    @ApiOperation(value = "删除资源")
    public Result<Object> delByIds(@RequestParam String[] ids){
        for(String id : ids){
            iCourseResourcesService.removeById(id);
        }
        return ResultUtil.success();
    }
}
