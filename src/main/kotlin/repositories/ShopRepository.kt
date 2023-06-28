package repositories

import domain.Shop
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ShopRepository : JpaRepository<Shop, Long> {
    fun findById(it: String): List<Shop>
}

