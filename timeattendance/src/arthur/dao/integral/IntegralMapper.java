package arthur.dao.integral;

import org.apache.ibatis.annotations.Param;

public interface IntegralMapper {
	// 通过学生id添加积分
	public Integer addIntegral(@Param("studentId") Integer studentId);

	// 通过提问给回答者id积分奖励
	public Integer updateIntegral(@Param("studentId") Integer studentId);
}
