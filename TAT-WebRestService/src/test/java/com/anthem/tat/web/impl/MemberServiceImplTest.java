/**
 * 
 */
package com.anthem.tat.web.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.anthem.tat.web.service.MemberRepository;
import com.anthem.tat.web.service.MemberService;

/**
 * @author AF43847
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberServiceImplTest {

	/*
	 * @Autowired private TestEntityManager entityManager;
	 */
	@Autowired
	private MemberRepository memberRepository;
	@Autowired
	MemberService memberService;

	public Date formateDate(String dateString) {

		String pattern = "yyyy-MM-dd";
		Date formatedDate = null;
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		try {
			formatedDate = format.parse(dateString);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return formatedDate;
	}

	@Test
	public void testFindByName() {
		memberRepository.findAll();

		/*
		 * List<AuthorizationTATView> viewlist =
		 * memberService.findMemberBySearchCriteria(formateDate("2016-01-01"),
		 * formateDate("2016-01-10"), "Medicaid", "VA", "IP");
		 * 
		 * for (AuthorizationTATView v : viewlist) { System.out.println("---->"
		 * + v.getMemeCk()); }
		 */

	}

}
