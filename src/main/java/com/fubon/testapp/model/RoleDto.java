package com.fubon.testapp.model;

import io.swagger.annotations.ApiModel;
import lombok.Data;


@Data
@ApiModel(description = "角色資料")
public class RoleDto {

    private String roleId;
    private String name;

}
