package arthur.service;

import org.apache.ibatis.annotations.Param;

public interface FabulousService {
	public Integer addFabulousIdAndFabulousTime(@Param("studentId") Integer studentId);
}
