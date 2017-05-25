package com.javalab.demo2;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CounterTest {

  @Test
  public void testCalculateSumOfSalary() throws Exception {
    SalaryCalculator salaryCalculator = new Counter();

    long sumOfSalary = salaryCalculator.calculateSalarySumOfContract();

    assertTrue(sumOfSalary == 145000);

  }
}