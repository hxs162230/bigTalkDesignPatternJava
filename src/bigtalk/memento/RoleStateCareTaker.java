package bigtalk.memento;

import java.util.ArrayList;
import java.util.List;

public class RoleStateCareTaker {
	public List<RoleStateMemo> saves = new ArrayList<>();
	
	public RoleStateMemo getSave(){
		return saves.get(0);
	}
	
	public void setSave(RoleStateMemo memo){
		saves.add(0, memo);
	}
}
