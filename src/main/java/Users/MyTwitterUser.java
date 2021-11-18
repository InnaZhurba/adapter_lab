package Users;

import lombok.Getter;
import twitter.TwitterUser;

@Getter
public class MyTwitterUser implements User {
    private TwitterUser twitterUser;

    public MyTwitterUser convertTo(TwitterUser user) {
        twitterUser = user;
        return this;
    }

    @Override
    public String getEmail() {
        return twitterUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return twitterUser.getCountry();
    }

    @Override
    public int getActiveTime() {
        return twitterUser.getLastActiveTime();
    }
}
