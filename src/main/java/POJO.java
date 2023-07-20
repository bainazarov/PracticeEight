// Используется для инкапсуляции бизнес-логики в приложениях
public class POJO {
    private String name;
    private int age;
    public POJO(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void sayHello() {
        System.out.println("Hello, " + name);
    }
}
