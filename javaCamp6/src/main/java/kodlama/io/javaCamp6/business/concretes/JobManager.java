package kodlama.io.javaCamp6.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import kodlama.io.javaCamp6.business.abstracts.JobService;
import kodlama.io.javaCamp6.dataAccess.abstracts.JobDao;
import kodlama.io.javaCamp6.entities.concretes.Job;
@Service
public class JobManager implements JobService {

	//injection
	private JobDao jobDao;
	
	
	@Autowired //bizim yerimize new liyor. Çok önemli
	public JobManager(JobDao jobDao) { //constructor
		super();
		this.jobDao = jobDao;
	}



	@Override
	public List<Job> getAll() {
		//Dao çağır findAll() //jparepostiory'de gelir.
		
		return jobDao.findAll();
	}

	
}
