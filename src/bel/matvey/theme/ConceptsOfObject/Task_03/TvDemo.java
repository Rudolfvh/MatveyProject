package bel.matvey.theme.ConceptsOfObject.Task_03;

import bel.matvey.theme.ConceptsOfObject.Task_03.entity.Tv;

    public class TvDemo {
        public static void main(String[] args) {
            Tv tv1 = new Tv();
            Tv tv2 = new Tv();

            tv1.setProducer("Sony");
            tv2.setProducer("Philips");
            for(int i=0;i<10;i++) tv1.increaseVolume();
            for(int i=0;i<10;i++) tv2.increaseChanel();
            System.out.println(tv1.equals(tv2));
         }
    }
