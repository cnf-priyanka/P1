package com.priya.dao;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.priya.entity.ManpowerDetails;

public class ManpowerDAOImpl implements ManpowerDAO {
@Autowired
	private SessionFactory sessionFactory;
@Override
public void addManpowerDetails(ManpowerDetails manpower){
	System.out.println("In DAO");
	Session session=sessionFactory.getCurrentSession();
	System.out.println("2222");
	session.save(manpower);
	System.out.println("545454");
	
}
@SuppressWarnings("unchecked")
@Override
public List<ManpowerDetails> getAllManpower(){
	Session session=sessionFactory.openSession();
	List<ManpowerDetails> list= session.createQuery("from ManpowerDetails").list();
	session.clear();
	session.close();
	return list;
	
}
}
