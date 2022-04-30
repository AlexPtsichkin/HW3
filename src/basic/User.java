package basic;

import data.UserData;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<User> friends = new ArrayList<>();
    private int value;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public User(String name, int value) {
        this.name = name;

        if (value <= 1) {
            return;
        }
        else {
            value = value-1;
            for (int i = 0; i <= 1; i++) {
                friends.add(new User(UserData.returnUserName(), value));
            }
        }


    }
}
