package lession03;

public class ArrayLearning {
    public static void main(String[] args) {
        int[] myIntegerArr = new int[5];
        for (int index = 0; index < myIntegerArr.length; index++) {
            System.out.println(myIntegerArr[index]);
        }
        // vua khai bao + yeu cau cap phat bo nho
        int[] myNumberArr = new int[] {1 ,2 ,3 ,4, 5};
        for (int i = 0; i < myNumberArr.length; i++) {
            System.out.println(myNumberArr[i]);
        }

        // gan gia tri
        int[] myNumberArr2 = new int[5];
        for (int i = 0; i < myNumberArr2.length; i++) {
            myNumberArr2[i] = i + 1;

        }
        for (int i = 0; i < myNumberArr2.length; i++) {
            System.out.println(myNumberArr2[i]);
        }

        //Enhanced for: khi duyet qua tung gia tri cua mang khong care den index
        for (int num:myNumberArr){
            System.out.println(num);

        }
        // Lay phan tu cuoi cung cua mang
        System.out.println(myNumberArr[myNumberArr.length -1]);
        // Lay phan tu dau tien cua mang
        System.out.println(myNumberArr[0]);
    }
}
