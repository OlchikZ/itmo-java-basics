package itmo.java.basics.lessons.lesson9.generic;

import java.util.List;

public abstract class DownloadService<Request, Response> {
    public abstract void validate(Request request);

    public abstract void printResponse(Response response);

    public void process(Request request, Response response) {
//        Response answer = getAnswer();

    }

    public static <Request> void handleList(List<Request> list) {

    }

//    public abstract Response getAnswer();
}
