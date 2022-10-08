package com.kotlinplayground.kotininaction.basics

// Expression class hierarchy
interface Expr
class Num(val value: Int): Expr
class Sum(val left: Expr, val right: Expr) : Expr