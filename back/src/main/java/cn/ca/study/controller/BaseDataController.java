package cn.ca.study.controller;

import cn.ca.basics.baseVo.PageVo;
import cn.ca.basics.baseVo.Result;
import cn.ca.basics.utils.PageUtil;
import cn.ca.basics.utils.ResultUtil;
import cn.ca.data.utils.ZwzNullUtils;
import cn.ca.study.entity.BaseData;
import cn.ca.study.service.IBaseDataService;
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
@Api(tags = "基本信息管理接口")
@RequestMapping("/zwz/baseData")
@Transactional
public class BaseDataController {

    @Autowired
    private IBaseDataService iBaseDataService;

    @RequestMapping(value = "/getOne", method = RequestMethod.GET)
    @ApiOperation(value = "查询单条基本信息")
    public Result<BaseData> get(@RequestParam String id){
        return new ResultUtil<BaseData>().setData(iBaseDataService.getById(id));
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @ApiOperation(value = "查询全部基本信息个数")
    public Result<Long> getCount(){
        return new ResultUtil<Long>().setData(iBaseDataService.count());
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ApiOperation(value = "查询全部基本信息")
    public Result<List<BaseData>> getAll(){
        return new ResultUtil<List<BaseData>>().setData(iBaseDataService.list());
    }

    @RequestMapping(value = "/getByPage", method = RequestMethod.GET)
    @ApiOperation(value = "查询基本信息")
    public Result<IPage<BaseData>> getByPage(@ModelAttribute BaseData baseData ,@ModelAttribute PageVo page){
        QueryWrapper<BaseData> qw = new QueryWrapper<>();
        if(!ZwzNullUtils.isNull(baseData.getTitle())) {
            qw.like("title",baseData.getTitle());
        }
        if(!ZwzNullUtils.isNull(baseData.getContent())) {
            qw.like("content",baseData.getContent());
        }
        IPage<BaseData> data = iBaseDataService.page(PageUtil.initMpPage(page),qw);
        return new ResultUtil<IPage<BaseData>>().setData(data);
    }

    @RequestMapping(value = "/insertOrUpdate", method = RequestMethod.POST)
    @ApiOperation(value = "增改基本信息")
    public Result<BaseData> saveOrUpdate(BaseData baseData){
        if(iBaseDataService.saveOrUpdate(baseData)){
            return new ResultUtil<BaseData>().setData(baseData);
        }
        return ResultUtil.error();
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ApiOperation(value = "新增基本信息")
    public Result<BaseData> insert(BaseData baseData){
        iBaseDataService.saveOrUpdate(baseData);
        return new ResultUtil<BaseData>().setData(baseData);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ApiOperation(value = "编辑基本信息")
    public Result<BaseData> update(BaseData baseData){
        iBaseDataService.saveOrUpdate(baseData);
        return new ResultUtil<BaseData>().setData(baseData);
    }

    @RequestMapping(value = "/delByIds", method = RequestMethod.POST)
    @ApiOperation(value = "删除基本信息")
    public Result<Object> delByIds(@RequestParam String[] ids){
        for(String id : ids){
            iBaseDataService.removeById(id);
        }
        return ResultUtil.success();
    }
}
