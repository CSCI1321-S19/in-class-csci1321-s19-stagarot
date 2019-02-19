package Puyo

class Puyo(val x: Int, val y: Int, val color: PuyoColor.Value) extends Boba {
    def fall(): Puyo = {
      new Puyo(x, y+1, color)
    }
}




trait Boba {
  def x: Int
  def y: Int
  def color: PuyoColor.Value
  
  def fall(): Boba
}