package edu.csh.chase.osrs.cluescrolls.solver.models.parsers

sealed class ParseResult<T> {
    class Success<T>(val model: T) : ParseResult<T>()
    class Failure<T>(val error: String) : ParseResult<T>()
}

fun <T> T.wrap() = ParseResult.Success(this)

fun <T> String.failure() = ParseResult.Failure<T>(this)