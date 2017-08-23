package arthur.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import arthur.dao.StuClassMapper;
import arthur.entity.StuClass;
import arthur.service.StuClassService;

@Service
public class StuClassServiceImpl implements StuClassService {
	@Resource
	private StuClassMapper stuClassMapper;

	@Override
	public List<StuClass> fingAll() {
		return stuClassMapper.fingAll();
	}

}
