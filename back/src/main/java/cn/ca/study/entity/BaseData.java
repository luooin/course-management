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
import java.math.BigDecimal;

/**
 *
 */
@Data
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "a_base_data")
@TableName("a_base_data")
@ApiModel(value = "基本信息")
public class BaseData extends ZwzBaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "信息标题")
    private String title;

    @ApiModelProperty(value = "信息内容")
    private String content;

    @ApiModelProperty(value = "排序值")
    private BigDecimal sortOrder;

    @ApiModelProperty(value = "备注")
    private String remark;
}