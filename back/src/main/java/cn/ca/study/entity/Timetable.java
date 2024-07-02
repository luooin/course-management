package cn.ca.study.entity;

import cn.ca.basics.baseClass.ZwzBaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 *
 */
@Data
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "a_timetable")
@TableName("a_timetable")
@ApiModel(value = "课表")
public class Timetable extends ZwzBaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "课程ID")
    private String curriculumId;

    @ApiModelProperty(value = "课程名称")
    private String curriculumName;

    @ApiModelProperty(value = "学生ID")
    private String userId;

    @ApiModelProperty(value = "学生姓名")
    private String userName;

    @ApiModelProperty(value = "上课日期")
    private String date;

    @ApiModelProperty(value = "分配人")
    private String workUser;
}