package com.epul.cerisaie.demo.service;

import com.epul.cerisaie.demo.dto.IActiviteProjection;

import java.util.List;

public interface IActiviteService {

    List<IActiviteProjection> getActivites();

    List<IActiviteProjection> getActivite(int id);
}
