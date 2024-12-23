package org.ncu.mfw.EcommmerceApp_Spring_jdbc.DaoLayer;

import org.ncu.mfw.EcommmerceApp_Spring_jdbc.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
	JdbcTemplate jdbctemp;

	@Override
	public void Addrecord(User user) {
		String query = "insert into user values (?,?,?,?,?,?)";
		Object[] arr = {user.getFirstname(),user.getLastname(),user.getUsername(),user.getPassword(),user.getEmailid(),user.getUsertype()};
		jdbctemp.update(query,arr);
	}

	@Override
	public void Deleterecord() {
				
	}

	@Override
	public void Updaterecord() {
		
	}

	@Override
	public User Getrecord(String uname, String pass) {
		//String type;
		String query ="select usert from user where uname = ? and pass = ?";
		/* Object[] arr = {user.getUsername(),user.getPassword()}; */
		Object[] arr = {uname, pass};
		return  jdbctemp.queryForObject(query, new UserRowMapper(), arr);
		
	}
    
}
