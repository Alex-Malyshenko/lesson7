package ru.geekbrains.lesson7.observer;

public interface Observer {

    void receiveOffer(String nameCompany, double salary);

    boolean getSpec(Specialization findSpec);
}
