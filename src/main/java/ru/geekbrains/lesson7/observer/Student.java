package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Student implements Observer {

    private static Random random = new Random();

    private Specialization spec;
    private String name;
    public boolean getSpec(Specialization findSpec) {
        if (findSpec == spec) {
            return true;
        }
        return false;
    }
    private double minSalary;

    public Student(String name, Specialization special) {
        this.name = name;
        minSalary = random.nextDouble(2000, 3000);
        spec = special;
    }

    @Override
    public void receiveOffer(String nameCompany, double salary) {
        if (minSalary <= salary){
            System.out.printf("Студент %s (%f) >>> Мне нужна эта работа по специальности: %s! (%s - %f)\n",
                    name, minSalary, spec, nameCompany, salary);
            minSalary = salary;
        }
        else{
            System.out.printf("Студент %s (%f) >>> Я найду работу получше! (%s - %f)\n",
                    name, minSalary, nameCompany, salary);
        }
    }
}
