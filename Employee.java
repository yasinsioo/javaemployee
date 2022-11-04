public class Employee {
    private String firstName;
    private String lastName;
    private int salary;
    private int year;
    private int employeeId;

    public Employee(String firstName, String lastname, int salary, int year, int employeeId) {
        this.firstName = firstName;
        this.lastName = lastname;
        this.salary = salary;
        this.year = year;
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String firstName) {
        this.firstName = firstName;
    }
    public void setEmployeeLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmployeeName(int salary) {
        this.salary = salary;
    }
    public void setYear (int year) {
        this.year = year;
    }
    public void setEmployeeId (int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return firstName;
    }
    public String getEmployeeLastName() {
        return lastName;
    }
    public int getSalary() {
        return salary;
    }
    public int getYear () {
        return year;
    }
    public int getEmployeeId () {
        return employeeId;
    }
    public String getEmployeeStatus(int id) {
        if (String.valueOf(employeeId).startsWith("1")) {
            return "Executive";
        } else if (String.valueOf(employeeId).startsWith("2")) {
            return "Manager";
        } else {
            return "Common Employee";
        }

    }
    public int getNewSalary() {
        if (getEmployeeStatus(employeeId).equals("Common Employee") && year >= 5) {
            return salary = salary + (salary / 100 * 20) ;
        } else if (getEmployeeStatus(employeeId).equals("Common Employee")) {
            return salary = salary + (salary / 100 * 10) ;
        } else {
            return salary = salary + (salary / 100 * 15) ;
        }
    }
    public void displayDetails() {
        System.out.println("Employee name: " + firstName);
        System.out.println("Employee last name:" + lastName);
        System.out.println("Employee id: " + employeeId);
        System.out.println("Employee salary: " + salary);
        System.out.println("\t--> Employee new salary: " + getNewSalary());
        System.out.println("\t--> Employee status: " + getEmployeeStatus(getEmployeeId()));
    }


}
