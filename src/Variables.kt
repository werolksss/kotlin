fun main() {
    // Задача 2
    val name = "Дарья"
    var age = 17
    println("\nМеня зовут $name, мне $age лет")
    age += 1
    println("Через год мне будет $age лет")

    // Задача 3
    println("\nШестнадцатеричное 0xFF = ${0xFF}")
    println("Двоичное 0b1010 = ${0b1010}")
    println("Длинное целое = ${100_000L}")
    println("Число с плавающей точкой = ${3.14f}")

    // Задача 4
    val isSunny = true
    val isRainy = false
    println("\nЛогические операции:")
    println("Солнце && Дождь = ${isSunny && isRainy} (false, так как не может быть одновременно)")
    println("Солнце || Дождь = ${isSunny || isRainy}")
    println("Не дождь = ${!isRainy}")
}
/*
  Оператор && (логическое И) возвращает true только если ОБА операнда равны true
  В нашем случае:
  -isSunny = true
  -isRainy = false
   Поскольку isRainy = false, условие isSunny && isRainy = true && false = false
   Это соответствует логике: не может быть одновременно солнечно и идет дождь.
   */