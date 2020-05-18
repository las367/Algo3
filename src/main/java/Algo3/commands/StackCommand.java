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
                                        " 7. Get size of stack." + "\n" +
                                        " 0. Exit." + "\n" +
                                        "Please enter a number for an option:";

    public StackCommand() {

        stack = new Stack<Student>();
    }


    @Override
    public void execute() {
        // TODO add commands

    }
    
}