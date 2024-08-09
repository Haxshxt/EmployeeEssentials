package com.service;
import java.util.List;
public interface Service {
	
	public String createService(Object obj);
	public List<Object> readService();
	public String updateService(int pk , List<Object> list);
	public String deleteService(int pk);
	

}
