package structural.composite;

public class Main {

    public static void main(String[] args) {

        Directory one = new Directory("dir1"),
                two = new Directory("dir2"),
                three = new Directory("dir3");

        LeafFile a = new LeafFile("a.txt"),
                b = new LeafFile("b.txt"),
                c = new LeafFile("c.txt"),
                d = new LeafFile("d.txt"),
                e = new LeafFile("e.txt");

        one.add(a);
        one.add(two);
        one.add(c);
        two.add(b);
        two.add(three);
        two.add(d);
        three.add(e);
        one.printName();
    }
}