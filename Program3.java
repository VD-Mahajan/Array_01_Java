import java.io.*;
class Program3{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size : ");
		int size = Integer.parseInt(br.readLine());
		
		int prodIndex=1;
		int[] arr = new int[size];
		
		System.out.println("Enter array elements : ");
		
		for (int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		for (int i=0;i<arr.length;i++){
			if(arr[i]%2!=0 && i>0){
				prodIndex=prodIndex*i;
			}
		}
		System.out.println("prodIndex of odd elements in array is  : "+prodIndex);
	}
}
