package ua.edu.ucu.apps.demo.flower;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@SuppressWarnings("magicnumber")
@Component
public final class Inventory {

    /**
     * Flowers list.
     */
    private final List<Flower> flowers = new ArrayList<>();

    /**
     * Initialize inventory with available flowers.
     */
    public Inventory() {
        flowers.add(new Flower(1, FlowerColor.WHITE, 9, FlowerType.CHAMOMILE, 7));
        flowers.add(new Flower(2, FlowerColor.BLUE, 20, FlowerType.CHAMOMILE, 7));
        flowers.add(new Flower(3, FlowerColor.RED, 20, FlowerType.CHAMOMILE, 7));

        flowers.add(new Flower(4, FlowerColor.RED, 100, FlowerType.ROSE, 30));
        flowers.add(new Flower(5, FlowerColor.WHITE, 80, FlowerType.ROSE, 30));
        flowers.add(new Flower(6, FlowerColor.BLUE, 90, FlowerType.ROSE, 30));
        flowers.add(new Flower(7, FlowerColor.RED, 60, FlowerType.ROSE, 20));
        flowers.add(new Flower(8, FlowerColor.WHITE, 50, FlowerType.ROSE, 20));
        flowers.add(new Flower(9, FlowerColor.BLUE, 40, FlowerType.ROSE, 20));

        flowers.add(new Flower(10, FlowerColor.BLUE, 80, FlowerType.TULIP, 20));
        flowers.add(new Flower(11, FlowerColor.WHITE, 70, FlowerType.TULIP, 20));
        flowers.add(new Flower(12, FlowerColor.RED, 60, FlowerType.TULIP, 20));
        flowers.add(new Flower(13, FlowerColor.BLUE, 50, FlowerType.TULIP, 15));
        flowers.add(new Flower(14, FlowerColor.WHITE, 40, FlowerType.TULIP, 15));
        flowers.add(new Flower(15, FlowerColor.RED, 30, FlowerType.TULIP, 15));
    }

    /**
     * Find flowers by criteria.
     * @param criteria search criteria
     * @return search result
     */
    public List<Flower> search(final Criteria criteria) {
        return flowers.stream()
                .filter(f -> f.getColor().equals(criteria.getColor()))
                .filter(f -> f.getType().equals(criteria.getType()))
                .filter(f -> f.getPrice() <= criteria.getMaxPrice())
                .filter(f -> f.getSepalLength() >= criteria.getSepalLength())
                .collect(Collectors.toList());
    }

    public List<Flower> getAllFlowers(){
        return new ArrayList<>(flowers);
    }

    public Flower getById(int id) {
        Optional<Flower> flower = flowers.stream().filter(f -> id == f.getId()).findFirst();
        return flower.orElse(null);
    }
}

