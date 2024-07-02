package cn.ca.test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.ca.test.entity.Student;

/**
 * 学生服务接口
 *
 * 继承自MyBatis-Plus的IService接口，用于定义与Student实体类相关的业务操作
 * IService接口已经为Student实体类提供了丰富的CRUD方法，如查询、插入、更新、删除等
 */

public interface IStudentService extends IService<Student> {

}