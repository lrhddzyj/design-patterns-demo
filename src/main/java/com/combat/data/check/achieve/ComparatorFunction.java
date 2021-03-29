/*
 * xsyx Inc. 湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2021. All Rights Reserved.
 */
package com.combat.data.check.achieve;

import java.util.function.BiFunction;

/**
 * 比较器
 *
 * @author lirh
 * @date 2021/03/25 8:43
 */
@FunctionalInterface
public interface ComparatorFunction<T, U> extends BiFunction<T,U,Boolean> {

    /**
     * 比较
     *
     * @param t 比较对象
     * @param u 比较对象
     * @return 比较结果
     */
    @Override
    Boolean apply(T t, U u);
}
