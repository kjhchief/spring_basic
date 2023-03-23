package ezen.springbasic.guestbook.dao;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import ezen.springbasic.guestbook.dto.Guestbook;


@Component
//@Repository
public class MemoryGuestbookRepository implements GuestbookDao {
	
	private Map<Integer, Guestbook> repository = new HashMap<Integer, Guestbook>();
	
	private static Integer sequence = 0; 
	
	@Override
	public void create(Guestbook guestbook) {
		repository.put(++sequence, guestbook);
		System.out.println("신규 방명록 등록 : " + guestbook);
	}
	
	@PostConstruct
	public void init() {
		repository.put(++sequence, new Guestbook());
		repository.put(++sequence, new Guestbook());
		repository.put(++sequence, new Guestbook());
	}

	@Override
	public List<Guestbook> findAll() {
		return new ArrayList<Guestbook>(repository.values());
	}
}





