package methodoverriding;

public class Main {

	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		System.out.println(v.id);
		System.out.println(v.no);
		v.start();

	}

}
