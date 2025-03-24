package behavioral.observer;

class PushObserver implements Observer {
    private final String name;

    public PushObserver(String name) {
        this.name = name + "'s news push subscription";
    }

    @Override
    public void update(String news) {
        System.out.println(name + " latest: " + news);
    }
}