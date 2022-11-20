class Student{
    String name;
    int rollNo;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.rollNo);
    }

    Student()
    {
        System.out.println("Non-Parameterized constructor Called");
    }
}

public class NonParameterizedConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="Jaydeep";
        s1.rollNo=18;

        s1.printInfo();
    }
}
