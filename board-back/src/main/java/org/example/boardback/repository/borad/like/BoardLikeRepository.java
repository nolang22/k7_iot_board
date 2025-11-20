package org.example.boardback.repository.borad.like;

import org.example.boardback.entity.board.like.BoardLike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardLikeRepository extends JpaRepository<BoardLike, Long> {
}
