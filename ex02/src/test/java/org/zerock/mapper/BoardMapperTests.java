package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	// 매퍼 객체 생성해서 
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
	@Test
	public void testGetList() {
		mapper.getList().forEach(board -> log.info(board));
	}
	
	@Test
	public void testInsert() {
		
		BoardVO board = new BoardVO();
		board.setTitle("새로 작성한 글");
		board.setContent("새로 작성한 내용");
		board.setWriter("newbie");
		
		mapper.insert(board);

		log.info(board);
	}
	
	@Test
	public void testInsertSelectKey() {
		
		BoardVO board = new BoardVO();
		board.setTitle("새로 작성한 글 select key");
		board.setContent("새로 작성한 글 내용 select key");
		board.setWriter("newbie");
		
		mapper.insertSelectKey(board);
		
		log.info(board);
	}
	
	@Test
	public void testRead() {
		
		// 존재하는 게시물 번호로 테스트
		BoardVO board = mapper.read(4L);
		
		log.info(board);
	}
	
	@Test
	public void testDelete() {
		
		log.info("삭제 카운트 = " + mapper.delete(6L));
	}
	
	@Test
	public void testUpdate() {
		
		BoardVO board = new BoardVO();
		board.setBno(4L);
		board.setTitle("수정된 제목");
		board.setContent("수정된 내용");
		board.setWriter("수정된 유저 이름");
		
		// update 성공하면 1 출력
		int count = mapper.update(board);
		log.info("update count : " + count);
	}
}
