package android.example.com.dolker;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RidesAdapter extends ArrayAdapter<DataPack> {

    public RidesAdapter(Activity context, ArrayList<DataPack> dataPacks) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, dataPacks);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_rides, parent, false);
            //activity_call_dolker deve ser altearada para as outras telas. Talvez tenha q criar outras classes
        }

        // Get the {@link DataPack} object located at this position in the list
        DataPack currentDataPack = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView dogName = (TextView) listItemView.findViewById(R.id.dog_name_field);
        TextView dolkerName = (TextView) listItemView.findViewById(R.id.dolker_name_field);
        TextView ridePrice = (TextView) listItemView.findViewById(R.id.price_field);
        TextView rideDate = (TextView) listItemView.findViewById(R.id.date_field);
        TextView rideHour = (TextView) listItemView.findViewById(R.id.hour_field);
        TextView rideTime = (TextView) listItemView.findViewById(R.id.time_field);

        // Get the version name from the current DataPack object and
        // set this text on the name TextView
        dogName.setText(currentDataPack.getDogName());
        dolkerName.setText(currentDataPack.getDolkerName());
        ridePrice.setText(currentDataPack.getRidePrice());
        rideDate.setText(currentDataPack.getRideDate());
        rideHour.setText(currentDataPack.getRideHour());
        rideTime.setText(currentDataPack.getRideTime());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView dogProfileImg = (ImageView) listItemView.findViewById(R.id.dog_profileImage);
        ImageView dolkerProfileImg = (ImageView) listItemView.findViewById(R.id.dolker_profileImage);

        if (currentDataPack.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            dogProfileImg.setImageResource(currentDataPack.getImageResourceId());

            // Make sure the view is visible
            dogProfileImg.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            dogProfileImg.setVisibility(View.GONE);
        }

        if (currentDataPack.hasImage2()) {
            // If an image is available, display the provided image based on the resource ID
            dolkerProfileImg.setImageResource(currentDataPack.getImageResourceId2());

            // Make sure the view is visible
            dolkerProfileImg.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            dolkerProfileImg.setVisibility(View.GONE);
        }

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
