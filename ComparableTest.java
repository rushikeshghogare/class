package Collection;
import java.util.Comparator;

class lastNameComparator implements Comparator<Test>{


    @Override
    public int compare(Test o1, Test o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
class middleNameComparator implements Comparator<Test>{


    @Override
    public int compare(Test o1, Test o2) {
        return o1.getMiddleName().compareTo(o2.getLastName());
    }
}

class Test implements Comparable{
    private String firstName;
    private String lastName;
    private String middleName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private double salary;

    public Test() {


    }
public Test(String firstName, String middleName, String lastName, int age, double salary){
        this.firstName=firstName;
        this.lastName=lastName;
        this.middleName=middleName;
        this.age=age;
        this.salary=salary;

}


    public int compareTo(Test o) {
        return this.getFirstName().compareTo(o.getFirstName());
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
public class ComparableTest {
    public static void main(String[] args) {

    }
}
