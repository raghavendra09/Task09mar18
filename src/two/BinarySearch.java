package two;

public class BinarySearch {

	public static void main(String[] args) {
		int[] intarray={1,2,3,4,5,6,7,8,9};
		int k=1;
		int l=0;
		int h=(intarray.length)-1;
		int mid=(l+h)/2;
		while(l<=h) {
			mid=(l+h)/2;
			if(intarray[mid]<k) {
				l=mid+1;
			}
			else if(intarray[mid]>k) {
				h=mid-1;
			}
			else {
				System.out.println("Element "+k+" found at "+mid+" index postion.");
				break;
			}
		}
		if(l>h) {
			System.out.println("Element "+k+" not found");
		}
	}

}
