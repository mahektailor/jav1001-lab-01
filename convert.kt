fun main() {
    println("Measurement Conversion Program")
    println("-------------------------------")
    println("Available conversions:")
    println("1. Kilometers to Miles")
    println("2. Miles to Kilometers")
    println("3. Centimeters to Inches")
    println("4. Inches to Centimeters")
 

    print("Enter the numeric value: ")
    val value = readLine()?.toDoubleOrNull()

    if (value == null) {
        println("Invalid input. Exiting the program.")
        return
    }

    print("Enter the current unit of measurement: ")
    val unit = readLine()?.toIntOrNull()

    val result = when (unit) {
        /*function call to Km to miles*/
        1 -> convertKilometersToMiles(value)
        2 -> convertMilesToKilometers(value)
        3 -> convertCentimetersToInches(value)
        4 -> convertInchesToCentimeters(value)
 
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