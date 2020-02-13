package kimdeoksoo.board.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kimdeoksoo.board.board.dao.BoardDao;
import kimdeoksoo.board.board.domain.Board;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired private BoardDao boardDao;
	
	@Override
	public List<Board> getBoards() {
		return boardDao.getBoards();
	}

}
