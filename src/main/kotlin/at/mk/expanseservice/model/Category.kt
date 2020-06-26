package at.mk.expanseservice.model

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "category")
data class Category(
        @Column(name = "name")
        var name : String = "",
        @Column(name = "iconName")
        var iconName: String = "",
        @Id
        var id: UUID = UUID.randomUUID()
        )
{}