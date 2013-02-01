package kr.saeildamil.androidstudy.actionbar;

import java.util.List;

import kr.saeildamil.androidstudy.R;
import android.app.Activity;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;

public class MyActionBarSearchView extends Activity {
	private SearchView sv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		getMenuInflater().inflate(R.menu.searchview, menu);
		MenuItem mi = menu.findItem(R.id.action_search);
		sv = (SearchView) mi.getActionView();
		
		mi.setShowAsActionFlags(MenuItem.SHOW_AS_ACTION_IF_ROOM|MenuItem.SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW);
		
		SearchManager sm = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
		
		if (sm != null){
			List<SearchableInfo> searchables = sm.getSearchablesInGlobalSearch();
			SearchableInfo info = sm.getSearchableInfo(getComponentName());
			for(SearchableInfo inf : searchables){
				if (inf.getSuggestAuthority() != null && inf.getSuggestAuthority().startsWith("applications")){
					info = inf;
				}
			}
			sv.setSearchableInfo(info);
		}
		sv.setOnQueryTextListener(listener);
		sv.setQueryHint("질문에 대한 힌트를 입력하시오");
		return true;
	}
	
	OnQueryTextListener listener = new OnQueryTextListener() {
		
		@Override
		public boolean onQueryTextSubmit(String query) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean onQueryTextChange(String newText) {
			// TODO Auto-generated method stub
			return false;
		}
	};
}
