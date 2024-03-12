package app;

import java.util.List;
import java.util.function.Consumer;

public class UserDataHandler {

    public void handleUserData(List<User> users, Consumer<User> consumer) {
        for (User user : users) {
            consumer.accept(user);
        }
    }

    public Consumer<User> getConsumer() {
        return contact ->
                new Outputer().getOutput(contact.toString());
    }
}
