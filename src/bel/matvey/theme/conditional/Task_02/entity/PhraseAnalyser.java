package bel.matvey.theme.conditional.Task_02.entity;

public class PhraseAnalyser {
    public String analyse(String text){
        if(text.startsWith("Make") && text.endsWith("great again"))
            return "It stands no chance";
        if(text.startsWith("Make") || text.endsWith("great again"))
            return "It could be worse";
        return "It is fine, really";
    }
}
