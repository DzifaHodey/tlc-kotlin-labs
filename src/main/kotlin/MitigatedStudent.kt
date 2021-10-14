class MitigatedStudent( name : String, grades : List<Double>) : Student(name, grades) {
    override fun averageGrade() : Double {
        var updatedGrades : MutableList<Double> = grades.sorted().toMutableList()
        updatedGrades.removeAt(0)
        return updatedGrades.reduce { a, b -> a + b } /updatedGrades.size
    }
}