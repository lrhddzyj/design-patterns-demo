/*
 * xsyx Inc. 湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2021. All Rights Reserved.
 */
package com.combat.delivery.achieve.achieve.factory;

import com.combat.delivery.achieve.achieve.*;
import com.combat.delivery.achieve.achieve.em.DeliveryState;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 配送订单状态服务工厂
 *
 * @author lirh
 * @date 2021/03/30 14:25
 */
public class DeliverOrderStateServiceFactory {

    private static Map<DeliveryState, DeliverOrderStateService> stateServiceMap = new HashMap<>();

    static {
        stateServiceMap.put(DeliveryState.wait_distribution, new WaitDistributionOrderStateServiceImpl());
        stateServiceMap.put(DeliveryState.wait_send, new WaitSendOrderStateServiceImpl());
        stateServiceMap.put(DeliveryState.process, new ProcessOrderStateServiceImpl());
        stateServiceMap.put(DeliveryState.complete, new CompleteOrderStateServiceImpl());
    }

    /**
     * 获取对应服务
     * @param deliveryState
     * @return
     */
    public static DeliverOrderStateService getStateService(DeliveryState deliveryState) {
        return stateServiceMap.get(deliveryState);
    }


}
