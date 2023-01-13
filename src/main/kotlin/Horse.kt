class Horse(food: String, location: String, val riderName: String) : Animal(food, location) {
    override fun makeNoise() {
        println("И-го-го-го")
    }

    override fun eat() {
        println("Наездник $riderName привел лошадь в $location и кормит ее $food")
    }
}