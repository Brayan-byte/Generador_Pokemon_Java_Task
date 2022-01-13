package inheritancheAndPolymorfism;

public class GrassPokemon extends Pokemon {

	@Override
	public void Attack() {
		System.out.println(name+" Attack you with "+ moveSet);
		
	}
	@Override
	public void Eat() {
		System.out.println(name+" Eat some flowers ");
		
	}
	@Override
	public void Sound() {
		System.out.println(name+" Scream like a falling tree");
		
	}
	@Override
	public String type() {
		return "Grass Type Pokemon";
		
	}

}
