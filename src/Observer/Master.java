package Observer;

public class Master extends Employee implements Observer {

    private String name;
    private int salary = 80000;
    private VacancyType vacancyType;

    public Master(String name, VacancyType vacancyType) {
        this.name = name;
        this.vacancyType = vacancyType;
    }

    @Override
    public void receiveOffer(String nameCompany, VacancyType vacancyType, int salary) {
        if (this.salary <= salary && this.vacancyType == vacancyType){
            System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }else if (this.vacancyType != vacancyType) {
            System.out.printf("Специалист %s: Не мой профиль! (компания: %s; заработная плата: %d)\n", name, nameCompany, salary);

        }
        else {
            System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
    }
}
