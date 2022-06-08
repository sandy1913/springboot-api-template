package com.dcs.prototype.dao;

import com.dcs.prototype.model.Data;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface DataRepository extends JpaRepository<Data, BigInteger> {
}
