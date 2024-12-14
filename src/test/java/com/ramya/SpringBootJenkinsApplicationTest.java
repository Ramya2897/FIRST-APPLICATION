package com.ramya;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootJenkinsApplicationTest {

	@Test
	public void contextLoad() {
		
		System.out.println("Executing contextLoad() method.....");
		assertEquals(true,true);
	}
}
