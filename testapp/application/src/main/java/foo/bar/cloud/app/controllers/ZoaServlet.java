package foo.bar.cloud.app.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.stream.Collectors;

// Import for debugging
//import org.springframework.http.HttpStatus;

import com.sap.cloud.sdk.cloudplatform.connectivity.DestinationAccessor;
import foo.bar.cloud.app.external.adaptivecard.client.AdaptiveCardApi;
import foo.bar.cloud.app.external.adaptivecard.model.PostAdaptiveCardRequest;
import com.sap.cloud.sdk.cloudplatform.connectivity.HttpDestination;
import com.sap.cloud.sdk.datamodel.odata.client.exception.ODataException;
import com.sap.cloud.sdk.services.openapi.core.OpenApiResponse;

@WebServlet("/zoa")
public class ZoaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    // Only decorate as DefaultErpDestination if you need additional header values such as sap-client
    private final HttpDestination destination = DestinationAccessor.getDestination("MyErpSystem").asHttp();
    private final PostAdaptiveCardRequest ACReq = new PostAdaptiveCardRequest();
    Logger logger = LoggerFactory.getLogger(ZoaServlet.class);
    
    @Override
    protected void doPost(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {
                
                //print all headers 
                /*while (request.getHeaderNames().hasMoreElements()) {
                    String headerName = request.getHeaderNames().nextElement();
                    logger.info(headerName + ": " + request.getHeader(headerName));
                }*/

                //get Body of request if raw or other than application/json
                //String requestData = request.getReader().lines().collect(Collectors.joining());

                //if it's a JSON body, we need to the following:
                ObjectMapper mapper = new ObjectMapper();
                PostAdaptiveCardRequest adaptiveCardRequest = mapper.readValue(request.getInputStream(),PostAdaptiveCardRequest.class); // if request body matches API call exactly

                //Setter methods in case you need to set any properties manually
                //PostAdaptiveCardRequest ACReq = new PostAdaptiveCardRequest();
                ACReq.setActionCode("actionCode");
                ACReq.setComments("comments");
                ACReq.setApproverLevel("approverLevel");
                ACReq.setApproverUserid("approverUserid");
                ACReq.setSubmitterUserid("submitterUserid");
                ACReq.setReqNum("reqNum");

        try {
            final OpenApiResponse zoaResponse =
                    new AdaptiveCardApi(destination)
                          //.postAdaptiveCard(ACReq);
                            .postAdaptiveCard(adaptiveCardRequest);
            
                /* Optional logging and debugging
                String reasonPhrase = zoaResponse.getStatusCode().getReasonPhrase();
                HttpStatus httpStatus = zoaResponse.getStatusCode();
                boolean isErrorenous = zoaResponse.getStatusCode().isError();
                */
            response.setContentType("application/json");
            response.getWriter().write(new Gson().toJson(zoaResponse));
        } catch (final ODataException e) {
            logger.error(e.getMessage(), e);
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            response.getWriter().write(e.getMessage());
        }
    }
}