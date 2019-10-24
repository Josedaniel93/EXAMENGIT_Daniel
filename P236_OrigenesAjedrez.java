import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
					
		int granos = sc.nextInt();
		int multiple = sc.nextInt();
		int casillas = sc.nextInt();		
			
		if (granos == 0 && multiple == 0 && casillas == 0) {
			 System.exit(0);
		}
		
		granos=granos* (multiple*casillas);
		
		System.out.println(granos);
		
	}

}