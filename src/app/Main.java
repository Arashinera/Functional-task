package app;

public class Main {

    public static void main(String[] args) {
        UserDataHandler handler = new UserDataHandler();
        handler.handleUserData(UserDataProvider.newUserList(), handler.getConsumer());
    }
}
