/*
 * xsyx Inc. 湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2021. All Rights Reserved.
 */
package com.combat.delivery.achieve.achieve.entity;

import com.combat.delivery.achieve.achieve.em.DeliveryState;

/**
 * 配送订单
 * @author lirh
 * @date 2021/03/30 14:10
 */
public class DeliveryOrder {

    /**
     * 订单id
     */
    private String id;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 配送人id
     */
    private String directorId;

    /**
     * 配送人名称
     */
    private String directorName;

    /**
     * 接收人
     */
    private String receiver;

    /**
     * 接收人电话
     */
    private String receiverTel;

    /**
     * 接受人地址
     */
    private String address;

    /**
     * 配送状态
     */
    private DeliveryState deliveryState;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getDirectorId() {
        return directorId;
    }

    public void setDirectorId(String directorId) {
        this.directorId = directorId;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getReceiverTel() {
        return receiverTel;
    }

    public void setReceiverTel(String receiverTel) {
        this.receiverTel = receiverTel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public DeliveryState getDeliveryState() {
        return deliveryState;
    }

    public void setDeliveryState(DeliveryState deliveryState) {
        this.deliveryState = deliveryState;
    }
}
