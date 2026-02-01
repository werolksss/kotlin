//// Задание 1
//fun main() {
//    print("Введите начальное число: ")
//    val start = readLine()?.toIntOrNull() ?: 1
//    print("Введите конечное число: ")
//    val end = readLine()?.toIntOrNull() ?: 10
//
//    for (num in start..end step 2) {
//        if (num % 3 == 0) {
//            println(num)
//        }
//    }
//}
//
//// Задание 2
//fun main() {
//    val numbers = Array(10) { (1..100).random() }
//    println("Массив: ${numbers.joinToString()}")
//
//    var max = numbers[0]
//    var min = numbers[0]
//    var sum = 0
//    var evenCount = 0
//
//    for (num in numbers) {
//        if (num > max) max = num
//        if (num < min) min = num
//        sum += num
//        if (num % 2 == 0) evenCount++
//    }
//
//    println("Максимум: $max")
//    println("Минимум: $min")
//    println("Среднее: ${sum / numbers.size.toDouble()}")
//    println("Чётных: $evenCount")
//}
//
//// Задание 3
//fun main() {
//    print("Введите число: ")
//    val num = readLine()?.toIntOrNull() ?: 0
//    print("Система счисления (2, 8, 16): ")
//    val base = readLine()?.toIntOrNull() ?: 2
//
//    when (base) {
//        2 -> println("В двоичной: ${Integer.toBinaryString(num)}")
//        8 -> println("В восьмеричной: ${Integer.toOctalString(num)}")
//        16 -> println("В шестнадцатеричной: ${Integer.toHexString(num)}")
//        else -> println("Неподдерживаемая система")
//    }
//}
//
//// Задание 4
//fun main() {
//    for (num in 2..100) {
//        var isPrime = true
//        for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
//            if (num % i == 0) {
//                isPrime = false
//                break
//            }
//        }
//        if (isPrime) print("$num ")
//    }
//    println()
//}
//
//// Задание 5
//fun main() {
//    print("Введите строку: ")
//    val input = readLine() ?: ""
//    var result = ""
//
//    for (char in input) {
//        when {
//            char.isLetter() -> {
//                val base = if (char.isUpperCase()) 'A' else 'a'
//                val shifted = ((char - base + 3) % 26 + base.toInt()).toChar()
//                result += shifted
//            }
//            else -> result += char
//        }
//    }
//
//    println("Зашифровано: $result")
//}
//
//// Задание 6
//fun main() {
//    println("Введите текст (end для завершения):")
//    val lines = mutableListOf<String>()
//    while (true) {
//        val line = readLine()
//        if (line == "end") break
//        lines.add(line ?: "")
//    }
//
//    val text = lines.joinToString("\n")
//    val chars = text.length
//    val words = text.split(Regex("\\s+")).filter { it.isNotBlank() }.size
//    val sentences = text.split(Regex("[.!?]+")).filter { it.isNotBlank() }.size
//    val longestWord = text.split(Regex("\\W+")).maxByOrNull { it.length } ?: ""
//
//    println("Символов: $chars")
//    println("Слов: $words")
//    println("Предложений: $sentences")
//    println("Самое длинное слово: $longestWord")
//}
//
//// Задание 7
//fun main() {
//    val secret = (1..100).random()
//    var attempts = 0
//    var guess: Int
//
//    println("Угадайте число от 1 до 100")
//
//    do {
//        attempts++
//        print("Попытка $attempts: ")
//        guess = readLine()?.toIntOrNull() ?: 0
//
//        when {
//            guess < secret -> println("Больше")
//            guess > secret -> println("Меньше")
//            else -> println("угадал за $attempts попыток")
//        }
//    } while (guess != secret)
//}
//
//// Задание 8
//fun main() {
//    val matrix = Array(3) { Array(3) { (1..9).random() } }
//
//    println("Матрица:")
//    matrix.forEach { println(it.joinToString()) }
//
//    println("Суммы строк:")
//    matrix.forEachIndexed { i, row -> println("Строка ${i + 1}: ${row.sum()}") }
//
//    println("Суммы столбцов:")
//    for (j in 0..2) {
//        val colSum = matrix.sumOf { it[j] }
//        println("Столбец ${j + 1}: $colSum")
//    }
//
//    val diagSum = (0..2).sumOf { matrix[it][it] }
//    println("Сумма диагонали: $diagSum")
//}
//
//// Задание 9
//fun main() {
//    print("Сколько чисел Фибоначчи:")
//    val n = readLine()?.toIntOrNull() ?: 10
//
//    var a = 0
//    var b = 1
//
//    for (i in 1..n) {
//        val fib = when (i) {
//            1 -> a
//            2 -> b
//            else -> {
//                val next = a + b
//                a = b
//                b = next
//                next
//            }
//        }
//
//        if (!(fib % 2 == 0 || (fib > 50 && fib < 200))) {
//            continue
//        }
//
//        print("$fib ")
//    }
//    println()
//}
//
//// Задание 10
//fun main() {
//    print("Введите пароль: ")
//    val password = readLine() ?: ""
//    val errors = mutableListOf<String>()
//
//    if (password.length < 8) errors.add("Меньше 8 символов")
//    if (!password.any { it.isDigit() }) errors.add("Нет цифр")
//    if (!password.any { it.isUpperCase() }) errors.add("Нет заглавных букв")
//    if (!password.any { it in "!@#$%^&*()" }) errors.add("Нет спецсимволов")
//
//    if (errors.isEmpty()) {
//        println("Пароль надёжный")
//    } else {
//        println("Ошибки: ${errors.joinToString()}")
//    }
//}
//
//// Задание 11
//fun main() {
//    while (true) {
//        println("\n1. Секунды в часы:минуты:секунды")
//        println("2. Часы:минуты в секунды")
//        println("3. Выход")
//        print("Выбор: ")
//
//        when (readLine()) {
//            "1" -> {
//                print("Секунды: ")
//                val total = readLine()?.toIntOrNull() ?: 0
//                val hours = total / 3600
//                val minutes = (total % 3600) / 60
//                val seconds = total % 60
//                println("$hours:$minutes:$seconds")
//            }
//            "2" -> {
//                print("Часы: ")
//                val hours = readLine()?.toIntOrNull() ?: 0
//                print("Минуты: ")
//                val minutes = readLine()?.toIntOrNull() ?: 0
//                println("Секунд: ${hours * 3600 + minutes * 60}")
//            }
//            "3" -> break
//        }
//    }
//}
//
//// Задание 12
//fun main() {
//    print("Введите выражение: ")
//    val input = readLine() ?: ""
//
//    try {
//        val parts = input.split(" ")
//        var result = parts[0].toDouble()
//
//        for (i in 1 until parts.size step 2) {
//            val op = parts[i]
//            val num = parts[i + 1].toDouble()
//
//            when (op) {
//                "*" -> result *= num
//                "/" -> {
//                    if (num == 0.0) throw ArithmeticException("Деление на ноль")
//                    result /= num
//                }
//                "+" -> result += num
//                "-" -> result -= num
//            }
//        }
//
//        println("Результат: $result")
//    } catch (e: Exception) {
//        println("Ошибка: ${e.message}")
//    }
//}