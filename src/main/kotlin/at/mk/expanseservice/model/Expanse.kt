package at.mk.expanseservice.model

import org.hibernate.annotations.GenericGenerator
import java.util.*
import javax.persistence.*

@Entity
@Table
data class Expanse(

        @Id
        var id : UUID = UUID.randomUUID(),

        @Column(name = "name")
        var name: String = "",

        @Column(name = "sum")
        var sum: Double = -1.0,

        @ManyToOne
        var category: Category?

) {}