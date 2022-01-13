package pkg;

import java.util.Scanner;

import inheritancheAndPolymorfism.ElectricPokemon;
import inheritancheAndPolymorfism.GrassPokemon;
import inheritancheAndPolymorfism.Pokemon;
import inheritancheAndPolymorfism.WaterPokemon;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcomte to Pokemon Generator: \n");
		System.out.println("---------------------------------\n");
		System.out.println("Please choose one tipe of pokemon to start:\n");
		System.out.println("1.-Electric Pokemon");
		System.out.println("2.-Water Pokemo");
		System.out.println("3.-Grass Pokemon\n");
		
		int option = sc.nextInt();
		Pokemon pokemon=null;

		if(option == 1) {
			pokemon = new ElectricPokemon();
		}
		if(option == 2) {
			pokemon = new WaterPokemon();	
		}
		if(option == 3) {
			pokemon = new GrassPokemon();
		}
		
		System.out.println("You Choose a: "+ pokemon.type());
		
		System.out.println("Give a name to your pokemon");
		String name = sc.next();
		pokemon.setName(name);
		
		System.out.println("Give one attack to your pokemon");
		String attack = sc.next();
		pokemon.setMoveSet(attack);
		
			if(name!=null && attack !=null) {
				pokemon.Attack();
				pokemon.Eat();
				pokemon.Sound();	
			}
			else {
				System.out.println("Upppppssss.... You don't enter a value, please try again");
			}

		}

		

		

		
	}

