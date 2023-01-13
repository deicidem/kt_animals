abstract class Animal(val food: String, val location: String) {
    abstract fun makeNoise()
    abstract fun eat()
    open fun sleep() {
        println("${this::class.simpleName} сейчас спит")
    }
}