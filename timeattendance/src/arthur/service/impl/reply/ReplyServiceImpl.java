package arthur.service.impl.reply;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import arthur.dao.reply.ReplyMapper;
import arthur.entity.Reply;
import arthur.entity.Student;
import arthur.service.ReplyService;

/**
 * 
 * @author 钱文飞
 *
 *         2017年7月19日
 */
@Service
public class ReplyServiceImpl implements ReplyService {

	@Resource
	public ReplyMapper replyMapper;

	@Override
	public Student selectReplyHelpName(Integer studentId) {
		return replyMapper.selectReplyHelpName(studentId);
	}

	@Override
	public List<Reply> addReply(Integer studentId) {
		return replyMapper.addReply(studentId);
	}

	@Override
	public Student selectReplyAnswerName(Integer studentId) {
		return replyMapper.selectReplyAnswerName(studentId);
	}

}
