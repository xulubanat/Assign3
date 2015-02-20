package za.ac.cput.collectionpro;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * Created by student on 2015/02/16.
 */
public class CollectionTest
{
    List<Integer> numbers;
    Set<String> color;
    Map<Integer, Character> initial;
    Collection<String> car;
    @Before
    public void setUp() throws Exception
    {
        numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);

        color = new HashSet<String>();
        color.add("Green");
        color.add("Yellow");
        color.add("White");

        initial = new HashMap<Integer, Character>();
        initial.put(1, 'c');
        initial.put(2, 'd');
        initial.put(3, 'e');

        car = new ArrayList<String>();
        car.add("Toyota");
        car.add("BMW");
        car.add("VW");

    }

    @Test
    public void myCollect() throws Exception
    {
        CollectionInterface col = new Collections();
        Assert.assertEquals(numbers, col.myList());
        Assert.assertEquals(color, col.mySet());
        Assert.assertEquals(initial, col.myMap());
        Assert.assertEquals(car,col.myCollection());
    }

    @After
    public void tearDown() throws Exception
    {
    }
}
