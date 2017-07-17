package arthur.dao.integral;

import arthur.entity.Integral;
import arthur.entity.Student;

public interface IntegralMapper {
	// 通过学生id添加积分
	public Integer addIntegral(Integral integral, Student studentId);

	// 通过提问给回答者积分奖励
	public Integer updateIntegral(Integral integral, Student studentId);
}
