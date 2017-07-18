package arthur.service.impl.integral;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import arthur.dao.integral.IntegralMapper;
import arthur.service.IntegralService;

@Service
public class IntegralServiceImpl implements IntegralService {
	@Resource
	public IntegralMapper integralMapper;

	@Override
	public Integer addIntegral(Integer studentId) {
		return integralMapper.addIntegral(studentId);
	}

	@Override
	public Integer updateIntegral(Integer studentId) {
		return integralMapper.updateIntegral(studentId);
	}

}
