import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPet junebug = new VirtualPet();

		String menu = "Enter '1' to feed, '2' to water, '3' to pet, or '4' to quit";

		String menuChoice = "";
		
		Boolean gameRunning = true;
		
		while (gameRunning) {
			System.out.println(getStatus(junebug));

			while (!menuChoice.equals("1") && (!menuChoice.equals("2")) && (!menuChoice.equals("3")) && (!menuChoice.equals("4"))) {
				System.out.println(menu);
				menuChoice = input.nextLine();
			}
			if (menuChoice.equals("1")) {
				System.out.println("How much do you want to feed Junebug?");
				int foodAmount = input.nextInt();
				junebug.tick();

				if (junebug.feed(foodAmount) >= 50) {

					System.out.println("Meow. Junebug is still hungry.");

				} else {

					System.out.println("Yum! Junebug's Hunger is now: " + junebug.feed(foodAmount));
				}
				menuChoice = input.nextLine();

			} else if (menuChoice.equals("2")) {
				System.out.println("How much do you want to water Junebug?");
				int waterAmount = input.nextInt();
				junebug.tick();

				if (junebug.water(waterAmount) >= 50) {

					System.out.println("Meow. Junebug is still thirsty.");

				} else {

					System.out.println("Slurp! Junebug's Thirst is now: " + junebug.water(waterAmount));
				}
				menuChoice = input.nextLine();

			} else if (menuChoice.equals("3")) {
				System.out.println("How much do you want to pet Junebug?");
				int petAmount = input.nextInt();
				junebug.tick();

				if (junebug.pet(petAmount) < 50) {

					System.out.println("Meow. Junebug is still sad.");

				} else {

					System.out.println("Purrr! Junebug's Happiness is now: " + junebug.pet(petAmount));
				}
				menuChoice = input.nextLine();
			} else if (menuChoice.equals("4")) {
				System.out.println("Meow! See you later!");
				gameRunning = false;
				System.exit(0);
			
			}
		}
	}

	private static String getStatus(VirtualPet pet) {
		String status = "Junebug the Cat: Hunger = " + pet.hunger + "/100 , Thirst = " + pet.thirst
				+ "/100 , Happiness = " + pet.happiness + "/100";
		return status;
	}

}
