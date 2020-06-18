package Algo3.commands;

import Algo3.data.Student;
import Algo3.stacks.Stack;

public class StackCommand implements ICommand {

    private Console in = new Console();
    private Stack<Student> stack;

    private final String MENU_TEXT = "Console-Application: Exercise-3" + "\n" + 
                                        "1. Push student to stack." + "\n" +
                                        "2. Pop student from stack." + "\n" +
                                        "3. Peek student." + "\n" +
                                        "4. Check if students are on the stack." + "\n" +
                                        "5. Clear stack." + "\n" +
                                        "6. Print all students from stack." + "\n" +
                                        "7. Get size of stack." + "\n" +
                                        "0. Exit." + "\n" +
                                        "Please enter a number for an option:";

    public StackCommand() {

        stack = new Stack<Student>();
    }


    @Override
    public void execute() {
        
        int userInput = 12;

        while ( userInput != 0 ) {

            userInput = in.inputInt(MENU_TEXT);

            switch ( userInput ) {
                
                case 1:
                    stack.push(
                        CreateStudent.create()
                    );
                    break;

                case 2:
                    System.out.println(
                        "Student popped: " + stack.pop()
                    );
                    break;

                case 3:
                    System.out.println(
                        "Student peeked: " + stack.peek()
                    );
                    break;
                
                case 4:
                    System.out.println(
                        stack.isEmpty() ? "stack is empty" : "stack is not empty"
                    );
                    break;
                
                case 5:
                    stack.clear();
                    break;

                case 6:
                    stack.printAll();
                    break;

                case 7:
                    System.out.println(
                        "size:  " + stack.size()
                    );
                    break;
            
                case 0:
                    break;

                default: 
                    System.out.println("Please enter another number");
                    break;
            }   
        }
    }
    
}