package com.web.dao;

import java.util.List;

import com.web.model.FollowupB9;

public interface FollowupB9Dao {
	public void add(FollowupB9 followupb9);
	public void edit(FollowupB9 followupb9);
	public void delete(int b9);
	public FollowupB9 getFollowupB9(int b9);
	public List getAllFollowupB9();

}
