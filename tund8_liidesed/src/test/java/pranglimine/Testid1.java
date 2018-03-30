package pranglimine;
import org.junit.*;

import pranglimine.JuhuarvudeGeneraatoriLiides;
import pranglimine.JuhuarvudeYhtlaneGeneraator;
import pranglimine.Liitmisylesanne;
import pranglimine.LiitmisylesanneteLoojaLiides;
import pranglimine.LiitmisylesanneteTavalineLooja;

import static org.junit.Assert.*;

public class Testid1{
    @Test
    public void ylesandeLoomine(){
        Liitmisylesanne y1=new Liitmisylesanne(3,2);
        assertEquals("3+2=", y1.toString());
        assertEquals(5, y1.kysiSumma());
    }
    @Test
    public void ylesandeLoomineLiidesest(){
        LiitmisylesanneteLoojaLiides looja=new LiitmisylesanneteTavalineLooja();
        Liitmisylesanne y1=looja.looLiitmisylesanne(100);
        assertTrue(y1.kysiSumma()<=100);
        assertEquals(y1.kysiSumma(), y1.kysiLiidetav1()+ y1.kysiLiidetav2());
    }
    @Test
    public void juhuarvuLoomine(){
        JuhuarvudeGeneraatoriLiides generaator=new JuhuarvudeYhtlaneGeneraator();
        boolean yksLeitud=false;
        boolean viisLeitud=false;
        for(int i = 0;i<100; i++){
            int arv=generaator.looJuhuarv(1, 5);
            assertTrue(arv>=1);
            assertTrue(arv<=5);
            if(arv==1){yksLeitud=true;}
            if(arv==5){viisLeitud=true;}

        }
        assertTrue(yksLeitud);
        assertTrue(viisLeitud);
    }
}
