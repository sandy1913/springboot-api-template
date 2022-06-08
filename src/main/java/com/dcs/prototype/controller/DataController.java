package com.dcs.prototype.controller;

import com.dcs.prototype.model.Data;
import com.dcs.prototype.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
public class DataController {

    @Autowired
    private DataService dataService;

    @PostMapping("/data")
    public ResponseEntity<Data> saveData(@RequestBody Data data){
        Data saveData = dataService.saveData(data);
        return new ResponseEntity<>(saveData, HttpStatus.CREATED);
    }

    @GetMapping("/data")
    public ResponseEntity<Data> getData(@RequestParam(name="resultId")BigInteger resultId){
     Data data= dataService.getData(resultId);
     return new ResponseEntity<>(data, HttpStatus.OK);
    }

    public List<Data> getDataList(){
        return dataService.getDataList();
    }

    public ResponseEntity<Data> updateData(@RequestParam(name= "resultId") BigInteger resultId, @RequestBody Data data){
        Data updatedData = dataService.updateData(resultId, data);
        return new ResponseEntity<>(updatedData, HttpStatus.OK);
    }

    public ResponseEntity<Data> deleteData(@RequestParam(name= "resultId") BigInteger resultId, @RequestBody Data data){
        Data deletedData = dataService.deleteData(resultId);
        return new ResponseEntity<>(deletedData, HttpStatus.OK);
    }

}
