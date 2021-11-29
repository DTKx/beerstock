package one.digitalinnovation.beerstock.repository;


import one.digitalinnovation.beerstock.entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * DAO-Data Access Object.
 * Communicates with the database (Create,get,removal)
 */
public interface BeerRepository extends JpaRepository<Beer, Long> {

    Optional<Beer> findByName(String name);
}