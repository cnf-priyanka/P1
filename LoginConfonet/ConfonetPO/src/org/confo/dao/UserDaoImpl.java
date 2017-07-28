package org.confo.dao;

public class UserDaoImpl {

	@Autowired
	DataSource datasource;
	
	@AutoWired
	JdbcTemplate jdbcTemplate;
	
	public void register(User user){
		
		String sql="insert into users values(?,?,?,?,?,?)"
	}
}
