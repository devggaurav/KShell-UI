package com.example.demo.commands

import com.example.demo.models.Argument

internal class Arguments(
    private val arguments: List<Argument>,
): Iterable<Argument> {
    internal operator fun get(index: Int) = arguments[index]
    internal fun first() = arguments[0]
    internal fun last() = arguments[count() - 1]
    internal fun count() = arguments.size
    internal fun dropFirst() = Arguments(arguments.drop(1))
    internal fun isEmpty() = arguments.isEmpty()
    override fun iterator() = arguments.iterator()
}