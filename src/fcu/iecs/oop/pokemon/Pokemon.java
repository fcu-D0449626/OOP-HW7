package fcu.iecs.oop.pokemon;

public abstract class Pokemon {
	private int cp;
	private final String name;
	private final PokemonType Type;
	
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public String getName() {
		return name;
	}
	public PokemonType getType() {
		return Type;
	}
	public Pokemon(String name, PokemonType type,int cp) {
		super();
		this.cp = cp;
		this.name = name;
		this.Type = type;
	}
	public abstract void attack();
	
}