package pl.jcommerce.jdk10;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class UnmodifiableCollectionsTest {

    @Test
    public void unmodifiableCollections() {
        var vegetables = Lists.newArrayList("Broccoli", "Celery", "Carrot");
        var unmodifiable = Collections.unmodifiableList(vegetables);

        vegetables.set(0, "Radish");
        var v = unmodifiable.get(0);

        unmodifiable.forEach(System.out::println);
    }

    @Test
    public void unmodifiableCollectionsCopyOf() {
        var list = Lists.newArrayList(1, 2);
        var unmodifiableList = Collections.unmodifiableList(list);
        var copyOfList = List.copyOf(list);

        //modifying of source list
        list.add(3);
        System.out.println("unmodifiableList: " + unmodifiableList);
        System.out.println("copyOfList: " + copyOfList);
    }

    @Test
    public void whenModifyCopyOfList_thenThrowsException() {
        var list = Lists.newArrayList(1, 2);
        var copyOfList = List.copyOf(list);
        Assertions.assertThrows(UnsupportedOperationException.class, () -> {
            copyOfList.add(4);
        });
    }
}
