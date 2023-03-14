package com.checker.sa.android.helper;

import java.util.ArrayList;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.checker.sa.android.data.Answers;
import com.mor.sa.android.activities.R;

public class CustomRadioCheckButtonClass {

	public Answers answers;
	public ImageView radioIem;

	public CustomRadioCheckButtonClass(ImageView img, Answers answers2) {
		radioIem = img;
//		radioIem.setPadding(0, 40, 0, 40);
		answers = answers2;
	}

	public boolean compare(Answers answerin) {
		if (answers != null && answerin != null
				&& answers.getAnswerID() != null
				&& answerin.getAnswerID() != null
				&& answers.getAnswerID().equals(answerin.getAnswerID())) {
			return true;
		} else
			return false;
	}
}
