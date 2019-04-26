package aware;

import base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAware extends UnitTestBase {
    @Test
    public void testMoocApplicationContext() {
        System.out.println("TestMoocApplicationContext: " + super.getBean("moocApplicationContext").hashCode());
    }

    @Test
    public void textMoocBeanName() {
        System.out.println("textMoocBeanName : " + super.getBean("moocBeanName").hashCode());
    }
}
