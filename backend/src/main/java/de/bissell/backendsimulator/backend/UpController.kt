package de.bissell.backendsimulator.backend

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UpController {

	@RequestMapping("/up")
	fun up(): String {
		return "UP"
	}
}
