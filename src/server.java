import java.io.File;

class server {

//global Variables

    public static void main(String[] args) {

        //check that there was an actual request

        if(args.length < 2)
            return;


//main variables

        String request,parameters ;




//data preprocessing
        request= args[0];
        parameters = args[1];


//program logic

        if (request.equalsIgnoreCase("get"))
            Get.get(parameters);

//clean up 

        //testing


            //print("hello");

//end testing

    }



    public static void print(Object output){

        System.out.println(output+"\n");

    }





}
