package android.example.com.dolker;

public class DataPack {

    //Call Dolker
    private String mDolkerName;
    private String mDolkerAge;
    private String mDolkerRegion;

    //DogsList
    private String mDogName;
    private String mDogBreed;
    private String mDogAge;
    private String mDogWeight;

    //Rides
    //private String mDolkerName;
    private String mRideDate;
    private String mRideHour;
    private String mRideTime;
    private String mRidePrice;

    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mImageResourceId2 = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    //Interface para CallDolker
    public DataPack(String dolkerName, String dolkerAge, String dolkerRegion, int imageResourceId){
        mDolkerName = dolkerName;
        mDolkerAge = dolkerAge;
        mDolkerRegion = dolkerRegion;
        mImageResourceId = imageResourceId;
    }

    //Interface para DogsList
    public DataPack(String dogName, String dogBreed, String dogAge, String dogWeight, int imageResourdeId){
        mDogName = dogName;
        mDogAge = dogAge;
        mDogBreed = dogBreed;
        mDogWeight = dogWeight;
        mImageResourceId = imageResourdeId;
    }

    //Interface para Rides
    public DataPack(String dogName, String dolkerName, String ridePrice, String rideDate, String rideHour, String rideTime, int imageResourdeId, int imageResourdeId2){
        mDogName = dogName;
        mDolkerName = dolkerName;
        mRidePrice = ridePrice;
        mRideDate = rideDate;
        mRideHour = rideHour;
        mRideTime = rideTime;
        mImageResourceId = imageResourdeId;
        mImageResourceId2 = imageResourdeId2;
    }

    public String getDolkerName(){
        return mDolkerName;
    }

    public String getDolkerAge(){
        return mDolkerAge;
    }

    public String getDolkerRegion(){
        return mDolkerRegion;
    }

    public String getDogName(){
        return mDogName;
    }

    public String getDogBreed(){
        return mDogBreed;
    }

    public String getDogAge(){
        return mDogAge;
    }

    public String getDogWeight(){
        return mDogWeight;
    }

    public String getRidePrice(){
        return mRidePrice;
    }

    public String getRideDate(){
        return mRideDate;
    }

    public String getRideHour(){
        return mRideHour;
    }

    public String getRideTime(){
        return mRideTime;
    }


    public int getImageResourceId(){
        return mImageResourceId;
    }

    public int getImageResourceId2(){
        return mImageResourceId2;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public boolean hasImage2(){
        return mImageResourceId2 != NO_IMAGE_PROVIDED;
    }
}
