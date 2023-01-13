class Vet {
    fun treatAnimal(animal: Animal) {
        println("Ветеринар начал осмотр животного ${animal::class.simpleName}")
        println("Проверка на звук:")
        animal.makeNoise()
        println("Проверка на питание:")
        animal.eat()
        println("Проверка на сон:")
        animal.sleep()
        println("Осмотр закончен")
        println()
    }
}
