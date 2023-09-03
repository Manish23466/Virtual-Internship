class StudentInformation{
    String name;
    int age;
    String Course;

    public StudentInformation(String name,int age,String Course){
        this.name=name;
        this.age=age;
        this.Course=Course;
    }

    public void Studentinfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + Course);
        System.out.println();
    }
}

public class Student {
    public static void main(String[] args) {
        StudentInformation student1 = new StudentInformation("Manish", 20, "Computer Science");
        StudentInformation student2 = new StudentInformation("Ram", 21, "Engineering");

        System.out.println("Student 1 Information:");
        student1.Studentinfo();

        System.out.println("Student 2 Information:");
        student2.Studentinfo();
    }
}+
