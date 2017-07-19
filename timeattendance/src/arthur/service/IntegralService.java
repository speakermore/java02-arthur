package arthur.service;

public interface IntegralService {
	// 通过学生id添加积分
	public Integer addIntegral(Integer studentId, Integer integralNum);

	// 通过提问给回答者id积分奖励
	public Integer updateIntegral(Integer studentId, Integer giftPoints);
}
