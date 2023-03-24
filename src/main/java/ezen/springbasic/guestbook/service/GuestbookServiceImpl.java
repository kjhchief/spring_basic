package ezen.springbasic.guestbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import ezen.springbasic.guestbook.dao.GuestbookDao;
import ezen.springbasic.guestbook.dto.Guestbook;

//@Component
@Service
public class GuestbookServiceImpl implements GuestbookService {
	
	@Autowired
	private GuestbookDao guestbookDao;
	
	@Override
	public void registerGuestbook(Guestbook guestbook) {
		guestbookDao.create(guestbook);
	}

	@Override
	public List<Guestbook> findGuestbooks() {
		return guestbookDao.findAll();
	}

}
