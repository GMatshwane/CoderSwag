package com.gordon.coderswag.Services

import com.gordon.coderswag.Model.Category
import com.gordon.coderswag.Model.Product

object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val products = listOf(
            Product("Devslopes beanie", "R20", "hat01"),
            Product("Devslopes hat white", "R30", "hat02"),
            Product("Devslopes hat black", "R40", "hat03"),
            Product("Devslopes snapback", "R50", "hat04")
    )

    val hoodies = listOf(
            Product("Devslopes hoodie red", "R20", "hoodie01"),
            Product("Devslopes hoodie blue", "R220", "hoodie02"),
            Product("Devslopes hoodie green", "R320", "hoodie03"),
            Product("Devslopes hoodie black", "R120", "hoodie04")
    )

    val shirts = listOf(
            Product("Devslopes shirts red", "R20", "shirt01"),
            Product("Devslopes shirts blue", "R230", "shirt02"),
            Product("Devslopes shirts green", "R420", "shirt03"),
            Product("Devslopes shirts black", "R130", "shirt04"),
            Product("Devslopes Hustle shirt white", "R1220", "shirt05")
    )
}