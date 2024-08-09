package com.repository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRespositoryImpl implements EmployeeRepository {

	List<Object> list = new ArrayList<>();
	@Override
	public String create(Object object) {
		String status;
		if(object!=null) {
			boolean b = list.add(object);
			if(b) {
				status= "created";
			}else {
				status="not created";
			}
		}else {
			status="null";
		}
		
		return status;
	}

	@Override
	public List<Object> read() {
		
		return list;
	}

	@Override
	public String update(int pk, List<Object> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(int pk) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countEmployee() {
		int size = list.size();
		return size;
	}

}
