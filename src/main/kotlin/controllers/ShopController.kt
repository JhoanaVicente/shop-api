package controllers

import domain.Shop
import org.springframework.web.bind.annotation.*
import repositories.ShopRepository

@RestController
class ShopController(private val shopRepository: ShopRepository) {

    @GetMapping("/products")
    fun getAllProducts(@RequestParam(required = false, defaultValue = "false") discount: Boolean): List<Shop> {
        return if (discount) {
            shopRepository.findByHasDiscount(true)
        } else {
            shopRepository.findAll()
        }
    }

    @PostMapping("/products")
    fun createProduct(@RequestBody shop: Shop): Shop {
        return shopRepository.save(shop)
    }

    @DeleteMapping("/products/{id}")
    fun deleteProduct(@PathVariable id: Long) {
        shopRepository.deleteById(id)
    }
}

