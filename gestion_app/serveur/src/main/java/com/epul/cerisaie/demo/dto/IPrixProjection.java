package com.epul.cerisaie.demo.dto;

public interface IPrixProjection extends Comparable{

    String getClient();

    Integer getNbInscriptions();

    Double getPrix();
}
