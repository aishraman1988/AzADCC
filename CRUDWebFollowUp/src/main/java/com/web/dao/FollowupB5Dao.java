package com.web.dao;

import java.util.List;

import com.web.model.FollowupB5;

public interface FollowupB5Dao {
	public void add(FollowupB5 followupb5);
	public void edit(FollowupB5 followupb5);
	public void delete(int b5);
	public FollowupB5 getFollowupB5(int b5);
	public List getAllFollowupB5();

}
