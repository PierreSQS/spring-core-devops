package guru.springframework;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SpringCoreDevOpsApplicationTests {

	@Autowired
	ApplicationContext appCtx;

	@Test
	public void contextLoads() {
		assertThat(appCtx).isNotNull();
	}

}
