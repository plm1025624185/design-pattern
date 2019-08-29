package com.plm.simplefactory.operation;

import com.plm.simplefactory.pojo.ResultPojo;

/**
 * 减法运算
 */
public class SubstructionOperation implements Operation {
    public ResultPojo doOperation(double paramA, double paramB) {
        return ResultPojo.success(paramA - paramB);
    }
}
