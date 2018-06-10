package com.epul.cerisaie.demo.dao;

import com.epul.cerisaie.demo.model.Activite;
import com.epul.cerisaie.demo.model.ActivitePK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IActiviteRepository extends JpaRepository<Activite, ActivitePK> {
}