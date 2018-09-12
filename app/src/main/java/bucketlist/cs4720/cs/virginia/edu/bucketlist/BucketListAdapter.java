package bucketlist.cs4720.cs.virginia.edu.bucketlist;

import android.app.usage.NetworkStats;

public class BucketListAdapter extends RecyclerView.Adapter<BucketListAdapter.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row

        public TextView appTitle;
        public Checkbox completedBoxForStreak;
        public Checkbox completedBoxForHighFive;
        public Button floatingAdd;

        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            appTitle = (TextView) itemView.findViewById(R.id.app_name);
            completedBoxForStreak = (Checkbox) itemView.findViewById(R.id.check_streak);
            completedBoxForHighFive = (Checkbox) itemView.findViewById(R.id.check_highFive);
            floatingAdd = (Button) itemView.findViewById(R.id.add_item_button);

        }
    }
}
