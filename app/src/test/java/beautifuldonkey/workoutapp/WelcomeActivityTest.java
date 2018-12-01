package beautifuldonkey.workoutapp;


import android.os.Bundle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class WelcomeActivityTest {

  @InjectMocks
  private WelcomeActivity welcomeActivity;

  @InjectMocks
  private Bundle testBundle;

  @Test
  public void onCreateTest(){
//    Bundle testBundle = new Bundle();
//    welcomeActivity.onCreate(testBundle);
  }

}
