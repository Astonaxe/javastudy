package sec09.exam05_instance_member;

public class Car {
	// 필드 
	String model;
	int speed;
	
	// 생성자 
	Car(String model){
		this.model = model; // this model  
	}
	// 메소드 
	void setSpeed(int speed){
		this.speed = speed; // this.speed는 인스턴스 객체 필드 
		
	}
	
	void run() {
		for(int i= 10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model+"가 달립니다. (시속"+this.speed+"km/h)");
			
		}
	}
}
