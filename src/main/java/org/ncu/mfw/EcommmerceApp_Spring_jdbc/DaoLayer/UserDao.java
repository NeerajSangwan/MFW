package org.ncu.mfw.EcommmerceApp_Spring_jdbc.DaoLayer;

import org.ncu.mfw.EcommmerceApp_Spring_jdbc.Entity.User;

public interface UserDao {
public void Addrecord(User user);
public void Deleterecord();
public void Updaterecord();
public User Getrecord(String uname,String pass);
}
