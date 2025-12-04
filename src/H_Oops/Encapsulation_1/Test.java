package H_Oops.Encapsulation_1;

public class Test {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Pooja", 222000.8f);

        e1.display();

        e1.setId(22);
        e1.setName("Meena");
        e1.setSalary(3000.5f);

        System.out.println(e1.getId() + "  " + e1.getName() + "  " + e1.getSalary());

        System.out.println("Employee Details: " + e1);
    }
}
/*
Output -
1  Pooja  222000.8
22  Meena  3000.5
Employee Details: Employee [id=22, name=Meena, salary=3000.5]
 */
