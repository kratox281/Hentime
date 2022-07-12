package com.hentime.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public abstract class CRUD<T,ID>{
	

	protected abstract JpaRepository<T, ID> getRepo();

	public T save(T t) throws Exception {
		return getRepo().save(t);
	}

	public T update(T t) throws Exception {
		return getRepo().save(t);
		
	}

	public List<T> list() throws Exception {
		return getRepo().findAll();
	}

	public T findById (ID id) throws Exception {
		//System.out.println(id);
		Optional<T> m1 = (Optional<T>) getRepo().findById(id);
		//System.out.println(m1.get().toString());
		return m1.isPresent() ? m1.get() : null;
		
	}

	public boolean delete(ID id) throws Exception {
		getRepo().deleteById(id);
		return true;
	}

}
