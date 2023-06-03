import java.io.*;
class Program2{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size : ");
		int size = Integer.parseInt(br.readLine());
		
		int prod=1;
		int[] arr = new int[size];
		
		System.out.println("Enter array elements : ");
		
		for (int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		for (int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				prod=prod*arr[i];
			}
		}
		System.out.println("Prod of even elements in array is  : "+prod);
	}
}
