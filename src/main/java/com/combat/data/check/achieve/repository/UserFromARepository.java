/*
 * xsyx Inc. 湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2021. All Rights Reserved.
 */
package com.combat.data.check.achieve.repository;

import com.combat.data.check.achieve.CheckCondition;

import java.util.Collection;

/**
 * 数据源A的用户数据资源服务
 *
 * @author lirh
 * @date 2021/03/28 17:59
 */
public class UserFromARepository implements UserRepository{
    /**
     * 获取数据源大小
     *
     * @param checkCondition
     * @return
     */
    @Override
    public Integer getSize(CheckCondition checkCondition) {
        return null;
    }

    /**
     * 获取数据集合
     *
     * @param checkCondition
     * @return
     */
    @Override
    public Collection getCollection(CheckCondition checkCondition) {
        return null;
    }
}
