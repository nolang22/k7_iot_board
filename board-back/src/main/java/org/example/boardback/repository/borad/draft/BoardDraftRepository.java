package org.example.boardback.repository.borad.draft;

import org.example.boardback.entity.board.draft.BoardDraft;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardDraftRepository extends JpaRepository<BoardDraft, Long> {
}
