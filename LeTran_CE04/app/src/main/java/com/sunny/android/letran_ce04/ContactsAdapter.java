
	// Name: Tran Le
	// JAV2 - 1809
	// File name: ContactsAdapter.java

package com.sunny.android.letran_ce04;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.widget.ResourceCursorAdapter;

public class ContactsAdapter extends ResourceCursorAdapter {

	// Constructor
	public ContactsAdapter(Context _context, Cursor _cursor) {
		super(_context, R.layout.custom_listcell, _cursor, 0);
	}

	@Override
	public void bindView(View view, Context context, Cursor cursor) {

	}
}
