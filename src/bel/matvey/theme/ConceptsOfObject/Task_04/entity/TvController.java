package bel.matvey.theme.ConceptsOfObject.Task_04.entity;

public class TvController {
    private boolean TurndController = false;

    Tv tv = new Tv();

    public void increaseChanel(){
        if(getChanel() <100 && (tv.getTurned()==true && getTurndController() == true))setChanel(tv.chanel+=1);
        if(getChanel() >100 && (tv.getTurned()==true && getTurndController() == true))setChanel(1);
    }

    public void decreaseChanel(){
        if(getChanel() >=1 && (tv.getTurned()==true && getTurndController() == true))setChanel(tv.chanel-=1);
        if(getChanel()<1 && (tv.getTurned()==true && getTurndController() == true))setChanel(100);
    }

    public void setTurnedController(boolean turnd){this.TurndController = turnd;}

    public boolean getTurndController(){return TurndController;}

    public void setChanel(int chanel) {tv.chanel = chanel;}

    public void setVolume(int volume) {tv.volume = volume;}

    public int getVolume(){return tv.volume;}

    public int getChanel(){return tv.chanel;}

    public void increaseVolume(){if(getVolume() <100 && (tv.getTurned()==true && getTurndController() == true))setVolume(tv.volume+=1);}

    public void decreaseVolume(){if(getVolume() >=0 && (tv.getTurned()==true && getTurndController() == true))setVolume(tv.volume-=1);}
}
