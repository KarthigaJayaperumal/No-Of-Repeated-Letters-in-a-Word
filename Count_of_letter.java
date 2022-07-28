
public class Count_of_letter {

	public static void main(String[] args) {
		String name="JayaPerumal";
		int feq[]=new int[name.length()];
		int j=0;
		while(j<name.length()) {
		char ch=name.charAt(j);
				int count=1;
				for(int i=j+1;i<name.length();i++) {
					if(ch==name.charAt(i)) {
						count++;
						feq[i]=-1;
					}}
					if(feq[j]!=-1) {
						feq[j]=count;
						
					}j++;}
				for(int i=0;i<feq.length;i++){
		if(feq[i]>0) {
		System.out.println(name.charAt(i)+"   appreas  "+feq[i]+" times");
		}}}}