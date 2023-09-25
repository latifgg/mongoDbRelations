package com.deee.deeee.service;

import com.deee.deeee.model.Contract;
import com.deee.deeee.model.Instrument;

import java.util.List;

public interface AppService {
    Instrument addInstrument(String instrumentName);
    List<Instrument> getAllInstruments();

    // Yeni metotlar ekleyin:
    Instrument addContractToInstrument(String instrumentId, String contractId);

    List<Contract> getContractsByInstrument(String instrumentId);

    Contract createContract(String contractName);

    List<Contract> getAllContracts();

    Contract getContractById(String contractId);


}

