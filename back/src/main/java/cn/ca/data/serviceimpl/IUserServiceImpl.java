package cn.ca.data.serviceimpl;

import cn.ca.data.dao.mapper.UserMapper;
import cn.ca.data.entity.User;
import cn.ca.data.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class IUserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
