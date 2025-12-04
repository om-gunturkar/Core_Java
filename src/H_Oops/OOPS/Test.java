package H_Oops.OOPS;

public class Test {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.showEmp();
        e1.show();

        System.out.println("-------------------");

        Employee e2 = new Employee(222, "Riya");
        e2.showEmp();
    }
}
/*
Output -
Person class constructor called!!!
Employee default constructor called!!
Employee Name: Pooja, Id: 0
Person Name: Meena
Employee can dance!!!
Person can dance!!!
-------------------
Person class parameterized constructor called!!!
Employee parameterized constructor called!!
Employee Name: Pooja, Id: 222
Person Name: Riya
 */
