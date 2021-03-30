/*
 * xsyx Inc. 湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2021. All Rights Reserved.
 */
package com.combat.delivery.achieve.achieve;

import com.combat.delivery.achieve.achieve.entity.DeliveryOrder;
import com.combat.delivery.achieve.achieve.entity.Director;

/**
 * 配送订单状态服务
 *
 * @author lirh
 * @date 2021/03/30 14:17
 */
public interface DeliverOrderStateService {

    RuntimeException unSupportException = new RuntimeException("非法操作");

    /**
     * 分配配送人员
     * @param orderStateMachine
     * @param deliveryOrder
     * @param director
     */
    default void distribution(DeliveryOrderStateMachine orderStateMachine, DeliveryOrder deliveryOrder,
                              Director director) {
        throw unSupportException;
    }

    /**
     * 开始配送
     * @param orderStateMachine
     * @param deliveryOrder
     */
    default void startDelivery(DeliveryOrderStateMachine orderStateMachine, DeliveryOrder deliveryOrder) {
        throw unSupportException;
    }

    /**
     * 完成配送
     * @param orderStateMachine
     * @param deliveryOrder
     */
    default void completeDelivery(DeliveryOrderStateMachine orderStateMachine, DeliveryOrder deliveryOrder) {
        throw unSupportException;
    }



}
