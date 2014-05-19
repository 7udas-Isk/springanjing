package com.me.dao;

import java.util.List;

import javax.persistence.*;

import org.springframework.stereotype.Repository;

import com.me.model.Lat;

@Repository
public class LatDaoImpl implements LatDao {
	
	private EntityManager em;
	
	public EntityManager getEntityManager() {
		return em;
	}
	
	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}
	
	@SuppressWarnings("unchecked")
	public List<Lat> findAll() {
		return em.createQuery("select l from Lat l").getResultList();
	}
}
