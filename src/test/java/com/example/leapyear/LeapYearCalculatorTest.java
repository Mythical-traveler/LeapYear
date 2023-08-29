package com.example.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearCalculatorTest
{
    @Test
    public void test2004isLeapYear()
    {
        LeapYearCalculator LY=new LeapYearCalculator();
        Boolean result=LY.isLeapYear(2004);
        Assertions.assertTrue(result);

    }
}
