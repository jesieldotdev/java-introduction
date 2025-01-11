public class Person {
    private String name;
    private int age;
    private final String cpf;

    //constructor
    public Person(String name, int age, String cpf) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
    }

    //getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCpf() {
        return cpf;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCPF(String cpf) {
        this.name = cpf;
    }

    public void showInfo(){
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("CPF: " + cpf);
    }
}
