package workers;

public class HumanWorker implements eating, working{
    @Override
    public void work()
    {
        System.out.println("Human is working");
    }

    @Override
    public void eat()
    {
        System.out.println("human is eating");
    }

}
