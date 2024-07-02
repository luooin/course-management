package cn.ca.data.serviceimpl;

import cn.ca.data.dao.mapper.LogMapper;
import cn.ca.data.entity.Log;
import cn.ca.data.service.ILogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class ILogServiceImpl extends ServiceImpl<LogMapper, Log> implements ILogService {

}
