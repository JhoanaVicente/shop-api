package domain

import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Component
import repositories.ShopRepository


@Component
class DataLoader(private val shopRepository: ShopRepository) {
    @PostConstruct
    fun load() {
        val shops = listOf(
            Shop(
                name = "Rainburst",
                brand = "Akwa",
                hasDiscount = true,
                price = 35.0,
            ),
            Shop(
                name = "Energy",
                brand = "4life",
                hasDiscount = true,
                price = 40.0,
            ),
        )
        shopRepository.saveAll(shops)
    }
}
