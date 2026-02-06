import kotlin.math.PI

fun main() {
    println("задание 1")
    greetUser("Дарья")
    greetUser("Алексей")
    greetUser("Мария")

    println("\nзадание 2")
    println("Площадь круга с радиусом 5.0: ${calculateCircleArea(5.0)}")
    println("Площадь круга с радиусом 10.0: ${calculateCircleArea(10.0)}")
    println("Площадь круга с радиусом 2.5: ${calculateCircleArea(2.5)}")

    println("\nзадание 3")
    printPersonInfo("Дарья", 25, "Чита")
    printPersonInfo("Алексей", 30)
    printPersonInfo("Мария")

    println("\nзадание 4")
    printPersonInfo(city = "Санкт-Петербург", name = "Иван", age = 28)
    printPersonInfo(age = 22, city = "Казань", name = "Анна")

    println("\nзадание 5")
    println("Среднее 1, 2, 3: ${calculateAverage(1, 2, 3)}")
    println("Среднее 10, 20, 30, 40, 50: ${calculateAverage(10, 20, 30, 40, 50)}")
    println("Среднее 5, 5, 5, 5: ${calculateAverage(5, 5, 5, 5)}")

    println("\nзадание 6")
    println("Квадрат числа 4: ${square(4)}")
    println("Число 7 четное? ${isEven(7)}")
    println("Число 5 четное? ${isEven(5)}")
    println("Максимум из 10 и 15: ${max(10, 15)}")
    println("Максимум из 20 и 8: ${max(20, 8)}")

    println("\nзадание 7")
    println("Пароль 'Password123' валиден? ${validatePassword("Password123")}")
    println("Пароль 'pass' валиден? ${validatePassword("pass")}")
    println("Пароль 'PASSWORD' валиден? ${validatePassword("PASSWORD")}")
    println("Пароль 'пароль123' валиден? ${validatePassword("пароль123")}")

    println("\nзадание 8")
    println("Площадь круга (радиус=3.0): ${calculateArea(3.0)}")
    println("Площадь прямоугольника (4.0 x 5.0): ${calculateArea(4.0, 5.0)}")
    println("Площадь треугольника (осн=6.0, выс=4.0): ${calculateArea(6.0, 4.0, isTriangle = true)}")

    println("\nзадание 9")
    val numbers = listOf(1, 3, 5, 7, 9, 12, 14, 16, 18, 20, 2, 4, 6, 8, 10, 11, 13, 15)

    val evenNumbers = filterList(numbers) { it % 2 == 0 }
    println("Четные числа: $evenNumbers")

    val greaterThanTen = filterList(numbers) { it > 10 }
    println("Числа > 10: $greaterThanTen")

    val between5and15 = filterList(numbers) { it in 5..15 }
    println("Числа от 5 до 15: $between5and15")

    println("\nзадание 10")
    val counterFrom5 = createCounter(5)
    println("Счетчик от 5: ${counterFrom5()}, ${counterFrom5()}, ${counterFrom5()}")

    val counterFromZero = createCounter(0)
    println("Счетчик от 0: ${counterFromZero()}, ${counterFromZero()}, ${counterFromZero()}, ${counterFromZero()}")
}

//1
fun greetUser(name: String) {
    println("Привет, $name!")
}

//2
fun calculateCircleArea(radius: Double): Double {
    return PI * radius * radius
}

//3
fun printPersonInfo(name: String, age: Int = 18, city: String = "Неизвестно") {
    println("Имя: $name, Возраст: $age, Город: $city")
}


//5
fun calculateAverage(vararg numbers: Int): Double {
    if (numbers.isEmpty()) return 0.0
    return numbers.sum().toDouble() / numbers.size
}

//6
fun square(x: Int) = x * x
fun isEven(num: Int) = num % 2 == 0
fun max(a: Int, b: Int) = if (a > b) a else b

//7
fun validatePassword(password: String): Boolean {
    fun hasMinimumLength(pass: String) = pass.length >= 8
    fun hasDigit(pass: String) = pass.any { it.isDigit() }
    fun hasUpperCase(pass: String) = pass.any { it.isUpperCase() }

    return hasMinimumLength(password) && hasDigit(password) && hasUpperCase(password)
}

//8
fun calculateArea(radius: Double): Double {
    return PI * radius * radius
}

fun calculateArea(width: Double, height: Double): Double {
    return width * height
}

fun calculateArea(base: Double, height: Double, isTriangle: Boolean): Double {
    return if (isTriangle) 0.5 * base * height else base * height
}

//9
fun filterList(list: List<Int>, predicate: (Int) -> Boolean): List<Int> {
    val result = mutableListOf<Int>()
    for (item in list) {
        if (predicate(item)) {
            result.add(item)
        }
    }
    return result
}

//10
fun createCounter(start: Int): () -> Int {
    var count = start
    return {
        count++
    }
}
