# Kotlin Introduction

Kotlin is modern OOP and functional language and is a statically typed language same as Java
- free open source language licensed under Apache 2.0

Why Kotlin?
- expressive language and has concise syntax
  - means code is readable and maintainable
- safe language which prevents un-necessary errors
- Interoperable with java

Var and Val
- Var are variables in Kotlin that are mutable
- Val are variables in Kotlin that are immutable


Variable types in Kotlin

- No distinction between primitives and wrapper types
- All numbers in Kotlin are presented as types
  - Integer types: Byte, Short, Int, Long
  - Floating Types : Float, Double
  - Character Type : Char
  - Boolean Type : Boolean

Kotlin and Java have Type inference
- meaning it can identify which type of variable is being assigned
  - in intellij you can see a prompt of "redundant type"

String interpolation or templates
- can use by using $ + name of variable example: (println("Course: $course"))
- can use function execution by wrapping it in a curly braces: ${course.length}

Conditionals - If and When Block

In Kotlin, If Else block is an expression, hence we can assign it to a variable and expect a result
![img.png](img.png)
Anytime you add a last statement, that will be the return value/type
![img_1.png](img_1.png)