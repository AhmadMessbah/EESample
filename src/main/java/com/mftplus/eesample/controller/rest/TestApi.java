package com.mftplus.eesample.controller.rest;

import com.mftplus.eesample.model.Role;
import com.mftplus.eesample.model.User;
import com.mftplus.eesample.utils.Loggable;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Loggable
@Path("test")
public class TestApi {
    @GET
    public Response test() {
        User user = User.builder().username("ahmad").password("ahmad123").role(Role.builder().roleName("admin").build()).build();
        return Response.ok(user).build();
    }
}
