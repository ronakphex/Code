import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {

    private int id;
    private String name;
    private int age;
    private String gender;
    private String department;
    private int yearOfJoining;
    private double salary;

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }


    //List of employees in each department:{Product Development=[Murali Gowda, Sanvi Pandey, Anuj], Security And Transport=[Iqbal Hussain], Sales And Marketing=[Paul Niksui], Infrastructure=[Martin Theron, Jasna Kaur], HR=[Jiya Brein, Nima Roy]}
    //Count of employees in each department:{Product Development=3, Security And Transport=1, Sales And Marketing=1, Infrastructure=2, HR=2}
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0),
               new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0),
        new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0),
        new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0),
        new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0),
        new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0),
        new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0),
        new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0),
        new Employee(277, "Anuj", 31, "Male", "Product Development", 2012, 35700.0));


        //list of employees in each department
        Map<String,List<String>> employessInEachDepartmentMap = employees.stream().collect(Collectors
                .groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName,Collectors.toList())));

        System.out.println("List of employees in each department:"+employessInEachDepartmentMap);


        Map<String,Long> countMap = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));

        System.out.println("Count of employees in each department:"+countMap);
    }
}
