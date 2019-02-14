import model.Student;

public class Main {
    public static void main(String[] args) {
        Student jenny = new Student("Jenny", 18, "female", "1001");
        System.out.println(jenny.getName());
        System.out.println(jenny.getAge());
        System.out.println(jenny.getGender());
        System.out.println(jenny.getId());
    }
}




