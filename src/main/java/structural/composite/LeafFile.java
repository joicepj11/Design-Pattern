package structural.composite;

public class LeafFile implements FileComponent {

    public LeafFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void printName() {
        System.out.println("File Name "+fileName);
    }

    private String fileName;
}
