package com.repository;
import java.util.List;
public interface CrudRepository {
	
	public String create(Object object);
	public List<Object> read();
	public String update(int pk , List<Object> list);
	public String delete(int pk);

}
