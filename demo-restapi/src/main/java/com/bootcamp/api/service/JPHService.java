package com.bootcamp.api.service;

import java.util.List;
import org.apache.catalina.User;

// https://jsonplaceholder.typicode.com/users

public interface JPHService {
  List<User> getJPHUsers();
}
