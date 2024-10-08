package com.henry.springbootinit.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 图表信息表
 * @TableName chart
 */
@TableName(value ="chart")
@Data
public class Chart implements Serializable {
    // 图表id
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    // 分析数据
    private String goal;

    // 图表名称
    private String chartName;

    // 图表数据
    private String chartData;

    // 图表类型
    private String chartType;

    // 生成图表
    private String genChart;

    // 生成结论
    private String genResult;

    // 用户id
    private Long userId;

    // 创建时间
    private Date createTime;

    // 更新时间
    private Date updateTime;

    // 是否删除
    @TableLogic
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}