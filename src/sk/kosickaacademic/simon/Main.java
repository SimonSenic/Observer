package sk.kosickaacademic.simon;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new HexObserver(subject);

        System.out.println("First state: 20");
        subject.setState(20);
        System.out.println("Second state: 38");
        subject.setState(38);
    }
}
