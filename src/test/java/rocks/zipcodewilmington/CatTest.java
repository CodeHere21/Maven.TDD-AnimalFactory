package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    String retrievedName="";
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void testSetName() {

        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId=123;
        Cat cat = new Cat(givenName,givenBirthDate, givenId);

        cat.setName(givenName);//calls metod setName
        String retrievedName = cat.getName();

        Assert.assertEquals(givenName, retrievedName);
    }
    @Test
    public void testSpeak (){
       String givenName = "Zula";
       Date givenBirthDate = new Date();
       Integer givenId=123;
        Cat cat = new Cat(givenName,givenBirthDate, givenId);
        String given="meow!";
        String retrieved = cat.speak();
        Assert.assertEquals(given,retrieved);
    }
    @Test
    public void testSetBirthDate(){
        String givenName = "Zula";
        Date givenBirthDate = new Date();

        Integer givenId=123;
        Cat cat = new Cat(givenName,givenBirthDate, givenId);
        Date expectedBirthDate=cat.getBirthDate();
        Assert.assertEquals(givenBirthDate,expectedBirthDate );
    }
    @Test
    public void testEat(){
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId=123;
        Cat cat = new Cat(givenName,givenBirthDate, givenId);
        Food givenMeal=new Food();
        cat.eat(givenMeal);
        int givenEat= 1;
        int retrievedEat=cat.getNumberOfMealsEaten();//method calling from eat()
        Assert.assertEquals(givenEat,retrievedEat);
    }
    @Test
    public void testGetId() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 123;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Integer retrievedId = cat.getId();
        Assert.assertEquals(givenId, retrievedId);
    }

     @Test
     public void testAnimalInheritance(){
            String givenName = "Zula";
            Date givenBirthDate = new Date();
            Integer givenId=123;
            Cat cat = new Cat(givenName,givenBirthDate, givenId);
            Assert.assertTrue(cat instanceof Animal);
        }

     @Test
    public void testMammalInheritance(){
         String givenName = "Zula";
         Date givenBirthDate = new Date();
         Integer givenId=123;
         Cat cat = new Cat(givenName,givenBirthDate, givenId);
         Assert.assertTrue(cat instanceof Mammal);
     }
    }

