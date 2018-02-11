package com.veephealthoutloud.healthoutloud;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.veephealthoutloud.healthoutloud.Interfaces.IPost;

import java.text.DateFormat;
import java.util.Date;

import java.util.ArrayList;

/**
 * Adapter used to render Posts in the newsfeed.
 */

public class PostAdapter extends BaseAdapter {

    static class ViewHolder {
        TextView messageTextView;
        TextView dateTextView;
        TextView feelingsTextView;
    }

    private Context mContext;
    private LayoutInflater mInflater;
    private ArrayList<IPost> mDataSource;

    PostAdapter(Context context, ArrayList<IPost> posts) {

        mContext = context;
        mDataSource = posts;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return mDataSource.size();
    }

    @Override
    public Object getItem(int i) {
        return mDataSource.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder viewHolder;

        if (view == null){
            view = mInflater.inflate(R.layout.list_item_post, viewGroup, false);

            viewHolder = new ViewHolder();
            viewHolder.dateTextView = view.findViewById(R.id.post_date);
            viewHolder.messageTextView = view.findViewById(R.id.post_message);
            viewHolder.feelingsTextView = view.findViewById(R.id.post_feelings);
            view.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) view.getTag();
        }

        IPost post = (IPost) getItem(i);

        viewHolder.dateTextView.setText(DateFormat.getDateTimeInstance().format(post.GetDate()));
        viewHolder.messageTextView.setText(post.GetMessage());
        viewHolder.feelingsTextView.setText(GetFeelingsString(post.GetFeelings()));

        view.setBackgroundColor(Color.WHITE);

        return view;
    }

    private String GetFeelingsString(ArrayList<String> feelings){
        StringBuilder result = new StringBuilder();
        for (String feeling : feelings){
            result.append(String.format("#%s ", feeling));
        }
        return result.toString();
    }
}
