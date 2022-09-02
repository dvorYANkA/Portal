package students.portal.demo.services;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import students.portal.demo.model.Student;
import students.portal.demo.repository.StudentRepository;
import students.portal.demo.services.implementations.StudentServiceImpl;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceImplTest {

    StudentServiceImpl studentService;

    @Mock
    StudentRepository studentRepository;

    @Before
    public void anyMethodBeforeMyTests() throws Exception {
        MockitoAnnotations.initMocks(this);
        studentService = new StudentServiceImpl(studentRepository);
    }

    @Test
    public void findAll() throws Exception {
        Set<Student> students = studentService.findAll();
        assertEquals(students.size(),0);
    }
}