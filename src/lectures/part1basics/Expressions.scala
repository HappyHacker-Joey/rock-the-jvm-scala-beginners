package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // expressions
  println(x)

  println(2 + 3 * 4)
  // + - * / & ^ right s

  println(1 == x)

  var aVaribale = 2 // also works with --
  aVaribale += 3
  println(aVaribale)

  // INstrucrtions (DO) vs Expressions

  //IF expression
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3
  println(aConditionedValue)
  println(1 + 3)

  // Avoid loop in functional programming language
  // NEVER WRITE THIS
  var i = 0
  val aWhile = while (i < 10) {
    println(i)
    i += 1
  }

  // EVERYTHING in Scala is an Expression!
  val aWeirdValue = (aVaribale = 3) // Unit === void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning - means return Unit

  // Code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  // 1. difference between "hello world" vs println("hello world")?
  //  -> println is expression which return Unit, side effect.
  // 2.

  val someValue = {
    2 < 3
  }
  println(someValue)
  val someOtherValue = {
    if (someValue) 239 else 986
    42
  }

  println(someOtherValue)
}
