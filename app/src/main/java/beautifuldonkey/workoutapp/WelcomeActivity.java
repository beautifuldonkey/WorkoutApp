package beautifuldonkey.workoutapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_welcome);
    final Context context = getApplicationContext();

    Button btn_timer = findViewById(R.id.btn_timer);
    btn_timer.setOnClickListener(new Button.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(context, TimerActivity.class);
        startActivityForResult(intent, WoutConstants.ACTIVITY_TIMER);
      }
    });


  }
}
