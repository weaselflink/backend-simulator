package de.bissell.backendsimulator.frontend

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.client.RestTemplate

@Controller
class FrontendController(
		@Value("\${backend.url}")
		private val backendUrl: String,
		private val restTemplate: RestTemplate) {

	@GetMapping("/todo-list")
	fun todoList(model: Model): String {
		val listResponse = restTemplate.getForObject(backendUrl, ListResponse::class.java)

		model.addAttribute("list", listResponse.list)

		return "main-page"
	}
}

data class ListResponse(
		val list: List<String>
)
