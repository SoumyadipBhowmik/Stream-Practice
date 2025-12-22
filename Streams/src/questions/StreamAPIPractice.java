package questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIPractice {

    public static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(1, "Rajesh Kumar", 28, "Male", "IT", 2019, 75000, "Bengaluru", "Developer", true, 5, "Project Alpha", 4.2),
                new Employee(2, "Priya Singh", 32, "Female", "HR", 2017, 65000, "Mumbai", "HR Manager", false, 8, "Project Beta", 4.5),
                new Employee(3, "Amit Sharma", 45, "Male", "Finance", 2010, 95000, "Delhi", "Finance Manager", false, 15, "Project Gamma", 4.8),
                new Employee(4, "Sneha Patel", 26, "Female", "IT", 2020, 68000, "Pune", "Developer", true, 3, "Project Alpha", 4.0),
                new Employee(5, "Vikram Rao", 38, "Male", "Sales", 2015, 72000, "Hyderabad", "Sales Executive", false, 10, "Project Delta", 4.3),
                new Employee(6, "Ananya Reddy", 29, "Female", "Marketing", 2018, 70000, "Chennai", "Marketing Lead", false, 6, "Project Epsilon", 4.6),
                new Employee(7, "Karthik Nair", 35, "Male", "IT", 2014, 88000, "Bengaluru", "Senior Developer", false, 12, "Project Alpha", 4.7),
                new Employee(8, "Divya Iyer", 27, "Female", "Finance", 2019, 62000, "Mumbai", "Accountant", false, 4, "Project Gamma", 4.1),
                new Employee(9, "Rahul Verma", 31, "Male", "HR", 2016, 67000, "Delhi", "HR Executive", false, 7, "Project Beta", 4.4),
                new Employee(10, "Pooja Gupta", 24, "Female", "IT", 2021, 58000, "Pune", "Junior Developer", true, 2, "Project Alpha", 3.9),
                new Employee(11, "Sandeep Joshi", 42, "Male", "Sales", 2012, 85000, "Hyderabad", "Sales Manager", false, 13, "Project Delta", 4.5),
                new Employee(12, "Neha Agarwal", 30, "Female", "Marketing", 2017, 73000, "Chennai", "Marketing Manager", false, 8, "Project Epsilon", 4.6),
                new Employee(13, "Arun Kumar", 36, "Male", "Finance", 2013, 90000, "Bengaluru", "Senior Accountant", false, 11, "Project Gamma", 4.7),
                new Employee(14, "Lakshmi Menon", 28, "Female", "IT", 2019, 76000, "Mumbai", "Developer", false, 5, "Project Alpha", 4.2),
                new Employee(15, "Suresh Babu", 33, "Male", "HR", 2016, 68000, "Delhi", "HR Manager", false, 9, "Project Beta", 4.4),
                new Employee(16, "Kavita Desai", 25, "Female", "Sales", 2020, 60000, "Pune", "Sales Executive", true, 3, "Project Delta", 4.0),
                new Employee(17, "Manoj Pillai", 40, "Male", "Marketing", 2011, 82000, "Hyderabad", "Marketing Head", false, 14, "Project Epsilon", 4.8),
                new Employee(18, "Shalini Rao", 29, "Female", "IT", 2018, 74000, "Chennai", "Developer", false, 6, "Project Alpha", 4.3),
                new Employee(19, "Deepak Singh", 34, "Male", "Finance", 2015, 87000, "Bengaluru", "Finance Executive", false, 10, "Project Gamma", 4.6),
                new Employee(20, "Ritu Sharma", 27, "Female", "HR", 2019, 64000, "Mumbai", "HR Executive", false, 4, "Project Beta", 4.1),
                new Employee(21, "Vishal Reddy", 31, "Male", "IT", 2017, 79000, "Delhi", "Senior Developer", false, 8, "Project Alpha", 4.5),
                new Employee(22, "Anjali Nair", 26, "Female", "Sales", 2020, 61000, "Pune", "Sales Executive", true, 3, "Project Delta", 3.9),
                new Employee(23, "Ravi Kumar", 39, "Male", "Marketing", 2013, 84000, "Hyderabad", "Marketing Manager", false, 12, "Project Epsilon", 4.7),
                new Employee(24, "Shreya Patel", 28, "Female", "IT", 2019, 75000, "Chennai", "Developer", false, 5, "Project Alpha", 4.2),
                new Employee(25, "Arjun Iyer", 35, "Male", "Finance", 2014, 89000, "Bengaluru", "Senior Accountant", false, 11, "Project Gamma", 4.6),
                new Employee(26, "Meera Gupta", 30, "Female", "HR", 2017, 69000, "Mumbai", "HR Manager", false, 7, "Project Beta", 4.4),
                new Employee(27, "Nikhil Joshi", 32, "Male", "Sales", 2016, 76000, "Delhi", "Sales Manager", false, 9, "Project Delta", 4.5),
                new Employee(28, "Priyanka Verma", 25, "Female", "Marketing", 2020, 62000, "Pune", "Marketing Executive", true, 3, "Project Epsilon", 4.0),
                new Employee(29, "Sanjay Kumar", 41, "Male", "IT", 2012, 92000, "Hyderabad", "Tech Lead", false, 13, "Project Alpha", 4.8),
                new Employee(30, "Tanya Singh", 29, "Female", "Finance", 2018, 72000, "Chennai", "Accountant", false, 6, "Project Gamma", 4.3),
                new Employee(31, "Varun Reddy", 33, "Male", "HR", 2016, 70000, "Bengaluru", "HR Manager", false, 8, "Project Beta", 4.4),
                new Employee(32, "Zoya Patel", 27, "Female", "IT", 2019, 73000, "Mumbai", "Developer", false, 4, "Project Alpha", 4.1),
                new Employee(33, "Akash Nair", 36, "Male", "Sales", 2014, 83000, "Delhi", "Sales Manager", false, 11, "Project Delta", 4.6),
                new Employee(34, "Bhavna Iyer", 28, "Female", "Marketing", 2019, 71000, "Pune", "Marketing Lead", true, 5, "Project Epsilon", 4.2),
                new Employee(35, "Chetan Kumar", 34, "Male", "Finance", 2015, 88000, "Hyderabad", "Finance Manager", false, 10, "Project Gamma", 4.7),
                new Employee(36, "Diya Sharma", 26, "Female", "IT", 2020, 67000, "Chennai", "Developer", false, 3, "Project Alpha", 4.0),
                new Employee(37, "Gaurav Verma", 38, "Male", "HR", 2013, 78000, "Bengaluru", "HR Head", false, 12, "Project Beta", 4.8),
                new Employee(38, "Isha Gupta", 30, "Female", "Sales", 2017, 74000, "Mumbai", "Sales Executive", false, 7, "Project Delta", 4.4),
                new Employee(39, "Jatin Reddy", 32, "Male", "Marketing", 2016, 77000, "Delhi", "Marketing Manager", false, 9, "Project Epsilon", 4.5),
                new Employee(40, "Komal Patel", 25, "Female", "IT", 2020, 64000, "Pune", "Junior Developer", true, 2, "Project Alpha", 3.9),
                new Employee(41, "Lokesh Nair", 40, "Male", "Finance", 2011, 91000, "Hyderabad", "Finance Head", false, 14, "Project Gamma", 4.8),
                new Employee(42, "Megha Iyer", 29, "Female", "HR", 2018, 68000, "Chennai", "HR Executive", false, 6, "Project Beta", 4.3),
                new Employee(43, "Naman Kumar", 35, "Male", "Sales", 2014, 82000, "Bengaluru", "Sales Manager", false, 11, "Project Delta", 4.6),
                new Employee(44, "Ojaswi Singh", 27, "Female", "Marketing", 2019, 70000, "Mumbai", "Marketing Executive", false, 4, "Project Epsilon", 4.1),
                new Employee(45, "Pankaj Sharma", 33, "Male", "IT", 2016, 86000, "Delhi", "Senior Developer", false, 8, "Project Alpha", 4.5),
                new Employee(46, "Queen Verma", 28, "Female", "Finance", 2019, 72000, "Pune", "Accountant", true, 5, "Project Gamma", 4.2),
                new Employee(47, "Rohan Gupta", 37, "Male", "HR", 2014, 79000, "Hyderabad", "HR Manager", false, 10, "Project Beta", 4.7),
                new Employee(48, "Sakshi Reddy", 26, "Female", "Sales", 2020, 63000, "Chennai", "Sales Executive", false, 3, "Project Delta", 4.0),
                new Employee(49, "Tarun Patel", 39, "Male", "Marketing", 2012, 85000, "Bengaluru", "Marketing Head", false, 13, "Project Epsilon", 4.8),
                new Employee(50, "Usha Nair", 30, "Female", "IT", 2017, 78000, "Mumbai", "Developer", false, 7, "Project Alpha", 4.4),
                new Employee(51, "Vinay Kumar", 34, "Male", "Finance", 2015, 87000, "Delhi", "Finance Manager", false, 10, "Project Gamma", 4.6),
                new Employee(52, "Warda Singh", 27, "Female", "HR", 2019, 66000, "Pune", "HR Executive", true, 4, "Project Beta", 4.1),
                new Employee(53, "Yash Sharma", 36, "Male", "Sales", 2013, 84000, "Hyderabad", "Sales Manager", false, 12, "Project Delta", 4.7),
                new Employee(54, "Zara Verma", 25, "Female", "Marketing", 2020, 61000, "Chennai", "Marketing Executive", false, 3, "Project Epsilon", 3.9),
                new Employee(55, "Abhishek Gupta", 31, "Male", "IT", 2017, 80000, "Bengaluru", "Senior Developer", false, 8, "Project Alpha", 4.5),
                new Employee(56, "Bhumi Reddy", 29, "Female", "Finance", 2018, 73000, "Mumbai", "Accountant", false, 6, "Project Gamma", 4.3),
                new Employee(57, "Chirag Patel", 33, "Male", "HR", 2016, 71000, "Delhi", "HR Manager", false, 9, "Project Beta", 4.4),
                new Employee(58, "Disha Nair", 28, "Female", "Sales", 2019, 69000, "Pune", "Sales Executive", true, 5, "Project Delta", 4.2),
                new Employee(59, "Eshan Kumar", 42, "Male", "Marketing", 2010, 93000, "Hyderabad", "Marketing Director", false, 15, "Project Epsilon", 4.9),
                new Employee(60, "Falguni Iyer", 26, "Female", "IT", 2020, 66000, "Chennai", "Developer", false, 3, "Project Alpha", 4.0),
                new Employee(61, "Girish Singh", 35, "Male", "Finance", 2014, 88000, "Bengaluru", "Finance Manager", false, 11, "Project Gamma", 4.7),
                new Employee(62, "Hema Sharma", 30, "Female", "HR", 2017, 70000, "Mumbai", "HR Manager", false, 7, "Project Beta", 4.4),
                new Employee(63, "Irfan Verma", 32, "Male", "Sales", 2016, 77000, "Delhi", "Sales Manager", false, 9, "Project Delta", 4.5),
                new Employee(64, "Jyoti Gupta", 27, "Female", "Marketing", 2019, 68000, "Pune", "Marketing Lead", true, 4, "Project Epsilon", 4.1),
                new Employee(65, "Kartik Reddy", 38, "Male", "IT", 2013, 90000, "Hyderabad", "Tech Lead", false, 12, "Project Alpha", 4.8),
                new Employee(66, "Lata Patel", 29, "Female", "Finance", 2018, 74000, "Chennai", "Accountant", false, 6, "Project Gamma", 4.3),
                new Employee(67, "Mohit Nair", 34, "Male", "HR", 2015, 76000, "Bengaluru", "HR Manager", false, 10, "Project Beta", 4.6),
                new Employee(68, "Nisha Kumar", 26, "Female", "Sales", 2020, 64000, "Mumbai", "Sales Executive", false, 3, "Project Delta", 4.0),
                new Employee(69, "Om Singh", 40, "Male", "Marketing", 2011, 86000, "Delhi", "Marketing Head", false, 14, "Project Epsilon", 4.8),
                new Employee(70, "Pallavi Sharma", 28, "Female", "IT", 2019, 75000, "Pune", "Developer", true, 5, "Project Alpha", 4.2),
                new Employee(71, "Qasim Verma", 36, "Male", "Finance", 2014, 89000, "Hyderabad", "Finance Manager", false, 11, "Project Gamma", 4.7),
                new Employee(72, "Rhea Gupta", 25, "Female", "HR", 2020, 62000, "Chennai", "HR Executive", false, 3, "Project Beta", 3.9),
                new Employee(73, "Sahil Reddy", 31, "Male", "Sales", 2017, 78000, "Bengaluru", "Sales Manager", false, 8, "Project Delta", 4.5),
                new Employee(74, "Tanvi Patel", 29, "Female", "Marketing", 2018, 72000, "Mumbai", "Marketing Manager", false, 6, "Project Epsilon", 4.4),
                new Employee(75, "Uday Nair", 37, "Male", "IT", 2013, 91000, "Delhi", "Tech Lead", false, 12, "Project Alpha", 4.8),
                new Employee(76, "Vani Kumar", 27, "Female", "Finance", 2019, 71000, "Pune", "Accountant", true, 4, "Project Gamma", 4.1),
                new Employee(77, "Wasim Singh", 33, "Male", "HR", 2016, 73000, "Hyderabad", "HR Manager", false, 9, "Project Beta", 4.5),
                new Employee(78, "Yana Sharma", 28, "Female", "Sales", 2019, 70000, "Chennai", "Sales Executive", false, 5, "Project Delta", 4.2),
                new Employee(79, "Zahir Verma", 35, "Male", "Marketing", 2014, 83000, "Bengaluru", "Marketing Manager", false, 11, "Project Epsilon", 4.6),
                new Employee(80, "Aarti Gupta", 26, "Female", "IT", 2020, 67000, "Mumbai", "Developer", false, 3, "Project Alpha", 4.0),
                new Employee(81, "Brijesh Reddy", 39, "Male", "Finance", 2012, 92000, "Delhi", "Finance Head", false, 13, "Project Gamma", 4.8),
                new Employee(82, "Chetna Patel", 30, "Female", "HR", 2017, 69000, "Pune", "HR Manager", true, 7, "Project Beta", 4.4),
                new Employee(83, "Dhruv Nair", 32, "Male", "Sales", 2016, 79000, "Hyderabad", "Sales Manager", false, 9, "Project Delta", 4.5),
                new Employee(84, "Ekta Kumar", 27, "Female", "Marketing", 2019, 68000, "Chennai", "Marketing Executive", false, 4, "Project Epsilon", 4.1),
                new Employee(85, "Falgun Singh", 41, "Male", "IT", 2011, 94000, "Bengaluru", "Tech Lead", false, 14, "Project Alpha", 4.9),
                new Employee(86, "Garima Sharma", 29, "Female", "Finance", 2018, 73000, "Mumbai", "Accountant", false, 6, "Project Gamma", 4.3),
                new Employee(87, "Harish Verma", 34, "Male", "HR", 2015, 77000, "Delhi", "HR Manager", false, 10, "Project Beta", 4.6),
                new Employee(88, "Ira Gupta", 25, "Female", "Sales", 2020, 63000, "Pune", "Sales Executive", true, 3, "Project Delta", 4.0),
                new Employee(89, "Jay Reddy", 38, "Male", "Marketing", 2013, 85000, "Hyderabad", "Marketing Head", false, 12, "Project Epsilon", 4.7),
                new Employee(90, "Kiran Patel", 28, "Female", "IT", 2019, 74000, "Chennai", "Developer", false, 5, "Project Alpha", 4.2),
                new Employee(91, "Lalit Nair", 36, "Male", "Finance", 2014, 88000, "Bengaluru", "Finance Manager", false, 11, "Project Gamma", 4.7),
                new Employee(92, "Mansi Kumar", 26, "Female", "HR", 2020, 65000, "Mumbai", "HR Executive", false, 3, "Project Beta", 4.0),
                new Employee(93, "Naveen Singh", 33, "Male", "Sales", 2016, 80000, "Delhi", "Sales Manager", false, 9, "Project Delta", 4.5),
                new Employee(94, "Oviya Sharma", 29, "Female", "Marketing", 2018, 71000, "Pune", "Marketing Manager", true, 6, "Project Epsilon", 4.4),
                new Employee(95, "Piyush Verma", 37, "Male", "IT", 2013, 90000, "Hyderabad", "Senior Developer", false, 12, "Project Alpha", 4.8),
                new Employee(96, "Quincy Gupta", 27, "Female", "Finance", 2019, 70000, "Chennai", "Accountant", false, 4, "Project Gamma", 4.1),
                new Employee(97, "Rachit Reddy", 35, "Male", "HR", 2014, 78000, "Bengaluru", "HR Manager", false, 11, "Project Beta", 4.6),
                new Employee(98, "Seema Patel", 28, "Female", "Sales", 2019, 69000, "Mumbai", "Sales Executive", false, 5, "Project Delta", 4.2),
                new Employee(99, "Tushar Nair", 40, "Male", "Marketing", 2011, 87000, "Delhi", "Marketing Head", false, 14, "Project Epsilon", 4.8),
                new Employee(100, "Urmila Kumar", 30, "Female", "IT", 2017, 79000, "Pune", "Developer", true, 7, "Project Alpha", 4.4)
        );
    }

    public static void main(String[] args) {
        List<Employee> employees = getEmployees();

        System.out.println("=== JAVA STREAM API PRACTICE QUESTIONS ===\n");

        // Q1: Print all employee names
        // Expected: List of all 100 employee names
        List<String> list = employees.stream().map(Employee::getName).toList();
        System.out.println(list);

        // Q2: Count total number of employees
        // Expected: 100
        long count = employees.size();
        System.out.println(count);

        // Q3: Find all employees from IT department
        // Expected: All employees where department = "IT"
        List<String> employeeList = employees.stream().filter(employee -> employee.getDepartment().equals("IT")).map(Employee::getName).toList();
        System.out.println(employeeList);

        // Q4: Find average salary of all employees
        double averageSalary = employees.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
        System.out.println(averageSalary);

        // Q5: Find highest salary
        // Expected: 95000
        double highestSalary = employees.stream().mapToDouble(Employee::getSalary).max().orElse(0.0);
        System.out.println(highestSalary);

        // Q6: Find employee with highest salary
        // Expected: Amit Sharma
        Employee highestPaidEmployee = employees.stream().max(Comparator.comparing(employee -> employee.getSalary())).orElse(null);
        if ((highestPaidEmployee != null)) {
            System.out.println(highestPaidEmployee);
        } else {
            System.out.println("null");
        }

        // Q7: Find all employees with salary > 80000
        // Expected: All employees earning more than 80000
        List<Employee> employeeStream = employees.stream().filter(employee -> employee.getSalary() > 80000).toList();
        System.out.println(employeeStream);

        // Q8: Count employees in each department
        // Expected: Map with department names as keys and count as values
        Map<String, Long> departmenCount = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.counting()));
        System.out.println(departmenCount);

        // Q9: Find average salary by department
        // Expected: Map with department and average salary
        Map<String, Double> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(collect);

        // Q10: Find youngest employee
        // Expected: Employee with age 24
        Employee youngest = employees.stream().min(Comparator.comparing(Employee::getAge)).orElse(null);
        System.out.println(youngest);

        // Q11: Find oldest employee
        // Expected: Employee with age 45
        Employee oldest = employees.stream().max(Comparator.comparing(Employee::getAge)).get();
        System.out.println(oldest);

        // Q12: Find all female employees
        // Expected: All employees where gender = "Female"
        List<Employee> femaleEmployees = employees.stream().filter(employee -> employee.getGender().equals("Female")).toList();
        System.out.println(femaleEmployees);

        // Q13: Find all male employees working remotely
        // Expected: Male employees where isRemote = true
        List<Employee> maleRemoteEmployees = employees.stream().filter(employee -> employee.getGender().equals("Male") && employee.isRemote() == true).toList();
        System.out.println(maleRemoteEmployees);

        // Q14: Find total salary expense of company
        // Expected: Sum of all salaries
        double sumOfSalary = employees.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println(sumOfSalary);

        // Q15: Find employees who joined after 2018
        // Expected: Employees with yearOfJoining > 2018
        List<Employee> emloyeesAfter2018 = employees.stream().filter(employee -> employee.getYearOfJoining() > 2018).toList();
        System.out.println(emloyeesAfter2018);

        // Q16: Find top 5 highest paid employees
        // Expected: Top 5 employees sorted by salary descending
        List<Employee> employeeList1 = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(5).toList();
        System.out.println(employeeList1);

        // Q17: Find employees from Bengaluru city
        // Expected: All employees where city = "Bengaluru"
        List<Employee> bengaluruBasedEmployees = employees.stream().filter(employee -> employee.getCity().equals("Bengaluru")).toList();
        System.out.println(bengaluruBasedEmployees);

        // Q18: Check if any employee has salary > 100000
        // Expected: false (no one earns more than 100000)
        boolean listOfEmployeesEarningMoreThan10k = employees.stream().anyMatch(employee -> employee.getSalary() > 100000);
        System.out.println(listOfEmployeesEarningMoreThan10k);

        // Q19: Check if all employees are above 20 years old
        // Expected: true
        boolean employeeAgeAbove20 = employees.stream().anyMatch(employee -> employee.getAge() > 20);
        System.out.println(employeeAgeAbove20);


        // Q20: Find distinct cities where employees work
        // Expected: List of unique cities
        List<String> city = employees.stream().map(Employee::getCity).distinct().toList();
        System.out.println(city);

        // Q21: Find average age of employees
        // Expected: Average age (around 31-32)
        double averageAge = employees.stream().mapToInt(Employee::getAge).average().orElse(0);
        System.out.println(averageAge);

        // Q22: Group employees by gender
        // Expected: Map with Male/Female as keys
        Map<String, List<Employee>> collected = employees.stream().collect(Collectors.groupingBy(Employee::getGender));
        System.out.println(collected);

        // Q23: Find employees with experience > 10 years
        // Expected: Employees where experienceYears > 10
        List<Employee> employeeWithExperienceMoreThanTen = employees.stream().filter(employee -> employee.getExperienceYears() > 10).toList();
        System.out.println(employeeWithExperienceMoreThanTen);

        // Q24: Find employee names starting with 'A'
        // Expected: Names starting with A
        List<Employee> employeesStartingWithA = employees.stream().filter(employee -> employee.getName().startsWith("A")).toList();
        System.out.println(employeesStartingWithA);

        // Q25: Sort employees by name alphabetically
        // Expected: All employees sorted by name
        List<Employee> sortedEmployees = employees.stream().sorted(Comparator.comparing(Employee::getName)).toList();
        System.out.println(sortedEmployees);

        // Q26: Find 3rd highest salary
        // Expected: 3rd highest distinct salary value


        // Q27: Find employees working on "Project Alpha"
        // Expected: All employees where projectName = "Project Alpha"

        // Q28: Count male and female employees separately
        // Expected: Male count and Female count

        // Q29: Find average salary of IT department
        // Expected: Average salary of IT employees

        // Q30: Find employees with performance rating >= 4.5
        // Expected: High performers with rating 4.5 or above

        // Q31: Find departments with more than 15 employees
        // Expected: Departments having > 15 employees

        // Q32: Find youngest employee in each department
        // Expected: Map of department to youngest employee

        // Q33: Find employees whose name contains "Kumar"
        // Expected: All employees with "Kumar" in name

        // Q34: Find second youngest employee
        // Expected: Employee with 2nd lowest age

        // Q35: Calculate total salary by department
        // Expected: Map of department to total salary

        // Q36: Find employees from Mumbai or Delhi
        // Expected: Employees from these two cities

        // Q37: Find average experience of employees
        // Expected: Average of experienceYears

        // Q38: Find remote employees count
        // Expected: Count where isRemote = true

        // Q39: Sort employees by salary in descending order
        // Expected: All employees sorted by highest salary first

        // Q40: Find employees with salary between 70000 and 80000
        // Expected: Employees in this salary range

        // Q41: Find department with highest average salary
        // Expected: Department name with max average salary

        // Q42: Find employees who joined in 2019
        // Expected: Employees where yearOfJoining = 2019

        // Q43: Get list of all designations (unique)
        // Expected: Distinct designations

        // Q44: Find employees older than 35
        // Expected: Employees where age > 35

        // Q45: Count employees in each city
        // Expected: Map of city to employee count

        // Q46: Find highest paid employee in IT department
        // Expected: IT employee with max salary

        // Q47: Find employees with performance rating below 4.0
        // Expected: Employees with rating < 4.0

        // Q48: Check if any employee is from Kolkata
        // Expected: false (no employee from Kolkata)

        // Q49: Find average salary of female employees
        // Expected: Average salary of all females

        // Q50: Group employees by city and count them
        // Expected: Map of city to count

        // Q51: Find employees with exactly 5 years experience
        // Expected: Employees where experienceYears = 5

        // Q52: Find total number of projects
        // Expected: Count of distinct projects

        // Q53: Find employees whose salary is above department average
        // Expected: Complex grouping and filtering

        // Q54: Find the most common designation
        // Expected: Designation that appears most frequently

        // Q55: Calculate salary increment of 10% for all IT employees
        // Expected: Map of IT employee names to new salary

        // Q56: Find employees in ascending order of experience
        // Expected: Employees sorted by experience ascending

        // Q57: Find city with maximum employees
        // Expected: City name with most employees

        // Q58: Get last 10 employees by ID
        // Expected: Employees with ID 91-100

        // Q59: Find employees who are neither from IT nor HR
        // Expected: Employees from other departments

        // Q60: Calculate average performance rating by department
        // Expected: Map of department to avg rating

        // Q61: Find employees with name length > 12 characters
        // Expected: Employees with longer names

        // Q62: Find department with most female employees
        // Expected: Department name with max female count

        // Q63: Find all "Manager" designation employees
        // Expected: Employees with Manager in designation

        // Q64: Calculate median salary
        // Expected: Middle value of sorted salaries

        // Q65: Find employees earning exactly average salary
        // Expected: Employees with salary = average (might be none)

        // Q66: Group employees by decade of age (20s, 30s, 40s)
        // Expected: Map with age groups

        // Q67: Find employees working on most common project
        // Expected: Employees on most assigned project

        // Q68: Check if all IT employees earn > 60000
        // Expected: true/false

        // Q69: Find sum of experience years of all employees
        // Expected: Total experience years

        // Q70: Find employees whose ID is even number
        // Expected: Employees with even IDs

        // Q71: Find employees who joined before 2015
        // Expected: Employees with yearOfJoining < 2015

        // Q72: Calculate standard deviation of salaries (advanced)
        // Expected: Standard deviation value

        // Q73: Find top 3 departments by average salary
        // Expected: Top 3 departments with highest avg salary

        // Q74: Find employees with age between 25 and 30
        // Expected: Employees in this age range

        // Q75: Count employees by designation
        // Expected: Map of designation to count

        // Q76: Find employees who are remote and from IT
        // Expected: IT employees where isRemote = true

        // Q77: Find minimum salary in each department
        // Expected: Map of department to minimum salary

        // Q78: Find employees with performance rating exactly 4.5
        // Expected: Employees where rating = 4.5

        // Q79: Get first 5 employees by name alphabetically
        // Expected: First 5 when sorted by name

        // Q80: Find employees from Sales or Marketing department
        // Expected: Employees from these departments

        // Q81: Calculate average age by gender
        // Expected: Map of gender to average age

        // Q82: Find employees whose city name starts with 'B'
        // Expected: Employees from Bengaluru

        // Q83: Find highest performing employee (max rating)
        // Expected: Employee with rating 4.9

        // Q84: Count employees who joined each year
        // Expected: Map of year to count

        // Q85: Find employees with odd ID numbers
        // Expected: Employees with odd IDs

        // Q86: Find department with lowest average age
        // Expected: Department with youngest employees on average

        // Q87: Get names of top 10 earners
        // Expected: Names only of top 10 by salary

        // Q88: Find employees whose name ends with 'a'
        // Expected: Names ending with 'a'

        // Q89: Calculate total salary by city
        // Expected: Map of city to total salary

        // Q90: Find employees with experience less than 5 years
        // Expected: Employees where experienceYears < 5

        // Q91: Group employees by remote status
        // Expected: Map with true/false keys

        // Q92: Find average salary of employees above 30 years
        // Expected: Average salary where age > 30

        // Q93: Find employees from Pune who work remotely
        // Expected: Pune employees where isRemote = true

        // Q94: Count employees with each performance rating
        // Expected: Map of rating to count

        // Q95: Find employees who are not managers (designation check)
        // Expected: Employees without "Manager" in designation

        // Q96: Find city with highest average salary
        // Expected: City name with max average salary

        // Q97: Get list of employees sorted by multiple fields (department, then salary)
        // Expected: Employees sorted by dept asc, then salary desc

        // Q98: Find partition of employees: salary > 75000 vs <= 75000
        // Expected: Map with true/false keys for partition

        // Q99: Find employees whose experience equals their age minus 22
        // Expected: Employees where experienceYears = age - 22

        // Q100: Create summary statistics of salary (count, sum, min, avg, max)
        // Expected: IntSummaryStatistics or DoubleSummaryStatistics object


//        System.out.println("\n=== Complete all 100 questions above ===");
//        System.out.println("Tips:");
//        System.out.println("1. Use filter() for conditions");
//        System.out.println("2. Use map() for transformations");
//        System.out.println("3. Use collect() for collecting results");
//        System.out.println("4. Use Collectors.groupingBy() for grouping");
//        System.out.println("5. Use Collectors.counting() for counts");
//        System.out.println("6. Use Collectors.averagingDouble() for averages");
//        System.out.println("7. Use sorted() with Comparator for sorting");
//        System.out.println("8. Use distinct() for unique values");
//        System.out.println("9. Use anyMatch(), allMatch(), noneMatch() for boolean checks");
//        System.out.println("10. Use reduce() for aggregations");
    }
}