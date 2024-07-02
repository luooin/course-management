package cn.ca.data.serviceimpl;

import cn.ca.data.dao.mapper.RoleMapper;
import cn.ca.data.entity.Role;
import cn.ca.data.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class IRoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
