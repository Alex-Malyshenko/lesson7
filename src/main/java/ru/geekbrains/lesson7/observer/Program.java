package ru.geekbrains.lesson7.observer;

public class Program {


    /**
     * TODO: 1.Доработать приложение, поработать с шаблоном проектирования Observer
     *   добавить новый тип соискателя.
     *   **.2 Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *   **.3 Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();

        Company geekBrains = new Company("GeekBrains", 70000, jobAgency, Specialization.cleaner);
        Company google = new Company("Google", 100000, jobAgency, Specialization.programmer);
        Company yandex = new Company("Yandex", 120000, jobAgency, Specialization.engineer);

        Master ivanov = new Master("Ivanov", Specialization.programmer);
        Master petrov = new Master("Petrov", Specialization.engineer);
        Student sidorov = new Student("Sidorov", Specialization.designer);
        Intern zaitcev = new Intern("Zaitcev", Specialization.cleaner);


        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(zaitcev);

        for (int i = 0; i < 5; i++){
            geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();
        }

    }

}
