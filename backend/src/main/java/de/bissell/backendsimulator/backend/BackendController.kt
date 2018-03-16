package de.bissell.backendsimulator.backend

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BackendController {

	@GetMapping("/list")
	fun list(): ListResponse {
		return ListResponse(listOf(
				"do the laundry",
				"wash the dishes",
				"reach master rank in SC2"
		))
	}
}

data class ListResponse(
		val list: List<String>
)
