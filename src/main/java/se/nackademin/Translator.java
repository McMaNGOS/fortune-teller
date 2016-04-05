package se.nackademin;

/**
 * Defines the arrays needed to tell the fortune.
 */
public class Translator {
    
    public static String[] adjectivesArray = {"stor", "liten", "stark", "svag", "mjuk", "hård", "snabb", "vacker", "ljus", "mörk" };
    public static String[] nounsArray = { "en lönehöjning", "en lönesänkning", "en fotboja", "en katt", "en hund", "ett hus", "ett barn", "ett elstängsel", "en dator", "ett golv" };
    public static String[] verbsArray = { "springa", "ljuga", "flyga", "se", "vara", "äta", "mäta", "gå", "röra", "resa" };
    
    public String fortuneA(){
        String result;
        int a = new MagicNumbers().calculateA();
        result = adjectivesArray[a];
        return result;
    }
    
    public String fortuneB(){
        String result;
        int a = new MagicNumbers().calculateB();
        result = verbsArray[a];
        return result;
    }
    
    public String fortuneC(){
        String result;
        int a = new MagicNumbers().calculateC();
        result = nounsArray[a];
        return result;
    }
    
        public String fortuneD(){
        String result;
        int a = new MagicNumbers().calculateD();
        result = verbsArray[a];
        return result;
    }
        
        public String fortuneE(){
        String result;
        int a = new MagicNumbers().calculateE();
        result = adjectivesArray[a];
        return result;
    }
}