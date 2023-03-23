package ezen.springbasic;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ezen.springbasic.guestbook.dto.Guestbook;
import ezen.springbasic.guestbook.service.GuestbookService;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class GuestbookServiceTest {
	
	@Autowired
	GuestbookService guestbookService;
		
	@Test
//	@Disabled
	@Order(1)
	public void registerTest() {
		Guestbook guestbook = new Guestbook();
		guestbook.setWriter("방그리");
		guestbook.setMessage("잘 보고 갑니다....");
		guestbookService.registerGuestbook(guestbook);
		System.out.println("방명록 등록 완료!");
	}
	
	@Test
//	@Disabled
	@Order(2)
	public void listTest() {
		List<Guestbook> list = guestbookService.findGuestbooks();
		System.out.println("방명록 리스트 : " + list);
	}
	
}






