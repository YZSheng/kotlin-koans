package iii_conventions

import util.TODO

class Invokable {
    var counter = 0
    fun getNumberOfInvocations(): Int = counter
}

fun todoTask31(): Nothing = TODO(
    """
        Task 31.
        Change the class 'Invokable' to count the number of invocations:
        for 'invokable()()()()' it should be 4.
    """,
    references = { invokable: Invokable -> })

fun task31(invokable: Invokable): Int = invokable()()()().getNumberOfInvocations()

operator fun Invokable.invoke(): Invokable {
    this.counter++
    return this
}
