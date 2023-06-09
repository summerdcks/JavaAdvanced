package PPT7;

import java.text.DecimalFormat;

public class PracticeP11 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		String [] OneRec_k36 = {	//문자열형 배열 OneRec을 선언하고 변수를 담아준다
				"01* 감                    100  1      1,000",
				"02  우유                2,000  2      4,000",
				"03* 청포도              6,980  3     20,940",
				"04  초코파이            4,500  4     18,000",
				"05* 새송이버섯          8,480  5     42,400",
				"06* 제로콜라 6묶음      1,500  6      9,000",
				"07  산지직송 Grape      7,890  7     55,230",
				"08  코카콜라제로 1     12,000  8     96,000",
				"09  킷캣 2F 미니        1,980  9     17,820",
				"10* (A)파머스픽 흙      3,180 10     11,800",			
				"11  노브랜드 굿모       1,790 20     35,800",
				"12  순창 양념듬뿍       4,880 30    146,400",
				"13  노브랜드 국산       3,280 40    131,200",
				"14* [직배송]이맛쌀     29,900 50  1,495,000",
				"15  집들이 선물세      81,000 60  4,860,000",
				"16  랜더스데이청소    349,000 70 24,430,000",
				"17  한국금거래소골    449,600 80 40,968,000",
				"18  [최초판매가 50     38,900 90  3,501,000",
				"19  [5/11순차출고]     74,800 11    822,800",
				"20  [뉴발란스] 200    209,000 12  2,508,000",		
				"21  종가 행복이온      48,900 13    635,700",
				"22  [해남미소]땅끝    112,200 14  1,560,800",
				"23  농심백산수 1L      22,300 15    334,500",
				"24  진주햄 천하장      21,800 16    348,800",
				"25* 스테비아 대추      30,900 17    525,300",			
				"26  부토버스터 화      41,940 18    754,920",
				"27* [CJ직배송]카놀     32,000 19    608,000",
				"28* [CJ직배송]비비     54,800 20  1,096,001",
				"29  드리미 L10s Ul  1,399,000 21 29,379,000",
				"30  LG울트라HD TV   2,863,700 22 63,001,400"	
		};
		
		System.out.printf("*************************************************\n");	//구분선 출력
		for(int i_k36 = 0; i_k36 < OneRec_k36.length; i_k36++) {	//0부터 배열의 길이, 즉 변수의 개수만큼 for문을 돈다
			byte [] s_k36 = OneRec_k36[i_k36].getBytes();	//i번째 변수를 byte단위로 쪼개어 byte배열에 담는다
			String p_k36 = new String(s_k36,20,9);		//byte배열의 20번째자리부터 9개의 바이트를 문자열로 변환하면 '가격'이 나온다
			p_k36 = p_k36.replaceAll(",", "");	//해당 문자열에서 쉼표 제거
			p_k36 = p_k36.replaceAll(" ", "");	//해당 문자열에서 띄어쓰기 제거
			int price_k36 = Integer.valueOf(p_k36);		//문자열을 정수값으로 변환한다
					
			String n_k36 = new String(s_k36,30,3);	//byte배열의 30번째자리부터 3개의 바이트를 문자열로 변환하면 '수량'이 나온다
			n_k36 = n_k36.replaceAll(",", "");	//해당 문자열에서 쉼표 제거
			n_k36 = n_k36.replaceAll(" ", "");	//해당 문자열에서 띄어쓰기 제거
			int number_k36 = Integer.valueOf(n_k36);	//문자열을 정수값으로 변환한다
			
			String t_k36 = new String(s_k36,33,10);	//byte배열의 33번째자리부터 10개의 바이트를 문자열로 변환하면 '총액'이 나온다
			t_k36 = t_k36.replaceAll(",", "");	//해당 문자열에서 쉼표 제거
			t_k36 = t_k36.replaceAll(" ", "");	//해당 문자열에서 띄어쓰기 제거
			int total_k36 = Integer.valueOf(t_k36);	//문자열을 정수값으로 변환한다
			
			if(price_k36 * number_k36 != total_k36) {	//가격 * 수량이 총액과 일치하지 않는 경우
				System.out.printf("오류[%s]\n", OneRec_k36[i_k36]);	//오류메시지와 해당 문자열을 출력해준다
				total_k36 = price_k36 * number_k36;	//올바른 총액을 계산한다
				String ss_k36 = new String(s_k36,0,33);	//총액부분을 제외한 나머지를 문자열로 변환한다
				DecimalFormat df_k36 = new DecimalFormat("###,###,###,###,###");
				//뒤에서 세자리마다 콤마를 찍어주는 DecimalFormat을 불러온다
				System.out.printf("수정[%s%10s]\n", ss_k36, df_k36.format(total_k36));	//수정메시지와 해당문자열과 수정된 총액을 함께 출력해준다
				System.out.printf("*************************************************\n");	//구분선 출력
			}		
		}		
	}
}
