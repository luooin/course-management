package cn.ca.test.mapper;

import cn.ca.test.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * StudentMapper接口
 * 继承自MyBatis-Plus的BaseMapper接口，提供了Student实体类的CRUD操作
 */

public interface StudentMapper extends BaseMapper<Student> {

}
// 由于StudentMapper继承了BaseMapper<Student>，所以这里不需要再定义任何方法
// BaseMapper已经为Student实体类提供了如selectById, insert, updateById, deleteById等方法