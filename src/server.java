/**
 * server.java
 * mockup java server that answers get and head requests
 * supports following responses 200,204,400, and 404.
 * I do not make myself responsible for whatever happens if you anything here
 * seriously this is just for fun
 */

class server {

    public static final String _200 = "Good, server status code 200:";
    public static final String _204 = "Well, 204 No Content";
    public static final String _400 = "Bad, 400 Bad Request";
    public static final String _404 = "ooooooh server error 404: file was not found";
    private static int response = 204;
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

        if (request.equalsIgnoreCase("get")||request.equalsIgnoreCase("head"))
            response =  Get.get(parameters);
        else
            response = 400;


        switch (response){

            case 200 : print(_200);break;
            case 400: print(_400);break;
            case 404: print(_404);break;

             default: print(_204);break;
        }


    }



    public static void print(Object output){

        System.out.println(output+"\n");

    }





}
