package iii_conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

operator fun MyDate.rangeTo(other: MyDate): DateRange {
    return DateRange(this, other)
}

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class DateRange(val start: MyDate, val endInclusive: MyDate)

operator fun DateRange.iterator(): Iterator<MyDate> {
    return DateIterator(this)
}

class DateIterator(private val dateRange: DateRange) : Iterator<MyDate> {
    var current = dateRange.start

    override fun next(): MyDate {
        val result = current
        current = current.addTimeIntervals(TimeInterval.DAY, 1)
        return result
    }

    override fun hasNext(): Boolean {
        return current <= dateRange.endInclusive
    }
}
