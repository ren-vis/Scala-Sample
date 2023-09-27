import java.time._
object test {
    def main(args: Array[String]) = {
        println("Hello, world")
        for( a <- 1 to 10){
            println( "Value of a: " + a );
            Thread.sleep(20000L)
        }
    }
}