package bel.matvey.theme.ConceptsOfObject.Task_03.entity;

import java.util.Objects;

public class Tv{
    private String producer;
    public int volume=0,chanel=1;
    private boolean turned = true;

    public void increaseChanel(){
        if(getChanel() <100 && getTurned()==true)setChanel(this.chanel+=1);
        if(getChanel() >100 && getTurned()==true)setChanel(1);
    }

    public void decreaseChanel(){
        if(getChanel() >=1 && getTurned()==true)setChanel(this.chanel-=1);
        if(getChanel()<1 && getTurned()==true)setChanel(100);
    }

    public void setChanel(int chanel) {this.chanel = chanel;}

    public void setVolume(int volume) {this.volume = volume;}

    public int getVolume(){return this.volume;}

    public int getChanel(){return this.chanel;}

    public void setProducer(String producer) {this.producer = producer;}

    public String getProducer(){return getProducer();}

    public void increaseVolume(){if(getVolume() <100 && getTurned()==true)setVolume(this.volume+=1);}

    public void decreaseVolume(){if(getVolume() >=0 && getTurned()==true)setVolume(this.volume-=1);}

    public void TurnedOn(){this.turned = true;}

    public void TurnedOff(){this.turned = false;}

    public boolean getTurned(){return turned;}

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
        Tv tv = (Tv) o;
        return volume == tv.volume && chanel == tv.chanel && turned == tv.turned && Objects.equals(producer, tv.producer);
    }
}