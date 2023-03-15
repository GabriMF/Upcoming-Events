package com.upcoming.events.demo.models;


import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

// import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
// import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
// import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;

// @DataJpaTest
@SpringBootTest
// @AutoConfigureTestDatabase(replace = Replace.NONE)s
public class UserTest {

    @Autowired
    private EntityManager entityManager;

    @Test
    public void testCountryPersistedInDatabase() {
        User paco = new User("Paco", "pass", null);

        entityManager.persist(paco);
        entityManager.flush();

        User retrievedUser = entityManager.find(User.class, paco.getId());

        assertThat(retrievedUser).isNotNull();
        assertThat(retrievedUser.getUsername()).isEqualTo("Paco");
    }

    @Test
    public void testingUserName() {
        User paco = new User("Paco", "pass", null);
        assertEquals("Paco", paco.getUsername());
    }

    @Test
    void testGetAuthorities() {
        User gobi = new User("Gobi", "1234", null);
        assertEquals(null, gobi.getAuthorities());
    }

    @Test
    void testGetId() {
        
    }

    @Test
    void testGetPassword() {
        User gobi = new User("Gobi", "1234", null);
        assertEquals("1234", gobi.getPassword());
    }

    @Test
    void testGetUsername() {
        User gobi = new User("Gobi", "1234", null);
        assertEquals("Gobi", gobi.getUsername());
    }

    @Test
    void testSetAuthorities() {
        
    }

    @Test
    void testSetId() {
        
    }

    @Test
    void testSetPassword() {
        User gobi = new User("Gobi", "1234", null);
        gobi.setPassword("987654321");
        assertEquals("987654321", gobi.getPassword());
    }

    @Test
    void testSetUsername() {
        User gobi = new User("Gobi", "123456789", null);
        gobi.setUsername("Gobimonnn");
        assertEquals("Gobimonnn", gobi.getUsername());
    }

    
}