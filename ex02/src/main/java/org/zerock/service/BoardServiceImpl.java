package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

// 구현체
// 여기는 서비스에서 메소드를 물려받아 오버라이딩 해서 사용하고 그 안에 mapper 객체를 불러와 비즈니스 로직 + sql 두가지를 같이 처리

@Log4j
@Service
@AllArgsConstructor // 모든 파라미터를 이용하는 생성자 만듬
public class BoardServiceImpl implements BoardService{ // BoardService 상속 받아 메소드 오버라이딩

//	@AllArgsConstructor 이녀석이 해주는 것들 생성자, 매개변수 타입 모두 받아주기등
	
//		BoardServiceImpl(){
//			
//		}
//		BoardServiceImpl(BoardMapper mapper){
//			
//		}
		
		//@Setter(onMethod_ = @Autowired) 객체 자동 생성, 생략 가능
		private BoardMapper mapper;
		
		@Override
		public void register(BoardVO board) {
			
			log.info("가입... " + board);
			
			// 생성된 게시물 번호 확인 메소드
			mapper.insertSelectKey(board); // mapper (sql 때려박은거) 가져와서 메소드 사용
		}

		@Override
		public List<BoardVO> getList(Criteria cri) {
			
			log.info("모든 리스트 가져오기 " + cri);
			
			return mapper.getListWithPaging(cri);
		}

		@Override
		public BoardVO get(Long bno) {
			
			log.info("get..." + bno);
			
			return mapper.read(bno);
		}

		@Override
		public boolean modify(BoardVO board) {
			
			log.info("수정..." + board);
			
			return mapper.update(board)  == 1;
		}

		@Override
		public boolean remove(Long bno) {

			log.info("remove..." + bno);
			
			return mapper.delete(bno) == 1;
		}

}
