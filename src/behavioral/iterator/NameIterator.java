package behavioral.iterator;

class NameIterator implements Iterator<String> {
    private final String[] names;
    private int index;

    NameIterator(String[] names) {
        this.names = names;
        this.index = 0;
    }


    @Override
    public boolean hasNext() {
        return index < names.length;
    }

    @Override
    public String next() {
        if(hasNext()) {
            return names[index++];
        }
        return null;
    }
}
