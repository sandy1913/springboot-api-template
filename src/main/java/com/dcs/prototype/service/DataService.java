package com.dcs.prototype.service;


import com.dcs.prototype.dao.DataRepository;
import com.dcs.prototype.model.Data;
import org.hibernate.cfg.BinderHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class DataService {

    @Autowired
    private DataRepository dataRepository;

    public Data saveData(Data data){
        return dataRepository.save(data);
    }

    public Data getData(BigInteger resultId){
        return dataRepository.findById(resultId).orElseThrow(() -> new RuntimeException("not found"));
    }

    public List<Data> getDataList(){
        return dataRepository.findAll();
    }

    public Data updateData(BigInteger resultId, Data data){
        Data existingData = dataRepository.findById(resultId).orElseThrow(() -> new RuntimeException("not found"));
        existingData.setLoadDate(data.getLoadDate());
        existingData.setCompoundNumber(data.getCompoundNumber());
        existingData.setSummaryGroupId(data.getSummaryGroupId());
        return existingData;
    }

    public Data deleteData(BigInteger resultId){
        Data existingData = dataRepository.findById(resultId).orElseThrow(()-> new RuntimeException("not found"));
        dataRepository.deleteById(resultId);
        return existingData;
    }

}
