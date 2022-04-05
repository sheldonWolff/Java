import java.util.Date;
public class AlfredQuotes {
    
    public String guestGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        String greeting = String.format("Hello %s, welcome back!", name);
        return greeting;
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "The current date and time is " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") > -1) {
            return "I'll take care of that, Alexis needs a break.";
        }
        if (conversation.indexOf("Alfred") > -1) {
            return "As you wish.";
        }
        return "I shall pretend i did not hear that.";
        
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

