package org.ncu.mfw.EcommmerceApp_Spring_jdbc.ServiceLayer;

import org.ncu.mfw.EcommmerceApp_Spring_jdbc.DaoLayer.UserDaoImpl;
import org.ncu.mfw.EcommmerceApp_Spring_jdbc.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
	UserDaoImpl udao;
	
	@Override
	public void Addrecord(User user){
	udao.Addrecord(user);	
	}

	@Override
	public void Deleterecord(User user) {
		
	}

	@Override
	public void Updaterecord() {
		
	}

	@Override
	public User Getrecord(String uname,String pass) {
		//System.out.println(udao.Getrecord(uname,pass));
		return udao.Getrecord(uname,pass);
		
	}

}
