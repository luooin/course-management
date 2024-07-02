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
@Table(name = "a_curriculum")
@TableName("a_curriculum")
@ApiModel(value = "课程")
public class Curriculum extends ZwzBaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "课程标题")
    private String title;

    @ApiModelProperty(value = "课程介绍")
    private String content;

    @ApiModelProperty(value = "课程图片")
    private String image;

    @ApiModelProperty(value = "课程状态")
    private String status;
}