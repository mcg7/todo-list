/*
 * package是一个java特性,为了方便管理组织java文件的目录结构，并防止不同java文件之间发生命名冲突。
 * 不同package中的类的名字可以相同，只是在使用时要带上package的名称加以区分.
 */
package com.javalab.bruce;

public class App1 {
    //定义一个静态String变量 将String包装类型的值赋值给常量final；
    private static final String GREETING = "greeting";

    /**
     * 定义一个static方法，那就是说，无需实例化本类(new一个App1对象)即可调用此方法.
     *
     * @param greeting String类型
     * @return String类型, 返回参数greeting的值
     */
    public static String greet(String greeting) {

        /*
         * 什么是System?
         * 是java.lang中的一个类。
         * System中的属性 System.in 是InputStream类型的，可以接受控制台输入的信息；
         * System.out 和 System.err 都是PrintStream类型的，可以在控制台输出信息。
         * System.out 中的 out 代表了 System 类中的静态对象 PrintStream: public static
         * println 是 PrintStream 中的方法
         *
         */
        System.out.println(greeting);

        /*
         * String length()是字符个数,在控制台输出一行字符"=",个数是参数的字符个数.
         */
        for (int i = 0; i < greeting.length(); i++) {
            System.out.print("=");
        }

        System.out.println("");//在控制台输出一个空行.

        return new String(greeting);//返回参数的值
    }
    /*
    * 定义一个类方法
    * @param greeting String类型
    * @return boolean类型，返回比较参数 greeting == GREETING 的值
    * */

    public boolean ifValidate(String greeting) {

        System.out.println("ifValidate(). parameter=" + greeting);

        return greeting == GREETING;
    }

    /*
     * 1. main方法必须声明为public、static、void，否则JVM没法运行程序.
     * 2. 如果JVM找不到main方法就抛出NoSuchMethodError:main异常，
     *    例如：如果你运行命令：java HelloWorld，JVM就会在HelloWorld.class文件中搜索
     *    public static void main (String[] args) 方法.
     * 3. main方法是程序的入口，程序执行的开始处。
     * 4. main方法被一个特定的main线程运行，程序会一直运行直到main线程结束或者non-daemon线程终止。
     */
    public static void main(String[] args) {
        App1.greet("huxiaokang");
    }

}
