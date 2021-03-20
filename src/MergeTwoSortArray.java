
public class MergeTwoSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,2,4,6,8,12,14,15,17};
		int arr2[]= {1,3,5,7,9,10,11,16,18,19,20};
		int l1=arr.length;
		int l2=arr2.length;
		System.out.println(l1+" "+l2);
		int i=0;
		int j=0;
		if(l1>l2) {
		while(j<l2) {
			if(arr[i]<arr2[j]) {
				System.out.println(arr[i]+" i="+i);
				i++;
			}
			else if(arr[i]>arr2[j]) {
				System.out.println(arr2[j]+" j="+j);
				j++;
			}
			
			
		}
		for(int x=i;x<l1;x++) {
			System.out.println(arr[x]);
		}
		}
		else {
			while(i<l1) {
				if(arr[i]<arr2[j]) {
					System.out.println(arr[i]);
					i++;
				}
				else if(arr[i]>arr2[j]) {
					System.out.println(arr2[j]);
					j++;
				}
			}
			for(int x=j;x<l2;x++) {
				System.out.println(arr2[x]);
			}
			
		}

	}

}
