package arthur.service;

import org.apache.ibatis.annotations.Param;

public interface IntegralService {
	public Integer addIntegral(@Param("studentId") Integer studentId);

	public Integer updateIntegral(@Param("studentId") Integer studentId);
}
