public class commandlinearguments {
    // command line arguments is a argument that is passed at the runninf time of java progaram
    public static void main(String[] args) {//args is reference variable to  array(i.e String[]args=new args[].. this is a array)
        // the synatx for array in java is  int a[]=new a[5]... with the block  of memeory  their ia memory careated  length[]
        //program  of avaerage   of numbers in command line  arguments

int i,s=0;


    for(i=0;i< args.length;i++){
        int num = Integer.parseInt(args[i]);// conversion of data  to integer 
        System.err.println(num);
        s=s+num;
    }


System.out.println("Average is "+s/args.length);
    }
// for to running command line argumentt this we need to do this on cmd .. for complile javac filename.java and for eun and input
//java filename input(90 798 90 etc)
    
}


