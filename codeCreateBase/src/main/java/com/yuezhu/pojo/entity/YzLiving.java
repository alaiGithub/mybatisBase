package com.yuezhu.pojo.entity;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
@Data
@ApiModel(value ="直播表")
public class YzLiving {
    @ApiModelProperty(value ="")
    private Integer id;

    @ApiModelProperty(value ="")
    private String name;

    @ApiModelProperty(value ="分类--备用")
    private Byte type;

    @ApiModelProperty(value ="背景图片")
    private String backgroundUrl;

    @ApiModelProperty(value ="直播的url")
    private String livingUrl;

    @ApiModelProperty(value ="区县编码")
    private String districtCode;

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
    private String bakup6;

    @ApiModelProperty(value ="")
    private Date addTime;

    @ApiModelProperty(value ="")
    private Date updateTime;
}