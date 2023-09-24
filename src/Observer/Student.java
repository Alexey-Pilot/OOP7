package Observer;

public class Student implements Observer {

    private String name;
    private int salary = 10000;
    private final VacancyType vacancyType;

    public Student(String name, VacancyType vacancyType) {
        this.name = name;
        this.vacancyType = vacancyType;
    }

    @Override
    public void receiveOffer(String nameCompany, VacancyType vacancyType, int salary) {
        if (this.salary <= salary && this.vacancyType == vacancyType) {
            System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s, %s; заработная плата: %d)\n",
                    name, nameCompany, vacancyType.toString(), salary);
            this.salary = salary;
        } else if (this.salary + 10000 <= salary && (this.vacancyType == VacancyType.worker || this.vacancyType == VacancyType.service)) {
            System.out.printf("Студент %s: Несмотря на то что я ищу другую работу, я согласен на эту работу! (компания: %s, %s; заработная плата: %d)\n",
                    name, nameCompany, vacancyType.toString(), salary);
            this.salary = (this.salary + salary) / 2;
        } else {
            System.out.printf("Студент %s: Я найду работу получше! (компания: %s, %s; заработная плата: %d)\n",
                    name, nameCompany, vacancyType.toString(), salary);
        }
    }
}
