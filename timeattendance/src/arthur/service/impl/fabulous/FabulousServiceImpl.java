package arthur.service.impl.fabulous;

import java.sql.Timestamp;

import arthur.dao.fabulous.FabulousMapper;
import arthur.service.FabulousService;

/**
 * 
 * @auther 代益铨 2017年7月19日下午5:19:45
 */

public class FabulousServiceImpl implements FabulousService {

	public FabulousMapper fabulousMapper;

	@Override
	public Integer addFabulousIdAndFabulousTime(Integer studentId) {
		return fabulousMapper.addFabulousIdAndFabulousTime(studentId, new Timestamp(System.currentTimeMillis()));
	}

}
