package com.javalab;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class App1Test {

    @Test
    public void greet() throws Exception {

        assertTrue("first-app".equals(App1.greet("first-app")));

        assertTrue("hello-world".equals(App1.greet("hello")));

    }

}