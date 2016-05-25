package ca.moonglow.sample;

import ca.moonglow.sample.rest.HelloController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SampleApplication.class)
@WebAppConfiguration
public class HelloControllerTest {

    @Inject
    HelloController helloController;

    @Test
    public void testHello() {
        String response = helloController.hello();

        Assert.assertEquals("hello",response);
    }
}
