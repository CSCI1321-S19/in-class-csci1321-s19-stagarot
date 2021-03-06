package Puyo

class Puyo(val x: Int, val y: Int, val color: PuyoColor.Value) extends Boba {
  def move(dx: Int, dy: Int): Puyo = {
    new Puyo(x + dx, y + dy, color)
  }
  
  def isClear(dx: Int, dy: Int, boardClear: (Int, Int) => Boolean): Boolean = {
    x+dx >= 0 && x+dx < Board.Width && y+dy < Board.Height && boardClear(x+dx, y+dy)
  }
}




trait Boba {
  def x: Int
  def y: Int
  def color: PuyoColor.Value
  
  def move(dx: Int, dy: Int): Boba
}