class Dog(food: String, location: String, val name: String) : Animal(food, location) {
    override fun makeNoise() {
        println("Гав-гав")
    }

    override fun eat() {
        println("Собака $name сейчас находится в $location и ест $food")
    }
}