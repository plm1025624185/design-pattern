package com.plm.simplefactory.operation;

import com.plm.simplefactory.pojo.ResultPojo;

/**
 * 加法运算
 */
public class AddOperation implements Operation {

    public ResultPojo doOperation(double paramA, double paramB) {
        return ResultPojo.success(paramA + paramB);
    }
}
