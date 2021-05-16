package kodlama.io.javaCamp6.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.javaCamp6.business.abstracts.UserService;
import kodlama.io.javaCamp6.dataAccess.abstracts.UserDao;
import kodlama.io.javaCamp6.entities.concretes.User;
@Service
public class UserManager implements UserService{
	private UserDao userDao;
	@Autowired

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	@Override
	public List<User> getAll() {
		
		return userDao.findAll();
	}
}
