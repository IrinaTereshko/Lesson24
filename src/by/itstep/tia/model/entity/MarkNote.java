package by.itstep.tia.model.entity;

public class MarkNote {
    private double mark1;

    public MarkNote(){
        mark1 =4;
    }

    public MarkNote(double mark1) {
        this.mark1 = mark1;
    }

    public double getMark1() {
        return mark1;
    }
// проверка для мин и макс значений!!! добавить
    public void setMark1(double mark1) {
        this.mark1 = mark1;
    }
}
