/*
 * xsyx Inc. 湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2021. All Rights Reserved.
 */
package com.combat.data.check.achieve;

import org.apache.commons.collections4.IterableUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Collection;
import java.util.Objects;

/**
 * one by one checker
 *
 * @author lirh
 * @date 2021/03/28 17:16
 */
public abstract class AbstractOneByOneChecker<T extends Signature,U extends Signature> extends AbstractDataChecker<Collection<T>, Collection<U>> {

    public AbstractOneByOneChecker() {
        super(new DataOneByOneComparatorFunction());
    }

    /**
     * 数据检查
     * 模板方法模式
     *
     * @param checkCondition 检测条件
     * @return 数据检查结果
     */
    @Override
    public CheckResult check(CheckCondition checkCondition) {
        OneByOneCheckCondition oneByOneCheckCondition = new OneByOneCheckCondition() {
            @Override
            public String getDepartmentId() {
                return checkCondition.getDepartmentId();
            }
        };
        final Collection<T> comparatorSourceCollectionFromA =
                this.getComparatorSourceCollectionFromA(oneByOneCheckCondition);
        final Collection<U> comparatorSourceCollectionFromB =
                this.getComparatorSourceCollectionFromB(oneByOneCheckCondition);
        final Boolean comparatorResult = comparatorFunction.apply(comparatorSourceCollectionFromA, comparatorSourceCollectionFromB);
        if (comparatorResult) {
            if (Objects.nonNull(super.getNextDataChecker())) {
                return super.getNextDataChecker().check(checkCondition);
            }
            return CheckResult.success();
        }
        return CheckResult.fail("one by one 比较失败");
    }


    /**
     * 从数据源A获取比较集合
     *
     * @param condition
     * @return
     */
    public abstract Collection<T> getComparatorSourceCollectionFromA(OneByOneCheckCondition condition);

    /**
     * 从数据源B获取比较集合
     *
     * @param condition
     * @return
     */
    public abstract Collection<U> getComparatorSourceCollectionFromB(OneByOneCheckCondition condition);


    /**
     * OneByOne 比较器（桥接模式的独立实现）
     */
    public static class DataOneByOneComparatorFunction<T extends Signature,U extends Signature> implements ComparatorFunction<Collection<T>, Collection<U>> {

        /**
         * 比较
         *
         * @param ts 比较对象
         * @param us 比较对象
         * @return 比较结果
         */
        @Override
        public Boolean apply(Collection<T> ts, Collection<U> us) {
            for (int i = 0; i < ts.size(); i++) {
                final T t = IterableUtils.get(ts, i);
                final U u = IterableUtils.get(us, i);
                if (!StringUtils.equals(t.getSignature(), u.getSignature())) {
                    return false;
                }
            }
            return true;
        }
    }
}
