package ioc;

import base.UnitTestBase;
import ioc.service.InjectionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;


@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase {

    public TestInjection() {
        super("classpath:spring-injection.xml");
    }

    @Test
    public void testSetter() {
        InjectionService injectionService = super.getBean("injectionService");
        injectionService.save("1231");
    }

    @Test
    public void testConstructor() {
        InjectionService injectionService = super.getBean("injectionService");
        injectionService.save("0313");
    }
}
