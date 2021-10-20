package org.zerock.mapper;

import java.util.List;


import org.zerock.domain.BoardVO;

public interface BoardMapper {

	//@Select("select * from tbl_board where bno > 0") xml 에서 따로 쿼리 처리
	public List<BoardVO> getList();

	// insert 로직 작성 (insert만 처리되고 PK값을 알 필요 없는 경우 )
	public void insert (BoardVO board);
	
	// insert 로직 작성 (insert만 처리되고 PK값 알아야 하는 경우 )
	public void insertSelectKey(BoardVO board);
	
	// 조회 로직
	public BoardVO read(Long bno);
	
	// 삭제 로직
	public int delete(Long bno);
	
	// 업데이트 로직
	public int update(BoardVO board);
}
