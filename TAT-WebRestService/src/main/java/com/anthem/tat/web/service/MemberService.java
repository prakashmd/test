/**
 * 
 */
package com.anthem.tat.web.service;

import java.util.Date;
import java.util.List;

import com.anthem.tat.web.domain.AuthorizationTATView;
import com.anthem.tat.web.domain.Member;

/**
 * @author AF43847
 *
 */
/**
 * @author Member service
 *
 */
public interface MemberService {
	List<Member> findByMemberName(String name);

	List<AuthorizationTATView> findMemberBySearchCriteria(Date fromDate, Date toDate, String productLine, String plan,
			String authCategory);

	List<Member> findByMemberID(Long id);

	List<Member> findAllMembers();

	public List<Member> findAll();

	public void saveMember(Member member);

	public Member findOne(long id);

	public void delete(long id);

	/**
	 * @param fromDate
	 * @param toDate
	 * @return
	 */
	List<Member> findMemberByCriteria(Date fromDate, Date toDate);

	List<Member> findMemberByCriteria(Long id);

}
