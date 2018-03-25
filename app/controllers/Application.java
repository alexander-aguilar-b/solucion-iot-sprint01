package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Dashboard IoT"));
        //return ok(index.render("Your new application is ready."));
        //return ok("Your new application is ready.");
    }

    public static LegacyWebSocket<String> wsInterface(){
        return new LegacyWebSocket<String>(){

            // called when websocket handshake is done
            public void onReady(WebSocket.In<String> in, WebSocket.Out<String> out){
                //SimpleChat.start(in, out);
            }
        };
    }

}
