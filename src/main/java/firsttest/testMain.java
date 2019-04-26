package firsttest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testMain {
    public static void main(String[] args) {
        //创建Spring上下文（加载bean.xml）
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/bean.xml");
        //获取HelloWorld实例
        IntroduceDemo introduceDemo = applicationContext.getBean("IntroduceDemo", IntroduceDemo.class);
        introduceDemo.introduce();
    }
}
