package iii_conventions

import util.TODO
import util.doc25

fun todoTask25(): Nothing = TODO(
    """
        Task 25.
        Uncomment the commented line and make it compile. 
        Make all the changes to the file MyDate.kt.

        Tips: Make the class 'MyDate' implement 'Comparable'.
    """,
    documentation = doc25(),
    references = { date: MyDate, comparable: Comparable<MyDate> -> }
)

fun task25(date1: MyDate, date2: MyDate): Boolean {
//    todoTask25()
    return date1 < date2
}

operator fun MyDate.compareTo(date2: MyDate): Int {
    if (year < date2.year) return -1
    if (year == date2.year && month < date2.month) return -1
    if (year == date2.year && month == date2.month && dayOfMonth < date2.dayOfMonth) return -1
    if (year == date2.year && month == date2.month && dayOfMonth == date2.dayOfMonth) return 0
    return 1
}

