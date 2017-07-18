package arthur.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import arthur.entity.Reply;
import arthur.entity.Student;

public interface ReplyService {
	// 根据提问者Id显示他的姓名
	public Student selectReplyHelpName(@Param("studentId") String studentId);

	// 添加提问的问题
	public List<Reply> addReply(@Param("studentId") Integer studentId);

	// 根据回答问题显示回答问题的姓名
	public Student selectReplyAnswerName(@Param("answer") String studentId);
}
