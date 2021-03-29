/*
 * xsyx Inc. 湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2021. All Rights Reserved.
 */
package com.combat.data.check.achieve.demo;

import com.combat.data.check.achieve.repository.UserFromARepository;
import com.combat.data.check.achieve.repository.UserFromBRepository;

/**
 * @author lirh
 * @date 2021/03/28 18:01
 */
public class ClientDemo {

    public static void main(String[] args) {
        UserFromARepository userFromARepository = new UserFromARepository();
        UserFromBRepository userFromBRepository = new UserFromBRepository();
        UserSizeChecker userSizeChecker = new UserSizeChecker(userFromARepository, userFromBRepository);
        UserOneByOneChecker userOneByOneChecker = new UserOneByOneChecker(userFromARepository, userFromBRepository);
        userSizeChecker.setNextDataChecker(userOneByOneChecker);
    }
}
