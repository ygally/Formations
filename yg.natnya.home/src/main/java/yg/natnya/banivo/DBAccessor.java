package yg.natnya.banivo;

import com.google.gson.Gson;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.impl.DefaultBHttpClientConnection;
import org.apache.http.impl.DefaultConnectionReuseStrategy;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.protocol.*;
import org.apache.http.util.EntityUtils;
import yg.natnya.honivo.Home;
import yg.natnya.honivo.Homes;

import java.io.IOException;
import java.net.Socket;

public class DBAccessor {
    public static final RequestUserAgent USER_AGENT = new RequestUserAgent("HomeHC/1.1");
    private static final ConnectionReuseStrategy CONN_STRATEGY = DefaultConnectionReuseStrategy.INSTANCE;
    public static final Gson GSON = new Gson();
    final private HttpProcessor httpproc;
    final private HttpRequestExecutor httpexecutor;
    final private DefaultBHttpClientConnection conn;
    final private HttpHost host;
    public DBAccessor(){
        httpproc = HttpProcessorBuilder.create()
                .add(new RequestContent())
                .add(new RequestTargetHost())
                .add(new RequestConnControl())
                .add(USER_AGENT)
                .add(new RequestExpectContinue(true)).build();
        httpexecutor = new HttpRequestExecutor();
        conn = new DefaultBHttpClientConnection(8 * 1024);
        host = new HttpHost("seoul", 8124);
    }

    public Home getHome(int index) {
        String dataFromSeoulLabs = null;
        try {
            dataFromSeoulLabs = getStringFromPath("/labs/data.json");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.err.println(">> JSON retrieved: " + dataFromSeoulLabs);
        return GSON.fromJson(dataFromSeoulLabs, Homes.class)
                .getHomes()[index];
    }

    private String getStringFromPath(String path) throws IOException, HttpException {
        HttpCoreContext coreContext = HttpCoreContext.create();
        coreContext.setTargetHost(host);
        String strResponse = "";
        try {
            if (!conn.isOpen()) {
                Socket socket = new Socket(host.getHostName(), host.getPort());
                conn.bind(socket);
            }
            BasicHttpRequest request = new BasicHttpRequest("GET", path);
            System.err.println(">> Request URI: " + request.getRequestLine().getUri());
            httpexecutor.preProcess(request, httpproc, coreContext);
            HttpResponse response = httpexecutor.execute(request, conn, coreContext);
            httpexecutor.postProcess(response, httpproc, coreContext);
            strResponse = EntityUtils.toString(response.getEntity());
            conn.close();
        } finally {
            conn.close();
        }
        return strResponse;
    }
}
