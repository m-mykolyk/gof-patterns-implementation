package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        Observer myroslavPushObserver = new PushObserver("Myroslav");
        Observer myroslavEmailObserver = new EmailObserver("Myroslav");
        Observer anastasiiaEmailObserver = new EmailObserver("Anastasiia");

        newsAgency.addObserver(myroslavPushObserver);
        newsAgency.addObserver(myroslavEmailObserver);
        newsAgency.addObserver(anastasiiaEmailObserver);

        newsAgency.setNews("First notification!");

        newsAgency.removeObserver(myroslavPushObserver);

        newsAgency.setNews("Second notification");
    }
}
