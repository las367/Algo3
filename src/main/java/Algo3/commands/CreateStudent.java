package Algo3.commands;

import Algo3.data.Student;

public class CreateStudent {

    private  static Console in = new Console();

    public static Student create() {

        String prename = in.inpuString("Please enter Prename: ");
        String surname = in.inpuString("Please enter surname: ");
        int course = in.inputInt("Please enter course number: ");
        int matNumber = in.inputInt(" Please enter matriculation number: ");

        return new Student(prename, surname, course, matNumber);
    }
    
}