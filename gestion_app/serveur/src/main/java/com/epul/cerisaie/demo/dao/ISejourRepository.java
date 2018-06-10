package com.epul.cerisaie.demo.dao;

import com.epul.cerisaie.demo.model.Sejour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ISejourRepository extends JpaRepository<Sejour, Integer> {
}
