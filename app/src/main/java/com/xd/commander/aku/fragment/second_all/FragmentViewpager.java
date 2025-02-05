package com.xd.commander.aku.fragment.second_all;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import com.xd.commander.aku.R;
import com.xd.commander.aku.adapter.AdapterViewPaper;
import com.xd.commander.aku.base.BaseFragment;

/**
 * Copyright (C) 2017 By yjm at 13:42
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class FragmentViewpager extends BaseFragment{
    public static FragmentViewpager newInstance(){
        return new FragmentViewpager();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_second_viewpagr;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {

        TabLayout mTab = (TabLayout) view.findViewById(R.id.tab);
        ViewPager mViewPager = (ViewPager) view.findViewById(R.id.viewPager);

        mTab.addTab(mTab.newTab());
        mTab.addTab(mTab.newTab());
        mTab.addTab(mTab.newTab());

        mViewPager.setAdapter(new AdapterViewPaper(getChildFragmentManager()));
        mTab.setupWithViewPager(mViewPager);
    }
}
