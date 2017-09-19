/**
 * 
 */
package com.anthem.tat.web.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anthem.tat.web.domain.Member;

/**
 * @author AF43847
 *
 */
public interface MemberRepository extends JpaRepository<Member, Integer> {

	/**
	 * @param fromDate
	 * @param toDate
	 * @return
	 */

}
