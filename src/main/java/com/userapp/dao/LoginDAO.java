package com.userapp.dao;

import com.userapp.model.*;

public interface LoginDAO{    
       public boolean checkLogin(String userName, String userPassword);
}