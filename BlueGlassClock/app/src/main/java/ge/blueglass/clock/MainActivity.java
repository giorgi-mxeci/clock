package ge.blueglass.clock;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.Gravity;
import android.graphics.Color;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView message = new TextView(this);
        message.setText("Blue Glass Clock\n\nTo add the clock: long-press an empty area on your Home screen → Widgets → Blue Glass Clock → Add.\n\nAndroid/Samsung does not allow ordinary third-party widgets to replace the secure lock-screen clock. This app creates a Home-screen widget.");
        message.setTextColor(Color.WHITE);
        message.setTextSize(18);
        message.setGravity(Gravity.CENTER);
        message.setPadding(28, 28, 28, 28);
        message.setBackgroundColor(Color.rgb(5, 22, 45));
        setContentView(message);
    }
}
