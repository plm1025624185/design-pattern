package com.plm.simplefactory.operation;

import com.plm.simplefactory.pojo.ResultPojo;

/**
 * 空运算符
 * 不在运算符内的调用该运算，直接返回失败
 */
public class NonOperation implements Operation {

    @Override
    public ResultPojo doOperation(double paramA, double paramB) {
        return ResultPojo.fail();
    }
}
