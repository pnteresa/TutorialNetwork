package id.ristek.tutorialnetwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import id.ristek.tutorialnetwork.adapter.UserAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setLayoutManager(manager);
        UserAdapter adapter = new UserAdapter(getUsers());
        recyclerView.setAdapter(adapter);
    }

    List<User> getUsers() {
        List<User> users = new List<User>();
        return users;
    }
}
