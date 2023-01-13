fun main(args: Array<String>) {
    val veterinarian = Vet()

    val animals = arrayOf(
        Cat("рыба", "дом", "бенгал"),
        Dog("корм", "улица", "Шарик"),
        Horse("яблоко", "хлев", "Андрей")
    )

    for (animal in animals) {
        veterinarian.treatAnimal(animal)
    }
}