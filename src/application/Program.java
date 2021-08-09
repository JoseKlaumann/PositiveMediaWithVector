//URI - 1064 - 08/08/2021.
//With list

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.PositiveMedia;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		PositiveMedia pro = new PositiveMedia();
		pro.setRepeat(sc.nextInt());

		PositiveMedia[] vect = new PositiveMedia[pro.getRepeat()];

		for (int i = 0; i < pro.getRepeat(); i++) {
			pro.setValues(sc.nextDouble());

			if (pro.getValues() > 0) {
				vect[i] = new PositiveMedia(pro.getValues()); // necessario um construtor
			}
		}

		for (int i = 0; i < pro.getRepeat(); i++) {
			if (vect[i] != null) {
				pro.sum(vect[i].getValues()); //adiciona o valor que esta na lista no metodo de soma 
				pro.addCountPositive();
			}
		}
		
		System.out.println(pro);

		sc.close();
	}
}