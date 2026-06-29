package javaPrograms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Employee {
    String name="";
    String department = "";
    int id=0;
//    static List<Employee> listOfEmployee = new ArrayList<>();
    static Map<Integer,List<Employee>> map = new LinkedHashMap<>();

    Employee(String name, String department, int id){
        this.name=name;
        this.department=department;
        this.id=id;
    }

    public static void addEmployee(String name, String department, int id){
        Employee emp = new Employee(name,department,id);
        List<Employee> listOfEmp = new ArrayList<>();
        listOfEmp.add(emp);
        map.put(id,listOfEmp);
    }

    public static void showEmployees(){
        for (Map.Entry<Integer,List<Employee>> entry: map.entrySet()){
            System.out.println(new ArrayList<>(entry.getValue()));
        }
    }

    public static void removeEmployee(int id){
        map.remove(id);
    }

//    public static void updateEmployee(int id){
//        List<Employee> employee = map.get(id);
//
//    }

    @Override
    public String toString(){
        return name+ ", " +department+", "+id;
    }
    public static void main(String[] args) {
        addEmployee("Naveen","RestAssured", 3);
        addEmployee("Kartheek","Selenium", 1);
        addEmployee("Chandana","Playwright", 2);

        showEmployees();
        removeEmployee(2);
        System.out.println("__________________________________");
        showEmployees();
    }

}
