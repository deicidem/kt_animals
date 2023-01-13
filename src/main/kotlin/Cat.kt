class Cat(food: String, location: String, val breed: String) : Animal(food, location) {
    override fun makeNoise() {
        println("Мяу-мяу")
    }

    override fun eat() {
        println("Кошка пароды $breed сейчас находится в $location и ест $food")
    }
}