package com.zhang.fakeweibo.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import com.zhang.fakeweibo.FragmentAdapter.HomeAdapter;
import com.zhang.fakeweibo.R;
import com.zhang.fakeweibo.pojo.DongTai;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aaa on 15-5-20.
 */
public class HomeFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ListView listView = (ListView) view.findViewById(R.id.home);
        List<DongTai> list = new ArrayList<>();
        String str = "广播接收者和activity间如何传递消息，我想显示到activity上：通过接口，但是具体的流程和方式还是不懂。activity和服务之间如何传递消息,我想显示到activity上.activity之间又是怎么传递数据ude.fragment和activity之间的。交互也是一个问题，这里都涉及了回调，待再继续的深入的学习";
        list.add(new DongTai("天心月圆", str));
        list.add(new DongTai("水月洞天", str));
        list.add(new DongTai("四海为家", str));
        list.add(new DongTai("冰心玉壶", str));
        HomeAdapter homeAdapter = new HomeAdapter(getActivity(), list);
        listView.setAdapter(homeAdapter);
        return view;
    }
}