package arthur.dao.integral;

import arthur.entity.Integral;

public interface IntegralMapper {
	// 通过学生id添加积分
	public Integer addIntegral(Integral integral);
}
