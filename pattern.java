//right-angled inverted triangle pattern
import java.util.*;
class Main {
    public static void main(String[] args) {
        int n = 4;
        for(int i=1;i<=n;i++){
            for(int j=4;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
* * * * 
* * * 
* * 
* 

  //right-angled triangle pattern
  import java.util.*;
class Main {
    public static void main(String[] args) {
        int n = 4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
* 
* * 
* * * 
* * * * 
//box:
import java.util.*;
class Main {
    public static void main(String[] args) {
        pattern1(5);
    }
    static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*****
*****
*****
*****
*****
    
class Main {
    public static void main(String[] args) {
        pattern4(4);
    }
    static void pattern4(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++ ){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
1
12
123
1234
