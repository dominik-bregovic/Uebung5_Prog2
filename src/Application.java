/*
*Application
* includes the main method and here we are creating instances of the classes RegisteredUser and AnonymousUser
* frist we are printing the toString method which is implemented in both classes
* then we are printing the methods from the interface Prettyprint, which is implemented in RegisteredUser and defined there
* written on a keybord with an english layout. Thats why the output is written like "Gruesse"
* Dominik Bregovic
* Last Change 19.04.2021
 */

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        User registered1 = new RegisteredUser("Dominik", "Domi","domink.bregovic@gmx.at", "12345");
        User anonymous1 = new AnonymousUser("Domi");

        userList.add(registered1);
        userList.add(anonymous1);

        for (int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i).toString());
            System.out.println("-------------------------");
        }

        System.out.println(((RegisteredUser) registered1).printWithPass());
        System.out.println("-------------------------");
        System.out.println(((RegisteredUser) registered1).printWithoutPass());


    }
}
