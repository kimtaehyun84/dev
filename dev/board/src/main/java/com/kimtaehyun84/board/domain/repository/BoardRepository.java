package com.kimtaehyun84.board.domain.repository;

import com.kimtaehyun84.board.domain.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
}
