/*
 * xsyx Inc. 湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2021. All Rights Reserved.
 */
package com.combat.data.check.achieve;

/**
 * 用户检查比较器
 *
 * @author lirh
 * @date 2021/03/28 17:22
 */
public class UserCheckCondition implements DataCheckService.CheckCondition {

    private String departmentId;

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }
}
