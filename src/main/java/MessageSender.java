import Users.MyFacebookUser;
import Users.MyTwitterUser;
import Users.User;
import facebook.FacebookUser;
import twitter.TwitterUser;

import java.util.Objects;

public class MessageSender {
    public boolean send(String text, User user, String country){
        //if(user!=null)
        //   System.out.println(text);

        if(user instanceof MyFacebookUser){
            if(Objects.equals(((MyFacebookUser) user).getFacebookUser().getCountry(), country))
                System.out.println(text);
            return true;
        }
        else if(user instanceof MyTwitterUser) {
            if(Objects.equals(((MyTwitterUser) user).getTwitterUser().getCountry(), country))
                System.out.println(text);
            return true;
        }
        return false;
    }
}
