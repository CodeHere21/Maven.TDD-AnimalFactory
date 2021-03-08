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
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

@Test
public void testAdd(){
    CatHouse.clear();
    String givenName = "Zula";
    Date givenBirthDate = new Date();
    Integer givenId = 0;
    Cat cat = new Cat(givenName, givenBirthDate, givenId);
    CatHouse.add(cat);
    int givenCat=1;
    int retrievedCat=CatHouse.getNumberOfCats();
    Assert.assertEquals(givenCat,retrievedCat);
}
@Test
public void testRemoveById(){
    String givenName = "Zula";
    Date givenBirthDate = new Date();
    Integer givenId = 0;
    Cat cat = new Cat(givenName, givenBirthDate, givenId);
    CatHouse.add(cat);
    CatHouse.remove(cat);
    Integer givenCat=0;
    Integer retrievedCat=cat.getId();
    Assert.assertEquals(givenCat,retrievedCat);

}
@Test
public void testRemove(){
    CatHouse.clear();
    String givenName = "Zula";
    Date givenBirthDate = new Date();
    Integer givenId = 0;
    Cat cat = new Cat(givenName, givenBirthDate, givenId);
    CatHouse.add(cat);
    CatHouse.remove(cat);
    Integer givenCat=0;
    Integer retrievedCat=CatHouse.getNumberOfCats();
    Assert.assertEquals(givenCat,retrievedCat);
}
@Test
public void testGetCatById(){
    String givenName = "Zula";
    Date givenBirthDate = new Date();
    Integer givenId = 0;
    Cat cat = new Cat(givenName, givenBirthDate, givenId);
    Integer retrievedId= cat.getId();
    Assert.assertEquals(givenId,retrievedId);
}
@Test
public void testGetNumberOfCats(){
    // Given (some
    String name = "Zula";
    Date birthDate = new Date();
    Cat animal = AnimalFactory.createCat(name, birthDate);
    CatHouse.clear();

    // When
    CatHouse.add(animal);

    // Then
    CatHouse.getNumberOfCats();
}
}
