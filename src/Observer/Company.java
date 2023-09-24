package Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Company {

    private Random random = new Random();
    private String name;
    private Publisher jobAgency;
    private int maxSalary;
    private List<Vacancy> vacancies = new ArrayList<>();

    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
    }
    public void addVacancy(VacancyType vacancyType){
        int salary = random.nextInt(maxSalary);
        Vacancy vacancy = new Vacancy(name, salary, vacancyType);
        vacancies.add(vacancy);
    }
    public void printVacancy(){
        for (Vacancy vacancy: vacancies){
            System.out.println(vacancy.toString());
        }
    }
    public void sendVacancies(){
        for (Vacancy vacancy: vacancies){
            jobAgency.sendOffer(name, vacancy.getVacancyType(), vacancy.getMaxSalary());
        }
    }


    public void removeVacancy(Vacancy vacancy){
        vacancies.remove(vacancy);
    }


}
