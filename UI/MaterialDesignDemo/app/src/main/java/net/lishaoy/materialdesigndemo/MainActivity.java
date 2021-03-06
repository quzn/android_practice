package net.lishaoy.materialdesigndemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import net.lishaoy.materialdesigndemo.activity.button.ButtonActivity;
import net.lishaoy.materialdesigndemo.activity.button.FloatingActionButtonActivity;
import net.lishaoy.materialdesigndemo.activity.card.CardActivity;
import net.lishaoy.materialdesigndemo.activity.chip.ChipActivity;
import net.lishaoy.materialdesigndemo.adapter.NavRecyclerViewAdapter;
import net.lishaoy.materialdesigndemo.activity.appbars.BottomAppBarActivity;
import net.lishaoy.materialdesigndemo.activity.navigation.BottomNavActivity;
import net.lishaoy.materialdesigndemo.activity.appbars.TopAppBarActivity;
import net.lishaoy.materialdesigndemo.bean.NavListItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private RecyclerView recyclerView;
    private NavListItem navListItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.nav_list);

        final List<NavListItem> navListItems = new ArrayList<>();
        navListItem = new NavListItem(R.drawable.ic_calendar, "Bottom App Bar", BottomAppBarActivity.class);
        navListItems.add(navListItem);
        navListItem = new NavListItem(R.drawable.ic_crop, "Top App Bar", TopAppBarActivity.class);
        navListItems.add(navListItem);
        navListItem = new NavListItem(R.drawable.ic_input, "Bottom Navigation", BottomNavActivity.class);
        navListItems.add(navListItem);
        navListItem = new NavListItem(R.drawable.ic_chart, "Button", ButtonActivity.class);
        navListItems.add(navListItem);
        navListItem = new NavListItem(R.drawable.ic_golf, "Floating Action Button", FloatingActionButtonActivity.class);
        navListItems.add(navListItem);
        navListItem = new NavListItem(R.drawable.ic_card, "Card", CardActivity.class);
        navListItems.add(navListItem);
        navListItem = new NavListItem(R.drawable.ic_check, "Chip", ChipActivity.class);
        navListItems.add(navListItem);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new NavRecyclerViewAdapter(this, navListItems));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}