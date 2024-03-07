package com.rockthejvm

object Basics extends App {

  // define a value
  val meaningOfLife: Int = 42 // final int meaningOfLife = 42;
  val aBoolean = false
  val aString = "I love Scala"
  val aComposedString = "I" + " Love " + "Scala"
  val anInterpolatedString = s"The meaning of life is $meaningOfLife"

  // expressions
  val enExpression = 2 + 3

  // if-expression
  val ifExpression = if (meaningOfLife > 43) 56 else 999

  val aCodeBlock = {
    // definition
    val aLocalVal = 67
    // value of a code block is the value of the last expression
    aLocalVal + 3
  }

  // define a function
  def myFunction (x: Int, y: String) = y + " " + x

  // recursive functions
  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else n * factorial(n -1)
  }

  // In scala we don't use loops or iterations, we use RECURSION

  // The Unit type = no meaningful value == void in Java
  // type of SIDE EFFECTS
  println("I love scala")

  def myUnitReturningFunction(): Unit = {
    println("I don't love returning unit")
  }
  // Unit return is same as follows
  val theUnit = ()

}
