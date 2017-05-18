package com.javalab;

import org.junit.Test;
//导入包org.junit的test类
import static org.junit.Assert.assertTrue;
//导入包org.junit类Assert的assertTrue
public class App1Test {
    //定义App1Test类
    @Test
    //注解Test
    public void greet() throws Exception {
        //定义一个
        assertTrue("first-app".equals(App1.greet("first-app")));
        //静态方法assertTrue方法测试是true 则通过，比较字符串字面值和App1中静态方法中返回的值所包含的内容相同，如果测试不通过抛出错误。
        assertTrue("hello-world".equals(App1.greet("hello-world")));
        //
    }

}