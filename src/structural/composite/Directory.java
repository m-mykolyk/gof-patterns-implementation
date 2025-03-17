package structural.composite;

import java.util.ArrayList;
import java.util.List;

class Directory implements FileSystem {
    private final String name;
    private final List<FileSystem> elements = new ArrayList<>();

    Directory(String name) {
        this.name = name;
    }

    void addElement(FileSystem element) {
        elements.add(element);
    }

    void removeElement(FileSystem element) {
        elements.remove(element);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory: " + name);
        for(FileSystem element : elements) {
            element.showDetails();
        }
    }
}
