package com.dash.dashapp.adapters;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dash.dashapp.R;
import com.dash.dashapp.models.BudgetProposal;

import io.realm.OrderedRealmCollection;
import io.realm.RealmRecyclerViewAdapter;

public class ProposalAdapter extends RealmRecyclerViewAdapter<BudgetProposal, ProposalHolder> {

    public ProposalAdapter(@Nullable OrderedRealmCollection<BudgetProposal> data) {
        super(data, true);
    }

    @NonNull
    @Override
    public ProposalHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.proposal_view, parent, false);
        return new ProposalHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProposalHolder holder, int position) {
        BudgetProposal budgetProposal = getItem(position);
        holder.bind(budgetProposal);
    }
}