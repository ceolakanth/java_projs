import org.jibble.pircbot.*;

public class IRCBot extends PircBot {
	
	public IRCBot(String name) {
		this.setName(name);
	}
	
	public void onConnect() {
		for (int i=0; i <=2; i++) {
			sendMessage("#TPOISA", "Hi Maggie");
		}
	}

}