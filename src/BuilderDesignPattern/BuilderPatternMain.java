package BuilderDesignPattern;

public class BuilderPatternMain {

	public static void main(String[] args) {
		FootballClubBuilder fb = new FootballClubBuilder();
		
		FootballClub fc = fb.setName("FC Barcelona").setCountry("Spain").setMarketValue(5000).setCaptain("Messi").build();
		
		System.out.println(fc);
	}

}
