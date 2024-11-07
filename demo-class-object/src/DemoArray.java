// package DemoStaticMethod;
import java.util.Arrays;

public class DemoArray {
  
    int[] arr = new int[]{1,2,3,4,5};

    // Instance method
    public void add(int innum){ 
      int[] newArr = Arrays.copyOf(this.arr, this.arr.length+1);
      newArr[this.arr.length]=innum;
      this.arr = newArr;
    }

    public void sub(int innum){
      if (this.arr.length != 1){
        int[] newArr = new int[this.arr.length];
        int j=0;
        boolean subed = false;
        for (int i=0; i<newArr.length; i++){
          if (this.arr[i] != innum) {
            newArr[j]=this.arr[i];
            j++;
          }
          else subed=true;
        }
        if (subed) {
          int[] newArr1 = Arrays.copyOf(newArr, newArr.length-1);
          this.arr=newArr1;    
        }
      }
    }

    public int getLength(){
      return this.arr.length;
    }

    public void showarray(){
      System.out.println(Arrays.toString(this.arr));
    }
  
  public static void main(String[] args) {
    DemoArray x = new DemoArray();
    x.showarray();
    x.add(9);
    x.showarray();
    x.sub(9);
    x.showarray();
    x.sub(4);
    x.showarray();
    x.add(6);
    x.showarray();
  }

}