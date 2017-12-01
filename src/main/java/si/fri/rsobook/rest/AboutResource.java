package si.fri.rsobook.rest;

import com.kumuluz.ee.logs.cdi.Log;
import org.eclipse.microprofile.metrics.Counter;
import org.eclipse.microprofile.metrics.annotation.Metric;
import si.fri.rsobook.model.AboutDto;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("About")
@RequestScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AboutResource {

    @Inject
    @Metric(name = "about_returned")
    private Counter aboutReturned;

    @Log
    @GET
    public Response getList() {
        aboutReturned.inc();
        return Response.ok(AboutDto.build()).build();
    }

}
