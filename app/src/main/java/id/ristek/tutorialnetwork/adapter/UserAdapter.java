package id.ristek.tutorialnetwork.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import id.ristek.tutorialnetwork.R;

/**
 * Created by teresa on 4/17/2016.
 */
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder>{
    ArrayList<User> users;

    public UserAdapter(ArrayList<User> users) {
        this.users = users;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_user,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        User current = user.get(position);
        holder.name.setText(current.getName());
        holder.phone.setText(current.getPhone());
        holder.email.setText(current.getEmail());
        holder.id.setText(current.getId());
        holder.bankNo.setText(current.getBankNo());
        holder.bankId.setText(current.getBankId());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView phone;
        TextView email;
        TextView id;
        TextView bankNo;
        TextView bankId;

        public ViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            phone = (TextView) itemView.findViewById(R.id.phone);
            email = (TextView) itemView.findViewById(R.id.email);
            id = (TextView) itemView.findViewById(R.id.id);
            bankNo = (TextView) itemView.findViewById(R.id.bank_no);
            bankId = (TextView) itemView.findViewById(R.id.bank_id);
        }
    }
}
