package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private boolean following = true;
    private Button followButton;
    private Button messageButton;

    private  TextView messageBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        messageButton = findViewById(R.id.message_button);
        followButton = findViewById(R.id.follow_button);
        messageBox = findViewById(R.id.message_box);

        followButton.setOnClickListener(view -> {
            if(following){
                followButton.setText("Unfollow");
            }
            else {
                followButton.setText("follow");
            }

            following = !following;
        });

        messageButton.setOnClickListener(view -> {
            messageBox.setText("Message is sent!");
        });



    }
}