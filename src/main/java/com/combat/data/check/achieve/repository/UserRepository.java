/*
 * xsyx Inc. 湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2021. All Rights Reserved.
 */
package com.combat.data.check.achieve.repository;

import com.combat.data.check.achieve.CheckCondition;

import java.util.Collection;

/**
 * 用户数据获取
 *
 * @author lirh
 * @date 2021/03/28 17:57
 */
public interface UserRepository<T> {

    /**
     * 获取数据源大小
     * @param checkCondition
     * @return
     */
    Integer getSize(CheckCondition checkCondition);


    /**
     * 获取数据集合
     * @param checkCondition
     * @return
     */
    Collection<T> getCollection(CheckCondition checkCondition);
}
