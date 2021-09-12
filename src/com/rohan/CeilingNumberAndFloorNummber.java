public class CeilingNumberAndFloorNummber{
    public static void main(String[] args) {
       int[] arr = {2,3,5,9,14,16,18};
       int target=19;
        int a = ceilingNumber(arr,target);
        // int a =floorNumber(arr,target);

        System.out.print(a);
    }

    static int ceilingNumber(int[] arr, int target){
        int s=0;
        int e=arr.length-1;

        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]>target){
                e=m-1;
            }
            else if(arr[m]<target){
                s=m+1;
            }
            else{
                return m;
            }
        }
        return s;
    }


    static int floorNumber(int[] arr, int target){
        int s=0;
        int e=arr.length-1;

        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]>target){
                e=m-1;
            }
            else if(arr[m]<target){
                s=m+1;
            }
            else{
                return m;
            }
        }
        return e;
    }
}