package com.example.jpamanytoone.repository;

import com.example.jpamanytoone.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface RegionRepository extends JpaRepository<Region, Integer> {
}
