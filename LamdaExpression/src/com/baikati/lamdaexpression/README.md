Lambda expression is an anonymous function without name, and it does not belong to any class.

we don't need to mention the return type for lambda expression. since Java8 compiler is able to infer the return type.

Variable Scope
--------------
In Lambda, we are allowed to use the local variable but we cannot modify the local variable even though it is not declared as final. This condition is called Effectively Final

````
    int i=0;
    List<Employee> employees = EmployeeProducer.getAllEmployees();
    employees.forEach(instructor -> {
        System.out.println(instructor+" "+ i++);  //CE:Variable used in lambda expression should be final or effectively final
    }
````