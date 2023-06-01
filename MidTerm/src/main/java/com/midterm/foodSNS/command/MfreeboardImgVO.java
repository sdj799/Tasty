package com.midterm.foodSNS.command;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
freeboard_img_number INT PRIMARY KEY AUTO_INCREMENT,
    freeboard_article_number int,
    foreign key (freeboard_article_number) references FreeboardArticle(freeboard_article_number) on delete cascade,
    upload_path varchar(100) ,
    file_loca varchar(100) ,
    file_name varchar(50) ,
    file_real_name varchar(50) ,  
    reg_date datetime default current_timestamp
);
 * */


@Getter
@Setter
@ToString
public class MfreeboardImgVO {
	
	private int freeboardImgNumber;
	private int freeboardArticleNumber;
	private String uploadPath;
	private String fileLoca;
	private String fileName;
	private String fileRealName;
	private LocalDateTime regDate;
}
