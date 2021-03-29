/*
 * xsyx Inc. 湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2021. All Rights Reserved.
 */
package com.combat.data.check.achieve.demo;

import com.combat.data.check.achieve.CheckCondition;
import com.combat.data.check.achieve.CheckerChain;
import com.combat.data.check.achieve.repository.UserFromARepository;
import com.combat.data.check.achieve.repository.UserFromBRepository;

/**
 * @author lirh
 * @date 2021/03/28 18:01
 */
public class ClientDemo {

    public static void main(String[] args) {
        CheckerChain checkerChain = new CheckerChain();
        UserFromARepository userFromARepository = new UserFromARepository();
        UserFromBRepository userFromBRepository = new UserFromBRepository();
        UserSizeChecker userSizeChecker = new UserSizeChecker(userFromARepository, userFromBRepository);
        UserOneByOneChecker userOneByOneChecker = new UserOneByOneChecker(userFromARepository, userFromBRepository);
        checkerChain.addChecker(userSizeChecker);
        checkerChain.addChecker(userOneByOneChecker);

        //执行
        checkerChain.check(new CheckCondition() {
            @Override
            public String getDepartmentId() {
                return null;
            }
        });
    }
}
