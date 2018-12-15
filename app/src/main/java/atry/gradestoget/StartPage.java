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
 */
package atry.gradestoget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StartPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);
        System.out.println("This is my app right now.... oh boy.");
    }
}
