package za.ac.cput.collectionpro;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by student on 2015/02/16.
 */
public interface CollectionInterface
{
    public List<Integer> myList();
    public Set<String> mySet();
    public Map<Integer, Character> myMap();
    public Collection<String> myCollection();
}
