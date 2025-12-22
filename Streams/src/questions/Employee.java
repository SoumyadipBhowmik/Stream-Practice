package questions;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String department;
    private int yearOfJoining;
    private double salary;
    private String city;
    private String designation;
    private boolean isRemote;
    private int experienceYears;
    private String projectName;
    private double performanceRating;

    public Employee(int id, String name, int age, String gender, String department,
                    int yearOfJoining, double salary, String city, String designation,
                    boolean isRemote, int experienceYears, String projectName, double performanceRating) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.city = city;
        this.designation = designation;
        this.isRemote = isRemote;
        this.experienceYears = experienceYears;
        this.projectName = projectName;
        this.performanceRating = performanceRating;
    }

    // Getters
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

    public String getCity() {
        return city;
    }

    public String getDesignation() {
        return designation;
    }

    public boolean isRemote() {
        return isRemote;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public String getProjectName() {
        return projectName;
    }

    public double getPerformanceRating() {
        return performanceRating;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', department='" + department +
                "', salary=" + salary + ", city='" + city + "'}";
    }
}