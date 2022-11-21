// Class is nothing but blueprint that object follows
class Pen{
    String color;
    String type; // Ball Pen Gel Pen

    public void Write(){
        System.out.println("Writing Something");
    }

    public void printColor(){
        System.out.println(this.color);
    }

    public void printType(){
        System.out.println(this.type);
    }
}

class Student{
    String name;
    int rollNo;
    char Div;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.rollNo);
        System.out.println(this.Div);
        System.out.println(this.age);
    }
    
}

public class ClassEx {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color="blue";
        pen1.type="Gel";

        Pen pen2 = new Pen();
        pen2.color="Black";
        pen2.type="BallPoint";

        pen1.printColor();
        pen2.printColor();


        Student s1 =new Student();
        s1.name="Jaydeep";
        s1.rollNo=18;
        s1.Div='A';
        s1.age=23;

        s1.printInfo();
    }
}
