/*
 * xsyx Inc. 湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2021. All Rights Reserved.
 */
package com.combat.data.check.achieve;

import java.util.Objects;

/**
 * 责任链
 *
 * @author lirh
 * @date 2021/03/29 17:03
 */
public class CheckerChain implements DataCheckService {

    private AbstractDataChecker head;
    private AbstractDataChecker tail;

    public void addChecker(AbstractDataChecker checker) {
        if (Objects.isNull(head)) {
            head = checker;
            tail = checker;
            return;
        }
        tail.setNextDataChecker(checker);
        tail = checker;
    }

    /**
     * 数据检查
     *
     * @param checkCondition 检测条件
     * @return 数据检查结果
     */
    @Override
    public CheckResult check(CheckCondition checkCondition) {
        return head.check(checkCondition);
    }






}
