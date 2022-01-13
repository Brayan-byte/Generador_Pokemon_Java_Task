package inheritancheAndPolymorfism;

public class WaterPokemon extends Pokemon{
	
	@Override
	public void Attack() {
		System.out.println(name+" Attack you with "+ moveSet);
		
	}
	@Override
	public void Eat() {
		System.out.println(name+" Eat some fish");
		
	}
	@Override
	public void Sound() {
		System.out.println(name+" Scream like a whale");
		
	}
	@Override
	public String type() {
		return "Water Type Pokemon";
		
	}

}
