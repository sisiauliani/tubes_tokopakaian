package id.sisi.pakaian.controller;

import id.sisi.pakaian.dao.CategoryDAO;
import id.sisi.pakaian.dao.CategoryDAOMySQL;
import id.sisi.pakaian.model.Category;
import java.util.List;


public class CategoryController {
    private CategoryDAO dao = new CategoryDAOMySQL();
    
    public List<Category> getAllData() {
        return dao.getAllCategory();
    }
}
