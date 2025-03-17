package structural.composite;

class File implements FileSystem {
    private final String name;

    File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name);
    }
}
