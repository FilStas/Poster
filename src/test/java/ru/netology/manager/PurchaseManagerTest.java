package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.PurchaseItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PurchaseManagerTest {

    @Test
    public void shouldRemoveIfExists() {
        PurchaseManager manager = new PurchaseManager();
        int idToRemove = 1;
        PurchaseItem first = new PurchaseItem(1, 1, "first", 1, 1);
        PurchaseItem second = new PurchaseItem(2, 2, "second", 1, 1);
        PurchaseItem third = new PurchaseItem(3, 3, "third", 1, 1);
        manager.add(first);
        manager.add(second);
        manager.add(third);

        manager.removeById(idToRemove);

        PurchaseItem[] actual = manager.getAll();
        PurchaseItem[] expected = new PurchaseItem[]{third, second};

        assertArrayEquals(expected, actual);
    }

}