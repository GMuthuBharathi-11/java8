import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Q4
{
 public static void main (String[] args)
 {
     List<Integer>numbers=new ArrayList<>(Arrays.asList(4,6,5,7,8,9,2,3,45,89));
     Collectors   collectors;
     List<Integer>evenNumbers =numbers.stream()
                                      .filter(num -> num%2==0)
                                      .collect(Collectors.toList());
     List<Employee>employees =new ArrayList<>();
     employees.add(new Employee("suhani",500L,"Jharkhand"));
     employees.add(new Employee("Mohana",6000L,"Bengaluru"));
     employees.add(new Employee("Sandhya",7000L,"Chennai"));
     employees.add(new Employee("Sriharan",8000L,"Hyderabad"));
     employees.add(new Employee("Sumathi",9000L,"Chithradurga"));
     employees.add(new Employee("Muthubharathi",2000L,"Tiruvannamalai"));
     employees.add(new Employee("Guru",1000L,"Delhi"));
     System.out.println(employees.stream()
                                .filter(employee -> employee.getsalary() <5000L && employee.getcity().equals("Beangaluru"))
                                .map(e ->e.getFullname().split(" ")[0])
                                .collect(Collectors.toSet()));



 }
}
