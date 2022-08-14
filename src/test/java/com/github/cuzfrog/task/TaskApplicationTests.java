package com.github.cuzfrog.task;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("h2")
class TaskApplicationTests {

	@Test
	void contextLoads() {
		assertThat(1).isEqualTo(1);
	}

}
