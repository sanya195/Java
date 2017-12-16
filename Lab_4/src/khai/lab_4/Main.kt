package khai.lab_4

data class Planet(val name: String, val mass: Double);

fun main(args: Array<String>) {
    val num_list = listOf(32868.0, 481068.0, 597600.0, 63345.0,
            187664328.0, 56180376.0, 8605440.0, 10159200.0, 1195.0);
    val string_list = listOf("Mercury", "Venus", "Earth", "Mars",
            "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto");

    //Создание списка экземпляров
    val planets = mutableListOf<Planet>()
    for (i in 0..string_list.lastIndex){
        planets.add(Planet(string_list[i],num_list[i]))
    }
    println("\nСписок экземпляров объектов:")
    planets.forEach { println("${it.name} - ${it.mass}") }

    //Отфильтровать планеты по величине массы не выше заданного значения
    val sorted = planets.filter { it.mass > 10000000 }.sortedBy { it.mass }
    println("\nСортировка: ")
    sorted.forEach({ println("${it.name} - ${it.mass}") })

    //Перевести массу планет из кг (10в24) в другие единицы измерения
    println("\nМасса планет относительно земной: ")
    planets.forEach { println("${it.name} - ${it.mass/ planets[2].mass}") }
}
