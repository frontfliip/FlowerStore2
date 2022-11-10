package ua.edu.ucu.apps.demo.flower;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FlowerRepository extends JpaRepository<Flower, Integer> {

    List<Flower> getBySepalLengthAndPriceAndColorAndType(Double sepalLength, Double price,FlowerColor color, FlowerType type);

}
