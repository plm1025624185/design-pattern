package com.plm.simplefactory;

import com.plm.simplefactory.operation.Operation;
import com.plm.simplefactory.pojo.ResultPojo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OperationSimpleFactoryTest {
    private OperationSimpleFactory factory;
    private double paramA = 1.0;
    private double paramB = 2.0;

    @Before
    public void init(){
        factory = new OperationSimpleFactory();
    }

    @Test
    public void testAdd(){
        Operation add = factory.createOperation("+");
        ResultPojo res = add.doOperation(paramA, paramB);
        System.out.println(res);
        Assert.assertEquals(paramA + paramB, res.getData(), 0.00001);
    }

    @Test
    public void testSub(){
        Operation sub = factory.createOperation("-");
        ResultPojo res = sub.doOperation(paramA, paramB);
        System.out.println(res);
        Assert.assertEquals(paramA - paramB, res.getData(), 0.00001);
    }

    @Test
    public void testMul(){
        Operation mul = factory.createOperation("*");
        ResultPojo res = mul.doOperation(paramA, paramB);
        System.out.println(res);
        Assert.assertEquals(paramA * paramB, res.getData(), 0.00001);
    }

    @Test
    public void testDiv(){
        Operation div = factory.createOperation("/");
        ResultPojo res = div.doOperation(paramA, paramB);
        System.out.println(res);
        Assert.assertEquals(paramA / paramB, res.getData(), 0.00001);
    }

    @Test
    public void testNon(){
        Operation non = factory.createOperation("&");
        ResultPojo res = non.doOperation(paramA, paramB);
        System.out.println(res);
        Assert.assertEquals(0.0, res.getData(), 0.00001);
    }
}
