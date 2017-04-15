package com.itant.customedview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ImageText extends LinearLayout {

	private TextView textView;
	
	public ImageText(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		LayoutInflater.from(context).inflate(R.layout.view_image_text, this);
		
		ImageView imageView = (ImageView) findViewById(R.id.iv_image);
		textView = (TextView) findViewById(R.id.tv_text);
		
		TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.ImageText);
		int imageResource = typedArray.getResourceId(R.styleable.ImageText_src, 0);
		int imageWidth = UIUtils.dip2px(context, typedArray.getDimension(R.styleable.ImageText_imageWidth, 40));
		int imageHeight = UIUtils.dip2px(context, typedArray.getDimension(R.styleable.ImageText_imageHeight, 40));
		float textSize = typedArray.getDimension(R.styleable.ImageText_textSize, 12);
		String text = typedArray.getString(R.styleable.ImageText_text);
		
		typedArray.recycle();
		
		imageView.setBackgroundResource(imageResource);
		LayoutParams params = new LayoutParams(imageWidth, imageHeight);
		imageView.setLayoutParams(params);
		
		textView.setTextSize(textSize);
		textView.setText(text);
	}
	
	
	
	/*
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
			textView.setTextColor(getResources().getColor(R.color.red));
			break;
		case MotionEvent.ACTION_UP:
			textView.setTextColor(getResources().getColor(R.color.gray));
			break;

		default:
			break;
		}
		
		//performClick();
		return super.onTouchEvent(event);
	}*/
}
