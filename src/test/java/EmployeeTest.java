import static org.junit.Assert.*;


public class EmployeeTest {
    public static void main (String args[]) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        emp1.name = "padmaja";
        emp2.setName("Rajendra Reddy");
        emp1.printEmp();
        emp2.printEmp();

    }

}