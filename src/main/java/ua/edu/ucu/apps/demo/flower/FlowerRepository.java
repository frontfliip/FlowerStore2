package ua.edu.ucu.apps.demo.flower;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FlowerRepository extends CrudRepository<Flower, Integer> {

}
