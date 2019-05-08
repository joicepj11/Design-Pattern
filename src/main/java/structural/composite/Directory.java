package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileComponent {

    public Directory(String fileName) {
        this.fileName = fileName;
    }

    public void add(FileComponent fileComponent) {
        files.add(fileComponent);
    }

    @Override
    public void printName() {
        System.out.println("Directory Name: " + fileName);

        for (Object file : files) {
            FileComponent fileComponent = (FileComponent) file;
            fileComponent.printName();
        }
    }

    private List<FileComponent> files = new ArrayList<>();
    private String fileName;
}
