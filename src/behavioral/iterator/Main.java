package behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        NameCollection nameCollection = new NameCollection();
        Iterator<String> iterator = nameCollection.createIterator();

        System.out.println("Iterated over names:");
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println("Name: " + name);
        }
    }
}
