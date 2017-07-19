package arthur.dao.integral;

import org.apache.ibatis.annotations.Param;

public interface IntegralMapper {
	// 通过学生id添加积分
	public Integer addIntegral(@Param("studentId") Integer studentId, @Param("integralNum") Integer integralNum);

	// 通过回答者id给积分奖励
	public Integer updateIntegral(@Param("studentId") Integer studentId, @Param("giftPoints") Integer giftPoints);
}
