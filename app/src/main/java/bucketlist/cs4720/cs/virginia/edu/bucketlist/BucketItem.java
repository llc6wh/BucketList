package bucketlist.cs4720.cs.virginia.edu.bucketlist;

public class BucketItem {
    private String name;
    private String description;
    private double latitude;
    private double longitude;
    private boolean isCompleted;

    public BucketItem(String newName, String newDescription, double newLatitude, double newLongitude, boolean newIsCompleted){
        name = newName;
        description = newDescription;
        latitude = newLatitude;
        longitude = newLongitude;
        isCompleted = newIsCompleted;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public boolean getIsCompleted() {
        return isCompleted;
    }
}
