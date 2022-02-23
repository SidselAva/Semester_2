package skoleList;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SkoleTest {
    
    Studerende studerende;
    Skole skole;
    
    @BeforeEach
    void setUp() {
    }
    
    @Test
    void getNavn() {
    }
    
    @Test
    void addStuderende() {
    }
    
    @Test
    void removeStuderende() {
    }
    
    @Test
    void getStuderendes() {
    }
    
    @Test
    void gennemsnit() {
        Studerende studerende = new Studerende(10,"Signe");
        studerende.addKarakter(12);
        studerende.addKarakter(4);
        Skole skole = new Skole("Rudolph Steiner");
        skole.addStuderende(studerende);
        assertEquals(8,skole.gennemsnit());
    }
    
    @Test
    void findStuderende() {
        Skole skole = new Skole("Bom");
        Studerende studerende = new Studerende(12,"Sofie");
        skole.addStuderende(studerende);
        assertEquals("Soe",skole.findStuderende(12));
    }
}