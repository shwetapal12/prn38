package com.test.application;
import org.testng.annotations.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	
	@Test
	public void contextLoads() {
		System.out.println("------This is my Test NG application-------------");
	}

}
