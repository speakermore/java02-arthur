package arthur.dao.integral;

import org.apache.ibatis.annotations.Param;

import arthur.entity.Integral;
import arthur.entity.Student;

public interface IntegralMapper {
	// 通过学生id添加积分
	public Integer addIntegral(@Param("integral") Integral integral, @Param("studentId") Student studentId);

	// 通过提问给回答者积分奖励
	public Integer updateIntegral(@Param("integral") Integral integral, @Param("studentId") Student studentId);
}
