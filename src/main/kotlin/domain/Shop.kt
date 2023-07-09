package domain

import jakarta.persistence.*


@Entity
@Table(name = "shop")
data class Shop(
    var name: String,
    var brand: String,
    var hasDiscount: Boolean,
    var price: Double,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long? = null
)

