package com.anthem.tat.web.impl;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anthem.tat.web.domain.AuthorizationTATView;
import com.anthem.tat.web.domain.Member;
import com.anthem.tat.web.service.MemberQueryRepository;
import com.anthem.tat.web.service.MemberRepository;
import com.anthem.tat.web.service.MemberService;

@Service("memberService")
@Transactional
public class MemberServiceImpl implements MemberService {

	private static List<Member> members;
	@Autowired
	private MemberRepository memberRepository;
	@Autowired
	private MemberQueryRepository memberQueryRepository;
	private String MEDICARE = "medicare";
	private String MMP = "mmp";
	private String MEDICAID = "medicaid";

	@PersistenceContext
	private EntityManager em;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.anthem.tat.web.service.MemberService#findByName(java.lang.String)
	 */
	@Override
	public List<Member> findByMemberName(String name) {
		return (List<Member>) memberRepository.findAll();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anthem.tat.web.service.MemberService#findAllMembers()
	 */
	@Override
	public List<Member> findAllMembers() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anthem.tat.web.service.MemberService#findAll()
	 */
	@Override
	public List<Member> findAll() {
		return memberRepository.findAll();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.anthem.tat.web.service.MemberService#saveMember(com.anthem.tat.web.
	 * domain.Member)
	 */
	@Override
	public void saveMember(Member member) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anthem.tat.web.service.MemberService#findOne(long)
	 */
	@Override
	public Member findOne(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anthem.tat.web.service.MemberService#delete(long)
	 */
	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anthem.tat.web.service.MemberService#findMemberBySearch(int,
	 * org.joda.time.LocalDate, org.joda.time.LocalDate)
	 */
	@Override
	public List<AuthorizationTATView> findMemberBySearchCriteria(Date fromDate, Date toDate, String productLine,
			String plan, String authCategory) {
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();

		CriteriaQuery<AuthorizationTATView> criteriaQuery = criteriaBuilder.createQuery(AuthorizationTATView.class);
		Root<AuthorizationTATView> authRoot = criteriaQuery.from(AuthorizationTATView.class);
		Predicate p = null;
		Predicate p3 = null;

		criteriaQuery.select(authRoot);

		/*
		 * criteriaQuery.where(criteriaBuilder.equal(authRoot.get("memberplan"),
		 * "VA"));
		 */
		Predicate p1 = criteriaBuilder.equal(authRoot.get("memberplan"), plan);
		Predicate p2 = criteriaBuilder.equal(authRoot.get("authcategory"), authCategory);

		criteriaQuery.orderBy(criteriaBuilder.asc(authRoot.get("umumRefId")));

		if (productLine.equalsIgnoreCase(MEDICARE) || productLine.equalsIgnoreCase(MMP)) {
			// Do a different fetch

			Path<Date> umvtstsdtm = authRoot.get("umvtstsdtm");

			p = criteriaBuilder.greaterThanOrEqualTo(umvtstsdtm, fromDate); // use
			// different
			// date
			// for
			// searching
			p3 = criteriaBuilder.lessThanOrEqualTo(umvtstsdtm, toDate);

		} else if (productLine.equalsIgnoreCase(MEDICAID)) {

			Path<Date> umsvrecddt = authRoot.get("umsvrecddt");

			p = criteriaBuilder.greaterThanOrEqualTo(umsvrecddt, fromDate);

			p3 = criteriaBuilder.lessThanOrEqualTo(umsvrecddt, toDate);
			// between(umsvrecddt, fromDate, toDate);

		}

		p = criteriaBuilder.and(p1, p2, p, p3);

		criteriaQuery.where(p);

		List<AuthorizationTATView> memberList = em.createQuery(criteriaQuery).getResultList();

		for (AuthorizationTATView view : memberList) {
			System.out.println(view.getMemeCk() + "---" + view.getReceveivedDate() + "---" + view.toString()
					+ "Status-->" + view.getAuthorizationUmvtStatus().toString());
		}

		return memberList;

	}

	@Transactional
	public List<Member> findMemberByCriteria(Date date1, Date date2) {

		TypedQuery<Member> query = em.createQuery(
				"select m from Member m where m.fromdate>= :fromdate  AND m.todate<= :todate", Member.class);
		query.setParameter("fromdate", date1, TemporalType.DATE);
		query.setParameter("todate", date2, TemporalType.DATE);
		List<Member> layoutsSelected = query.getResultList();

		return layoutsSelected;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.anthem.tat.web.service.MemberService#findByMemberID(java.lang.Long)
	 */
	@Override
	public List<Member> findByMemberID(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.anthem.tat.web.service.MemberService#findMemberByCriteria(java.lang.
	 * Long)
	 */
	@Override
	public List<Member> findMemberByCriteria(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
