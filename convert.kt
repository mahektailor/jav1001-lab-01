fun main() {
    println("Measurement Conversion Program")
    println("-------------------------------")
    println("Available conversions:")
    println("1. Kilometers to Miles")
    println("2. Miles to Kilometers")
    println("3. Centimeters to Inches")
    println("4. Inches to Centimeters")
    println("5. Kilograms to Pounds")
    println("6. Pounds to Kilograms")
    println("7. Grams to Ounces")

    print("Enter the numeric value: ")
    val value = readLine()?.toDoubleOrNull()

    if (value == null) {
        println("Invalid input. Exiting the program.")
        return
    }

    print("Enter the current unit of measurement: ")
    val unit = readLine()?.toIntOrNull()

    val result =
            when (unit) {
                /*function call to Km to miles*/
                1 -> convertKilometersToMiles(value)
                2 -> convertMilesToKilometers(value)
                3 -> convertCentimetersToInches(value)
                4 -> convertInchesToCentimeters(value)
                5 -> convertKilogramsToPounds(value)
                6 -> convertPoundsToKilograms(value)
                7 -> convertGramsToOunces(value)
                else -> {
                    println("Invalid unit of measurement. Exiting the program.")
                    return
                }
            }

    println("Result: $result")
}

/* Created a function to do kilometers to miles  */
fun convertKilometersToMiles(kilometers: Double): Double {
    return kilometers * 0.62
}
/* FUNCTION FOR miles to kilometer */
fun convertMilesToKilometers(miles: Double): Double {
    return miles * 1.61
}

fun convertCentimetersToInches(centimeters: Double): Double {
    return centimeters * 0.39
}

fun convertInchesToCentimeters(inches: Double): Double {
    return inches * 2.54
}

fun convertKilogramsToPounds(kilograms: Double): Double {
    return kilograms * 2.2
}

fun convertPoundsToKilograms(pounds: Double): Double {
    return pounds * 0.45
}

fun convertGramsToOunces(grams: Double): Double {
    return grams * 0.04
}

/*formatted doc */