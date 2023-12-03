import com.kevin.kotlin.Student
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest {
    @Test
    fun highestTest() {
        val student = Student("Kevin", 77, 88)
        Assertions.assertEquals(77, student.english)
    }

    @Test
    fun averageTest() {
        val student = Student("Kevin", 77, 88)
        Assertions.assertEquals((77 + 88) / 2, student.getAverage())
    }

    @Test
    fun gradingTest() {
        val student = Student("Kevin", 77, 88)
        Assertions.assertEquals('B', student.grading())
    }
}