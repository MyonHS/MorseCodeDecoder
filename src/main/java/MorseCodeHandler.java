import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MorseCodeHandler {

    private static HashMap<String, String> decryptMap = new HashMap<>();
    public MorseCodeHandler()
    {
        init();
    }

    private void init()
    {
        //initialising the hashmap
        decryptMap.put(".-", "A" );
        decryptMap.put("-...", "B");
        decryptMap.put("-.-.", "C");
        decryptMap.put("-..", "D");
        decryptMap.put(".", "E");
        decryptMap.put("..-.", "F");
        decryptMap.put("--.", "G");
        decryptMap.put("....", "H");
        decryptMap.put("..", "I");
        decryptMap.put(".---", "J");
        decryptMap.put("-.-", "K");
        decryptMap.put(".-..", "L");
        decryptMap.put("--", "M");
        decryptMap.put("-.", "N");
        decryptMap.put("---", "O");
        decryptMap.put(".--.", "P");
        decryptMap.put("--.-", "Q");
        decryptMap.put(".-.", "R");
        decryptMap.put("...", "S");
        decryptMap.put("-", "T");
        decryptMap.put("..-", "U");
        decryptMap.put("...-", "V");
        decryptMap.put(".--", "W");
        decryptMap.put("-..-", "X");
        decryptMap.put("-.--", "Y");
        decryptMap.put("--..", "Z");
        decryptMap.put(".----", "1");
        decryptMap.put("..---", "2");
        decryptMap.put("...--", "3");
        decryptMap.put("....-", "4");
        decryptMap.put(".....", "5");
        decryptMap.put("-....", "6");
        decryptMap.put("--...", "7");
        decryptMap.put("---..", "8");
        decryptMap.put("----.", "9");
        decryptMap.put("-----", "0");
        decryptMap.put("·−−·−", "À");
        decryptMap.put("·−·−", "Ä");
        decryptMap.put("·−··−", "È");
        decryptMap.put("··−··", "É");
        decryptMap.put("−−−·", "Ö");
        decryptMap.put("··−−", "Ü");
        decryptMap.put("···−−··", "ß");
        decryptMap.put("−−−−", "CH");
        decryptMap.put("−−·−−", "Ñ");
        decryptMap.put("·−·−·−", ".");
        decryptMap.put("−−··−−", ",");
        decryptMap.put("−−−···", ":");
        decryptMap.put("−·−·−·", ";");
        decryptMap.put("··−−··", "?");
        decryptMap.put("−·−·−−", "!");
        decryptMap.put("−····−", "-");
        decryptMap.put("··−−·−", "_");
        decryptMap.put("−·−−·", "(");
        decryptMap.put("−·−−·−", ")");
        decryptMap.put("·−−−−·", "'");
        decryptMap.put("·−··−·", "\"");
        decryptMap.put("−···−", "=");
        decryptMap.put("·−·−·", "+");
        decryptMap.put("−··−·", "/");
        decryptMap.put("·−−·−·", "@");
        decryptMap.put("···−−−···", "SOS"); //trivial. Could be deleted
        decryptMap.put(""," "); //empty token = new word starts
    }

    public static String decode(String cypher)
    {
        String result="";

        //replace triple empty spaces with double empty spaces, so we have only one empty token per Word space
        //split deletes the seperator char/string
        String[] cypherTextWords = cypher.replaceAll("   ", "  ").split(" ");

        for(String currentToken : cypherTextWords) result=result+decryptMap.get(currentToken);

        return result;
    }
}
