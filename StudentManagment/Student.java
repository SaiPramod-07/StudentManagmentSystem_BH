package Practice.logicbuilding.Oops_BasedProjects.StudentManagment;
// Student class (Encapsulation)
class Student {
    private String name;
    private int age;
    private String id;

    // Constructor
    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getId() { return id; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

    // toString method to display student details
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}
