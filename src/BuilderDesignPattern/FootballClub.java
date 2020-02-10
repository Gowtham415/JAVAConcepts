package BuilderDesignPattern;

public class FootballClub {
	private String name;
	private String country;
	private String manager;
	private String captain;
	private double marketValue;
	
	public FootballClub(String name, String country, String manager, String captain, double marketValue) {
		this.name = name;
		this.country = country;
		this.manager = manager;
		this.captain = captain;
		this.marketValue = marketValue;
	}

	@Override
	public String toString() {
		return "FootballClub [name=" + name + ", country=" + country + ", manager=" + manager + ", captain=" + captain
				+ ", marketValue=" + marketValue + "]";
	}
	
}
