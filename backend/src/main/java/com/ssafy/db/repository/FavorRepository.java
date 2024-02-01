package com.ssafy.db.repository;

import com.ssafy.db.entity.Favor;
import com.ssafy.db.entity.Galaxy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 유저성향 모델 관련 디비 쿼리 생성을 위한 JPA Query Method 인터페이스 정의.
 */
@Repository
public interface FavorRepository extends JpaRepository<Favor, Long> {

}
