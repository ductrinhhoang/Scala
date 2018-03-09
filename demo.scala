class Point(var _x: Float = 0, var _y: Float = 0){
  private var x : Float = _x
  private var y : Float = _y
  def show(){
    println("x = "+x+", y = "+y)
  }
}

var p1 = new Point(3, 4)
p1.show()
p1 = new Point(4,3)
p1.show()
println(p1.x)
