package com.plm.simplefactory.operation;

import com.plm.simplefactory.pojo.ResultPojo;

/**
 * 乘法运算
 */
public class MultiplicationOperation implements Operation {

    public ResultPojo doOperation(double paramA, double paramB) {
        return ResultPojo.success(paramA * paramB);
    }
}
