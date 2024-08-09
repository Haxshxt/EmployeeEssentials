package com.service;

import java.util.List;

import com.repository.EmployeeRespositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRespositoryImpl employeeRespositoryImpl;
	public EmployeeRespositoryImpl getEmployeeRespositoryImpl() {
		return employeeRespositoryImpl;
	}

	public void setEmployeeRespositoryImpl(EmployeeRespositoryImpl employeeRespositoryImpl) {
		this.employeeRespositoryImpl = employeeRespositoryImpl;
	}

	@Override
	public String createService(Object obj) {
	
		String status = employeeRespositoryImpl.create(obj);
		
		return status;
	}

	@Override
	public List<Object> readService() {
		
		List<Object> list = employeeRespositoryImpl.read();
		
		return list;
	}

	@Override
	public String updateService(int pk, List<Object> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteService(int pk) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countEmployee() {
		// TODO Auto-generated method stub
		return 0;
	}

}
