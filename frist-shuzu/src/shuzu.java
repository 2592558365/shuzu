import java.util.Scanner;

public class shuzu {
	public static void main(String[] args){
        int number,maxsum;//定义2个整型
        
        int a;
        Scanner in = new Scanner(System.in);//输入
        System.out.println("请输入数组大小");
        number=in.nextInt();//将输入值存于number1·
        int array[]=new int[number];//由上述操作定义数组
        System.out.println("请输入数组的值：");
        for(a=0;a<number;a++) {
                 array[a]=in.nextInt();
        }  //数组定义完成
        //查询最大数组
     
        int i,j,k;
        int max[]=new int [number];
        for(i=0;i<number;i++){
            max[i]=array[i];
            k=array[i];
            for(j=i+1;j<number;j++){
                k=k+array[j];
                if(k>max[i])
                {max[i]=k;}
            }
        }
        int m=max[0];
        for(i=1;i<number;i++)
        {
            if(max[i]>m)
            {m=max[i];}
        }
        System.out.println("所有连续子数组和的最大值为："+m);
                
    }
}
