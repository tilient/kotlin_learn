package org.tilient.learn

fun main(args: Array<String>)
{
  println("Learning Kotlin ...")
  println("-------------------")
  val arr = arrayOf(1,2,3,4)
  for (nr in arr) { println(nr) }
  println("-------------------")
  val nrs = (2..20).step(2).reversed()
  for (nr in nrs) { println(nr) }
  println("-------------------")
}
