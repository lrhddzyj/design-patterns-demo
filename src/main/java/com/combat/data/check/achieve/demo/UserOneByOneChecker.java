/*
 * xsyx Inc. 湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2021. All Rights Reserved.
 */
package com.combat.data.check.achieve.demo;

import com.combat.data.check.achieve.AbstractOneByOneChecker;
import com.combat.data.check.achieve.OneByOneCheckCondition;
import com.combat.data.check.achieve.repository.UserFromARepository;
import com.combat.data.check.achieve.repository.UserFromBRepository;

import java.util.Collection;

/**
 * @author lirh
 * @date 2021/03/28 18:00
 */
public class UserOneByOneChecker extends AbstractOneByOneChecker {

    private UserFromARepository userFromARepository;
    private UserFromBRepository userFromBRepository;

    public UserOneByOneChecker(UserFromARepository userFromARepository, UserFromBRepository userFromBRepository) {
        this.userFromARepository = userFromARepository;
        this.userFromBRepository = userFromBRepository;
    }

    /**
     * 从数据源A获取比较集合
     *
     * @param condition
     * @return
     */
    @Override
    public Collection getComparatorSourceCollectionFromA(OneByOneCheckCondition condition) {
        return userFromARepository.getCollection(condition);
    }

    /**
     * 从数据源B获取比较集合
     *
     * @param condition
     * @return
     */
    @Override
    public Collection getComparatorSourceCollectionFromB(OneByOneCheckCondition condition) {
        return userFromBRepository.getCollection(condition);
    }
}
