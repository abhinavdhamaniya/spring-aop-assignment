package com.abhinav.springaopassignment.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class AopSpringBootTest 
{
  @Autowired
  private DomainService service;
   
  @Test
  public void testGetDomainObjectById() 
  {
    service.getDomainObjectById(10L);
  }
}