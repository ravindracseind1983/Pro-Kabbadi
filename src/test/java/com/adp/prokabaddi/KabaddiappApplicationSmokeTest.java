package com.adp.prokabaddi;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.adp.prokabaddi.controller.TeamController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KabaddiappApplicationSmokeTest
{
  
  @Autowired
  private TeamController controller;
  
  @Test
  public void contexLoads ( ) throws Exception
  {
    assertThat(controller).isNotNull();
  }
}