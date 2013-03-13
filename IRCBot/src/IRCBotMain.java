import org.jibble.pircbot.*;

public class IRCBotMain {

	public static void main(String[] args) throws Exception {
		
		System.out.println("test");
		IRCBot bot = new IRCBot("TPOISABot");
		
		IRCBot bot2 = new IRCBot("TPOISABot2");
		
		bot.setVerbose(true);
		bot.connect("irc.freenode.net");
		bot.joinChannel("#TPOISA");
		
		bot2.setVerbose(true);
		bot2.connect("irc.freenode.net");
		bot2.joinChannel("#TPOISA");

	}	

}
