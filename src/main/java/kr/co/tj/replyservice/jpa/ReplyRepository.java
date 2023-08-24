package kr.co.tj.replyservice.jpa;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.tj.replyservice.dto.ReplyEntity;

public interface ReplyRepository extends JpaRepository<ReplyEntity, Long>{

	List<ReplyEntity> findByBid(Long bid);

	Page<ReplyEntity> findByBid(Long bid, Pageable pageable);




}
