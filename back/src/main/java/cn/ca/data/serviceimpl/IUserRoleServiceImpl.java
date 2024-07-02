package cn.ca.data.serviceimpl;

import cn.ca.data.dao.mapper.UserRoleMapper;
import cn.ca.data.entity.UserRole;
import cn.ca.data.service.IUserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class IUserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

}
