/*
 * xsyx Inc. 湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2021. All Rights Reserved.
 */
package com.combat.data.check.achieve;

import java.util.Objects;

/**
 * @author lirh
 * @date 2021/03/28 17:16
 */
public abstract class AbstractDataSizeChecker extends AbstractDataChecker<Integer,Integer> {

    public AbstractDataSizeChecker() {
        super(new IntegerComparatorFunction());
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
        final Integer comparatorSourceT = this.getDataSizeFromA(checkCondition);
        Integer comparatorSourceU = this.getDataSizeFromB(checkCondition);
        final Boolean comparatorResult = comparatorFunction.apply(comparatorSourceT, comparatorSourceU);
        if (comparatorResult) {
            if (Objects.nonNull(super.getNextDataChecker())) {
                return super.getNextDataChecker().check(checkCondition);
            }
            return CheckResult.success();
        }
        return CheckResult.fail("size比较失败");
    }


    /**
     * 从数据源A获取size
     *
     * @param checkCondition
     * @return 返回size大小
     */
    public abstract Integer getDataSizeFromA(CheckCondition checkCondition);

    /**
     * 从数据源B获取size
     *
     * @param checkCondition
     * @return 返回size大小
     */
    public abstract Integer getDataSizeFromB(CheckCondition checkCondition);

    /**
     *  Integer比较器（桥接模式的独立实现）
     */
    public static class IntegerComparatorFunction implements ComparatorFunction<Integer,Integer> {


        /**
         * 比较
         *
         * @param fromA  比较对象
         * @param fromB 比较对象
         * @return 比较结果
         */
        @Override
        public Boolean apply(Integer fromA, Integer fromB) {
            return fromA.equals(fromB);
        }

    }
}
