package org.zerock.domain;

import java.util.Date;

import lombok.Data;

@Data // DTO or Entity
public class BoardVO {
	
	private Long bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private Date updateDate;
}
