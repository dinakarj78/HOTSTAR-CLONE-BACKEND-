package backend.configuration;

import java.util.Properties;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class JpaConfig {

	@Bean
	public LocalContainerEntityManagerFactoryBean entityFactory() {
		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		emf.setDataSource(dataSource());
		
		JpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		emf.setJpaVendorAdapter(adapter);

		
		System.out.println("HIHIHHIHIH");
		emf.setJpaProperties(properties());
		emf.setPackagesToScan("Entities");
		return emf;
	}

	@Bean
	public PlatformTransactionManager txmgr(EntityManagerFactory emf) {
		JpaTransactionManager txm = new JpaTransactionManager(emf);
		return txm;
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://127.0.0.1:3306/hotstardb?useSSL=false");
		System.out.println("HIIII");
		ds.setUsername("root");
		ds.setPassword("dillu7777");
		return ds;
	}

	@Bean
	public PlatformTransactionManager txm(EntityManagerFactory emf) {
		JpaTransactionManager txm = new JpaTransactionManager(emf);

		return txm;

	}

	private Properties properties() {
		Properties props = new Properties();
		props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		props.setProperty("hibernate.hbm2ddl.auto", "create");
		props.setProperty("hibernate.show_sql", "true");
		props.setProperty("hibernate.format_sql", "true");
		return props;
	}
}
