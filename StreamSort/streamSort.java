package com.StreamSort;

import java.util.*;
import java.util.stream.Stream;

public class streamSort {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.addAll(List.of(34, 12, 98, 5, 78, 2));
        List<Integer> sortedList=list1.stream().sorted().toList();
        List<Integer> sortedList1=list1.stream().sorted((a,b)->a-b).toList();//in ascending order
        List<Integer> sortedList2=list1.stream().sorted((a,b)->b-a).toList();//in descending order
        List<Integer> sortedList3=list1.stream().sorted(Comparator.naturalOrder()).toList();
        System.out.println(sortedList);
        System.out.println(sortedList1);
        System.out.println(sortedList2);
        System.out.println(sortedList3);

    }
}
class Q1{
    public static void main(String[] args) {

//        List<Integer>list=list1.stream().sorted((a,b)->a-b).toList();
//        System.out.println(list);


//        List<Integer>list2=list1.stream().sorted((a,b)->-a+b).toList();
//        System.out.println(list2);

//        List<Integer>list2=list1.stream().filter(n->n%2==0).sorted((a,b)->a-b).toList();
//        System.out.println(list2);
//        Stream<Integer> listStream =list2.stream().limit(3);
//        listStream.forEach((item)-> System.out.print(item+ " "));


//        Integer it=list1.stream().sorted((a, b)->b-a).toList().get(1);
//        System.out.println(it);
//        List<Integer>list4=list1.stream().filter(n->n>20).sorted((a,b)->a-b).toList();
//        System.out.println(list4);

    }
}
class employee{
    int sal;
    String name;
    String dept;
    employee(int sal,String name,String dept){
        this.sal=sal;
        this.name=name;
        this.dept=dept;
    }

    @Override
    public String toString() {
        return "employee{" +
                "sal=" + sal +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}

class q4{

    public static void main(String[] args) {
        employee e1=new employee(20000,"Aryan","IT");
        employee e2=new employee(1000,"ALok","Accounts");
        employee e3=new employee(3000,"alok singh","Testing");
        employee e4 =new employee(10000,"arpit","Admin");
        employee e5=new employee(2000,"archit","Ceo");
        List<employee> list1 = Arrays.asList(e1,e2,e3,e4,e5);
        List<employee>list4=list1.stream().sorted((a,b)->a.sal-b.sal).toList();
        for (int i = 0; i < list4.size(); i++) {
            System.out.println(list4.get(i).name+" "+list4.get(i).sal);
        }
        System.out.println("dept");
        List<employee>list5=list1.stream().sorted((a,b)->a.dept.compareTo(b.dept)).toList();
        for (int i = 0; i < list5.size(); i++) {
            System.out.println(list5.get(i).name+" "+list5.get(i).sal);
        }
    }
}
