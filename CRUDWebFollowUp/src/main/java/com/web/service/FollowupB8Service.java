package com.web.service;

import java.util.List;

import com.web.model.FollowupB8;

public interface FollowupB8Service {
	public void add(FollowupB8 followupb8);
	public void edit(FollowupB8 followupb8);
	public void delete(int b8);
	public FollowupB8 getFollowupB8(int b8);
	public List getAllFollowupB8();

}
