package cn.ca.data.serviceimpl;

import cn.ca.data.dao.mapper.RolePermissionMapper;
import cn.ca.data.entity.RolePermission;
import cn.ca.data.service.IRolePermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class IRolePermissionServiceImpl extends ServiceImpl<RolePermissionMapper, RolePermission> implements IRolePermissionService {

}
