package com.web.dao;

import java.util.List;

import com.web.model.FollowupC2;

public interface FollowupC2Dao {
	public void add(FollowupC2 followupc2);
	public void edit(FollowupC2 followupc2);
	public void delete(int c2);
	public FollowupC2 getFollowupC2(int c2);
	public List getAllFollowupC2();

}
