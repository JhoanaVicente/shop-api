package domain

import jakarta.persistence.*


@Table(name = "shop")
@Entity
data class Shop(
    var name: String,
    var brand: String,
    var hasDiscount: Boolean,
    var price: Double,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long? = null,
)
