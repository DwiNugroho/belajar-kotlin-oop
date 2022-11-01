package data

class Car(paramBrand: String, paramName: String ,paramYear: Int) {

    init {
        println("Car $paramBrand dibuat")
    }

    constructor(paramBrand: String, paramName: String):this(paramBrand, paramName, 2020) {
        println("secondary  constructor")
    }

    constructor(paramBrand: String):this(paramBrand, "") {
        println("Secondary Consructor 2")
    }

    var brand = paramBrand
    var name = paramName
    var year = paramYear
}