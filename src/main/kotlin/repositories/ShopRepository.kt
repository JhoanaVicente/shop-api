package repositories

import domain.Shop
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ShopRepository : JpaRepository<Shop, Long> {
    override fun findById(id: Long): Optional<Shop>
    abstract fun findByHasDiscount(b: Boolean): List<Shop>
}


