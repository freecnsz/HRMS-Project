package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.hrms.business.abstracts.JobTypeService;
import kodlamaio.hrms.dataAccess.abstracts.JobTypeDao;
import kodlamaio.hrms.entities.concretes.JobType;

public class JobTypeManager implements JobTypeService {
	
	private JobTypeDao jobTypeDao;

	@Autowired
	public JobTypeManager(JobTypeDao jobTypeDao) {
		super();
		this.jobTypeDao = jobTypeDao;
	}

	@Override
	public List<JobType> getAll() {
		return this.jobTypeDao.findAll();
	}

}
