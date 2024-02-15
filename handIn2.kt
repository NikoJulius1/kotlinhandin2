package handIns

fun main() {

    //opgave 1
    val Anders = Employee("Anders", "Hansen", 32000)
    val Clara = Employee("Clara", "Dahl", 35000)

    //yearly salary
   val salaryAnders = Anders.monthlySalary*12
    println(salaryAnders)

    val salaryClara = Clara.monthlySalary*12
    println(salaryClara)

    //yearly salary after raise
    val andersRaised = salaryAnders*1.1
    println(andersRaised)

    val claraRaised = salaryClara*1.1
    println(claraRaised)

    //opgave 1 end

    //opgave 2
    val randomLaptop = Computer("Windows", 18, "ASUS 2000")
    val randomPhone = Computer("IOS", 4, "iPhone 13")
}

//opgave 1
class Employee ( var firstname: String, var lastname: String, monthlySalary: Int) {
    private var _monthlySalary: Int = monthlySalary

    var monthlySalary: Int
        get () {
            return _monthlySalary
        }
        set(value: Int) {
            if (value>0){
                _monthlySalary = value
            } else {
                _monthlySalary = 0
            }
        }
}
//opgave 1 end

//opgave 2
open class Computer(val system: String, val ram: Int, val model: String ) {

    fun ramChecker() {
        if (ram>4) {
            println("You have good ram")
        } else {
            println("get more ram")
        }
    }

    fun systemChecker() {
        if (system == "Windows"){
            println("Bill Gates")
        } else {
            println("Steve Jobs")
        }
    }

}

class Laptop (system: String, ram: Int, model: String, val screenSize: Int ): Computer(system, ram, model) {
    fun screenSize(){
        println(screenSize)
    }
}

class Smartphone (system: String, ram: Int, model: String,): Computer(system,ram,model)

//opgave3
open class Product(name: String, price: Int, quantity: Int) {
    open fun identifyProductCategory(){
        println("I am something")
    }
}

class Shoe(): Product("Shoe", 500, 200) {
    override fun identifyProductCategory() {
        println("I am a shoe")
    }
}
class Tshirt():  Product("tee", 300, 500) {
    override fun identifyProductCategory() {
        println("I am a tee")
}
class Book(): Product("Harry potter", 200, 1000){
    override fun identifyProductCategory() {
        println("I am a book")

} } }

//opgave 4
open class Shape(val color: String, val isTransparent: Boolean) {
    open fun calculatePerimeter(): Double {
        return 0.0
    }

    open fun calculateArea(): Double {
        return 0.0
    }
}

class Circle(val radius: Double, color: String, isTransparent: Boolean) : Shape("green", false) {
    override fun calculatePerimeter(): Double {
        return 2 * 3.14 * radius
    }

    override fun calculateArea(): Double {
        return 3.14 * radius * radius
    }
}

class Rectangle(val length: Double, val height: Double, color: String, isTransparent: Boolean) : Shape("blue", true) {
    override fun calculatePerimeter(): Double {
        return 2 * (length + height)
    }

    override fun calculateArea(): Double {
        return length * height
    }
}

class Triangle(val height: Double, val base: Double, color: String, isTransparent: Boolean) : Shape("Red", false) {
    override fun calculatePerimeter(): Double {
        return 3 * base
    }

    override fun calculateArea(): Double {
        return 0.5 * base * height
    }
}




