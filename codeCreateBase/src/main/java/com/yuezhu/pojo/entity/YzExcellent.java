package com.yuezhu.pojo.entity;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
@Data
@ApiModel(value ="优秀的房源")
public class YzExcellent {
    @ApiModelProperty(value ="")
    private Integer id;

    @ApiModelProperty(value ="房源名称")
    private String name;

    @ApiModelProperty(value ="房源的url")
    private String houseUrl;

    @ApiModelProperty(value ="房源的id")
    private Integer houseId;

    @ApiModelProperty(value ="房源的分类编码--字典")
    private Byte houseType;

    @ApiModelProperty(value ="房源的核心标题")
    private String excellentTitle;

    @ApiModelProperty(value ="")
    private String backup1;

    @ApiModelProperty(value ="")
    private String backup2;

    @ApiModelProperty(value ="")
    private String backup3;

    @ApiModelProperty(value ="")
    private String backup4;

    @ApiModelProperty(value ="")
    private String backup5;

    @ApiModelProperty(value ="")
    private String backup6;

    @ApiModelProperty(value ="")
    private Date addTime;

    @ApiModelProperty(value ="")
    private Date updateTime;
}