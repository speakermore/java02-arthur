package arthur.dao.question;

import java.sql.Timestamp;

import org.apache.ibatis.annotations.Param;

/**
 * 
 * @author 钱文飞
 *
 *         2017年7月24日
 */
public interface QuestionMapper {
	// 提问者:提问者给出提问的内容和时间
	public Integer addQuestionContentQuestionTime(@Param("questionContent") String questionContent,
			@Param("QuestionTime") Timestamp questionTime);

	// 提问者可以根据自己的id修改问题内容
	public Integer updateStudentIdQuestionContent(@Param("studentId") Integer studentId,
			@Param("questionContent") String questionContent);
}
