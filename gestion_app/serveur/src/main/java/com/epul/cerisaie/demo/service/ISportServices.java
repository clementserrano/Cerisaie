package com.epul.cerisaie.demo.service;

import com.epul.cerisaie.demo.dto.IActiviteProjection;
import com.epul.cerisaie.demo.dto.ISportProjection;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IServices {
    List<IActiviteProjection> getActivites();

    List<IActiviteProjection> getActivite(int id);

    List<ISportProjection> getSports();
}
