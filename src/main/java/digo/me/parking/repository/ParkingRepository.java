package digo.me.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import digo.me.parking.model.Parking;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, String> {
}