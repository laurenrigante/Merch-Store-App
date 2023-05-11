package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage"),
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage"),
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )

    val hats= listOf(
        Product("Devslopes Beanie", "$18", "hat1"),
        Product("Devslopes Hat Black", "$20", "hat2"),
        Product("Devslopes Hat White", "$18", "hat3"),
        Product("Devlsopes Hat Snapback", "$15", "hat4"),
        Product("Devslopes Beanie", "$18", "hat1"),
        Product("Devslopes Hat Black", "$20", "hat2"),
        Product("Devslopes Hat White", "$18", "hat3"),
        Product("Devlsopes Hat Snapback", "$15", "hat4"),
        Product("Devslopes Beanie", "$18", "hat1"),
        Product("Devslopes Hat Black", "$20", "hat2"),
        Product("Devslopes Hat White", "$18", "hat3"),
        Product("Devlsopes Hat Snapback", "$15", "hat4")
    )

    val hoodies= listOf(
        Product("Devslopes Hoodie Gray", "$28", "hoodie1"),
        Product("Devslopes Hoodie Red", "$28", "hoodie2"),
        Product("Devslopes Hoodie Dark Gray", "$28", "hoodie3"),
        Product("Devslopes Hoodie Black", "$28", "hoodie4"),
        Product("Devslopes Hoodie Gray", "$28", "hoodie1"),
        Product("Devslopes Hoodie Red", "$28", "hoodie2"),
        Product("Devslopes Hoodie Dark Gray", "$28", "hoodie3"),
        Product("Devslopes Hoodie Black", "$28", "hoodie4"),
        Product("Devslopes Hoodie Gray", "$28", "hoodie1"),
        Product("Devslopes Hoodie Red", "$28", "hoodie2"),
        Product("Devslopes Hoodie Dark Gray", "$28", "hoodie3"),
        Product("Devslopes Hoodie Black", "$28", "hoodie4")
    )
    val shirts= listOf(
        Product("Devslopes Shirt Gray", "$18", "shirt1"),
        Product("Devslopes Badge Light Grey ", "$20", "shirt2"),
        Product("Devslopes Logo Shirt Red", "$22", "shirt3"),
        Product("Devslopes Hustle ", "$22", "shirt4"),
        Product("Kickflip Studios ", "$18", "shirt5"),
        Product("Devslopes Shirt Gray", "$18", "shirt1"),
        Product("Devslopes Badge Light Grey ", "$20", "shirt2"),
        Product("Devslopes Logo Shirt Red", "$22", "shirt3"),
        Product("Devslopes Hustle ", "$22", "shirt4"),
        Product("Kickflip Studios ", "$18", "shirt5"),
        Product("Devslopes Shirt Gray", "$18", "shirt1"),
        Product("Devslopes Badge Light Grey ", "$20", "shirt2"),
        Product("Devslopes Logo Shirt Red", "$22", "shirt3"),
        Product("Devslopes Hustle ", "$22", "shirt4"),
        Product("Kickflip Studios ", "$18", "shirt5")
    )
    val digitalGood= listOf<Product>()

    fun getProducts( category: String) : List<Product>{
        return when(category){
            "SHIRTS"-> return shirts
            "HATS"-> return hats
            "HOODIES"-> return hoodies
            else-> return digitalGood
        }

    }
}