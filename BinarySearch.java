public class BinarySearch{

public static boolean search(int arr[],int target){

int start = 0;
int end = arr.length-1;

while(start<=end){

	int mid = start + (end-start)/2;

	if(arr[mid]==target){
	  return true;
	}
	else if(arr[mid]<target){
	  start = mid + 1;
	}
	else{
	 end = mid - 1;
	}

}
return false;


}

public static void main(String[] args){

int arr[]={23,45,67,78,99};

int target = 4;

boolean flag = search(arr,target);
System.out.println("Is element present? "+flag);

}



}


