package cn.ca.study.controller;

import cn.hutool.core.date.DateUtil;
import cn.ca.basics.utils.PageUtil;
import cn.ca.basics.utils.ResultUtil;
import cn.ca.basics.baseVo.PageVo;
import cn.ca.basics.baseVo.Result;
import cn.ca.basics.utils.SecurityUtil;
import cn.ca.data.entity.User;
import cn.ca.data.utils.ZwzNullUtils;
import cn.ca.study.entity.Appraise;
import cn.ca.study.entity.Curriculum;
import cn.ca.study.service.IAppraiseService;
import cn.ca.study.service.ICurriculumService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 */
@Slf4j
@RestController
@Api(tags = "课程评价管理接口")
@RequestMapping("/zwz/appraise")
@Transactional
public class AppraiseController {

    @Autowired
    private IAppraiseService iAppraiseService;
    @Autowired
    private ICurriculumService iCurriculumService;

    @Autowired
    private SecurityUtil securityUtil;

    @RequestMapping(value = "/addOne", method = RequestMethod.GET)
    @ApiOperation(value = "添加课程评价")
    public Result<Object> addOne(@RequestParam String id,@RequestParam String content){
        Curriculum curriculum = iCurriculumService.getById(id);
        if(curriculum == null) {
            return ResultUtil.error("课程不存在");
        }
        User currUser = securityUtil.getCurrUser();
        Appraise a = new Appraise();
        a.setCurriculumId(curriculum.getId());
        a.setCurriculumName(curriculum.getTitle());
        a.setUserId(currUser.getId());
        a.setUserName(currUser.getNickname());
        a.setContent(content);
        a.setTime(DateUtil.now());
        iAppraiseService.saveOrUpdate(a);
        return ResultUtil.success();
    }

    @RequestMapping(value = "/getOne", method = RequestMethod.GET)
    @ApiOperation(value = "查询单条课程评价")
    public Result<Appraise> get(@RequestParam String id){
        return new ResultUtil<Appraise>().setData(iAppraiseService.getById(id));
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @ApiOperation(value = "查询全部课程评价个数")
    public Result<Long> getCount(){
        return new ResultUtil<Long>().setData(iAppraiseService.count());
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ApiOperation(value = "查询全部课程评价")
    public Result<List<Appraise>> getAll(){
        return new ResultUtil<List<Appraise>>().setData(iAppraiseService.list());
    }

    @RequestMapping(value = "/getByPage", method = RequestMethod.GET)
    @ApiOperation(value = "查询课程评价")
    public Result<IPage<Appraise>> getByPage(@ModelAttribute Appraise appraise ,@ModelAttribute PageVo page){
        QueryWrapper<Appraise> qw = new QueryWrapper<>();
        if(!ZwzNullUtils.isNull(appraise.getCurriculumName())) {
            qw.like("curriculum_name",appraise.getCurriculumName());
        }
        if(!ZwzNullUtils.isNull(appraise.getUserName())) {
            qw.like("user_name",appraise.getUserName());
        }
        if(!ZwzNullUtils.isNull(appraise.getContent())) {
            qw.like("content",appraise.getContent());
        }
        IPage<Appraise> data = iAppraiseService.page(PageUtil.initMpPage(page),qw);
        return new ResultUtil<IPage<Appraise>>().setData(data);
    }

    @RequestMapping(value = "/insertOrUpdate", method = RequestMethod.POST)
    @ApiOperation(value = "增改课程评价")
    public Result<Appraise> saveOrUpdate(Appraise appraise){
        if(iAppraiseService.saveOrUpdate(appraise)){
            return new ResultUtil<Appraise>().setData(appraise);
        }
        return ResultUtil.error();
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ApiOperation(value = "新增课程评价")
    public Result<Appraise> insert(Appraise appraise){
        iAppraiseService.saveOrUpdate(appraise);
        return new ResultUtil<Appraise>().setData(appraise);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ApiOperation(value = "编辑课程评价")
    public Result<Appraise> update(Appraise appraise){
        iAppraiseService.saveOrUpdate(appraise);
        return new ResultUtil<Appraise>().setData(appraise);
    }

    @RequestMapping(value = "/delByIds", method = RequestMethod.POST)
    @ApiOperation(value = "删除课程评价")
    public Result<Object> delByIds(@RequestParam String[] ids){
        for(String id : ids){
            iAppraiseService.removeById(id);
        }
        return ResultUtil.success();
    }
}
