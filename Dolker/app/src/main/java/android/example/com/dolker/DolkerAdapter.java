package android.example.com.dolker;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DolkerAdapter extends ArrayAdapter<DataPack> {

    public DolkerAdapter(Activity context, ArrayList<DataPack> dataPacks) {
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
                    R.layout.activity_call_dolker, parent, false);
            //activity_call_dolker deve ser altearada para as outras telas. Talvez tenha q criar outras classes
        }

        // Get the {@link DataPack} object located at this position in the list
        DataPack currentDataPack = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView dolkerName = (TextView) listItemView.findViewById(R.id.name_field);
        TextView dolkerAge = (TextView) listItemView.findViewById(R.id.age_field);
        TextView dolkerRegion = (TextView) listItemView.findViewById(R.id.region_field);

        // Get the version name from the current DataPack object and
        // set this text on the name TextView
        dolkerName.setText(currentDataPack.getDolkerName());
        dolkerAge.setText(currentDataPack.getDolkerAge());
        dolkerRegion.setText(currentDataPack.getDolkerRegion());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView profileImg = (ImageView) listItemView.findViewById(R.id.profileImage);

        if (currentDataPack.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            profileImg.setImageResource(currentDataPack.getImageResourceId());

            // Make sure the view is visible
            profileImg.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            profileImg.setVisibility(View.GONE);
        }


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}