import java.io.*;
class Program5{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size : ");
		int size = Integer.parseInt(br.readLine());
		
		int sum=0;
		int[] arr = new int[size];
		
		System.out.println("Enter array elements : ");
		
		for (int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		System.out.print("Elements divisible 5 are   : ");
		for (int i=0;i<arr.length;i++){
			if(arr[i]%5==0){
				System.out.print(arr[i]+"  ");
			}
		}
		System.out.println();
	}
}
