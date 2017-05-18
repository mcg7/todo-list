package com.javalab;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

/**
 * Copyright (c) 2012 Conversant Solutions. All rights reserved.
 * <p/>
 * Created on 2017/5/18.
 */
public class LotteryOddsTest {

    @Test
    public void calculate() throws Exception {

        LotteryOdds lotteryOdds = new LotteryOdds(2, 5);

        BigInteger lottery = lotteryOdds.calculate();

        Assert.assertTrue(lottery.intValue() == 10);
    }

}