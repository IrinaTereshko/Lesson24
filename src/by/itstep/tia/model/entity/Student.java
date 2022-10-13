package by.itstep.tia.model.entity;


public class Student extends Human {
    //добавляем только то, чего нет у базового класса

    
    private  double mark;

    public  Student (){};

    public Student(String name, int age, double mark) {
        super(name, age);
        this.mark = mark;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}
