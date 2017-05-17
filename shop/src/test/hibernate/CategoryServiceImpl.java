package test.hibernate;

import org.hibernate.Session;

import com.jcom.shop.model.Category;
import com.jcon.shop.utils.HibernateSessionFactory;

public class CategoryServiceImpl implements CategoryService{

	@Override
	public void save(Category category) {
		//生成的sessionFactory获取session
		Session session = HibernateSessionFactory.getSession();
		
		try {
			//手动事务
			session.getTransaction().begin();
			//执行业务逻辑
			session.save(category);
			//手动提交
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}

}
