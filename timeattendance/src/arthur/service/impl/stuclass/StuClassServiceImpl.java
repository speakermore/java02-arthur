package arthur.service.impl.stuclass;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import arthur.dao.stuclass.StuClassMapper;
import arthur.service.StuClassService;
@Service
public class StuClassServiceImpl implements StuClassService {
	
	@Resource
	public StuClassMapper stuClassMapper;
	
	@Override
	public Integer addStuClass(Integer studentId) {
		return stuClassMapper.addStuClass(studentId);
	}

}
