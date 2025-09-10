package Javahandson;

public class Person {
		    String name;
		    int age;
		    String address;
		    String usn;
		    int m1, m2, m3;
		    // Constructor
		    Person(String name, int age, String address, String usn, int m1, int m2, int m3) {
		        this.name = name;
		        this.age = age;
		        this.address = address;
		        this.usn = usn;
		        this.m1 = m1;
		        this.m2 = m2;
		        this.m3 = m3;
		    }
		    // Behavior
		    void sing() {
		        System.out.println(name + " is singing.");
		    }
		    
		    void study() {
		        System.out.println(name + " is studying.");
		    }
		    // Method to calculate average
		    double getAverage() {
		        return (m1 + m2 + m3) / 3.0;
		    }
		    
		    }