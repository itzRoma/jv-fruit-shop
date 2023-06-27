package core.basesyntax.dao;

import java.util.Map;

public interface FruitDao {
    void updateQuantity(String fruit, Integer amount);

    Map<String, Integer> getFruits();
}
