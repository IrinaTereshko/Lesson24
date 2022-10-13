package by.itstep.tia.model.entity;


public class Student extends Human {
    //добавляем только то, чего нет у базового класса

    public static final int MIN_MARK = 0;
    public static final int MAX_MARK = 10;

    private double mark;

    public Student() {
    }

//    public Student(String name, int age, double mark) {
//        this.name = name;
//        this.age = age;
//        this.mark = mark;
//    }


    public Student(String name, int age, double mark) {
        super(name, age);
        this.mark = mark;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if (mark > MIN_MARK & mark >= MIN_MARK) {
            this.mark = mark;
        }
    }

    //    public String getInfo() {
//        return " Name: " + name + ". Age: " + age + ". Mark : " + mark + ".";
//    }
    public String getInfo() {
        return super.getInfo() + ". Mark: " + mark;
    }
}
