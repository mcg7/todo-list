package com.javalab.demo2;


import java.io.*;

public class Counter implements SalaryCalculator {

  /**
   * 读 contracts.txt 文件,计算公司每月一共要给雇员发多少薪资.
   *
   * @return 雇员月薪之和
   */
    public static void main(String[] args) {
      Counter c = new Counter();
      System.out.println(c.calculateSalarySumOfContract());

    }
  public long calculateSalarySumOfContract() {
    long sum=0;
    try {
      FileReader fr = new FileReader("/Users/apple/java_lab/j2se/src/main/java/com/javalab/demo2/contracts.txt");
      BufferedReader br = new BufferedReader(fr);
      String name="";
      long salary = 0;
      String date = "";
      String line = null;
      String [] rec = null;
      while ((line=br.readLine()) != null){
        rec = line.split("\\,");
        name = rec[0];
        salary = Long.parseLong(rec[1]);
        date = rec[2];
        sum += salary;
      }

    }catch (Exception e){
      e.printStackTrace();
    }

    return sum;
  }
}
