/*
 * xsyx Inc. 湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2021. All Rights Reserved.
 */
package com.combat.delivery.achieve.achieve;
import com.combat.delivery.achieve.achieve.em.DeliveryState;

import com.combat.delivery.achieve.achieve.entity.DeliveryOrder;
import com.combat.delivery.achieve.achieve.entity.Director;

/**
 * 调用示例
 *
 * @author lirh
 * @date 2021/03/30 14:58
 */
public class ClientDemo {

    public static void main(String[] args) {
        final DeliveryOrder order = getOrder();
        DeliveryOrderStateMachine deliveryOrderStateMachine = new DeliveryOrderStateMachine(order.getDeliveryState());
        System.out.println("订单订单状态："+ order.getDeliveryState().name());
        deliveryOrderStateMachine.distribution(order, getDirector());
        System.out.println("订单订单状态："+ order.getDeliveryState().name());
        deliveryOrderStateMachine.startDelivery(order);
        System.out.println("订单订单状态："+ order.getDeliveryState().name());
        deliveryOrderStateMachine.completeDelivery(order);
        System.out.println("订单订单状态："+ order.getDeliveryState().name());
    }

    public static DeliveryOrder getOrder() {
        DeliveryOrder deliveryOrder = new DeliveryOrder();
        deliveryOrder.setId("100");
        deliveryOrder.setOrderNo("NO100");
        deliveryOrder.setReceiver("王朝伟");
        deliveryOrder.setReceiverTel("100011");
        deliveryOrder.setAddress("上海浦东");
        deliveryOrder.setDeliveryState(DeliveryState.wait_distribution);
        return deliveryOrder;
    }

    public static Director getDirector() {
        Director director = new Director();
        director.setId("100001");
        director.setName("刘德华");
        return director;
    }
}
