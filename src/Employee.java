import java.awt.color.ICC_ColorSpace;

public class Employee
{
    private final String fullname;
    private final long   salary;
    private final String city;
    public Employee (String fullname,long salary,String city) {
        this.fullname = fullname;
        this.salary   = salary;
        this.city  = city;
    }
    public String getFullname()
    {
        return fullname;
    }
    public long getsalary()
    {

        return salary;
    }
    public String getcity()
    {
        return city;
    }
   public String toString()
   {
       return "Employee {" +
              "fullname='"+fullname + '\'' +",salary=" + salary + ",city='" + city +'\'' +
              '}';
   }
}