package com.karasani.spring_boot_ad_campaign;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired
	NamedParameterJdbcTemplate jdbcTemplate;
	
	
	@Autowired
	private UserService userService;

	@RequestMapping("/")
	String hello() {
		return "Hello World!";
	}
	
@RequestMapping("/users")	
public List<Users> getAllUserDetails(){
	return userService.getAllUsers();
}
@RequestMapping("/users/{userid}")
public Users getUser(@PathVariable String userid) {
return userService.getUser(userid);	
}


@RequestMapping(method=RequestMethod.POST,value="/users")
public void addUser(@RequestBody Users user) {
	userService.addUser(user);
	
}


//@Data
//	static class Result {
//		private final int left;
//		private final int right;
//		private final long answer;
//
//		public Result(int left, int right, long answer) {
//			this.left = left;
//			this.right = right;
//			this.answer = answer;
//		}
//
//		public int getLeft() {
//			return left;
//		}
//
//		public int getRight() {
//			return right;
//		}
//
//		public long getAnswer() {
//			return answer;
//		}
//
//	}

	// SQL sample
//	@RequestMapping("calc")
//	Result calc(@RequestParam int left, @RequestParam int right) {
//		MapSqlParameterSource source = new MapSqlParameterSource().addValue("left", left).addValue("right", right);
//		return jdbcTemplate.queryForObject("SELECT :left + :right AS answer", source,
//				(rs, rowNum) -> new Result(left, right, rs.getLong("answer")));
	}

