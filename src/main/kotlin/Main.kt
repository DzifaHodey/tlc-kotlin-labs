fun main() {
    println("Hello World!")

    // q2
    var hello = "Hello!"
    println(hello)

    //q3
   /* for (x in -5..5){
        println(calculateY(3,x,-1))
    }*/

    //q4
    for (x in 0..20){
        var y1 = calculateY(3,x,5)
        var y2 = calculateY(4,x,2)
        if (y1==y2){
            println("($x , $y1)")
            break
        }
    }

    //q5
    intersection(3,5, 4, 2)
    intersection(2,1, 3, 3)
    intersection(-2,3, 3, -2)

}

fun calculateY(m : Int, x : Int, c : Int) : Int {
    // calculate y=mx+c
    return m * x + c
}

/**
 * This function prints the value of the x-coordinate where two lines intersect
 * @param mOne The gradient of the first line.
 * @param cOne The intercept of the first line
 * @param mTwo The gradient of the first line.
 * @param cTwo The intercept of the first line
 * */
fun intersection(mOne : Int, cOne : Int, mTwo : Int, cTwo : Int) : Unit{
    var xValue = (cTwo - cOne)/(mOne-mTwo)
    if(xValue in 1..99) println("x value: $xValue")
    else println("Don't intersect")
}