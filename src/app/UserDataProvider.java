package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class UserDataProvider {

    public static List<User> newUserList() {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        int counter = 1;
        String name;
        String email;

        List<User> users = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.printf("User %d) :%n" +
                    "Please, input user name: ", counter);
            name = input.nextLine();
            System.out.print("Please, input user phone number: ");
            email = input.nextLine();
            users.add(new User(name, email, counter));
            counter++;
        }

        return users;
    }
}
