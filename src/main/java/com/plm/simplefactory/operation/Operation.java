package com.plm.simplefactory.operation;

import com.plm.simplefactory.pojo.ResultPojo;

public interface Operation {
    /**
     * 进行操作并返回结果
     * @param paramA
     * @param paramB
     * @return
     */
    ResultPojo doOperation(double paramA, double paramB);
}
