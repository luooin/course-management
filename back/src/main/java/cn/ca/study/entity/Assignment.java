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
@Table(name = "a_assignment")
@TableName("a_assignment")
@ApiModel(value = "课程作业")
public class Assignment extends ZwzBaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "课程ID")
    private String curriculumId;

    @ApiModelProperty(value = "课程名称")
    private String curriculumName;

    @ApiModelProperty(value = "作业名称")
    private String title;

    @ApiModelProperty(value = "作业附件")
    private String file1;

    @ApiModelProperty(value = "完成附件")
    private String file2;

    @ApiModelProperty(value = "学生ID")
    private String userId;

    @ApiModelProperty(value = "学生姓名")
    private String userName;
}