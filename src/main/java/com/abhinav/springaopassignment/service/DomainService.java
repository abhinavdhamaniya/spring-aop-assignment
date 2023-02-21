package com.abhinav.springaopassignment.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class DomainService 
{
  public Object getDomainObjectById(Long id)
  {
    try {
      Thread.sleep(new Random().nextInt(2000));
    } catch (InterruptedException e) {
      System.out.println("Exception Occurred");
    }
        return id;
    }
}