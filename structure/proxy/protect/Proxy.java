package structure.proxy.protect;

/**
 * 项目名：design-patterns
 * 包名：structure.proxy.protect
 * 文件名：null.java
 * 创建时间：2021/12/26-10:05
 *
 * @author jacky.li
 * 描述：
 */
public class Proxy implements Subject {

    private Subject realSubject;

    @Override
    public void request() {
        // 延迟创建RealSubject对象，虚拟代理
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        // 可以作一些额外的检查或是其他工作
        doSthBefore();
        realSubject.request();
        // 请求后也可以作一些善后工作或其他工作
        doSthAfter();
    }

    private void doSthBefore() {
        System.out.println("do something before real request");
    }

    private void doSthAfter() {
        System.out.println("do something after real request");
    }
}
