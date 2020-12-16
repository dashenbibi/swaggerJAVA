package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(value = "响应" ,description= "返回响应数据")
public class BaseResponse<T> {
    @ApiModelProperty(name = "statusCode",value = "状态码",notes="状态码描述", required=true)
    public int statusCode;
    @ApiModelProperty(name = "type",value = "接口类型" ,dataType = "String", notes = "接口类型", required=true)
    public String type;
    @ApiModelProperty(name = "result" , notes = "结果数据", required=true)
    public T result;
}
