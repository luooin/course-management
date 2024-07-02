package cn.ca.data.serviceimpl;

import cn.ca.data.dao.mapper.PermissionMapper;
import cn.ca.data.entity.Permission;
import cn.ca.data.service.IPermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class IPermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {

}
