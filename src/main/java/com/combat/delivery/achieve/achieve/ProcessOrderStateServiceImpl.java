/*
 * xsyx Inc. 湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2021. All Rights Reserved.
 */
package com.combat.delivery.achieve.achieve;

import com.combat.delivery.achieve.achieve.em.DeliveryState;
import com.combat.delivery.achieve.achieve.entity.DeliveryOrder;
import com.combat.delivery.achieve.achieve.factory.DeliverOrderStateServiceFactory;

/**
 * 配送中的订单状态服务
 *
 * @author lirh
 * @date 2021/03/30 14:55
 */
public class ProcessOrderStateServiceImpl implements DeliverOrderStateService {

    /**
     * 完成配送
     *
     * @param orderStateMachine
     * @param deliveryOrder
     */
    @Override
    public void completeDelivery(DeliveryOrderStateMachine orderStateMachine, DeliveryOrder deliveryOrder) {
        deliveryOrder.setDeliveryState(DeliveryState.complete);
        orderStateMachine.setCurrentStateService(DeliverOrderStateServiceFactory.getStateService(DeliveryState.complete));
    }
}
