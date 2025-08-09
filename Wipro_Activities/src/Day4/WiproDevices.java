package Day4;
/*
interface WiproSystems{
	void deviceType();
	void compilespeed();
}
class Desktop implements WiproSystems{
	public void deviceType() {
		System.out.println("Wipro provides device:DESKTOP");
	}
	public void compilespeed() {
		System.out.println("Code is compiled faster in Desktop");
}
}
class Laptop implements WiproSystems{
	public void deviceType() {
		System.out.println("Wipro provides device:LAPTOP");
	}
	public void compilespeed() {
		System.out.println("Code is compiled slower in Laptop");
}
	
	}

public class WiproDevices {
	public static void main(String[] args) {
		WiproSystems laptop=new Laptop();
		laptop.deviceType();
		laptop.compilespeed();
		
		WiproSystems desktop=new Desktop();
		desktop.deviceType();
		desktop.compilespeed();
	}

}
*/
abstract class WiproSystems{
	abstract void devicetype();
	abstract void compilespeed();
}
class Desktop extends WiproSystems{
	void devicetype() {
		System.out.println("Wipro provides device: DESKTOP");
	}
	void compilespeed() {
		System.out.println("Code is compiled faster in Desktop");
	}
}
class Laptop extends WiproSystems{
	void devicetype() {
		System.out.println("Wipro provides device: Laptop");
	}
	void compilespeed() {
		System.out.println("Code is compiled slower in Laptop");
	}
}
public class WiproDevices{
	public static void main(String[] args) {
		WiproSystems desktop=new Desktop();
		desktop.devicetype();
		desktop.compilespeed();
		
		WiproSystems laptop=new Laptop();
		laptop.devicetype();
		laptop.compilespeed();
		
		
	}
}


