package cn.ca.data.controller;

import cn.ca.basics.log.LogType;
import cn.ca.basics.log.SystemLog;
import cn.ca.basics.utils.PageUtil;
import cn.ca.basics.utils.ResultUtil;
import cn.ca.basics.baseVo.PageVo;
import cn.ca.basics.baseVo.Result;
import cn.ca.data.entity.Log;
import cn.ca.data.service.ILogService;
import cn.ca.data.utils.ZwzNullUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

/**
 *
 */
@RestController
@Api(tags = "日志管理接口")
@RequestMapping("/zwz/log")
@Transactional
public class LogController{

    @Autowired
    private ILogService iLogService;

    @SystemLog(about = "查询日志", type = LogType.DATA_CENTER,doType = "LOG-01")
    @RequestMapping(value = "/getAllByPage", method = RequestMethod.GET)
    @ApiOperation(value = "查询日志")
    public Result<Object> getAllByPage(@ModelAttribute Log log, @ModelAttribute PageVo page){
        QueryWrapper<Log> qw = new QueryWrapper<>();
        if(!ZwzNullUtils.isNull(log.getName())) {
            qw.like("name",log.getName());
        }
        if(log.getLogType() != null) {
            qw.eq("log_type",log.getLogType());
        }
        if(!ZwzNullUtils.isNull(log.getUsername())) {
            qw.like("username",log.getUsername());
        }
        if(!ZwzNullUtils.isNull(log.getIp())) {
            qw.like("ip",log.getIp());
        }
        if(!ZwzNullUtils.isNull(log.getStartDate())) {
            qw.ge("create_time",log.getStartDate());
            qw.le("create_time",log.getEndDate());
        }
        return ResultUtil.data(iLogService.page(PageUtil.initMpPage(page),qw));
    }
}
