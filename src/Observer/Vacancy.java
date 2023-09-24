package Observer;

public class Vacancy {
    private final int id;
    private static int counter = 100;

    {
        id = ++counter;
    }
    private String companyName;
    private int maxSalary;
    private VacancyType vacancyType;



    protected Vacancy(String companyName, int maxSalary, VacancyType vacancyType) {
        this.companyName = companyName;
        this.maxSalary = maxSalary;
        this.vacancyType = vacancyType;
    }

    public int getId() {
        return id;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public VacancyType getVacancyType() {
        return vacancyType;
    }

    @Override
    public String toString() {
        return String.format("Вакасия #%d, %s, в компанию: %s зарплата: %d", id, vacancyType.toString(), companyName, maxSalary);
    }
}
