package lifecycle;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle /*implements InitializingBean, DisposableBean*/ {

//    @Override
//    public void destroy() {
//        System.out.println("Bean destroy!!!");
//    }
//
//    @Override
//    public void afterPropertiesSet() {
//        System.out.println("Bean afterPropertiesSet!!!");
//    }

    public void defaultInit() {
        System.out.println("默认的初始化方式！");
    }

    public void defaultDestroy() {
        System.out.println("默认的销毁方式！");
    }

    public void start() {
        System.out.println("Bean Start!");
    }

    public void stop() {
        System.out.println("Bean Stop！");
    }
}
