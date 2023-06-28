package controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ShopController {
    @GetMapping("/hola")
    fun execute() = "Hola"
}