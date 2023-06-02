fun main() {
    println("Measurement Conversion Program")
    println("-------------------------------")
    println("Available conversions:")
    println("1. Kilometers to Miles")
 

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

