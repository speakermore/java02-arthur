package arthur.dao.reply;

import arthur.entity.Reply;

public interface ReplyMapper {
	// 根据回答者回答的问题显示他的姓名
	public Integer addReply(Reply reply);
}
