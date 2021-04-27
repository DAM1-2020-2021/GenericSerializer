package org.iesfm.serializer;

import org.iesfm.generic.User;

public class UserSerializer implements Serializer<User> {

    @Override
    public String serialize(User user) {
        String usernameField = "username:" + user.getUsername();
        String passwordField = "password:" + user.getPassword();
        String levelField = "level:" + user.getLevel();

        return usernameField + "," + passwordField + "," + levelField;
    }
}
