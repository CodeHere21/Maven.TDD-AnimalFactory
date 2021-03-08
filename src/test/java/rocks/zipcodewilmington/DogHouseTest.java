package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
    @Test
    public void testAdd(){
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        DogHouse.add(animal);
        int givenDog=1;
        int retrievedDog=DogHouse.getNumberOfDogs();
        Assert.assertEquals(givenDog,retrievedDog);
    }
    @Test
    public void testRemoveById(){
        String givenName = "Milo";
            Date givenBirthDate = new Date();
            Integer givenId = 0;
            Dog dog= new Dog(givenName, givenBirthDate, givenId);
            DogHouse.add(dog);

        DogHouse.remove(dog);
        Integer givenDog=0;
        Integer retrievedDog=dog.getId();
        Assert.assertEquals(givenDog,retrievedDog);
    }
    @Test
    public void testRemove(){
        DogHouse.clear();
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        DogHouse.add(dog);
        DogHouse.remove(dog);
        Integer givenDog=0;
        Integer retrievedDog=DogHouse.getNumberOfDogs();
        Assert.assertEquals(givenDog,retrievedDog);
    }
    @Test
    public void testGetCatById(){
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        Integer retrievedId= dog.getId();
        Assert.assertEquals(givenId,retrievedId);
    }
}
