
object sample {
  def main(args : Array[String]){
      println("holla!");
      
      val numbers = List(1, 2, 3, 4, 5, 6)
      
      var total = 0;
      for(e <- numbers){
        total+= e
      }
      println(total)
      
      println(
          numbers.foldLeft(0) { (c, e) => c + e}
      )
      
      var greet = "hello"
      println(greet)
      
      greet = "howdy"
      println(greet)
      
     // greet = 1
      
      
      
      
  }
}