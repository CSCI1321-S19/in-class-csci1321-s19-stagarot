package basics

//import basics.ArrayQueue

object Utility extends App {
  def findAndRemove[A](lst: List[A])(pred: A => Boolean): (Option[A], List[A]) = {
    lst match {
      case Nil => (None, lst)
      case h :: t =>
        if(pred(h)) (Some(h), t) else {
          val (found, fixedList) = findAndRemove(t)(pred)
          (found, h :: fixedList)
        }
    }
  }
  
  val nums = List(1,2,3,4,5,6,7,8,9,5,5,5,5)
  val (five, notFive) = findAndRemove(nums)(_ == 5)
  println(five, notFive)
  
  val maze = Array(
      Array( 0,-1, 0, 0, 0,-1, 0,-1, 0, 0),
      Array( 0,-1, 0,-1, 0,-1, 0, 0, 0, 0),
      Array( 0,-1, 0,-1, 0, 0, 0, 0,-1, 0),
      Array( 0,-1, 0,-1,-1,-1,-1, 0,-1, 0),
      Array( 0, 0, 0, 0, 0,-1, 0, 0,-1, 0),
      Array( 0,-1,-1,-1,-1,-1, 0,-1,-1, 0),
      Array( 0,-1, 0, 0, 0, 0, 0,-1, 0, 0),
      Array( 0,-1, 0, 0,-1,-1, 0,-1, 0,-1),
      Array( 0,-1,-1, 0,-1, 0, 0,-1, 0, 0),
      Array( 0, 0, 0, 0,-1, 0, 0,-1, 0, 0))
  
  
  def shortestPath(sx: Int, sy: Int, ex: Int, ey: Int, maze: Array[Array[Int]]): Int = {
    val queue = new ArrayQueue[(Int, Int, Int)]()
    queue.enqueue((sx, sy, 0))
    while(!queue.isEmpty) {
      val (x, y, steps) = queue.dequeue()
    }
    -1000000000
  }
}