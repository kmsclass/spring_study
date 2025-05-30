package ex01_lombok;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

//@Setter
//@Getter
//@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ex01_User {
	private String id;
	private String pw;
}
