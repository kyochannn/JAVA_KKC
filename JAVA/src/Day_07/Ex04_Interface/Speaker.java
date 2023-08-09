package Day_07.Ex04_Interface;

public class Speaker implements Remotecontrol{
	
	// 변수
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("스피커 전원을 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("스피커 전원을 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		// 볼륨을 최댓값이 넘지 못하게 지정
		if (volume > Remotecontrol.MAX_VOLUME) {
			this.volume = Remotecontrol.MAX_VOLUME;
		} 
		else if (volume < Remotecontrol.MIN_VOLUME) {
			this.volume = Remotecontrol.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 스피커 볼룜 : " + this.volume);
		
	}
	
	

}
