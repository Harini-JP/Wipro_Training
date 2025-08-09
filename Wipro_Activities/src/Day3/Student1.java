package Day3;

class Student2 {
    private String name;
    private int age;
    public void setName(String studentName) {
        name = studentName;
    }

    public void setAge(int studentAge) {
        age = studentAge;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Student1 {
    public static void main(String[] args) {
        Student2 s = new Student2();
        s.setName("Harini");
        s.setAge(21);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
