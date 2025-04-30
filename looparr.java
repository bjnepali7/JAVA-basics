public class looparr {
    public static void main(String[] args) {
       int []ary={4,5,6,7,8};
        int index=0;
        System.out.println(index);
        while (index<5) {
            System.out.println(index);
            index++;
        }
        System.out.println("\n\n");
        //multidimenetional array
         int [][] matrix=new int[2][3];
         int[][]mat={{3,4},{5,6}};
         int i=0;
         while ((i<mat.length)) {
            int j=0;
            while (j<mat.length) {
                System.out.print(mat[i][j]+"\t");
                j++;

                
            }
            System.out.println();
            i++;
            
            
         }

    }
    
}
