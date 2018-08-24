package com.example.rebelbob11.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcUtilTest {

    CalcUtil calcUtil = new CalcUtil();
    double x = 8.0;
    double y = 7.0;

    @Before
    public void SetUp() throws Exception{

    }

    @Test
    public void TestAdd() throws Exception{

        double result = calcUtil.Add(x,y);
        double expected = 15.0;

        assertEquals(expected,result,0.1);
    }

    @Test
    public void TestSubtract() throws Exception{

        double result = calcUtil.Subtract(x,y);
        double expected = 1.0;

        assertEquals(expected,result,0.1);
    }

    @After
    public void TearDown() throws Exception{
        
    }
}
