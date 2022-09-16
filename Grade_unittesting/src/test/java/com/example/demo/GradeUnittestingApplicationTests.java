package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GradeUnittestingApplicationTests {

	@Test
	void passingmarks() {
		var grade= new Grade();
		assertEquals("Fails",grade.determinegrade(20));
	}
	@Test
	void belowsixty() {
		var grade= new Grade();
		assertEquals("Second class",grade.determinegrade(55));
	}
	@Test
	void belowseventyfive() {
		var grade= new Grade();
		assertEquals("First class",grade.determinegrade(65));
	}
	@Test
	void belowninety() {
		var grade= new Grade();
		assertEquals("Distinction",grade.determinegrade(89));
	}
	@Test
	void aboveninety() {
		var grade= new Grade();
		assertEquals("Extraordinary",grade.determinegrade(91));
	}
	@Test
	void negativenum() {
		var grade= new Grade();
		assertThrows(IllegalArgumentException.class,
				() -> {
					grade.determinegrade(-7);		
				});
          
	}
}
