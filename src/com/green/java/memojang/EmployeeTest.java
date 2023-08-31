package com.green.java.memojang;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        List list=new LinkedList();
        int[] hour =  {2, 4, 3, 4, 5, 8, 8};
        int[] hour1= {7, 3, 4, 3, 3, 4, 4};
        int[] hour2= {3, 3, 4, 3, 3, 2, 2};
        for (int i = 0; i < list.size(); i++) {

     //       list.add(new Employee("직원"+i, hour[i] ) );
        }

        }

    //    System.out.println(list.get(0).String);
    }


class Employee{
    String name;
    int[] hour;





    Employee(String name, int[] hour){
        this.name=name;
        this.hour=hour;
    }

   void printTotalHours(){

    }

    void totalHours(){

    }

}