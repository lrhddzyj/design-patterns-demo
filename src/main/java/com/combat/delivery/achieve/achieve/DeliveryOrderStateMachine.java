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
 * 配送订单的状态机
 *
 * @author lirh
 * @date 2021/03/30 14:16
 */
public class DeliveryOrderStateMachine {

    private DeliverOrderStateService currentStateService;

    public DeliveryOrderStateMachine(DeliveryState deliveryState) {
        this.currentStateService = DeliverOrderStateServiceFactory.getStateService(deliveryState);
    }

    /**
     * 设置当前的状态服务
     * @param deliverOrderStateService
     */
    public void setCurrentStateService(DeliverOrderStateService deliverOrderStateService) {
        this.currentStateService = deliverOrderStateService;
    }

    /**
     * 分配配送人员
     * @param deliveryOrder
     * @param director
     */
    public void distribution(DeliveryOrder deliveryOrder,
                              Director director) {
        currentStateService.distribution(this, deliveryOrder, director);
    }

    /**
     * 开始配送
     * @param deliveryOrder
     */
    public void startDelivery(DeliveryOrder deliveryOrder) {
        currentStateService.startDelivery(this, deliveryOrder);
    }

    /**
     * 完成配送
     * @param deliveryOrder
     */
    public void completeDelivery(DeliveryOrder deliveryOrder) {
        currentStateService.completeDelivery(this, deliveryOrder);
    }



}
