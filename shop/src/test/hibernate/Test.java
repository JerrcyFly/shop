package test.hibernate;

import com.jcom.shop.model.Category;



public class Test {

	@org.junit.Test
	public void hibernate(){
		CategoryService categoryService = new CategoryServiceImpl();
		Category category = new Category("男士休闲", true);
		categoryService.save(category);
	}
}
