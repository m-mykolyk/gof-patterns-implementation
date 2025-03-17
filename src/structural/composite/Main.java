package structural.composite;

public class Main {
    public static void main(String[] args) {
        FileSystem documentFile = new File("Document.docx");
        FileSystem photoFile = new File("Photo.jpg");
        FileSystem videoFile = new File("Video.mp4");

        Directory mainDirectory = new Directory("Main Directory");
        Directory subDirectory = new Directory("Sub Directory");

        mainDirectory.addElement(documentFile);

        subDirectory.addElement(photoFile);
        subDirectory.addElement(videoFile);

        mainDirectory.addElement(subDirectory);

        mainDirectory.showDetails();

        mainDirectory.removeElement(documentFile);

        mainDirectory.showDetails();
    }
}
