package cn.ca.test.entity;

import cn.ca.basics.baseClass.ZwzBaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.math.BigDecimal;

/**
 * 学生实体类
 * 用于映射数据库中的a_student表
 */

@Data      // Lombok注解，自动生成getter、setter、equals、hashCode、toString等方法
@Entity      // JPA注解，声明这是一个实体类，将映射到数据库中的表
@DynamicInsert      // JPA注解，表示在插入数据时，只插入非空字段，提高性能
@DynamicUpdate      // JPA注解，表示在更新数据时，只更新有变化的字段，提高性能
@Table(name = "a_student")      // JPA注解，指定实体类映射的数据库表名
@TableName("a_student")      // MyBatis-Plus注解
@ApiModel(value = "学生")      // Swagger注解，用于API文档生成，描述这个模型类的价值为“学生”
public class Student extends ZwzBaseEntity {
    // 序列化版本ID，用于对象的序列化与反序列化
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "性别")
    private String sex;

    @ApiModelProperty(value = "年龄")
    private BigDecimal age;

    @ApiModelProperty(value = "学号")
    private String number;

    @ApiModelProperty(value = "学校")
    private String school;
}