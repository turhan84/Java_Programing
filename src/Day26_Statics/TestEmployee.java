package Day26_Statics;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Turhan");
        System.out.println(employee1);
        Employee employee2 = new Employee("Turhan",'M');

        System.out.println(employee2);

        Employee employee3 = new Employee("Turhan",'M',"Java Developer");
        System.out.println(employee3);
        Employee employee4 = new Employee("Turhan",'M',"Java Developer",150000);
        System.out.println(employee4);
        Employee employee5 = new Employee("Turhan","Java Developer");
        System.out.println(employee5);
        Employee employee6 = new Employee("Turhan","Java Developer",150000);
        System.out.println(employee6);
    }
}
