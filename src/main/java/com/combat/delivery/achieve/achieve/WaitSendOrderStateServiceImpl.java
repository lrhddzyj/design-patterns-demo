/*
 * xsyx Inc. 湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2021. All Rights Reserved.
 */
package com.combat.delivery.achieve.achieve;

import com.combat.delivery.achieve.achieve.em.DeliveryState;
import com.combat.delivery.achieve.achieve.entity.DeliveryOrder;
import com.combat.delivery.achieve.achieve.factory.DeliverOrderStateServiceFactory;

/**
 * 待配送的订单操作服务
 * @author lirh
 * @date 2021/03/30 14:53
 */
public class WaitSendOrderStateServiceImpl implements DeliverOrderStateService {

    /**
     * 开始配送
     *
     * @param orderStateMachine
     * @param deliveryOrder
     */
    @Override
    public void startDelivery(DeliveryOrderStateMachine orderStateMachine, DeliveryOrder deliveryOrder) {
        deliveryOrder.setDeliveryState(DeliveryState.process);
        orderStateMachine.setCurrentStateService(DeliverOrderStateServiceFactory.getStateService(DeliveryState.process));
    }
}
