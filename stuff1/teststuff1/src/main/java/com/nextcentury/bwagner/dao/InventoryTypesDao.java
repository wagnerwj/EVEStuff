package com.nextcentury.bwagner.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nextcentury.bwagner.InventoryTypes;

@Repository
public class InventoryTypesDao implements CrudRepository<InventoryTypes, Long> {

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete(Long arg0) {
		// TODO Auto-generated method stub
		
	}

	public void delete(InventoryTypes arg0) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Iterable<? extends InventoryTypes> arg0) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public boolean exists(Long arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterable<InventoryTypes> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable<InventoryTypes> findAll(Iterable<Long> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public InventoryTypes findOne(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends InventoryTypes> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends InventoryTypes> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
