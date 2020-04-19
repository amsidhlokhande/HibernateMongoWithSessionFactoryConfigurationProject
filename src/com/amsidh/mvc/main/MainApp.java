package com.amsidh.mvc.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.ogm.cfg.OgmConfiguration;
import org.hibernate.service.ServiceRegistry;

import com.amsidh.mvc.dom.Person;

public class MainApp {

	public static void main(String[] args) {
		
		OgmConfiguration configuration = new OgmConfiguration();
		configuration.configure("hibernate.ogm.cfg.xml");
		configuration.addAnnotatedClass(Person.class);
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
		        .applySettings(configuration.getProperties()).build();
		System.out.println("Loaded Hibernate Configuration");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		System.out.println("SessionFactory created");
		
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		for(int i=0;i<10;i++){
			Person p=new Person(1+i,"Amsidh Lokhande","Pune"+i);
			session.save(p);
		}
		
		session.getTransaction().commit();
		session.close();
		
		System.out.println("Person Saved successfully");
	}
}
