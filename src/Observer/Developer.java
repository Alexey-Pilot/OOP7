package Observer;

public class Developer extends Employee implements Observer {

    private String name;
    private int salary = 100000;
    private final VacancyType vacancyType = VacancyType.it;

    public Developer(String name) {
        this.name = name;
    }

    public Developer(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void receiveOffer(String nameCompany, VacancyType vacancyType, int salary) {
        if (this.salary <= salary && this.vacancyType == vacancyType) {
            System.out.printf("Разработчик %s: Мне нужна эта работа! (компания: %s, %s; заработная плата: %d)\n",
                    name, nameCompany, vacancyType.toString(), salary);
            this.salary = salary;
        } else if (this.vacancyType != vacancyType) {
            System.out.printf("Разработчик %s: Не мой профиль! (компания: %s, %s; заработная плата: %d)\n",
                    name, nameCompany, vacancyType.toString(), salary);

        } else {
            System.out.printf("Разработчик %s: Я найду работу получше! (компания: %s, %s; заработная плата: %d)\n",
                    name, nameCompany, vacancyType.toString(), salary);
        }
    }
}
