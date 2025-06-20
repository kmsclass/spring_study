package ex01_lombok;

import lombok.ToString;
import lombok.Builder;
import lombok.Getter;
@ToString
@Builder
@Getter
public class Ex03_User {
	private String id;
	private String pw;
}
