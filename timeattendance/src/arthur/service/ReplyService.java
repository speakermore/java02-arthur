package arthur.service;

import java.util.List;

import arthur.entity.Reply;
import arthur.entity.Student;

/**
 * 
 * @author 钱文飞
 *
 *         2017年7月19日
 */
public interface ReplyService {
	// 根据提问者Id显示他的姓名
	public Student selectReplyHelpName(Integer studentId);

	// 添加提问的问题
	public List<Reply> addReply(Integer studentId);

	// 根据回答问题显示回答问题者的姓名
	public Student selectReplyAnswerName(Integer studentId);
}
