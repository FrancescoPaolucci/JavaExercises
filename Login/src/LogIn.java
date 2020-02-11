import java.util.Scanner;

public class LogIn {
	public static void main(String[] args) {
	Utenti user = new Utenti();
	int selezione;
	 selezione = readInput("Select 1 for sign up, select 2 fot log in, else exit,");
	switch(selezione) {
	  case 1:
		  System.out.println("*****WELCOME TO THE SIGN UP*****");
	    user.setName(readString("Insert first name"));
	    user.setLastname(readString("Insert Last name"));
	    user.setEmail(readString("Insert email"));
	    user.setPw(readString("Insert pw"));
	    System.out.println("**Welcome to our service**");
	    break;
	  case 2:
	    System.out.println("Inserisci email e PW");
	    break;
	    
	}
	user.addUSer(user.getName(),user.getLastname(),user.getEmail(),user.getPw());
	}
	
	

	public static String readString(String text) {
		Scanner scanner = new Scanner(System.in);
		String cccc = "NOPE";
		boolean ready = false;

		while (!ready) {
			try {
				System.out.println(text);
				String tmp = scanner.nextLine();
				return tmp;
			} catch (Exception e) {
			}

		}
		return cccc;
	}
	 public static int readInput(String text) {
	        Scanner scanner = new Scanner(System.in);
	        boolean ready = false;

	        while (!ready) {
	            try {
	                System.out.println(text);
	                String tmp = scanner.nextLine();
	                return Integer.parseInt(tmp);
	            } catch (Exception e) {
	            }

	        }
	        return 0;
	 }
}
