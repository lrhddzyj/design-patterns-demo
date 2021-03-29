/*
 * xsyx Inc. 湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2021. All Rights Reserved.
 */
package com.combat.data.check.achieve.demo;

import com.combat.data.check.achieve.AbstractDataSizeChecker;
import com.combat.data.check.achieve.CheckCondition;
import com.combat.data.check.achieve.repository.UserFromARepository;
import com.combat.data.check.achieve.repository.UserFromBRepository;

/**
 * @author lirh
 * @date 2021/03/28 17:56
 */
public class UserSizeChecker extends AbstractDataSizeChecker {

    private UserFromARepository userFromARepository;
    private UserFromBRepository userFromBRepository;

    public UserSizeChecker(UserFromARepository userFromARepository, UserFromBRepository userFromBRepository) {
        this.userFromARepository = userFromARepository;
        this.userFromBRepository = userFromBRepository;
    }

    /**
     * 从数据源A获取size
     *
     * @param checkCondition
     * @return 返回size大小
     */
    @Override
    public Integer getDataSizeFromA(CheckCondition checkCondition) {
        return userFromARepository.getSize(checkCondition);
    }

    /**
     * 从数据源B获取size
     *
     * @param checkCondition
     * @return 返回size大小
     */
    @Override
    public Integer getDataSizeFromB(CheckCondition checkCondition) {
        return userFromBRepository.getSize(checkCondition);
    }
}
