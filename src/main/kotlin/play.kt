import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*


fun main() {
    val inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH)
    val outputFormatter = DateTimeFormatter.ofPattern("dd MMM, yyyy", Locale.ENGLISH)
    val date = LocalDate.parse("2022-01-06T12:58:12Z", inputFormatter)
    val formattedDate = outputFormatter.format(date)
    println(formattedDate) // prints 10-04-2018
}