package com.spring.dao;

import com.spring.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerDao extends JpaRepository<Player,Integer> {

}
