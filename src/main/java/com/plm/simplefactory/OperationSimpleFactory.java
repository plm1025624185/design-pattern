package com.plm.simplefactory;

import com.plm.simplefactory.operation.*;

/**
 * 简单工厂模式
 * 根据运算符创建不同的运算对象
 */
public class OperationSimpleFactory {
    public Operation createOperation(String operationStr){
        Operation operation = null;
        switch (operationStr){
            case "+":
                operation = new AddOperation();
                break;
            case "-":
                operation = new SubstructionOperation();
                break;
            case "*":
                operation = new MultiplicationOperation();
                break;
            case "/":
                operation = new DivisionOperation();
                break;
            default:
                operation = new NonOperation();
        }
        return operation;
    }
}
