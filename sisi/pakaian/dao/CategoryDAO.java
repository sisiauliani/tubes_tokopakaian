package id.sisi.pakaian.dao;

import id.sisi.pakaian.model.Category;
import java.util.List;


public interface CategoryDAO {
    
    public boolean insert(Category c);
    
    public boolean update(Category c);
    
    public boolean delete(Category c);
    
    public List<Category> getAllCategory();
    
    public Category getByID(String id);
    
    public List<Category> getByName(String name);
}
