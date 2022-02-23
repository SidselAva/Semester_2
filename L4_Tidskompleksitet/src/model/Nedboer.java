package model;

import java.util.Arrays;

public class Nedboer {
    private int[] nedboerPrUge = {20, 10, 12, 12, 13, 14, 15, 10, 8, 7, 13,
            15, 10, 9, 6, 8, 12, 22, 14, 16, 16, 18, 23, 12, 0, 2, 0, 0, 78, 0,
            0, 0, 34, 12, 34, 23, 23, 12, 44, 23, 12, 34, 22, 22, 22, 22, 18,
            19, 21, 32, 24, 13};
    
    /**
     * Returnerer ugenummeret for den uge i året, hvor man skal starte ferien,
     * hvis man ønsker den minimale nedbørsmængde i de tre uger
     *
     * @return
     */
    
    // DENNE ER             O(1)
    public int bedsteTreFerieUger() {
        int min = Integer.MAX_VALUE;
        int ugeNr = Integer.MAX_VALUE;
        for (int i = 0; i < nedboerPrUge.length - 2; i++) {
            int sum = nedboerPrUge[i] + (nedboerPrUge[i + 1]) + (nedboerPrUge[i + 2]);
            if (sum < min) {
                ugeNr = i + 1;
                min = sum;
            }
        }
        return ugeNr;
    }
    
    /**
     * Returnerer ugenummeret for den uge i året, hvor man skal starte ferien,
     * hvis man ønsker den minimale nedbørsmængde i det "antal" uger, der er
     * angivet i paramtereren
     *
     * @return
     */
    // O(1)
    public int bedsteFerieUgerStart(int antal) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int ugeNr = 0;
        for (int i = 0; i < nedboerPrUge.length - antal; i++) {
            for (int j = 0; j < antal; j++) {
                sum = nedboerPrUge[i + j];
            }
            if (sum < min) {
                min = sum;
                ugeNr = i +1;
                sum = 0;
                
            } else
               sum = 0;
        }
        return ugeNr;
    }
    
    /**
     * Returnerer ugenummeret på den første uge hvor nedbøren har været præcis
     * den samme flest uger i træk
     *
     * @return
     */
    public int ensNedboer() {
        int index = 0;
        int sum = 0;
        int ugeNr = 0;
        for (int i = 0; i < nedboerPrUge.length - 1; i++) {
            if (nedboerPrUge[i] == nedboerPrUge[i + 1]) {
                ugeNr++;
                if (ugeNr > sum) {
                    index = i;
                    sum = ugeNr;
                }
            } else
                ugeNr = 0;
            
            
        }
        return (index - ugeNr) + 1;
        
    }
}