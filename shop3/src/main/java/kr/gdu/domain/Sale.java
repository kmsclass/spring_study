package kr.gdu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name="sale")
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Sale {	//db의 sale 테이블의 내용 + 사용자정보 + 주문상품정보
	@Id
	private int saleid;  //주문번호
	private String userid;  //주문 고객의 아이디
	private Date saledate;  //주문 일자
	private User user;  //고객정보
	private List<SaleItem> itemList = new ArrayList<>(); //주문상품 목록
	public int getTotal() {
		return itemList.stream()
			 .mapToInt(s->s.getItem().getPrice() * s.getQuantity()).sum(); 
	}
}
