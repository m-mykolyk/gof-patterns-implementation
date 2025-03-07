package structural.adapter;

public class Main {
    public static void main(String[] args) {
        Database database = new UserAPItoDatabaseAdapter();

        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
