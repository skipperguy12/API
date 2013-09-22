package me.skipperguy12.pmh.api.backend;

import java.util.Collection;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import me.skipperguy12.pmh.api.Match;
import me.skipperguy12.pmh.api.MatchManager;
import me.skipperguy12.pmh.api.Player;
import me.skipperguy12.pmh.api.PlayerManager;

import org.bukkit.World;

/**
 * Interface that is implemented by the API implementation is order to cleanly back static API methods.
 * 
 * It is much easier to implement an interface and set it in a static class than it is to overwrite static methods using reflection, so this interface is used in conjunction with {@link BackendManager}.
 * 
 * @see BackendManager
 */
public interface Backend {
	/** @see MatchManager#getMatch() */
	@Nullable
	Match getMatch();

	/** @see MatchManager#getMatch(World) */
	@Nullable
	Match getMatch(@Nonnull World world);

	/** @see MatchManager#getMatches */
	@Nonnull
	Collection<Match> getMatches();

	/** @see PlayerManager#getPlayer */
	@Nullable
	Player getPlayer(@Nonnull org.bukkit.entity.Player bukkit);
}
