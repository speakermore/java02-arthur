package arthur.dao.question;

import arthur.entity.Question;

/**
 * 
 * @author 钱文飞
 *
 *         2017年7月24日
 */
public interface QuestionMapper {
	// 提问者:提问者给出提问的内容和时间
	Integer addQuestion(Question qu);

}
