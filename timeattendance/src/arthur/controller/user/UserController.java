package arthur.controller.user;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import arthur.entity.Question;
import arthur.entity.Student;
import arthur.entity.Teacher;
import arthur.service.AnswerService;
import arthur.service.UserService;
import utils.PageSupport;

/***
 * 
 * @author 谭夏男
 *
 */

@Controller
@RequestMapping("/arthur/user")
public class UserController {
	@Resource
	UserService userService;
	@Resource
	AnswerService answerService;

	/**
	 * 
	 * 学生登录
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	/**
	 * 
	 * 学生登录
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@Param("studentName") String studentName, String newPwd, HttpSession session, Model model) {
		Student stu = userService.findByStuName(studentName);
		String s = "/login";
		if (null != stu) {
			if (!stu.getStudentPwd().equals(newPwd)) {
				s = "login";
				return s;
			} else {
				session.setAttribute("user", stu);
				s = "home";

				// 页面容量
				int pageSize = 5;
				// 当前页码
				String pageIndex = "0";
				// 定义当前页码
				Integer currentPageNo = 0;
				if (null != pageIndex) {
					try {
						currentPageNo = Integer.valueOf(pageIndex);// .valueOf()把字符串转换为数字
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				// 总数量(列表)
				int totalCount = 0;
				try {
					totalCount = answerService.count();
				} catch (Exception e) {
					e.printStackTrace();
				}
				// 总页数
				PageSupport pages = new PageSupport();
				pages.setCurrentPageNo(currentPageNo);
				pages.setPageSize(pageSize);
				pages.setTotalCount(totalCount);
				int totalPageCount = pages.getTotalPageCount();
				// 控制首页和尾页
				if (currentPageNo < 0) {
					currentPageNo = 0;
				} else if (currentPageNo > totalPageCount) {
					currentPageNo = totalPageCount;
				}
				List<Question> question = null;
				try {
					question = answerService.findAllQuestion(currentPageNo, pageSize);
				} catch (Exception e) {
					e.printStackTrace();
				}

				model.addAttribute("pages", pages);
				model.addAttribute("question", question);
				return s;
			}
		}
		return s;
	}

	// 老师登录
	@RequestMapping(value = "/teacherLogin", method = RequestMethod.GET)
	public String teacherLogin() {
		return "teacherLogin";
	}

	// 老师登录
	@RequestMapping(value = "/teacherLogin", method = RequestMethod.POST)
	public String teacherLogin(@Param("teacherName") String teacherName, String teacherPwd, HttpSession session,
			Model model) {
		Teacher teacher = userService.findByTeacherName(teacherName);
		String s = "";
		if (null != teacher) {
			if (!teacher.getTeacherPwd().equals(teacherPwd)) {
				s = "teacherLogin";
				return s;
			} else {
				s = "teacherattendance";
				List<Question> question = answerService.findAllQuestiontea();
				session.setAttribute("user", teacher);
				model.addAttribute("question", question);
				return s;
			}
		}
		return s;
	}

	// 老师给学生注册
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register() {
		return "register";
	}

	// 老师给学生注册
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(Student student, Model model) {
		String s = "";
		if (student != null) {
			Student stu = new Student();
			stu.setStudentName(student.getStudentName());
			stu.setStudentPwd(student.getStudentPwd());
			stu.setStudentNo(student.getStudentNo());
			stu.setStuClass(student.getStuClass());
			stu.setStudentSex(student.getStudentSex());
			userService.addStudent(stu);
			s = "teacherattendance";
			return s;
		}
		return s;
	}

	// 分页
	@RequestMapping(value = "/paging", method = RequestMethod.GET)
	public String paging() {
		return "paging";
	}

	// 分页
	@RequestMapping(value = "/paging", method = RequestMethod.POST)
	public String paging(int a) {
		return "student";
	}

	// 查看提问的列表
	@RequestMapping(value = "/answer", method = RequestMethod.GET)
	public String answer() {
		return "answer";
	}

	/**
	 * 修改学生密码
	 */
	@RequestMapping(value = "/studentUpdatePwd", method = RequestMethod.GET)
	public String studentUpdatePwd() {
		return "/studentUpdatePwd";
	}

	/**
	 * 修改学生密码
	 */
	@RequestMapping(value = "/studentUpdatePwd", method = RequestMethod.POST)
	public String updateStudentByStudentpwd(String studentPwd, @Param("stuPwd1") String stuPwd1, String stuPwd2,
			HttpSession session, Model model) {
		String s = "studentUpdatePwd";
		Student stu = (Student) session.getAttribute("user");
		if (stu.getStudentPwd().equals(studentPwd)) {
			if (stuPwd1.equals(stuPwd2)) {
				userService.updatePwd(stuPwd1, stu.getId());
				s = "login";
				return s;
			}
		}
		return s;
	}
}
