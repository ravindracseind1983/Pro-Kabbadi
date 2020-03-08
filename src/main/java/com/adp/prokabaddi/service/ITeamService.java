package com.adp.prokabaddi.service;

import java.util.List;

import com.adp.prokabaddi.entity.inter.model.RequestModel;
import com.adp.prokabaddi.entity.inter.model.ResponseModel;
import com.adp.prokabaddi.entity.model.Team;

/**
 * Team crud-like-service specification.
 */
public interface ITeamService
{
   /**
    * persist team
    */
   public ResponseModel add(RequestModel model);  
   
   /**
    * persist team list
    */
   public List<Team> add(List<Team> model);

}
