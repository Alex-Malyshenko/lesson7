package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Intern implements Observer{
    private static Random random = new Random();

    private Specialization spec;
    private String name;

    private double minSalary;

    public boolean getSpec(Specialization findSpec) {
        if (findSpec == spec) {
            return true;
        }
        return false;
    }

    public Intern(String name, Specialization special) {
        this.name = name;
        minSalary = random.nextDouble(1000, 2000);
        spec = special;
    }

    @Override
    public void receiveOffer(String nameCompany, double salary) {
        if (minSalary <= salary){
            System.out.printf("Стажер %s (%f) >>> Мне нужна работа по специальности: %s! (Компания: %s - %f )\n",
                    name, minSalary, spec, nameCompany, salary);
            minSalary = salary;
        }
        else{
            System.out.printf("Стажер %s (%f) >>> Я найду работу получше! (%s - %f)\n",
                    name, minSalary, nameCompany, salary);
        }
    }
}
