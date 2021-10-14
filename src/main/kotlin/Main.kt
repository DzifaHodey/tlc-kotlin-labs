fun main() {
    val clrm = Classroom(
       MitigatedStudent("Charlie", listOf(40.0, 50.0, 50.0, 50.0)),
        MitigatedStudent("Bob", listOf(40.0,10.0,40.0,40.0)),
        MitigatedStudent("Alice", listOf(20.0, 70.0, 70.0, 70.0))
    )
//    clrm.addBetter(SortedClassroom(
//        Student("Kojo", listOf(48.0, 90.0, 100.0, 100.0)),
//        Student("Kwame", listOf(4.0, 2.0, 90.0, 55.0))))

    for (s : MitigatedStudent in clrm) {
        println("Student ${s.name} with grade ${s.averageGrade()}")
    }

//    println()
//    val sortedClrm = SortedClassroom(
//        Student("Charlie", listOf(40.0, 80.0, 90.0, 55.0)),
//        Student("Bob", listOf(40.0,10.0,20.0,25.0)),
//        Student("Alice", listOf(20.0, 70.0, 60.0, 30.0))
//    )

//    for (s : Student in sortedClrm) {
//        println("Student ${s.name} with grade ${s.averageGrade()}")
//    }
}