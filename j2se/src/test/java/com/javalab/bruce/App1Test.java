package com.javalab.bruce;

/*
 * import是什么?
 * import 只是一种让你偷点懒少打字的方法，绝对不会影响你的classpath.
 * 没有非用import不可的理由，用了import也不会起到类似c里面嵌入某文件内容的效果，它只是一种省事的办法。
 * 不在classpath中的class，任你再import也无济于事。
 * 如果不用import，如何用ArrayList这个类？可以这样写：java.util.ArrayList
 * 而用了import java.util.ArrayList的话,代码中写ArrayList就可以了，省事。
 * import可以使用通配符*，*代表某package下所有的class，不包括子目录。
 *
 * JUnit 是什么?
 * JUnit 是一个框架，用于编写可复用测试集。
 * App1Test 类要使用 org.junit.Test 类提供的功能，实现单元测试功能。
 * org.junit.Test 类属于 junit-4.11.jar。这个 jar 包含了 JUnit 框架的所有类。
 * 项目的 pom.xml 里声明 对 junit-4.11.jar 的依赖。
 * 编译器在 classpath 里可以找到 junit-4.11.jar。
 * 在运行程序测试程序的时候，JVM 可以加载到 junit-4.11.jar。
 */
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class App1Test {

  private static final String FIRST_APP = "first-app";
  private static final String GREETING = "greeting";

  /*
   * "@Test" 属于junit框架的注解:将一个普通的方法修饰成为一个测试方法.
   */
  @Test
  public void greet() {

    /*
     * assertTrue与assertFalse可以判断某个条件是真还是假，如果和预期的值相同则测试成功，否则将失败。
     * 我们断言(或者说期望) App1.greet("first-app")的返回值是"first-app",
     * 也就是说,equals方法返回的boolean是true的话,assertTrue()通过,否则抛出Exception,表示测试不通过。
     *
     * equals方法用于比较两个String是否相等,注意不能用 == 比较两个字符串对象的值是否相等。为什么?
     * == 比较的是两者所引用的地址是否相同，equals对于字符串来说比较的是包含的内容是否相同
     * equals的意义是什么? 是object下的方法，指示两个引用的变量是否指向同一对象
     */
    assertTrue(FIRST_APP.equals(App1.greet(FIRST_APP)));

    assertFalse(App1.greet(FIRST_APP) == FIRST_APP);

    assertTrue(new App1().ifValidate(GREETING));

    assertFalse("hello".equals(App1.greet("hello-world")));

  }
}