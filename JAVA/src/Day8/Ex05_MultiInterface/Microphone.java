package Day8.Ex05_MultiInterface;

public interface Microphone {
	int inputVolumeMax = 50;
	int inputVolumeMin = 5;
	
	//음성 인식
	String reciveVoice(String voice);

	void touch(int x, int y);
	
}
