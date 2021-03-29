/*
 * xsyx Inc. 湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2021. All Rights Reserved.
 */
package com.combat.data.check.achieve;

/**
 * 数据检查接口
 *
 * @author lirh
 * @date 2021/03/28 17:05
 */
public interface DataCheckService {

    /**
     * 数据检查
     *
     * @param checkCondition 检测条件
     * @return 数据检查结果
     */
    CheckResult check(CheckCondition checkCondition);


    /**
     * 数据检查结果
     */
    class CheckResult {

        /**
         * 是否成功
         */
        private boolean success;

        /**
         * 错误信息
         */
        private String errorMsg;

        public CheckResult() {
        }

        public CheckResult(boolean success) {
            this.success = success;
        }

        public CheckResult(boolean success, String errorMsg) {
            this.success = success;
            this.errorMsg = errorMsg;
        }

        public boolean isSuccess() {
            return success;
        }

        public void setSuccess(boolean success) {
            this.success = success;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public void setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
        }

        /**
         * 成功
         * @return
         */
        public static CheckResult success(){
            return new CheckResult(true);
        }

        /**
         * 失败
         * @param errorMsg
         * @return
         */
        public static CheckResult fail(String errorMsg){
            return new CheckResult(false, errorMsg);
        }
    }
}
