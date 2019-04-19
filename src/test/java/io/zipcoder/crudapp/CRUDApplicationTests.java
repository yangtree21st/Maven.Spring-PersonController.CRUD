package io.zipcoder.crudapp;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CRUDApplicationTests {

	@Autowired
	private CRUDApplication crudApplication;

	@Test
	public void contextLoads() {
		Assert.assertNotNull(this.crudApplication);
	}
}