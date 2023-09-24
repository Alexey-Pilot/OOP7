package Observer;

public abstract class Employee implements Observer{
    protected final int id;
    private static int counter = 0;
    {
        id= ++ counter;
    }

    protected String name;
    protected int salary;
    protected VacancyType vacancyType;
    private boolean free = true;

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public abstract void receiveOffer(String nameCompany, VacancyType vacancyType, int salary);

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public VacancyType getVacancyType() {
        return vacancyType;
    }
}
