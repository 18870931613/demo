
public class Test {
	
	public static void main(String[] args) throws InterruptedException {
	Solution solution = new Solution();
	System.out.println(solution.isHappy(1));
		//王东修改了
	}
}


class Solution {
    public boolean isHappy(int n) {
    	//合金钢合金钢脚后跟
        boolean is = false;
        //不男不女
    	while (n!=1) {
			int sum =0;
			for (int j = 0; j < String.valueOf(n).length(); j++) {
				sum+=Integer.parseInt(String.valueOf(String.valueOf(n).charAt(j)))*Integer.parseInt(String.valueOf(String.valueOf(n).charAt(j)));
			}
			n=sum;
			if(n==4) {
				return is;
			}
		}
    	is = true;
        return is;
    }

}

