package com.plm.simplefactory.operation;

import com.plm.simplefactory.pojo.ResultPojo;

/**
 * 除法操作
 */
public class DivisionOperation implements Operation {

    public ResultPojo doOperation(double paramA, double paramB) {
        if (paramB == 0.0){
            ResultPojo.fail();
        }
        return ResultPojo.success(paramA / paramB);
    }
}
