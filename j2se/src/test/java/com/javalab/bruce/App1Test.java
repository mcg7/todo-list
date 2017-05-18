package com.javalab.bruce;

/**
 * import是什么?
 * import 只是一种让你偷点懒少打字的方法，绝对不会影响你的classpath.
 * 没有非用import不可的理由，用了import也不会起到类似c里面嵌入某文件内容的效果，它只是一种省事的办法。
 * 不在classpath中的class，任你再import也无济于事。
 * 如果你不用import，你用ArrayList这个类，就需要写
 * java.util.ArrayList。
 * 而用了import java.util.ArrayList的话,
 * 代码中写ArrayList就可以了，省事。
 * import可以使用通配符*，*代表某package下所有的class，不包括子目录。
 * <p>
 * Junit是什么?
 * JUnit是一个框架,用于编写可复用测试集。
 * <p>
 * 这句话的意思是,App1Test类要使用 org.junit.Test 类提供的功能,
 * 必须注意到,org.junit.Test类在junit-4.11.jar,这个jar包包含了junit框架的所有类,
 * 通过项目的pom.xml里声明了对junit的依赖,编译器能在classpath里找到junit-4.11.jar,
 * 在编译和打包的时候,JVM能加载到这个jar包。
 */
import org.junit.Test;

import static org.junit.Assert.assertTrue;//静态成员导入,可以用略掉所在的类或接口名的方式，来使用静态成员。

public class App1Test {

  /**
   * @Test 将一个普通的方法修饰成为一个测试方法.
   */
  @Test
  public void greet() throws Exception {

    /**
     * assertTrue与assertFalse可以判断某个条件是真还是假，如果和预期的值相同则测试成功，否则将失败。
     * 我们断言(或者说期望) App1.greet("first-app")的返回值是"first-app",
     * 也就是说,equals方法返回的boolean是true的话,assertTrue()通过,否则抛出Exception,表示测试不通过。
     */
    assertTrue("first-app".equals(App1.greet("first-app")));

    assertTrue("hello-world".equals(App1.greet("hello-world")));

  }
}