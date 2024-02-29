public class person {
    private int id;
    private String name;
    private int age;
    private float weight;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public person(int id, String name, int age, float weight) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void eat()
    {
        System.out.println("eating...");
    }

    public void sleep()
    {
        System.out.println("sleeping...");
    }

    public void relax()
    {
        System.out.println("playing game...");
    }

}
