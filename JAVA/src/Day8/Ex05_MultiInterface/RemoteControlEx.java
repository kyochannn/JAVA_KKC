package Day8.Ex05_MultiInterface;

public class RemoteControlEx {
	public static void main(String[] args) {
		// 인터페이스타입 객체명 = new구현 클래스();
		Remotecontrol tvRc = new Television();
		tvRc.turnOn();
		tvRc.setVolume(5);
		tvRc.setVolume(100);
		tvRc.setMute(true);
		tvRc.turnOff();
		System.out.println();
		
		Remotecontrol speakerRc = new Television();
		speakerRc.turnOn();
		speakerRc.setVolume(5);
		speakerRc.setVolume(-100);
		speakerRc.setMute(false);
		speakerRc.turnOff();
		System.out.println();
		
		Remotecontrol.changeBattery();
	}
}
