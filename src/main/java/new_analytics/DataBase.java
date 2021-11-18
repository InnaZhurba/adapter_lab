package new_analytics;

import analytics.БазаДаних;

public class DataBase extends БазаДаних {
    public String GetUserData(){return super.отриматиДаніКористувача();}
    public String GetStaticData(){return super.отриматиСтатистичніДані();}
}
