package PPT6;
import java.time.LocalDateTime;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

//변수와 메서드 ppt6 p6

public class PracticeP6 {	//클래스 선언
	
	public static void main(String[] args) {	//메인함수 선언
			
		int itemCount_k36 = itemname_k36.length;	//정수형 변수를 선언하며 항목의 갯수를 값으로 부여해준다
		TitlePrint_k36();		//영수증이 시작되는 타이틀을 출력해주는 함수
		TimeStamp_k36();		//출력시간을 불러와 출력해주는 함수
		HeaderPrint_k36();		//상품명, 단가, 수량, 금액을 출력해주는 함수
		
		for(int i_k36 = 0; i_k36 < itemCount_k36; i_k36++) {	//품목의 갯수만큼 for문을 돈다
			itemPrint_k36(i_k36);	//처음부터 마지막 품목까지 차례대로 정보를 출력해주는 함수
		}
		
		TotalPrint_k36();		//합계, 세액 등을 출력해주는 함수
	}
	
	public static String [] itemname_k36 = {"감","우유","청포도","초코파이","새송이버섯",
			"제로콜라 6묶음","산지직송 Grapefruit", "코카콜라제로 1.5LX2", "킷캣 2F 미니 오리지널 9g x 45개입 (405g)","(A)파머스픽 흙대파(봉)",
			"노브랜드 굿모닝 굿밀크 1L","순창 양념듬뿍쌈장 500g","노브랜드 국산콩두부300g*2입","[직배송]이맛쌀 10kg_상등급","집들이 선물세트(소르베머그&원형접시)",
			"랜더스데이청소기 특가전(로봇/스틱/스팀청소기 등)","한국금거래소골드바 3.75g","[최초판매가 50,000원] 브랜바인 미국 특허 간 기능 개선 영양제 100캡슐",
			"[5/11순차출고]스위치 젤다의 전설 티어스 오브 더 킹덤",	"[뉴발란스] 2002 남여공용 운동화 ML2002RC","종가 행복이온 포기김치 10kg",
			"[해남미소]땅끝농협 2022년 햇 깐마늘 10kg",	"농심백산수 1L 36병","진주햄 천하장사 오리지날 690g","스테비아 대추 방울토마토 2kg (500g x 4팩)",
			"부토버스터 화이트보머","[CJ직배송]카놀라유 900ML x 4",	"[CJ직배송]비비고미역국 500g x 10","드리미 L10s Ultra 올인원 로봇청소기 + 악세사리 키트 증정",
			"LG울트라HD TV 벽걸이형 86UQ8300ENA (217cm)","다이슨(dyson) ★5%다운쿠폰★다이슨 Gen5 디텍트™ 컴플리트(퍼플/퍼플)+ 디테일클리닝키트 추가증정",
			"다이슨 에어랩™ 멀티 스타일러 컴플리트 롱(니켈/코퍼)"};
	//폼목의 이름을 문자열형 배열의 변수값에 할당한다
	 
	public static int [] price_k36 = {100,2000,6980,4500,8480,1500,7890,12000,1980,3180,1790,4880,3280,29900,81000,349000,449600,38900,74800,209000,
			48900,112200,22300,21800,30900,41940,32000,54800,1399000,2863700,2086200,1550000};
	//품목의 가격을 정수형 배열의 변수값에 할당한다
	
	public static int [] num_k36 = {1,2,3,4,5,6,7,8,9,10,20,30,40,50,60,70,80,90,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
	//품목의 수량을 정수형 배열의 변수값에 할당한다 
	
	public static boolean [] taxfree_k36 = {true,false,true,false,true,true,false,false,false,true,false,false,false,true,false,false,
			false,false,false,false,false,false,	false,false,true,false,true,true,false,false,false,false};
	//품목의 면세가격유무를 boolean배열의 변수값에 할당한다 true면 면세, false면 과세		
	
	public static void TitlePrint_k36() {
		//출력시작
		System.out.printf("%34s\n", "이마트 죽전점 (031)888-1234");
		//해당점포표시와 전화번호를 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다		
		System.out.printf("%9s%20s\n","emart", "206-85-50913 강희석");
		//이마트표시와 사업자정보를 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("%28s\n", "용인 수지구 포은대로 552");
		//해당점포의 주소를 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("영수증 미지참시 교환/환불 불가\n");
		//해당 문구를 출력 후 줄바꿈 해준다
		System.out.printf("정상상품에 한함, 30일 이내(신선 7일)\n");
		//해당 문구를 출력 후 줄바꿈 해준다
		System.out.printf("※일부 브랜드매장 제외(매장 고지물참조)\n");
		//해당 문구를 출력 후 줄바꿈 해준다
		System.out.printf("교환/환불 구매점에서 가능(결제카드 지참)\n");
		//해당 문구를 출력 후 줄바꿈 해준다
		System.out.printf("\n");
		//줄바꿈
	}
	
	public static void TimeStamp_k36() {
		LocalDateTime currentDateTime_k36 = LocalDateTime.now();
		//LocalDateTime 함수를 이용하여 현재시간을 불러온다		
		DateTimeFormatter formatter1_k36 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		//DateTimeFormatter함수를 이용하여 원하는 변수값을 받아 형태를 부여한다		
		String formattedDateTime1_k36 = currentDateTime_k36.format(formatter1_k36);
		//불러온 현재시간을 원하는 형태에 맞게 출력할 수 있도록 String변수로 받는다
		System.out.printf("[구 매]" + formattedDateTime1_k36 + "%18s\n", "POS:0011-9861");
		//POS표시와 원하는 형태의 시간표시를 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
	}
	
	public static void HeaderPrint_k36() {
		System.out.printf("-----------------------------------------\n");
		//표시선을 출력 후 줄바꿈 해준다
		System.out.printf("%11s%12s%3s%5s\n", "상 품 명", "단 가", "수량", "금 액");
		//상품명, 단가, 수량, 금액을 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
	}
	
	public static void itemPrint_k36(int i_k36) {
		DecimalFormat df_k36 = new DecimalFormat("###,###,###,###,###");
		//뒤에서 세자리마다 콤마를 찍어주는 DecimalFormat함수를 불러온다
		
		if(i_k36 % 5 == 0) {
			System.out.printf("-----------------------------------------\n");
		}
		//품목항목이 5개가 출력될 때마다 구분선을 출력해준다
				
		if(taxfree_k36[i_k36] == true) {
			System.out.printf("* ");
		} else {
			System.out.printf("  ");
		}
		//면세유무배열의 i번째 변수가 true라면 별을 찍어주고 false라면 띄어쓰기만 해준다
				
		byte [] ibytes_k36 = itemname_k36[i_k36].getBytes();
		//품목명함수의 i번째변수를 바이트단위로 쪼개어 ibytes배열에 담아준다		
		
		//ibytes배열의 갯수는 각 품목명의 바이트수가 된다
		if(ibytes_k36.length == 14) {
		//품목명의 i번째 배열의 바이트수가 14일 때
			String ii_k36 = itemname_k36[i_k36];
			//해당 품목명을 그대로 문자열 변수로 받는다			
			System.out.printf("%7s%11s%3s%11s\n", ii_k36, df_k36.format(price_k36[i_k36]), num_k36[i_k36], df_k36.format(price_k36[i_k36]*num_k36[i_k36]));	
			//각 배열의 i번째 변수를 불러와 해당 품목명, df함수를 이용해 콤마처리된 가격, 수량, df함수처리된 총액을 출력한다			
		} else if(ibytes_k36.length > 14) {
			//품목명의 i번째 배열의 바이트수가 14보다 클 때			
			String ii_k36 = cutString_k36(itemname_k36[i_k36], 14);	
			//outString 메소드를 이용하여 품목명을 14바이트까지 잘라내어 문자열 변수로 선언한다 			
			byte [] iibytes_k36 = ii_k36.getBytes();
            //잘라낸 문자열을 다시 바이트단위로 잘라 바이트배열에 담는다
			
			if(iibytes_k36.length < 14) {
				//잘라낸 문자열이 14보다 작을 경우(문자열에서 잘린 마지막부분이 한글일 경우 반환되는 문자열은 13바이트가 된다)				
				System.out.printf("%7s%12s%3s%11s\n", ii_k36, df_k36.format(price_k36[i_k36]), num_k36[i_k36], df_k36.format(price_k36[i_k36]*num_k36[i_k36]));
				//줄을 맞추기 위해 출력되는 두번째 string변수에 자리값을 한자리 더 할당해준다(%12s)			
			} else {				
				System.out.printf("%7s%11s%3s%11s\n", ii_k36, df_k36.format(price_k36[i_k36]), num_k36[i_k36], df_k36.format(price_k36[i_k36]*num_k36[i_k36]));					
				//잘라낸 문자열이 14인 경우 원래 의도했던 자리값을 할당하여 차례대로 출력한다(%11s)					
			}
		} else {
			//품목명의 i번째 배열의 바이트수가 14보다 작을 때
			
			String ii_k36 = itemname_k36[i_k36];
			//해당 품목명을 그대로 문자열 변수로 받는다			
			//for문을 이용하여 14바이트보다 작은 문자열을 14바이트의 문자열로 만들어준다
			for(int a_k36 = ibytes_k36.length; a_k36 <= 14; a_k36++) {
				//정수형 변수 a를 해당 문자열의 바이트수를 부여하여 해당값이 14가 될 때까지 1씩 증가하며 루프를 돈다				
				ii_k36 = ii_k36 + " ";
				//루프 횟수만큼 문자열 뒤에 띄어쓰기를 붙여준다						
			}
		
			System.out.printf("%7s%10s%3s%11s\n", ii_k36, df_k36.format(price_k36[i_k36]), num_k36[i_k36], df_k36.format(price_k36[i_k36]*num_k36[i_k36]));	
			//14바이트가 된 문자열을 자리값을 할당하여 차례대로 출력해준다
		}			
	}
	
	public static void TotalPrint_k36() {
		int iTaxFree_k36 = 0;	//면세품목가
		int iNonTaxFree_k36 = 0; 	//과세품목가
		int iNum_k36 = 0;	//총품목수량
			
		//for문의 조건문에서 정수형 변수를 선언하며 0으로 초기화한다. 품목의 갯수만큼 루프를 돌고 빠져나온다
		//품목의 갯수만큼 면세품목가, 과세품목가, 총품목수량을 구해준다
		for(int a_k36 = 0; a_k36 < itemname_k36.length; a_k36++) {								
			
			if(taxfree_k36[a_k36] == true) {
				iTaxFree_k36 = iTaxFree_k36 + price_k36[a_k36] * num_k36[a_k36];	//면세품목가
				//면세품목가는 taxfree배열에서 a번째 변수가 true인 경우의 price*num만을 더해준다
			}
			
			if(taxfree_k36[a_k36] == false) {
				iNonTaxFree_k36 = iNonTaxFree_k36 + price_k36[a_k36] * num_k36[a_k36];	//과세품목가
				//과세품목가는 taxfree배열에서 a번째 변수가 false인 경우의 price*num만을 더해준다
			}
			
			iNum_k36++;	//총품목수량
			//총품목수량은 0부터 배열의 마지막값까지 루프문을 돌며 1씩 증가한 값이 된다
			
		}
						
		double iTaxRate_k36 = 0.1;	//과세율은 실수형 변수로 선언하며 0.1로 초기화한다
		
		int netprice_k36 = netprice_k36(iNonTaxFree_k36, iTaxRate_k36);	//k36_netprice함수는 static이므로 main에서 객체생성 없이 호출할 수 있다
		//과세품목가와 과세율을 netprice 함수에서 받아 정수형 세전가격을 반환한다
		
		int iTax_k36 = iNonTaxFree_k36 - netprice_k36;	//부가세 = 과세품목가 - 세전가격, 세전가격을 버림했으므로 부가세는 올림이 된다
		
		int iPrice_k36 =iTaxFree_k36  + netprice_k36 + iTax_k36;	//총합계 = 면세품목가 + 세전가격 + 부가세

		DecimalFormat df_k36 = new DecimalFormat("###,###,###,###,###");
		//뒤에서 세자리마다 콤마를 찍어주는 DecimalFormat함수를 불러온다
		System.out.printf("\n%22s%14s\n", "총 품목 수량", iNum_k36 );
		//총품목수량과 해당값을 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("%23s%14s\n", "(*)면 세  물 품", df_k36.format(iTaxFree_k36));
		//면세물품표시와 df함수로 콤마표시한 해당값을 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("%23s%14s\n", "과 세  물 품", df_k36.format(netprice_k36));
		//과세물품표시와 df함수로 콤마표시한 해당값을 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("%24s%14s\n", "부   가   세", df_k36.format(iTax_k36));
		//부가세와 df함수로 콤마표시한 해당값을 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("%25s%14s\n", "합        계", df_k36.format(iPrice_k36));
		//합계와 df함수로 콤마표시한 해당값을 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("%s%24s\n","결 제 대 상 금 액", df_k36.format(iPrice_k36));
		//결제대상금액과 df함수로 콤마표시한 해당값을 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("-----------------------------------------\n");
		//표시선을 출력 후 줄바꿈 해준다
		System.out.printf("%s%28s\n", "0012 KEB 하나","541707**0484/36860658");
		//사용한 카드의 은행정보와 카드정보를 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("%s%15s%11s\n", "카드결제(IC)", "일시불 / ", df_k36.format(iPrice_k36));		
		//카드결제, 일시불 표시와 df함수로 콤마표시한 결제액을 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("-----------------------------------------\n");
		//표시선을 출력 후 줄바꿈 해준다
		System.out.printf("%23s","[신세계포인트 적립]\n");	
		//신세계포인트 적립표시와 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("홍*두 고객님의 포인트 현황입니다.\n");
		//해당 문구를 출력 후 줄바꿈 해준다
		System.out.printf("금회발생포인트%17s%10s\n", "9530**9995", df_k36.format(iPrice_k36/1000));
		//금회발생포인트 표시와 df함수로 콤마표시한 해당값을 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("누계(가용)포인트%15s%10s\n", df_k36.format((iPrice_k36/1000) + 5473), "(   5,473)");
		//누계가용포인트 표시와 df함수로 콤마표시한 해당값을 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("*신세계포인트 유효기간은 2년입니다.\n");
		//해당 문구를 출력 후 줄바꿈 해준다
		System.out.printf("-----------------------------------------\n");
		//표시선을 출력 후 줄바꿈 해준다
		System.out.printf("%22s", "구매금액기준 무료주차시간 자동부여\n");
		//해당 문구를 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("%s%29s\n", "차량번호 : ", "34저****");
		//차량번호표시와 해당번호를 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
		TimeStamp_k36();
		LocalDateTime currentDateTime_k36 = LocalDateTime.now();
		//LocalDateTime 함수를 이용하여 현재시간을 불러온다	
		LocalDateTime refundDate_k36 = currentDateTime_k36.minusHours(3);	
		//LocalDateTime함수를 이용하여 불러온 현재시간에 3시간을 감한 refundDate 함수		
		DateTimeFormatter formatter2_k36 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		//DateTimeFormatter함수를 이용하여 원하는 변수값을 받아 형태를 부여한다				
		String formattedDateTime2_k36 = refundDate_k36.format(formatter2_k36);
		//불러온 현재시간에서 3시간을 감한 시간을 원하는 형태에 맞게 출력할 수 있도록 String변수로 받는다		
		System.out.printf("%s%30s\n", "입차시간 : ", formattedDateTime2_k36);
		//입차시간표시와 현재시간에서 3시간을 감한 실제 입차시간의 표시를 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("-----------------------------------------\n");
		//표시선을 출력 후 줄바꿈 해준다
		System.out.printf("캐셔:084299 양00%25s\n", "1150");
		//해당 문구를 출력 후 줄바꿈 해준다
		System.out.printf("   ||||||||||||||||||||||||||||||||||||\n");
		//바코드를 출력 후 줄바꿈 해준다
		System.out.printf("   ||||||||||||||||||||||||||||||||||||\n");
		//바코드문구를 출력 후 줄바꿈 해준다
		DateTimeFormatter formatter3_k36 = DateTimeFormatter.ofPattern("yyyyMMdd");
		//DateTimeFormatter함수를 이용하여 원하는 변수값을 받아 형태를 부여한다		
		String formattedDateTime3_k36 = currentDateTime_k36.format(formatter3_k36);
		//불러온 현재시간을 원하는 형태에 맞게 출력할 수 있도록 String변수로 받는다		
		System.out.printf("%14s%s\n", formattedDateTime3_k36,"/00119861/00164980/31");
		//현재시간표시와 그 외 문구를 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
	}
	
	
	
	public static int netprice_k36 (int price_k36, double rate_k36) {	
		//정수형 소비자가격, 소수형 세율을 받아 정수형 세전가격을 반환하는 함수	
		return (int)(price_k36 / (1 + rate_k36));	//정수선언을 하면 세전가격은 버림이 된다
	}	

	public static String cutString_k36(String str_k36, int len_k36) { //문자열과 정수값을 받아 문자열을 반환해주는 함수 cutString을 선언한다
		 byte[] by_k36 = str_k36.getBytes();	//받아온 문자열을 바이트단위로 쪼개어 바이트배열에 담아준다
		 int count_k36 = 0;	//문자열에 포함된 한글의 갯수를 담을 정수형 변수 count를 선언해주고 0으로 초기화한다
		  
		 //try~catch구문을 이용하여 오류를 잡아낸다
		 try  {	//첫번째로 실행되는 부분		
			  
		       for(int i_k36 = 0; i_k36 < len_k36; i_k36++) {	//for문을 이용하여 0부터 원하는 바이트수까지 루프를 돈다
		            if((by_k36[i_k36] & 0x80) == 0x80) count_k36++; 
		            //인덱스 값이 한글일 때 카운트를 1씩 추가하여 총 한글갯수를 카운트해준다
		       }
		       
		       if((by_k36[len_k36 - 1] & 0x80) == 0x80 && (count_k36 % 2) == 1) len_k36--; 
		       //마지막 인덱스가 한글이고 한글의 갯수가 홀수일 때 마지막 바이트값을 빼준다
		       return new String(by_k36, 0, len_k36);   //바이트를 문자열로 변환한 값을 반환해준다
		  }
		  catch(java.lang.ArrayIndexOutOfBoundsException e_k36)	//오류가 있을 때 실행되는 부분
		  {
		       System.out.println(e_k36);	//오류가 발생한 범위와 이유를 출력해준다		       
		       return "";	//빈 문자열을 반환해준다
		  }
	} 	
}
