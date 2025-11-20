package org.example.boardback.repository.borad;

import org.example.boardback.entity.board.BoardCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardCategoryRepository extends JpaRepository<BoardCategory, Long> {
}
