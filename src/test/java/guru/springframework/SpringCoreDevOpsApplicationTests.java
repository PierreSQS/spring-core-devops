package guru.springframework;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ComponentScan(basePackages = {"guru.springframework"})
public class SpringCoreDevOpsApplicationTests {

	@Test
	public void contextLoads() {
	}

}
