package com.being.zero.design.patterns.question1;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;


public class TestComputerShop {

    private static final String STUDENT = "Processor: INTEL_DUAL_CORE_I5, motherBoard: ASUS, ram: 4GB, hardDisk: 2TB, CDRome Included: true, Screen Size: 16inch, SSD Included: false";
    private static final String DEVELOPER = "Processor: INTEL_QUAD_CORE_I7, motherBoard: INTEL, ram: 16GB, hardDisk: 4TB, CDRome Included: false, Screen Size: 18inch, SSD Included: true";


    @Test
    public void testAssembleForStudent(){
        ComputerShop shop = new ComputerShop();
        Computer computer = shop.assembleComputer(new StudentConfig());
        Assert.assertEquals(STUDENT, computer);
    }

    @Test
    public void testAssembleForDeveloper(){
        ComputerShop shop = new ComputerShop();
        Computer computer = shop.assembleComputer(new StudentConfig());
        Assert.assertEquals(STUDENT, computer);
    }

    @Test
    public void testNoSetters(){
        Method[] methods = Computer.class.getMethods();
        for(Method method : methods){
            Assert.assertFalse("setter method "+method.getName()+" not allowed",isSetter(method));
        }
    }

    private static boolean isSetter(Method method){
        if(!method.getName().startsWith("set")) return false;
        if(method.getParameterTypes().length != 1) return false;
        return true;
    }
}
