package beanannotation;

import base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanAnnotation extends UnitTestBase {
    public TestBeanAnnotation() {
        super("classpath:spring-beanannotation.xml");
    }

    @Test
    public void testSay() {
        BeanAnnotation beanAnnotation = super.getBean("beanAnnotation");
        beanAnnotation.say("This is SAY");

//        BeanAnnotation beanAnnotation = super.getBean("bean");
//        beanAnnotation.say("This is SAY");
    }

    @Test
    public void testHashCode() {
        BeanAnnotation beanAnnotation = super.getBean("beanAnnotation");
        beanAnnotation.myHashCode();

        beanAnnotation = super.getBean("beanAnnotation");
        beanAnnotation.myHashCode();
    }
}
