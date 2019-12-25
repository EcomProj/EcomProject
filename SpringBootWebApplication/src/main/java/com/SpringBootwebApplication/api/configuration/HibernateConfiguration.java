package com.SpringBootwebApplication.api.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
@PropertySource(value = { "classpath:application.properties" })
public class HibernateConfiguration {

	// ---------DataBase Properties-----------//
	@Value("${db.driver}")
	private String driverClass;
	@Value("${db.url}")
	private String url;
	@Value("${db.username}")
	private String username;
	@Value("${db.password}")
	private String password;
	@Value("${hibernate.dialect}")
	private String dialect;
	@Value("${hibernate.show_sql}")
	private String show_sql;
	@Value("${hibernate.hbm2ddl.auto}")
	private String hbm2ddl;

	// --------------Create The DataSource Object----------------//
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource(url, username, password);
		ds.setDriverClassName(driverClass);
		return ds;
	}
	
	//-------------Hibernate Properties----------------//
	private Properties getHibernateProperties(){
		Properties prop=new Properties ();
		prop.putIfAbsent("hibernate.dialect",dialect);
		prop.putIfAbsent("hibernate.show_sql", show_sql);
		prop.putIfAbsent("hibernate.hbm2ddl.auto", hbm2ddl);
		return prop;
	}
	//--------------------------Session Factory
	@Bean
	public LocalSessionFactoryBean sessionFactory(){
		LocalSessionFactoryBean sf=new LocalSessionFactoryBean();
		sf.setDataSource(getDataSource());
		sf.setHibernateProperties(getHibernateProperties());
		sf.setPackagesToScan(new String[]{"com.example.SpringBootIntegrationWithHibernate.api.model"});
		return  sf;
	}
	
	@Bean
	@Autowired
	public HibernateTransactionManager trasactionManager(SessionFactory factory){
		HibernateTransactionManager htm=new HibernateTransactionManager();
		htm.setSessionFactory(factory);
		return htm;
	}

}
