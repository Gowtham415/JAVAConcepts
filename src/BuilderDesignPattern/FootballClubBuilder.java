package BuilderDesignPattern;

public class FootballClubBuilder {
	private String name;
	private String country;
	private String manager;
	private String captain;
	private double marketValue;
	
	public FootballClubBuilder setName(String name) {
		this.name = name;
		return this;
	}
	
	public FootballClubBuilder setCountry(String country) {
		this.country = country;
		return this;
	}
	public FootballClubBuilder setManager(String manager) {
		this.manager = manager;
		return this;
	}
	public FootballClubBuilder setCaptain(String captain) {
		this.captain = captain;
		return this;
	}
	public FootballClubBuilder setMarketValue(double marketValue) {
		this.marketValue = marketValue;
		return this;
	}
	
	public FootballClub build() {
		return new FootballClub(name, country, manager, captain, marketValue);
	}
	
}
