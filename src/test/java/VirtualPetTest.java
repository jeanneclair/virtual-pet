import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {

	VirtualPet pet = new VirtualPet();

	@Test
	public void shouldReturnTrueWhenHungryAndGivenFood() {
		int underTest = pet.feed(10);

		Assert.assertEquals(40, underTest);
	}

	@Test
	public void shouldReturnTrueWhenThirstyAndGivenWater() {
		int underTest = pet.water(10);

		Assert.assertEquals(40, underTest);

	}

	@Test
	public void shouldReturnTrueWhenNotHappyAndPetted() {
		int underTest = pet.pet(10);

		Assert.assertEquals(60, underTest);

	}

	@Test
	public void shouldReturnTrueWhenTurnTakenHungerAndThirstIncreasesWhileHappinessDecreases() {
		// Act
		pet.tick();

		// Arrange
		int underTest = pet.hunger;

		// Assert
		Assert.assertEquals(51, underTest);

	}
}
