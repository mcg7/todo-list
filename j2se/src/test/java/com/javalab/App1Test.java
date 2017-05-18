package com.javalab;

import org.junit.Test;
//导入包org.junit的test类
import static org.junit.Assert.assertTrue;
//导入包org.junit类Assert的assertTrue
public class App1Test {
    //定义App1Test类
    @Test
    public void greet() throws Exception {
        //
        assertTrue("first-app".equals(App1.greet("first-app")));
        //
        assertTrue("hello-world".equals(App1.greet("hello")));
        //
    }

}