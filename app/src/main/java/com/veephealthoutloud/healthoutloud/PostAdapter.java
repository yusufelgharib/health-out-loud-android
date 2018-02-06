package com.veephealthoutloud.healthoutloud;

import android.content.Context;
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
    private Context mContext;
    private LayoutInflater mInflater;
    private ArrayList<IPost> mDataSource;

    public PostAdapter(Context context, ArrayList<IPost> posts) {

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
        View postView = mInflater.inflate(R.layout.list_item_post, viewGroup, false);

        TextView dateTextView = postView.findViewById(R.id.post_date);
        TextView messageTextView = postView.findViewById(R.id.post_message);
        TextView feelingsTextView = postView.findViewById(R.id.post_feelings);

        IPost post = (IPost) getItem(i);

        dateTextView.setText(DateFormat.getDateTimeInstance().format(post.GetDate()));
        messageTextView.setText(post.GetMessage());
        feelingsTextView.setText(post.GetFeelings().toString());

        return postView;
    }
}
