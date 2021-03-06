package com.lengfeng.bookshop.ui.orderhistory;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.lengfeng.bookshop.databinding.FragmentOrderhistoryBinding;

public class OrderHistoryFragment extends Fragment {

    private FragmentOrderhistoryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        OrderHistoryViewModel orderHistoryViewModel =
                new ViewModelProvider(this).get(OrderHistoryViewModel.class);

        binding = FragmentOrderhistoryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textNotifications;
        orderHistoryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}