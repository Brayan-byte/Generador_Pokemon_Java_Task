package inheritancheAndPolymorfism;
/**
 * Se genero una clase abstracta con metodos abstractos para que pueda ser heredada y cada uno de sus hijos los instancie y les den su propio uso
 * Al cada uno de los hijos implementar de manera distina los metodos con el mismo nombre, se genera el polimorfismo.
 */
public abstract class Pokemon {
	//Atributos que son protegidos para encapsularlos y que no puedan ser modificados fuera del paquete InheritanceAndPolymorfism
	protected String name;
	protected int statOfAttack;
	protected String moveSet;
	
	
	public Pokemon() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMoveSet() {
		return moveSet;
	}
	public void setMoveSet(String moveSet) {
		this.moveSet = moveSet;
	}
	//Metodos abstractos vacios listos para que puedan ser implementandos en cada una de las clases hijas.
	public  abstract String type();
	public abstract void Attack();
	public abstract void Eat();
	public  abstract void Sound();

	public void Attack(String name, String moveSet) {
		// TODO Auto-generated method stub
		
	}
}
