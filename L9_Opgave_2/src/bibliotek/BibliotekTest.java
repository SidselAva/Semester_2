package bibliotek;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BibliotekTest {
    Bibliotek bibliotek;
    
    @BeforeEach
    void setup() {
    }
    
    @Test
    void getBeregnetDato() {
    }
    
    @Test
    void setBeregnetDato() {
    }
    
    @Test
    void isVoksen() {
    }
    
    @Test
    void setVoksen() {
    }
    
    @Test
    void beregnBøde() {
        Bibliotek bibliotek = new Bibliotek();
        assertEquals(20,bibliotek.beregnBøde(LocalDate.of(2012,1,1), LocalDate.of(2012,1,2),false));
    }
}