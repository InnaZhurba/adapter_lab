package new_analytics;

import static org.junit.jupiter.api.Assertions.*;

class DataBaseTest {
DataBase db = new DataBase();
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void getUserData() {
        assertEquals("hello",db.GetUserData());
    }

    @org.junit.jupiter.api.Test
    void getStaticData() {
        assertEquals("hello2",db.GetStaticData());
    }
}