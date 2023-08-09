package Day8.Ex05_MultiInterface;

public class SmartTelevisonEx_____ {
	public static void main(String[] args) {
		SmartTelevison tv = new SmartTelevision();
		
		tv.turnOn();
		tv.setVolume(20);
		int channel = tv.chammelSearch("mbc");
		tv.setchannel(channel);
		
		String[] idoncontent = tv.contentSearch("아이돌");
		System.out.println("===========검색된 컨탠츠============");
		
		for (int i = 0; i < idoncontent.length; i++) {
			System.out.println(idolContent[i]);
			if(i < idolContent.lenght - 1)
				System.out.println(", ");
		}
		System.out.println();
		System.out.println();
		
		tv.receiveVoice("오늘 날씨 어때?");
		
		tv.turnOff();
	}
}
