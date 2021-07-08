package net.soulteam.soulcore.soulpass.event;

import net.soulteam.soulcore.soulpass.PassPlayer;
import net.soulteam.soulcore.soulpass.quest.ItemQuest;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerEndItemQuestEvent extends Event {
	private static final HandlerList handlers = new HandlerList();
	final ItemQuest quest;
	final int id;
	private final PassPlayer pplayer;
	private boolean cancel = false;

	public PlayerEndItemQuestEvent(final PassPlayer pplayer, final ItemQuest quest) {
		this.pplayer = pplayer;
		this.quest = quest;
		this.id = quest.getQuestId();
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	public PassPlayer getUser() {
		return this.pplayer;
	}

	public int getId() {
		return this.id;
	}

	public final boolean isCancelled() {
		return this.cancel;
	}

	public void setCancelled(final boolean cancel) {
		this.cancel = cancel;
	}

	@Override
	public final HandlerList getHandlers() {
		return handlers;
	}
}
