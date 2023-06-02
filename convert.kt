/*File created for lab 01 convert.kt */

/*Task
You may work in groups of up to 3 students.
Convert.kt Write a small Kotlin command line application (Convert.kt) that allows a user to convert between different forms of measurement. The program should:
Collect a numeric value from the user and store it in an appropriate variable
Collect the current unit of measurement
Determine the appropriate conversion (in either direction, i.e., the user can enter km or mi)
Display the new result
 */
fun main(){
    /* Printing Program name  */
    println("Measurement Conversion Program")
    /* Asking User for Value Variable and storing  it  */
    print("Enter the numeric value: ")
    val value = readLine()?.toDoubleOrNull()
}