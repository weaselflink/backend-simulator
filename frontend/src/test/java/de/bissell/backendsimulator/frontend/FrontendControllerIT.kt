package de.bissell.backendsimulator.frontend

import io.restassured.RestAssured.get
import org.hamcrest.Matchers.containsString
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(
		classes = [FrontendApplication::class],
		webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
class FrontendControllerIT {

	@Value("\${local.server.port}")
	private var port: Int = 0

	@Test
	fun todoList() {
		get("http://localhost:$port/todo-list")
				.then()
				.body(containsString("do the laundry"))
				.body(containsString("wash the dishes"))
				.body(containsString("reach master rank in SC2"))
	}
}
