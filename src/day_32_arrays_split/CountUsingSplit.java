package day_32_arrays_split;

public class CountUsingSplit {
    public static void main(String[] args) {

        String catTypes = "bengal cat tabby cat persian cat no cat here";
        String [] catArrays = catTypes.split("cat");
        System.out.println("number of 'cats' = " + (catArrays.length -1));

        for (String type : catArrays) {
            System.out.println(type);
        }




//        int count = 0;
//        for (int i =0; i < cats.length() -2; i++){
//            if(cats.substring(i, i +3).equals("cat")){
//                count++;
//
//            }
//        }
//        System.out.println("count of cats : " + count);





//String catTypes = "bengal cat tabby cat persian cat no cat here";
//
//		String arr[] = catTypes.split(" ");
//
//		System.out.println();
//
//		for(int i  = 0 ; i <= arr.length-1; i++) {
//
//			if(arr[i].equals("cat")) {
//
//				continue;
//
//			}else {
//				System.out.print(arr[i]+" ");
//			}
//
//		}

//        String cats = "bengal cat tabby cat persian cat no cat here cat ";
//        String [] catArrays = cats.split("cat");
//
//
//        int count = 0;
//
//        for (int i =0; i < catArrays.length -1; i++){
//
//            count++;
//
//
//        }
//
//        System.out.println(count);


















    }
}
