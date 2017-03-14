package com.pluralsigth.service;

import java.util.List;

import com.pluralsigth.model.Custumer;
import com.pluralsigth.repository.CustumerRepository;
import com.pluralsigth.repository.HibernateCustumerRepositoryImpl;

public class CustumerServiceImpl implements CustumerService {

	private CustumerRepository custumerRepository = new HibernateCustumerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.pluralsigth.service.CustumerService#findAll()
	 */
	@Override
	public List<Custumer> findAll(){
		return custumerRepository.findAll();
	}
	
}
