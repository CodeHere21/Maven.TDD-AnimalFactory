package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void testConstructor() {
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testSpeak() {
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 123;
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        String actual = "bark!";
        String expected = dog.speak();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetBirthDate(){
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId=123;
        Dog dog= new Dog(givenName,givenBirthDate, givenId);

        Date expectedBirthDate=dog.getBirthDate();
        Assert.assertEquals(givenBirthDate,expectedBirthDate);
    }
    @Test
    public void testEat(){
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId=123;
        Dog dog = new Dog(givenName,givenBirthDate, givenId);
        Food givenMeal=new Food();
        dog.eat(givenMeal);
        int givenEat= 1;
        int retrievedEat=dog.getNumberOfMealsEaten();//method calling from eat()
        Assert.assertEquals(givenEat,retrievedEat);
    }
    @Test
    public void testGetId() {
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 123;
        Dog dog= new Dog(givenName, givenBirthDate, givenId);
        Integer retrievedId = dog.getId();
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testAnimalInheritance(){
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId=123;
        Dog dog = new Dog(givenName,givenBirthDate, givenId);
        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void testMammalInheritance(){
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId=123;
        Dog dog= new Dog(givenName,givenBirthDate, givenId);
        Assert.assertTrue(dog instanceof Mammal);
    }
}