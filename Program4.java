import java.io.*;
class Program4{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size : ");
		int size = Integer.parseInt(br.readLine());
		
		char[] arr = new char[size];
		
		System.out.println("Enter array elements : ");
		
		for (int i=0;i<arr.length;i++){
			arr[i]=(char)br.read();
			br.skip(1);
		}
		
		System.out.print("voles are : ");

		for (int i=0;i<arr.length;i++){
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){
				System.out.print(arr[i]+"  ");		
			}
		}
		System.out.println();
	}
}
