package com.bootcamp.api.service.impl;

import java.util.Arrays;
import java.util.List;
import org.apache.catalina.User;
import org.springframework.web.client.RestTemplate;
import com.bootcamp.api.service.JPHService;

public class JPHServiceHolder implements JPHService {
  @Override
  public List<User> getJPHUsers(){
    User[] users = new RestTemplate().getForObject("https://jsonplaceholder.typicode.com/users", User[].class);
  return Arrays.asList(users);
  }
}
