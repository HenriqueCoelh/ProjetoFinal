package service

import model.Student
import org.junit.jupiter.api.Assertions.*

internal class StudentServiceTest {
val studentService = StudentService()
val estudante = Student("123", "Henrique", "henrique@", null)

    @org.junit.jupiter.api.Test
    fun subscribeStudent() {
        studentService.subscribeStudent(estudante)
        assertEquals(true, studentService.isSubscribed("123"))
    }
}