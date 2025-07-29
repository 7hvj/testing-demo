package com.m7md.junitdemo;

import com.luv2code.junitdemo.DemoUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoUnitTest {



    @Test
    void testEqualAndNotEqual() {

        DemoUtils demoUtils = new DemoUtils();
        assertEquals(6,demoUtils.add(2,4),"2+4 Must be 6");
        assertNotEquals(6,demoUtils.add(1,9),"1+9 Must be 10");

    }

    @Test
    void testNullAndNotNull(){
        DemoUtils demoUtils = new DemoUtils();

        String str1= null;
        String str2= "M7md";

        assertNull( demoUtils.checkNull(str1),"object should be null");
        assertNotNull( demoUtils.checkNull(str2),"object should not be  null");


    }
}



