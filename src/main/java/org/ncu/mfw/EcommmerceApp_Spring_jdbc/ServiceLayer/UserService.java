package org.ncu.mfw.EcommmerceApp_Spring_jdbc.ServiceLayer;

import org.ncu.mfw.EcommmerceApp_Spring_jdbc.Entity.User;

public interface UserService {
public void Addrecord(User user);
public void Deleterecord(User user);
public void Updaterecord();

public User Getrecord(String uname,String pass);
}
