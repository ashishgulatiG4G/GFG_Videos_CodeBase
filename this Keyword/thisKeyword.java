class Student {
    private String name;
    private int age;

    public Student() {
    
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ", " + age;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public void display() {
        System.out.println("Student Name : " + name + ", Age : " + age);
    }

    public void printStudent(Student student) {
        student.display();
    }

    public void invokePrint() {
        // printStudent(this);
        this.display();
    }


}


public class thisKeyword {
    public static void main(String[] args) {

        Student studentAshish = new Student("Ashish", 25);
        // System.out.println(studentAshish.toString());

        // Student studentDefault = new Student();
        // System.out.println(studentDefault.toString());


        // Student studentRohan = new Student().setAge(10).setName("Rohan");
        // System.out.println(studentRohan.toString());

        studentAshish.invokePrint();

    }
}

/*
 * 1. Using this to refer to instance variables 
 * 2. Calling another constructor using this()
 * 3. Returning current class instance to support method chaining
 * 4. Using this keyword as a method parameter
 * 5/ Using this keyword to invoke method of current class
 */


