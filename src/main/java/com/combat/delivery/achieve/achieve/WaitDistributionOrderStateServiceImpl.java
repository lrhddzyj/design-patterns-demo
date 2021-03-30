/*
 * xsyx Inc. 湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2021. All Rights Reserved.
 */
package com.combat.delivery.achieve.achieve;

import com.combat.delivery.achieve.achieve.em.DeliveryState;
import com.combat.delivery.achieve.achieve.entity.DeliveryOrder;
import com.combat.delivery.achieve.achieve.entity.Director;
import com.combat.delivery.achieve.achieve.factory.DeliverOrderStateServiceFactory;

/**
 * 待分配的配送人员的订单服务
 *
 * @author lirh
 * @date 2021/03/30 14:32
 */
public class WaitDistributionOrderStateServiceImpl implements DeliverOrderStateService{

    /**
     * 分配配送人员
     *
     * @param orderStateMachine
     * @param deliveryOrder
     * @param director
     */
    @Override
    public void distribution(DeliveryOrderStateMachine orderStateMachine, DeliveryOrder deliveryOrder, Director director) {
        deliveryOrder.setDirectorId(director.getId());
        deliveryOrder.setDirectorName(director.getName());
        deliveryOrder.setDeliveryState(DeliveryState.wait_send);
        orderStateMachine.setCurrentStateService(DeliverOrderStateServiceFactory.getStateService(DeliveryState.wait_send));
    }
}
