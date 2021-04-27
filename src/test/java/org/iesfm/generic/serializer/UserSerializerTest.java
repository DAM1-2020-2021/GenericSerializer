package org.iesfm.generic.serializer;

import org.iesfm.generic.User;
import org.iesfm.serializer.UserSerializer;
import org.junit.Assert;
import org.junit.Test;

public class UserSerializerTest {

    @Test
    public void userSerializerTest() {
        UserSerializer userSerializer = new UserSerializer();

        User user = new User("Christian", "12345", 5);

        String expected = "username:Christian,password:12345,level:5";

        String serializedUser = userSerializer.serialize(user);
        Assert.assertEquals(expected, serializedUser);
    }
}
