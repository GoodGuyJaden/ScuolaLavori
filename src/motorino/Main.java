package motorino;

public class Main {

	public static void main(String[] args) {
		MotorinoImmatricolato piaggio = new MotorinoImmatricolato("rosso", "Si Piaggio", 30);
		
		piaggio.setAntifurto(true);
		piaggio.accelera(20);
		System.out.println(piaggio.getVelocit�());
		System.out.println();
		
		piaggio.setAntifurto(false);
		piaggio.accelera(25);
		System.out.println(piaggio.getVelocit�());
		System.out.println();
		
		piaggio.setAntifurto(true);
		System.out.println(piaggio.getAntifurto()); //falso perch� la velocit� non � 0
		System.out.println();
		
		piaggio.accelera(-25);
		System.out.println(piaggio.getVelocit�());
		piaggio.setAntifurto(true);
		System.out.println(piaggio.getAntifurto());
		System.out.println();
		
		piaggio.accelera(15);
		System.out.println(piaggio.getVelocit�());
		//System.out.println(piaggio.toString());
		
	}

}
