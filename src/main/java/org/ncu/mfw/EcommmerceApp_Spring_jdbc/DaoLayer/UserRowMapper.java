package org.ncu.mfw.EcommmerceApp_Spring_jdbc.DaoLayer;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.ncu.mfw.EcommmerceApp_Spring_jdbc.Entity.User;
import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User u = new User();
		u.setUsertype(rs.getString(1));
		return u;
	}

}
