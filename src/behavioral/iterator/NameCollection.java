package behavioral.iterator;

class NameCollection implements Collection<String> {
    private final String[] names = {"John", "Alice", "Bob", "Daisy"};

    @Override
    public Iterator<String> createIterator() {
        return new NameIterator(names);
    }
}
