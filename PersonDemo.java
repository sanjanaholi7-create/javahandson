package Javahandson;

public class PersonDemo {

	public static void main(String[] args) {
		// Creating 5 instances of Person
        Person p1 = new Person("Etha", 20, "India", "1", 85, 90, 80);
        Person p2 = new Person("Eva", 21, "Karnataka", "2", 78, 82, 89);
        Person p3 = new Person("Jija", 22, "Pune", "3", 92, 88, 84);
        Person p4 = new Person("Simbha", 19, "Mumbai", "4", 75, 70, 80);
        Person p5 = new Person("Jeeva", 23, "Bengaluru", "5", 88, 86, 90);

    
        Person[] persons = {p1, p2, p3, p4, p5};

        // First Output: name, usn, age
        System.out.println("---- First Output: Name, USN, Age ----");
        for (Person p : persons) {
            System.out.println("Name: " + p.name + ", USN: " + p.usn + ", Age: " + p.age);
        }

        // Second Output: usn, marks, average
        System.out.println("\n---- Second Output: USN, Marks, Average ----");
        for (Person p : persons) {
            double avg = p.getAverage();
            System.out.println("USN: " + p.usn + ", Marks: [" + p.m1 + ", " + p.m2 + ", " + p.m3 + "], Average: " + avg);
        }
    }

}
