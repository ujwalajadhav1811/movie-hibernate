package com.techdenovo.DAO;

import java.util.List;

import com.techdenovo.model.Actor;

public interface ActorDao
{
	public int addActor(Actor actor);
	public List<Actor> getAllActor();
}
