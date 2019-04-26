package lifestyle;

import base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestLifeCycle extends UnitTestBase {

    public TestLifeCycle() {
        super("classpath:spring-lifecycle.xml");
    }

    @Test
    public void test() {
//        super.getBean("beanLifeCycle");
    }
}
