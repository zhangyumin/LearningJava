package book.core.java;

import java.util.*;


/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by zym on 16-3-5.
 */
public class EmployeeTest {
    public static void main(String[] args) {

        Employee[] stuff = new Employee[3];
        stuff[0] = new Employee("Carl Craker", 75000, 1987, 12, 15);
        stuff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        stuff[2] = new Employee("Tony Test", 40000, 1990, 3, 15);

        for(Employee e : stuff){
            System.out.println("Id: " + e.getId() + ", Name: " +e.getName()+ ", Salary: " +e.getSalary()+ ", At " + e.getHireDate());
        }

        System.out.println("we would like to add their salary by 5%");
        for(Employee e : stuff){
            e.addSalary(5);
        }
        System.out.println("After, there salary would be:");
        for(Employee e : stuff){
            System.out.println("Id: " + e.getId() + ", Name: " +e.getName()+ ", Salary: " +e.getSalary()+ ", At " + e.getHireDate());
        }
    }
}

