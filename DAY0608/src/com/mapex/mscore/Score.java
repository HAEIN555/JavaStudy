package com.mapex.mscore;
import java.io.*;
public interface Score {

	// 메소드 정의  -> 단독으로 사용할 수 없다 구현체가 있어야 한다! 
	// 추가 수정 검색 삭제 전체출력(학번순) 전체출력(정렬)
	
	public int insert()throws IOException;
	public int update()throws IOException;
	public void search()throws IOException;
	public int delete()throws IOException;
	public void writeAll();
	public void writeSort();
}
