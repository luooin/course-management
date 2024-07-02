package cn.ca.test.serviceimpl;

import cn.ca.test.mapper.StudentMapper;
import cn.ca.test.entity.Student;
import cn.ca.test.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Slf4j      // 使用Lombok的Slf4j注解来自动添加日志功能
@Service      // 使用Spring的Service注解来声明这是一个服务类
@Transactional      // 使用Spring的事务注解来声明这个服务类中的所有方法都在事务上下文中执行
public class IStudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

    @Autowired      // 使用Spring的Autowired注解来自动装配StudentMapper接口的实现
    private StudentMapper studentMapper;
}