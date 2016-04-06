package se.nackademin;

/**
 * Defines the arrays needed to tell the fortune.
 */
public class Translator {
    
    MagicNumbers magicNumbers;
    
    public static String[] adjectivesArray = {"stor", "liten", "stark", "svag", "mjuk", "hård", "snabb", "vacker", "ljus", "mörk" };
    public static String[] nounsArray = { "en lönehöjning", "en lönesänkning", "en fotboja", "en katt", "en hund", "ett hus", "ett barn", "ett elstängsel", "en dator", "ett golv" };
    public static String[] verbsArray = { "springa", "ljuga", "flyga", "se", "vara", "äta", "mäta", "gå", "röra", "resa" };
    
    public String fortuneA(int a){
        String result;
        result = adjectivesArray[a];
        return result;
    }
    
    public String fortuneB(int a){
        String result;
        result = verbsArray[a];
        return result;
    }
    
    public String fortuneC(int a){
        String result;
        result = nounsArray[a];
        return result;
    }
    
        public String fortuneD(int a){
        String result;
        result = verbsArray[a];
        return result;
    }
        
        public String fortuneE(int a){
        String result;
        result = adjectivesArray[a];
        return result;
    }
}