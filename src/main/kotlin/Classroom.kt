import java.util.stream.Collectors

open class Classroom<T : Student>(vararg sts : T) : Iterable<T> {
    val students : MutableList<T> = mutableListOf()
    init {
        for (s in sts) students.add(s)
    }

    override fun iterator(): Iterator<T> {
        return students.iterator()
    }

    fun addBetter(cls : Classroom<Student>) {
        val highestAverageGrade = students.stream().map { it.averageGrade() }.collect(Collectors.toList()).maxOrNull()!!
        cls.students.forEach { if (it.averageGrade() > highestAverageGrade) students.add(it as T)}
    }
}