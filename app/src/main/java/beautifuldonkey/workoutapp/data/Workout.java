package beautifuldonkey.workoutapp.data;

import java.util.ArrayList;

/**
 * POJO that defines a workout for a user
 */

public class Workout {
  public String name;
  public ArrayList<String> targets;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<String> getTargets() {
    return targets;
  }

  public void setTargets(ArrayList<String> targets) {
    this.targets = targets;
  }
}
