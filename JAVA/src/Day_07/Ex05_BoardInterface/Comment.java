package Day_07.Ex05_BoardInterface;

public class Comment extends Text {

	private int commentNo;
	private int boardNo;
	
	// 생성자
	public Comment() {
		this("글쓴이없음", "내용없음");
	}
	
	public Comment(String writer, String content) {
		super(writer, content);
	}
	
	// getter, setter
	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	

	public int getCommentNo() {
		return commentNo;
	}

	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
		setNo(commentNo);
	
	}
}
