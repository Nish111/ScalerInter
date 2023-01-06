package array211122;
// 
public class Toggle {
	public int toggleBit(int N, int i) {
		return (N^(1<<i));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toggle t = new Toggle();
		System.out.println(t.toggleBit(10, 4)); // 26
		System.out.println(t.toggleBit(10, 3)); // 2
	}

}
