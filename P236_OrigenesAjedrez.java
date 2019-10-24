import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
					
		int granos = sc.nextInt();
		int multiple = sc.nextInt();
		int casillas = sc.nextInt();		
		int granos = 0;
		int multiple = 0;
		int casillas = 0;
		
		do {
			
			if (granos != 0 && multiple != 0 && casillas != 0) {
				
			
			for (int i = 0; i < casillas; i++) {
				
				
				
			}
			
			
			
			}

			
		if (granos == 0 && multiple == 0 && casillas == 0) {
			 System.exit(0);
		}
		
		granos=granos* (multiple*casillas);
		
		System.out.println(granos);
		
	}

}