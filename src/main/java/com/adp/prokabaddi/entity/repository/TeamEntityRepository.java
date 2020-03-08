package com.adp.prokabaddi.entity.repository;

import org.springframework.data.repository.CrudRepository;
import com.adp.prokabaddi.entity.TeamEntity;


/**
 *  Team Repo - to persist Team
 */
public interface TeamEntityRepository extends CrudRepository<TeamEntity, Long>
{
  
}
