package demoapp.co.nestedscrollviewwithrecyclerview;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.Gravity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ViewPager viewPager;
    int images[] = {R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher};
    CustomViewPagerAdapter mcustomViewPagerAdapter;

    private ArrayList<Integer> mProductHorizontalList;
    private ProductListHorizontalAdapter mProductListHorizontalAdapter;

    private RecyclerView productList_recycler_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager)findViewById(R.id.viewPager);

        mcustomViewPagerAdapter = new CustomViewPagerAdapter(MainActivity.this, images);
        viewPager.setAdapter(mcustomViewPagerAdapter);


        productList_recycler_view= (RecyclerView) findViewById(R.id.product_list);

        mProductHorizontalList=new ArrayList<>();
        mProductHorizontalList.add(R.mipmap.ic_launcher);
        mProductHorizontalList.add(R.mipmap.ic_launcher);
        mProductHorizontalList.add(R.mipmap.ic_launcher);
        mProductHorizontalList.add(R.mipmap.ic_launcher);
        mProductHorizontalList.add(R.mipmap.ic_launcher);
        mProductHorizontalList.add(R.mipmap.ic_launcher);
        mProductHorizontalList.add(R.mipmap.ic_launcher);
        mProductHorizontalList.add(R.mipmap.ic_launcher);
        mProductHorizontalList.add(R.mipmap.ic_launcher);
        mProductHorizontalList.add(R.mipmap.ic_launcher);
        mProductHorizontalList.add(R.mipmap.ic_launcher);
        mProductHorizontalList.add(R.mipmap.ic_launcher);
        mProductHorizontalList.add(R.mipmap.ic_launcher);
        mProductHorizontalList.add(R.mipmap.ic_launcher);
        mProductHorizontalList.add(R.mipmap.ic_launcher);
        mProductHorizontalList.add(R.mipmap.ic_launcher);
        mProductHorizontalList.add(R.mipmap.ic_launcher);
        mProductHorizontalList.add(R.mipmap.ic_launcher);
        mProductHorizontalList.add(R.mipmap.ic_launcher);
        mProductHorizontalList.add(R.mipmap.ic_launcher);
        mProductHorizontalList.add(R.mipmap.ic_launcher);
        mProductHorizontalList.add(R.mipmap.ic_launcher);
        mProductHorizontalList.add(R.mipmap.ic_launcher);
        mProductHorizontalList.add(R.mipmap.ic_launcher);
        mProductHorizontalList.add(R.mipmap.ic_launcher);
        mProductHorizontalList.add(R.mipmap.ic_launcher);
        mProductHorizontalList.add(R.mipmap.ic_launcher);
        mProductHorizontalList.add(R.mipmap.ic_launcher);
        mProductHorizontalList.add(R.mipmap.ic_launcher);
        mProductHorizontalList.add(R.mipmap.ic_launcher);
        mProductHorizontalList.add(R.mipmap.ic_launcher);
        mProductHorizontalList.add(R.mipmap.ic_launcher);



        mProductListHorizontalAdapter=new ProductListHorizontalAdapter(mProductHorizontalList);



        LinearLayoutManager horizontalLayoutManagaer
                = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        productList_recycler_view.setLayoutManager(horizontalLayoutManagaer);

        productList_recycler_view.setAdapter(mProductListHorizontalAdapter);

        SnapHelper snapHelper = new GravitySnapHelper(Gravity.START);
        snapHelper.attachToRecyclerView(productList_recycler_view);

    }
}
