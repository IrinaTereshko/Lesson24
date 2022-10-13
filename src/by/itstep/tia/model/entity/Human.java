package by.itstep.tia.model.entity;

public class Human {
    public static final int MIN_AGE = 0;
    public static final int MAX_AGE = 120;

    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human (){};

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >0 & age<=120){
        this.age = age;}

    }

    public String getInfo () {
        return "Name " + name+". Age "+ age +".";
    }
}
