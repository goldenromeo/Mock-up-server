import java.io.File;

/**
 * Created by rommeltrejo on 2/4/16.
 */
public class Get {




        public static void  get(String request){

            server.print("get request was "+request);

            File getRequest = new File(request);

            if(!getRequest.exists())
                server.print("ooooooh server error 404: file was not found");


                }






}
