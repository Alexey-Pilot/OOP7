package Observer;

public class Program {

    /**
     * TODO: Доработать приложение, которое разрабатывалось на семинаре, поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например, добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */
    public static void main(String[] args) {

        Publisher jobAgency = new JobAgency();
        Company google = new Company("Google", jobAgency, 500000);
        Company yandex = new Company("Yandex", jobAgency, 95000);
        Company geekBrains = new Company("GeekBrains", jobAgency, 98000);

        Student student1 = new Student("Петров", VacancyType.science);
        Master master1 = new Master("Иванов", VacancyType.worker);
        Master master2 = new Master("Сидоров", VacancyType.electricity);
        Driver driver1 = new Driver("Зуев");
        Driver driver2 = new Driver("Медведев", 80000);
        Developer developer1 = new Developer("Каменяцкий", 300000);
        Developer developer2 = new Developer("Смирнов");

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(master2);
        jobAgency.registerObserver(driver1);
        jobAgency.registerObserver(driver2);
        jobAgency.registerObserver(developer1);
        jobAgency.registerObserver(developer2);

        google.addVacancy(VacancyType.it);
        geekBrains.addVacancy(VacancyType.service);
        yandex.addVacancy(VacancyType.transport);
        google.addVacancy(VacancyType.transport);
        google.addVacancy(VacancyType.worker);
        yandex.addVacancy(VacancyType.it);
        google.addVacancy(VacancyType.science);
        geekBrains.addVacancy(VacancyType.science);

        google.printVacancy();
        google.sendVacancies();


    }

}
