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
@Table(name = "a_course_resources")
@TableName("a_course_resources")
@ApiModel(value = "资源")
public class CourseResources extends ZwzBaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "课程ID")
    private String curriculumId;

    @ApiModelProperty(value = "课程名称")
    private String curriculumName;

    @ApiModelProperty(value = "资源名称")
    private String title;

    @ApiModelProperty(value = "文件")
    private String fileUrl;
}