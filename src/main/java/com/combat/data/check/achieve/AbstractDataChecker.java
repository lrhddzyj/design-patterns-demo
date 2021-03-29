/*
 * xsyx Inc. 湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2021. All Rights Reserved.
 */
package com.combat.data.check.achieve;

/**
 * 抽象的数据检查器
 *
 * @author lirh
 * @date 2021/03/28 17:11
 */
public abstract class AbstractDataChecker<T, U> implements DataCheckService {

    /**
     * 抽象的比较器 桥接模式 (AbstractDataChecker 和 ComparatorFunction 都可以独立发展)
     *
     */
    protected ComparatorFunction<T, U> comparatorFunction;

    public AbstractDataChecker(ComparatorFunction<T, U> comparatorFunction) {
        this.comparatorFunction = comparatorFunction;
    }

    /**
     * 责任链模式
     */
    private AbstractDataChecker nextDataChecker;

    public void setNextDataChecker(AbstractDataChecker nextDataChecker) {
        this.nextDataChecker = nextDataChecker;
    }


    public AbstractDataChecker getNextDataChecker() {
        return this.nextDataChecker;
    }
}
