package enume;

public enum Direction {
	
	HAUT("haut", 0),
	BAS("bas", 1),
	DROITE("droite", 2),
	GAUCHE("gauche", 3);
	
	private String name;
	private int code;
	
	Direction(String _name, int _code) {
		
		this.name = _name;
		this.code = _code;
		
	}
	
	
	@Override
	
	public String toString() {
		
		return this.name;
		
	}
	
	public int getCode() {
		
		return this.code;
		
	}

}

