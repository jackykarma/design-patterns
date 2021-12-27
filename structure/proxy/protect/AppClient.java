package structure.proxy.protect;

/**
 * 项目名：design-patterns
 * 包名：structure.proxy.protect
 * 文件名：null.java
 * 创建时间：2021/12/26-10:12
 *
 * @author jacky.li
 * 描述：
 */
    public class AppClient {

        public static void main(String[] args) {
            // 客户端对RealSubject一无所知,它要做的工作都委托代理proxy去帮它干，这样更省心
            Proxy proxy = new Proxy();
            proxy.request();
        }
    }
