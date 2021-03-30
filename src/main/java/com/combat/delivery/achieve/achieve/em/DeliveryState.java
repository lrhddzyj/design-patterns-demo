/*
 * xsyx Inc. 湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2021. All Rights Reserved.
 */
package com.combat.delivery.achieve.achieve.em;

/**
 * 配送状态
 *
 * @author lirh
 * @date 2021/03/30 14:12
 */
public enum DeliveryState {

    /**
     * 待分配配送人员
     */
    wait_distribution,

    /**
     * 已分配配送人员，待配送
     */
    wait_send,
    /**
     * 配送中
     */
    process,
    /**
     * 已完成
     */
    complete;
}
