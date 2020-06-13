
public class Main {

	public static void main(String[] args) {
		
		//Create the observer and subject
		NewsAgency newsAgency = new NewsAgency();
		RadioChannel radioChannel = new RadioChannel();
		
		// Register the observer with the subject
		newsAgency.register(radioChannel);
		
		// Add News Headlines
		newsAgency.addNews("Breaking News: Life Found on Mars!");
		newsAgency.addNews("NASA Sends First Female to the Moon");
		newsAgency.addNews("Vaccine Found for Covid-19");
		

	}

}
