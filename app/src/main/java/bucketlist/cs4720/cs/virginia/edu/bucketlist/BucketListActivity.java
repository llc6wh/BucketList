package bucketlist.cs4720.cs.virginia.edu.bucketlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import android.widget.CheckBox;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.app.Activity;


public class BucketListActivity extends AppCompatActivity {

    ArrayList<BucketItem> bucketItems; //list of prepopulated and added items
    TextView appName; //will show the name
    private CheckBox checkHighFive, checkStreak; //will be empty if not done, checked if done
    private Button floatingAdd;
    RecyclerView rvItems; //the recycler view of the bucket items


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bucket_list);

        addListenerOnCheckHighFive();
        addListenerOnCheckStreak();
    }

    @Override
    protected void onStart(){
        super.onStart();
    }

    @Override
    protected void onResume(){
        super.onResume();
    }

    @Override
    protected void onPause(){
        super.onPause();
    }

    @Override
    protected void onStop(){
        super.onStop();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
    }


}
