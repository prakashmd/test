/**
 * 
 */
package com.anthem.tat.web.service;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.anthem.tat.web.domain.Member;

/**
 * @author AF43847
 *
 */
public interface MemberQueryRepository extends Repository<Member, Long> {

	// @Query(value = "select * from #{#entityName} b where b.name=?1",
	// nativeQuery = true)
	List<Member> findByMembername(String name);

	// @Query(value = "select name,author,price from Book b where b.name like
	// %:name%")
	// List<Member> findByNameMatch(@Param("memberName") String name);

	/*
	 * @Query(value = "select name,author,price from Book b where b.name = :name
	 * AND b.author=: author AND b.price=:price")
	 * 
	 * List<Member> findByNamedParam(@Param("memberName") String
	 * name, @Param("plan") String author,
	 * 
	 * @Param("price") long price);
	 */

	@Query(value = "select memberid,membername,plans,fromdate,todate from Member m where m.memberid =:id AND m.fromdate=:fromDate AND m.todate=:toDate")
	List<Member> findMemberBySearchCriteria(@Param("id") int id, @Param("fromDate") Date fromDate,
			@Param("toDate") Date toDate);

	/**
	 * @param fromDate
	 * @param toDate
	 * @param productLine
	 * @param plan
	 * @param authCategory
	 * @return
	 */
	// List<Member> findMemberBySearchCriteria(Date fromDate, Date toDate,
	// String productLine, String plan,
	// String authCategory);

	/*
	 * SELECT TOP 100 umsv.UMUM_REF_ID, umsv.UMSV_SEQ_NO, umsv.MEME_CK,
	 * umsv.SEGR_ID, CASE WHEN umsv.SEGR_ID = 'INFA' THEN 'IP' ELSE 'OP' END AS
	 * AuthCategory, umsv.UMSV_RECD_DT, tat.ORD_DT, umsv.UMSV_TO_DT,
	 *
	 * FROM ODW.FAC.CMC_UMSV_SERVICES umsv JOIN ODW.AGP.MER_CMS_TAT tat ON
	 * tat.UMUM_REF_ID = umsv.UMUM_REF_ID AND tat.UMSV_SEQ_NO = umsv.UMSV_SEQ_NO
	 */

}
