package aplicacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import pojo.Casa;

public class Principal {

	public static void main(String[] args) {
		
		Casa c1 = new Casa("Sol", 23, 50.75);
		Casa c2 = new Casa("Luna", 45, 23.4);
		Casa c3 = new Casa("Luna", 15, 23.4);
		Casa c4 = new Casa("Saturno", 20, 23.4);
		
		List <Casa> urbi = new ArrayList <Casa>();
		
		urbi.add(c1);
		urbi.add(c2);
		urbi.add(c3);
		urbi.add(c4);
		
		
		for (Casa elemento : urbi) {
			System.out.println(elemento.getCalle() + " # " + elemento.getNumero());
		}
		
		
		System.out.println(urbi);
		
		Collections.sort(urbi);
		
		System.out.println(urbi);

	}

}
