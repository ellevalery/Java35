package homeworks.members;

public class Manager extends Member{
    private String department;

    public Manager(String name, int age, String phoneNumber, String address, int salary, String department){
        super(name,age,phoneNumber,address,salary);
        this.department = department;
    }
}
