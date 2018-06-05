package com.epul.cerisaie.demo.dto;

import java.util.Date;

public interface IActiviteProjection extends Comparable{

    String getNomClient();

    Date getDate();

    String getNomActivite();

    Integer getNbInscriptions();
}
