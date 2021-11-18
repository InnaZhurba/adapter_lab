package Users;

import facebook.FacebookUser;
import lombok.Getter;

@Getter
public class MyFacebookUser implements User{
    private FacebookUser facebookUser;

    public MyFacebookUser convertTo(FacebookUser user) {
        this.facebookUser = user;
        return this;
    }

    @Override
    public String getEmail() {
        return facebookUser.getEmail();
    }

    @Override
    public String getCountry() {
        return facebookUser.getCountry();
    }

    @Override
    public int getActiveTime() {
        return facebookUser.getUserActiveTime();
    }
}
