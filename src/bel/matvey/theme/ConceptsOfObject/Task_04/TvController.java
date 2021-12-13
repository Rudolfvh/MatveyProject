package bel.matvey.theme.ConceptsOfObject.Task_04;

import bel.matvey.theme.ConceptsOfObject.Task_04.entity.Tv;

public class TvController {
    public static void main(String[] args) {
        Tv tvcontroller = new Tv();
        tvcontroller.ControllerTurnedOn();
        tvcontroller.increaseVolume();
        tvcontroller.ControllerTurnedOff();
        tvcontroller.increaseChanel();
        System.out.println(tvcontroller.getVolume() + " " + tvcontroller.getChanel());
    }
}
