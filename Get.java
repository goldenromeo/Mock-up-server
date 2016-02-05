import java.io.File;

/**
 * Created by rommeltrejo on 2/4/16.
 */
public class Get {




        public static int  get(String request){


            //test
            server.print("get request was "+request);
            //end test

            //java get file
            File getRequest = new File(request);

            //check if file exists or print a 404
            if(!getRequest.exists() || getRequest.isDirectory())
                return 404;
            else if(getRequest.isFile())
                return 200;


            return 204;}






}
