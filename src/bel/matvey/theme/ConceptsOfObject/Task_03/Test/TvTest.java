package bel.matvey.theme.ConceptsOfObject.Task_03.Test;

import bel.matvey.theme.ConceptsOfObject.Task_03.entity.Tv;
import org.junit.Test;

public class TvTest {

    @Test
    public void TvTurndOn(){
        Tv tv = new Tv();
        tv.TurnedOn();
        for(int i=0;i<65;i++) tv.increaseVolume();
        System.out.println(tv.getVolume());
        for(int i=1;i<14;i++) tv.increaseChanel();
        System.out.println(tv.getChanel());
    }
    @Test
    public void TvTurndOff(){
        Tv tv = new Tv();
        tv.TurnedOff();
        for(int i=0;i<102;i++) tv.increaseVolume();
        System.out.println(tv.getVolume());
        for(int i=0;i<102;i++) tv.increaseChanel();
        System.out.println(tv.getChanel());
    }
}
