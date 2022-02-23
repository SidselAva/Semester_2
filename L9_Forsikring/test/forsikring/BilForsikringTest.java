package forsikring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BilForsikringTest {
    BilForsikring bilForsikring;
    
    @BeforeEach
    void setUp() {
    
    }
    
    @Test
    void getGrundPraemie() {
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        assertEquals(1000, bilForsikring.getGrundPraemie());
        
    }
    
    @Test
    void setGrundpaemie() {
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.getGrundPraemie();
    }
    
    @Test
    void beregnPraemie() {
        
        // TC1
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        assertEquals(1250, bilForsikring.beregnPraemie(20, false, 2));
        
        
        // TC2
        assertEquals(1000, bilForsikring.beregnPraemie(30, false, 2));
        
        // TC3
        assertEquals(1187.5 , bilForsikring.beregnPraemie(20, true, 2));
        
        // TC4
        assertEquals(950, bilForsikring.beregnPraemie(30, true, 2));
        
        // TC5
        assertEquals(617, 5, bilForsikring.beregnPraemie(30, true, 9));
        
        // TC6
        assertEquals(650, bilForsikring.beregnPraemie(30, false, 9));
        
        
        
        
        // Exceptions

        Exception exception = assertThrows(RuntimeException.class, () -> {
            bilForsikring.beregnPraemie(20, true, 5);
        });
        assertEquals("Du kan ikke have kaert skadefri saelaenge", exception.getMessage());
        
        Exception exception1 = assertThrows(RuntimeException.class, () -> {
            bilForsikring.beregnPraemie(20, true, -1);
        });
        assertEquals("Antal skade frie aer skal vaere positiv", exception1.getMessage());
        
        
        Exception exception2 = assertThrows(RuntimeException.class,()-> {
            bilForsikring.setGrundpaemie(0);
        });
        assertEquals("grundPr skal vaere positiv", exception2.getMessage());
        
       
        Exception exception4 = assertThrows(RuntimeException.class, () -> {
            bilForsikring.beregnPraemie(16,true,2);
        });
        assertEquals("Du er for ung til at tegne en forsikring", exception4.getMessage());
    }
}