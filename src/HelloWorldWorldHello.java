import java.util.Arrays;

public class HelloWorldWorldHello {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k=0;
		int start=0;
		
		char arr[]= {'h','e','l','l','o',' ','w','o','r','l','d',' ','w','o','r','k'};
		String s=new String(arr);// this is way to convert char[] to string
		//System.out.println(s);
		String a[]=s.split(" ");//now we can reverse it and print it
		//System.out.println(Arrays.toString(a));

		
		// another approach without using String
		int l=arr.length;
		int end=l-1;
		char newarr[]=new char[l];
		
		
		
		for(int i=l-1;i>=0;i--) {
			if(arr[i]==' ') {
				start=i;
				for(int j=start+1;j<=end;j++) {
					
					newarr[k++]=arr[j];
				}
				end=start-1;
				newarr[k++]=' ';
				
			}
			
		}
		for(int i=0;i<l;i++) {
			if(arr[i]==' ') {
				for(int j=0;j<i;j++) {
					newarr[k++]=arr[j];
				}
				break;
			}
			
		}
		System.out.println(Arrays.toString(newarr));
		}
		
		

		
		
		
		
		
		
	}

	



