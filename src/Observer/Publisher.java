package Observer;

public interface Publisher {

    void sendOffer(String companyName, VacancyType vacancyType, int salary);

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

}
