import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Algo3.data.Student;
import Algo3.stacks.Stack;

public class StackTest {
        
        Student s1 = new Student("Mickey", "Mouse", 12, 3);
        Student s2 = new Student("Bart", "Simpson", 1, 5);
        Stack<Student> stack = new Stack<Student>();

        @Test
        public void TestPush () {
                
                stack.push(s1);
                assertFalse(stack.isEmpty());
        }

        @Test
        public void TestPop () {
                
                stack.push(s1);

                assertEquals("Student popped should match the last student pushed to the stack", true, stack.pop().equals(s1));
                assertTrue("Stack should be empty", stack.isEmpty());
        }

        @Test
        public void TestPeek () {
                
                stack.push(s1);
                assertEquals("Student peeked should match the last student pushed", true, stack.peek().equals(s1));
                assertTrue("Stack should not be empty", stack.isEmpty() == false);
        }

        @Test
        public void TestClearAndIsEmptyOnCreate () {
                
                assertEquals("Stack should be empty when no student is added", true, stack.isEmpty());

                stack.push(s1);
                stack.push(s2);

                stack.clear();
                assertEquals("Stack should be empty after clear is called", true, stack.isEmpty());
        }

        @Test
        public void TestSize () {
                
                stack.push(s1);
                stack.push(s2);

                assertEquals("The size of the stack should equal num of student added", 2, stack.size());
        }
}