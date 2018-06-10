package com.epul.cerisaie.demo.service.impl;

import com.epul.cerisaie.demo.dao.IActiviteRepository;
import com.epul.cerisaie.demo.dao.IClientRepository;
import com.epul.cerisaie.demo.dao.ISejourRepository;
import com.epul.cerisaie.demo.dao.ISportRepository;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class Services {

    @Autowired
    IActiviteRepository activiteDAO;

    @Autowired
    IClientRepository clientDAO;

    @Autowired
    ISportRepository sportDAO;

    @Autowired
    ISejourRepository sejourDAO;
}