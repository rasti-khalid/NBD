import Assignment1.days

import scala.::
import scala.Byte.MaxValue.+
import scala.Int.int2double
import scala.collection.convert.ImplicitConversions.`seq AsJavaList`
import scala.io.StdIn.readInt

object Assignment1 {
  val days = List("monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday")
  val numbers = List(1,4,5,6,8)
  val realNumbers = List(1.5,-4.3,5.7,6.1,-8.7)
  val tupleValues = new Tuple3(1, "hello", 2.2)
  val Values = List(0,1,2,0,3)
  val option = Map("Name" -> "Rasti", "Occcupation" -> "Student")

  def main(args: Array[String]) {
    println("________________________________________")
    println("task 1.a")
    A1_1a(days)
    println()
    println("________________________________________")
    println("task 1.b")
    A1_1b(days)
    println()
    println("________________________________________")
    println("task 1.c")
    A1_1c(days)
    println()
    println("________________________________________")
    println("task 3")
    A1_3(days)
    println
    println("________________________________________")
    println("task 4a")
    A1_4a(days)
    println
    println("________________________________________")
    println("task 4.b")
    A1_4b(days)
    println
    println("________________________________________")
    println("task 4.c")
    A1_4c(days)
    println()
    println("________________________________________")
    println("task 5")
    A1_5
    println()
    println("________________________________________")
    println("task 6")
    A1_6(numbers)
    println()
    println("________________________________________")
    println("task 7")
    A1_7(realNumbers)
    println()
    println("________________________________________")
    println("task 8")
    A1_8(tupleValues)
    println("________________________________________")
    println("task 9")
    A1_9(Values)
    println()
    println("________________________________________")
    println("task 10")
    //print(A1_9(option.get("Rasti"))


  }


  def A1_1a(list: List[Any]) {
    var StringDays = ""
    for (day <- list) StringDays += day + ", "

    print(StringDays)
  }


  def A1_1b(list: List[Any]) {
    var StringDayss = ""
    for (day <- days) {
      if (day.startsWith("s")) StringDayss += day + ", "
      else ""
    }
  print(StringDayss)

  }

  def A1_1c(list: List[Any]){
    var StringDayssss=""
    var x=0
    while (x<list.length){
      StringDayssss +=list(x)+ ", "
      x+=1
    }
    print(StringDayssss)

  }

  def A1_3(list: List[Any]){
    if(!list.isEmpty){
      print(list.head + ", ")
      A1_3(list.tail)
    }
  }



  def A1_4a(list: List[Any]){
    var str1=list.foldLeft("")(_ +_ + ", ")
    print(str1)
  }
  def A1_4b(list: List[Any]): Unit ={
    var str2=list.foldRight("")(_ + ", " + _)
    print(str2)
  }

  def A1_4c(list: List[Any]) {
    var str=list.foldLeft("")(_ +_ + ", ")
    print(str)
  }

  def A1_5(): Unit ={
    val map1: Map[String, Int]
     = Map("iphone 12" -> 900, "Galaxy s20" -> 800, "one plus 8" -> 600, "iphone XR" -> 450)
    println("Prices before the Reduction")
    map1.keys.foreach {key =>
     println(key+"= "+map1(key))
    }
    println("Prices After the Reduction")
    map1.keys.foreach {key =>
      val reducedPrice =map1(key)-map1(key)*0.10
      val map2: Map[String, Double]
      = Map(key -> reducedPrice)
      println(key+"= "+map2(key))
    }
  }
  def A1_6(list: List[Int]){

    println(list)
    println("after +1 to all the elements")
    val result = list.map(x => x+1)
    print(result)
  }
  def A1_7(list: List[Double]){
    println(list)
    println("absolut of all the elements from range of -5 to 12")
    val result = list.filter(x => x>= -5 && x <= 12).map(x => x.abs)
    print(result)
  }

  def A1_8(tuple: (Int, String, Double)): Unit ={
    println(tuple)
  }

  def A1_9(list: List[Any]): Unit ={

    var result=list.filter(x=> x!=0)
    print(result)


  }





}