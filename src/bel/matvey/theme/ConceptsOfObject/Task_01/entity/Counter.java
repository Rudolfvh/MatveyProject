package bel.matvey.theme.ConceptsOfObject.Task_01.entity;

public class Counter {
    private int value;
    private int step;

    public Counter() {
        this.value = 0;
        setValue(91);
        setStep(10);
        increment();
        System.out.println(getValue());
        clear();

        setValue(60);
        setStep(10);
        increment();
        System.out.println(getValue());
        clear();

        setValue(90);
        setStep(10);
        decrement();
        System.out.println(getValue());
        clear();

        setValue(9);
        setStep(10);
        decrement();
        System.out.println(getValue());
        clear();
    }

    public void increment() {
        if(getValue() + getStep() <= 100) this.value = getValue() + getStep();
    }

    public void decrement() {
        if(getValue() - getStep() >= 0)this.value = getValue() - getStep();
    }

    public void clear() {
        this.value = 0;
        this.step = 1;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public int getStep() {
        return this.step;
    }
}