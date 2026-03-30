package com.streamMinMax;

import java.util.*;
import java.util.stream.Stream;

public class StreamMaxMin {
    public static void main(String[] args) {
//        List<Integer> list1=Arrays.asList(20,30,40,10,40,50);
//        Optional<Integer> result=list1.stream().min((a,b)->a-b);
//        result.ifPresent(System.out::println);

//        List<Integer>list=new ArrayList<>();
//        Stream<Integer> listStream =list1.stream().limit(3);
//        listStream.forEach((item)-> System.out.print(item+ " "));

//        Optional<Integer> result=list1.stream().distinct().max((a,b)->a-b);
//        result.ifPresent(System.out::println);

//        list1.stream().distinct().skip(5).limit(3).forEach(System.out::println);

//        List<String> list2=Arrays.asList("zoya","ravi","shyam");
//        Optional<String> result1=list2.stream().min((a,b)->a.compareTo(b));
//        result1.ifPresent(System.out::println);

        ArrayList<Employee> empList = new ArrayList<>(Arrays.asList(
                new Employee(101, "Amit", 50000, 25, "IT"),
                new Employee(102, "Neha", 60000, 28, "HR"),
                new Employee(103, "Ravi", 45000, 24, "IT"),
                new Employee(104, "Karan", 70000, 30, "Finance"),
                new Employee(105, "Pooja", 55000, 27, "HR"),
                new Employee(106, "Rohit", 80000, 32, "IT"),
                new Employee(107, "Simran", 65000, 29, "Finance"),
                new Employee(108, "Amit", 50000, 25, "IT")
        ));

        Optional<Employee> result34=empList.stream().min(Comparator.comparingInt(Employee::getAge));
        result34.ifPresent(System.out::println);

    }
}

class Employee {
    int id;
    String name;
    double salary;
    int age;
    String department;

    public Employee(int id, String name, double salary, int age, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.department = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }
}
//Sample ArrayList (used in questions)
