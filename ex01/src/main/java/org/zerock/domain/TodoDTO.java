package org.zerock.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class TodoDTO {

	private String title;
	
	@DateTimeFormat(pattern = "yyyy/MM/dd") // 날짜 포멧 변환
	private Date dueDate;
	
}
