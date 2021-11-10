package service

import model.Course
import model.Module
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*


internal class CourseServiceTest {

    val courseService = CourseService()
    val curso = Course ("INTRO-CS-1", "Curso de Frances", 9,
        Module("INTRO-CS-1", "Curso de Frances", "Cuso Introdutório de Frances"))

    @Test
    fun registerCourse(){
        courseService.registerCourse(curso)
        assertEquals(true, courseService.verificar("INTRO-CS-1"))
    }
}