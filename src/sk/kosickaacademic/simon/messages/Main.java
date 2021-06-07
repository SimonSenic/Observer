package sk.kosickaacademic.simon.messages;

import sk.kosickaacademic.simon.messages.observers.EmailObserver;
import sk.kosickaacademic.simon.messages.observers.FBObserver;
import sk.kosickaacademic.simon.messages.observers.SMSObserver;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new EmailObserver(subject);
        new FBObserver(subject);
        new SMSObserver(subject);

        subject.setMessage("Allah je velky!", 3);
        subject.setMessage("I am hungry.", 1);
    }
}
