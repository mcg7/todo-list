package com.javalab;
// 类在com.javalab包中
public class App1 {
    //定义一个叫App1的类，权限为public
    public static String greet(String greeting) {
// 定义一个叫greet静态方法，权限为public  ，返回类型为String  有一个String类型的greeting形参
        System.out.println(greeting);
//在控制台输出传入的参数
        for (int i = 0; i < greeting.length(); i++) {
            System.out.print("=");
        }
//一个for循环语句，定义一个i=0，循环入口条件为i<参数greeting的长度，循环一次输出一个=符号，i++
        System.out.println("");
//输出一个空行
        return greeting;
    }//方法返回参数名


    public static void main(String[] args){
        App1.greet("huxiaokang");
    }
}
//程序入口函数，调用App1类中的greet方法 传入实参；