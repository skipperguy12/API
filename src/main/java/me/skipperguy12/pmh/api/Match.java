package me.skipperguy12.pmh.api;


import java.util.Collection;
import java.util.Set;
import java.util.UUID;

import javax.annotation.Nonnull;

import org.bukkit.World;

public interface Match {
	void broadcast(String message);

	@Nonnull
	boolean end();

	@Nonnull
	boolean end(@Nonnull Team winningTeam);

	Team getFirstOther(Team exclude);

	@Nonnull
	Set<Player> getParticipatingPlayers();

	@Nonnull
	Set<Team> getParticipatingTeams();

	@Nonnull
	Collection<Player> getPlayers();

	@Nonnull
	Set<Player> getSpectatingPlayers();

	@Nonnull
	Set<Team> getSpectatingTeams();

	@Nonnull
	Set<Team> getTeams();

	@Nonnull
	UUID getUUID();

	@Nonnull
	World getWorld();

	@Nonnull
	boolean isRunning();

	@Nonnull
	boolean start();
}
