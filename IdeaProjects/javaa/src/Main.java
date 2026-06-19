
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

class Employee {
    private int id;
    private String name;
    private double salary;
    private String dept;

    // Constructor
    public Employee(int id, String name, double salary, String dept) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public String getDept() {
        return dept;
    }

    // toString method for printing
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + ", name='" + name + "' }";
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", 15000, "ECE"),
                new Employee(2, "Bob", 25000, "CSE"),
                new Employee(3, "Charlie", 30000, "CSE"),
                new Employee(4, "David", 18000, "ECE")

        );

        // Using Streams to filter employees with salary > 20000
        List<Employee> lst  = employees.stream()
                .filter(n -> n.getSalary()>20000)
                .filter(e ->e.getName().startsWith("C"))
                .collect(Collectors.toList());
        System.out.println(lst);

        double avgSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
        System.out.println(avgSalary);

        Map<String, Employee> getSecondHigh = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept,
                        Collectors.collectingAndThen(Collectors.toList(),
                                list -> list.stream()
                                        .sorted(Comparator.comparing(Employee::getSalary).reversed())
                                        .limit(2)
                                        .skip(1)
                                        .findFirst()
                                        .orElse(null)
                        )));
        System.out.println(getSecondHigh);










        String strg = "mkarthicklkarthick";

        Character resl = strg.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(f -> f.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
        System.out.println(resl);


        List<String> lsts = Arrays.asList("string","integer", "char", "boolean");


       for(String vas : lst)
       {
           Map<Character, Integer> map = new HashMap<>();
           //String
           for(int i=0; i< vas.length(); i++)
           {
               char ch = vas.toLowerCase().charAt(i);
               if(ch == 'a' || ch=='e'|| ch=='i'||ch =='o' || ch =='u')
               {
                   map.put(ch, map.getOrDefault(ch, 0)+1);
               }

               System.out.println(map);
           }


       }































    }
}