import java.util.ArrayList;

public class Model {
    private final Drone standartDrone = new Drone();
    private final ArrayList<Drone> droneBase = new ArrayList<>();

    public int droneCount() {
        try {
            return droneBase.size();
        }catch (NullPointerException e){
            return 0;
        }

    }

    public Drone getShortInfoDrone(int index){
        try {
            return droneBase.get(index);
        } catch (IndexOutOfBoundsException e){
            return standartDrone;
        }
    }

    public boolean addDroneInfo(Drone inputDrone) {
        try {
            droneBase.add(inputDrone);
        } catch (Exception e){
            //View.println(e);
            return false;
        }
            return true;
    }
}
