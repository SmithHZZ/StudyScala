package study.scala.a.hello

object HelloScala {
  def main(args: Array[String]): Unit = {
    println("Hello Scala")
    helloWorld("Jason")

    variableStudy()

    delayed(time())

    println(sum(1,2))

    //可变参数
    printString(1,"hello","world")
    //匿名函数
    var inc = (x: Int)=>x+1

    println(inc(1))

    //匿名函数用处
    var testFunc = println(1,_:String)

    testFunc("1")
    testFunc("2")
  }

  def helloWorld(s: String) {
    println(s + " hello World")
  }

  def variableStudy(): Unit = {
    var myFirstVar = 10
    //统一赋值
    var i1,i2,i3 = 1
    println(i1)
    println(i2)
    println(i3)
  }

  def time() = {
    println("返回时间的长整型数值")
    System.nanoTime()
  }

  def delayed(t: Long): Unit = {
    println("时间为："+t)

  }

  def sum(a: Int,b: Int) = {
    a + b
  }

  def printString(count: Int,s: String*): Unit = {
    for(i <- s) {
      println(i)
    }
  }

}