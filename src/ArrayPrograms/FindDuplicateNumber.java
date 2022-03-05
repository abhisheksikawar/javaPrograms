package ArrayPrograms;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {1,2,3,4,2,5,2, 5 ,1}; //1 8 15 10 2 5
		int l=arr.length;
		for(int i=0;i<l;i++) {
			arr[arr[i]%l]=arr[arr[i]%l]+l;
		}
		for(int i=0;i<l;i++) {
			if(arr[i]>=l*2) {
				System.out.println(i);
			}
		}

	}

}
