class arrInsert{
	public static void main(String args[]){
		int [] arr = {10,20,40,50};
		int len = arr.length;
		
		int ele = 30;
		int index= 2;
		
		int [] newArr = new int[len+1];
		for(int i=0; i <index; i++){
			newArr[i] = arr[i];
		}
		newArr[index] = ele;
		
		for(int i=(index+1); i<newArr.length;i++){
			newArr[i]=arr[i-1];
		}
		for(int i =0; i<newArr.length ; i++){
			System.out.println(newArr[i]);
		}
		/*
		for(int i = 0 ; i<len; i++){
			newArr[i] = arr[i];
		}
		for(int i = len; i >= pos; i--){
			newArr[i] = newArr[i-1];
		}
		newArr[pos-1]= ele;
		for(int i=0; i <newArr.length; i++){
			System.out.println(newArr[i]);
		} */

	}
}



