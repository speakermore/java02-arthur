package arthur.service.impl.fabulous;

import java.sql.Timestamp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import arthur.dao.fabulous.FabulousMapper;
import arthur.service.FabulousService;

/**
 * 
 * @auther 代益铨 2017年7月19日下午5:19:45
 */
@Service
public class FabulousServiceImpl implements FabulousService {
	@Resource
	public FabulousMapper fabulousMapper;

	@Override
	public Integer addFabulousIdAndFabulousTime(Integer studentId) {
		return fabulousMapper.addFabulousIdAndFabulousTime(studentId, new Timestamp(System.currentTimeMillis()));
	}

}
