package inaction.basics

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr): Expr

fun main() {
    println((Sum(Sum(Num(1), Num(2)), Num(4))))
}