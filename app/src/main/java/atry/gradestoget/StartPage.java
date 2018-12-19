/*
This app is meant to grab all of my grades from the different grading websites:
Atlas gradebook
Moodle
Compass

I need to figure out how to connect to these websites an dgrabe the right data
- do they have api's?
- can i grab info without api's?
- can I make my own api?
- can I login?
- make the user do the robot bypass part if there is one?
- this is still easier technically right????
- meh, just for fun

So one of the first steps of this is to get the UI working or to get a UI idea in the works

Actually I feel like the better solution here is to get a way to set up the series of issues
around actually getting a way to connect the websites to the app and to get these to work.

Do we want all the grades in one place or just a quick easy access to each website??
I'd prefer all in one place to be completely honest
But if the best I can get is a button that takes you to the login of each that'll work too.

Maybe the user will setup what data to grab?

we'll see.
 */
package atry.gradestoget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class StartPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);
        System.out.println("This is my app right now.... oh boy.");

        configureGetDataButton();
    }

    public void configureGetDataButton() {
        Button getData = (Button) findViewById(R.id.getData);
        getData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("This is where you'd put the button to do stuff.");
            }
        });

    }
    public static boolean pingHost(String host, int port, int timeout) {
        try (Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress(host, port), timeout);
            return true;
        } catch (IOException e) {
            return false; //Either timeout or unreachable or failed DNS lookup.
        }
    }

}
