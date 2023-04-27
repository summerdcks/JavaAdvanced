package kr.ac.kopo.ctc.kopo36.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.ctc.kopo36.domain.WifiItem;

public class WifiItemDao {
	public WifiItem create(WifiItem wifiItem_k36) {
		return null;
	}
	
	public WifiItem selectOne(int id_k36) {
		return null;
	}
	
	public List<WifiItem> selectAll() throws IOException {	//객체배열 형식의 메소드 선언
		List<WifiItem> item_k36 = new ArrayList<>();			//객체배열 item선언
		File f_k36 = new File("C:\\Users\\DataSWB\\Desktop\\성남무료와이파이정보.txt");
		//해당 경로의 파일을 객체로 선언
		BufferedReader br_k36 = new BufferedReader(new FileReader(f_k36));
		//객체 br를 생성하며 f를 FileReader와 BufferedReader에 연결하며 선언		
		String readtxt_k36;	//문자열 변수 선언		
		if((readtxt_k36 = br_k36.readLine()) == null) {	//파일에 읽어낼 내용이 없으면
			System.out.printf("빈 파일입니다\n");	//해당문구 출력
		}
		while((readtxt_k36 = br_k36.readLine()) != null) {	//더이상 읽을 내용이 없을 때까지 한줄씩 읽어오기 반복
			String[] field_k36 = readtxt_k36.split("\t");	//읽어온 줄을 탭을 기준으로 나눠 담은 문자열형 배열 field 생성
			WifiItem a_k36 = new WifiItem();	//WifiItem형식의 객체 a 생성
			a_k36.setId_k36(Integer.parseInt(field_k36[0]));	
			//읽어온 줄의 0번째 문자열을 정수변환하여 a객체의 set메소드로 받아 해당 변수에 값을 대입해줌
			a_k36.setInstallationLocationDetails_k36(field_k36[2]);
			a_k36.setRoadNameAddress_k36(field_k36[9]);
			a_k36.setLotNumberAddress_k36(field_k36[10]);
			a_k36.setLatitude_k36(Double.parseDouble(field_k36[13]));
			a_k36.setLongitude_k36(Double.parseDouble(field_k36[14]));
			//읽어온 줄의 14번째 문자열을 실수변환하여 a객체의 set메소드로 받아 변수에 값을 대입해줌
			item_k36.add(a_k36); //값이 담아진 a객체를 item객체배열의 변수로 담아줌
		}
		return item_k36;	//파일내용이 item객체배열에 모두 담긴 값을 리턴해줌
	}
	
	public WifiItem update(WifiItem wifiItem_k36) {
		return null;
	}

	public WifiItem delete(int id_k36) {
		return null;
	}
}
