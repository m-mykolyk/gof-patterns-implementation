package behavioral.observer;

public class EmailObserver implements Observer {
    private final String name;

    public EmailObserver(String name) {
        this.name = name + "'s news email subscription";
    }

    @Override
    public void update(String news) {
        System.out.println(name + " latest: " + news);
    }
}
