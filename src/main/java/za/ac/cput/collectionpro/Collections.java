package za.ac.cput.collectionpro;

import java.util.*;

/**
 * Created by student on 2015/02/16.
 */
public class Collections implements CollectionInterface
{
    @Override
    public List<Integer> myList()
    {
        List<Integer> num = new ArrayList<Integer>();
        num.add(2);
        num.add(4);
        num.add(5);
        return(num);
    }
    @Override
    public Set<String> mySet()
    {
        Set<String> colors = new HashSet<String>();
        colors.add("Green");
        colors.add("Yellow");
        colors.add("White");

        return (colors);
    }
    @Override
    public Map<Integer, Character> myMap()
    {
        Map<Integer, Character> initials = new HashMap<Integer, Character>();
        initials.put(1, 'c');
        initials.put(2, 'd');
        initials.put(3, 'e');
        return (initials);
    }
    @Override
    public Collection<String> myCollection ()
    {
        Collection<String> cars = new ArrayList<String>();
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("VW");
        return(cars);
    }
}
