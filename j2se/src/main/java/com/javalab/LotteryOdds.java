package com.javalab;

import java.math.BigInteger;
import java.util.Scanner;

public class LotteryOdds {

    private int needDraw;
    private int highestNumber;

    public LotteryOdds(int needDraw, int highestNumber) {
        this.needDraw = needDraw;
        this.highestNumber = highestNumber;
    }

    /*
     * compute binomial coefficient highestNumber*(highestNumber-1)*(highestNumber-2)*...*(highestNumber-needDraw+1)/(1*2*3*...*needDraw)
     */
    public BigInteger calculate() {

        BigInteger lotteryOdds = BigInteger.valueOf(1);

        for (int i = 1; i <= this.needDraw; i++) {
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(this.highestNumber - i + 1)).divide(BigInteger.valueOf(i));
        }

        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");

        return lotteryOdds;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw? ");
        int needDraw = in.nextInt();

        System.out.print("What is the highest number you can draw? ");
        int highestNumber = in.nextInt();

        new LotteryOdds(needDraw, highestNumber).calculate();
    }
}
