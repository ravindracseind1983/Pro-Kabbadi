package com.adp.prokabaddi.entity.repository;

import org.springframework.data.repository.CrudRepository;

import com.adp.prokabaddi.entity.MatchEntity;

/**
 * Match Repo to persist match - details 
 */
public interface MatchEntityRepository extends CrudRepository<MatchEntity, Long>
{
  
}
