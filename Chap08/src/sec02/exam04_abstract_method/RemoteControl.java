package sec02.exam04_abstract_method;

public interface RemoteControl {
	//상수 
	//추상메소드 
	abstract void turnOn();
	void turnOff();
	void setVolume();
	//디폴트메소드 
	
	default void setMute(boolean mute){
		if(mute){
			System.out.println("무음처리합니다.");
			
		}else {
			System.out.println("무음해제합니다.");
			
		}
	}
	//정적 메소드 
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");

	}
	
}
