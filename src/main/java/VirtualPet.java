
public class VirtualPet {

	int hunger = 50;
	int thirst = 50;
	int happiness = 50;

	public int feed(int fed) {

		hunger -= fed;
		thirst += 10;
		happiness += 10;

		if (hunger < 0) {

			return hunger = 0;

		} else {

			return hunger;
		}

	}

	public int water(int watered) {

		thirst -= watered;
		happiness += 5;

		if (thirst < 0) {

			return thirst = 0;

		} else {

			return thirst;
		}

	}

	public int pet(int petted) {

		happiness += petted;

		if (happiness > 100) {

			return happiness = 100;

		} else {

			return happiness;
		}

	}

	public void tick() {

		hunger += 1;
		thirst += 1;
		happiness -= 1;

	}

}
