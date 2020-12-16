package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "用户信息" ,description= "返回响应数据")
public class User
{
    @ApiModelProperty(name = "success",value = "是否成功", required=true)
    public boolean success = true;
    @ApiModelProperty(value = "用户ID" ,dataType = "int", notes = "用户ID",required=true)
    public Integer userID;
    @ApiModelProperty(value = "用户账号" ,dataType = "string", notes = "用户账号",required=true)
    public String userName;
    @ApiModelProperty(value = "用户年龄", dataType = "string",notes = "用户年龄",required=true)
    public String userAge;
    @ApiModelProperty(value = "用户邮箱", dataType = "string", notes = "用户邮箱",required=true)
    public String userMail;

    public int getId() {
        return this.userID;
    }

}
