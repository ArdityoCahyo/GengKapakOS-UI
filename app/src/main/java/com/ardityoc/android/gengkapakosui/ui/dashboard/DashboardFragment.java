package com.ardityoc.android.gengkapakosui.ui.dashboard;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import com.ardityoc.android.gengkapakosui.R;
import com.ardityoc.android.gengkapakosui.databinding.FragmentDashboardBinding;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class DashboardFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);

        Toolbar toolbar = root.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = root.findViewById(R.id.toolbar_layout);
        toolBarLayout.setTitle(getResources().getText(R.string.title_dashboard));

        toolBarLayout.setExpandedTitleTextAppearance(R.style.Theme_GengKapakOSUI_CollapsingColor);
        toolBarLayout.setCollapsedTitleTextAppearance(R.style.Theme_GengKapakOSUI_CollapsingColor);

        return root;
    }
}