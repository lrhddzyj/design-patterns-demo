/*
 * xsyx Inc. 湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2021. All Rights Reserved.
 */
package com.combat.data.check.achieve.entity;

import com.combat.data.check.achieve.Signature;

/**
 * 来源DataSourceB的用户信息
 * （可能与DataSourceA的id不一样）
 *
 *
 * @author lirh
 * @date 2021/03/28 17:17
 */
public class UserFromDataSourceB implements Signature {

    private Long id;

    private String name;

    private String age;

    private String address;

    private String tel;

    private String departmentId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * 获取签名
     *
     * @return
     */
    @Override
    public String getSignature() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getName());
        stringBuilder.append(this.getDepartmentId());
        stringBuilder.append(this.getAge());
        stringBuilder.append(this.getTel());
        return stringBuilder.toString();
    }
}
