package first.maven.Hello;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.media.multipart.FormDataParam;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
    @POST
    @Path("/add")
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Produces(MediaType.TEXT_PLAIN)
    public String add(@DefaultValue("0")@FormDataParam("op1") String op1, @DefaultValue("0")@FormDataParam("op2") String op2){
        System.out.println("add called");
        //System.out.println(op1 +" + "+op2);
        if(op1=="" && op2=="")return "0";
        else if(op1=="")return op2;
        else if(op2=="")return op1;
        else
        return ""+(Integer.parseInt(op1.trim())+Integer.parseInt(op2.trim()));
    }
    
    @POST
    @Path("/sub")
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Produces(MediaType.TEXT_PLAIN)
    public String sub(@DefaultValue("0")@FormDataParam("op1") String op1, @DefaultValue("0")@FormDataParam("op2") String op2){
        System.out.println("sub called");
        if(op1=="" && op2=="")return "0";
        else if(op1=="")return op2;
        else if(op2=="")return op1;
        else
        return ""+(Integer.parseInt(op1.trim())-Integer.parseInt(op2.trim()));
    }
    
    @POST
    @Path("/mul")
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Produces(MediaType.TEXT_PLAIN)
    public String mul(@DefaultValue("0")@FormDataParam("op1") String op1, @DefaultValue("0")@FormDataParam("op2") String op2){
        System.out.println("mul called");
        if(op1=="" || op2=="")return "0";
        
        else
        return ""+(Integer.parseInt(op1.trim())*Integer.parseInt(op2.trim()));
    }
    
    @POST
    @Path("/div")
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Produces(MediaType.TEXT_PLAIN)
    public String div(@DefaultValue("0")@FormDataParam("op1") String op1, @DefaultValue("0")@FormDataParam("op2") String op2){
        System.out.println("div called");
        if(op1=="" && op2=="")return "0";
        else if(op2.trim()=="0")return "Error";
        else
        return ""+(Double.parseDouble(op1.trim())/Double.parseDouble(op2.trim()));
    }
}
