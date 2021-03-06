package org.apel.hermes.config.biz.dao;

import java.util.List;

import org.apel.gaia.persist.dao.CommonRepository;
import org.apel.hermes.config.biz.domain.Job;

public interface JobRepository extends CommonRepository<Job, String>{

	public List<Job> findByJobBizId(String jobBizId);
	

}
