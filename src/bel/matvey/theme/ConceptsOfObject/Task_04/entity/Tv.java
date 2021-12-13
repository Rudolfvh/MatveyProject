package bel.matvey.theme.ConceptsOfObject.Task_04.entity;

import bel.matvey.theme.ConceptsOfObject.Task_04.TvController;

import java.util.Objects;

public class Tv{
    private String producer;
    public int volume=0,chanel=1;
    private boolean turned = true;
    private boolean tvController = false;


    public void increaseChanel(){
        if(getChanel() <100 && (getTurned()==true && getTvController()==true))setChanel(this.chanel+=1);
        if(getChanel() >100 && (getTurned()==true && getTvController()==true))setChanel(1);
    }

    public void decreaseChanel(){
        if(getChanel() >=1 && (getTurned()==true && getTvController()==true))setChanel(this.chanel-=1);
        if(getChanel()<1 && (getTurned()==true && getTvController()==true))setChanel(100);
    }

    public void setChanel(int chanel) {this.chanel = chanel;}

    public void setVolume(int volume) {this.volume = volume;}

    public int getVolume(){return this.volume;}

    public int getChanel(){return this.chanel;}

    public void setProducer(String producer) {this.producer = producer;}

    public String getProducer(){return getProducer();}

    public void increaseVolume(){if(getVolume() <100 && (getTurned()==true && getTvController()==true))setVolume(this.volume+=1);}

    public void decreaseVolume(){if(getVolume() >=0 && (getTurned()==true && getTvController()==true))setVolume(this.volume-=1);}

    public void TurnedOn(){this.turned = true;}

    public void TurnedOff(){this.turned = false;}

    public void ControllerTurnedOn(){this.tvController = true;}

    public void ControllerTurnedOff(){this.tvController = false;}

    public boolean getTurned(){return turned;}

    public boolean getTvController(){return tvController;}

    @Override
    public String toString() {
        return "Tv{" +
                "producer='" + this.producer + '\'' +
                ", volume=" + this.volume +
                ", chanel=" + this.chanel +
                ", turned=" + this.turned +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        bel.matvey.theme.ConceptsOfObject.Task_04.entity.Tv tv = (bel.matvey.theme.ConceptsOfObject.Task_04.entity.Tv) o;
        return volume == tv.volume && chanel == tv.chanel && turned == tv.turned && Objects.equals(producer, tv.producer);
    }
}