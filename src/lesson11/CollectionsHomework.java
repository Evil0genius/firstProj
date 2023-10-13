package lesson11;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionsHomework implements CollectionUtils {

    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        List<Integer> result = new ArrayList<>(a);
        result.addAll(b);
        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        List<Integer> result = new ArrayList<>(a);
        result.retainAll(b);
        return result;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> result1 = new HashSet<>(a);
        result1.addAll(b);
        return result1;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> result = a.stream()
                .distinct()
                .filter(b::contains)
                .collect(Collectors.toSet());
        return result;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        List<Integer> differences = new ArrayList<>(a);
        differences.removeAll(b);
        return differences;
    }
}
