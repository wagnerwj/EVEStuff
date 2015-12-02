package com.nextcentury.bwagner.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nextcentury.bwagner.InvTypes;

@Repository
public interface InvTypesDao extends CrudRepository<InvTypes, Long> {

	public long count();

	public void delete(Long arg0);

	public void delete(InvTypes arg0);

	public void delete(Iterable<? extends InvTypes> arg0) ;
	public void deleteAll() ;

	public boolean exists(Long arg0) ;

	public Iterable<InvTypes> findAll() ;

	public Iterable<InvTypes> findAll(Iterable<Long> arg0) ;

	public InvTypes findOne(Long arg0) ;

	public <S extends InvTypes> S save(S arg0) ;

	public <S extends InvTypes> Iterable<S> save(Iterable<S> arg0) ;
	
	@Query(value = "SELECT t from invtypes  t where t.typename = 'typename'", 
			nativeQuery = true)
	public List<InvTypes> findByTypename(String typename);

}
