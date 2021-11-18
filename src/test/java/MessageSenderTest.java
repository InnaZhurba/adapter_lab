import Users.MyFacebookUser;
import Users.User;
import facebook.FacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageSenderTest {
User user;
String text = "my little pony";
FacebookUser fb = new FacebookUser("abc","cvf",5);
MessageSender messageSender = new MessageSender();
    @BeforeEach
    void setUp() {
        user = new MyFacebookUser();
        user = ((MyFacebookUser) user).convertTo(fb);
    }

    @Test
    void send() {
        assertTrue(messageSender.send(text, user, "cvf"));
    }
}