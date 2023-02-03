import static org.junit.Assert.*;

public class MorseCodeHandlerTest {

    @org.junit.Test
    public void decodeTest() {
        MorseCodeHandler morseCodeHandlerTest = new MorseCodeHandler();

        assertEquals("HELLO WORLD", morseCodeHandlerTest.decode(".... . .-.. .-.. ---   .-- --- .-. .-.. -.."));
        assertEquals("SOS", morseCodeHandlerTest.decode("... --- ..."));
        assertEquals("DAS WAR KOMPLIZIERTER ALS ICH DACHTE",
                morseCodeHandlerTest.decode("-.. .- ...   .-- .- .-.   -.- --- -- .--. .-.. .. --.. .. . .-. - . .-.   .- .-.. ...   .. -.-. ....   -.. .- -.-. .... - ."));
    }
}