
public class parameters
{
    public static void changeName (Student student)
    {
        student.setName ("Sun");
    }
    public static void main(String args [])
    {
        Student s = new Student ("Bun");
        System.out.println("Original name: " + s.getName());
        changeName(s);
        System.out.println("Modified name: " + s.getName());
    }
}
class Student
{
    private String name;
    public Student(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
