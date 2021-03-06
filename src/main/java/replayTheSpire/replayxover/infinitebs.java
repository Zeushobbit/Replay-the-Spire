package replayTheSpire.replayxover;

import infinitespire.InfiniteSpire;
import infinitespire.abstracts.Quest;
import infinitespire.events.PrismEvent;
import infinitespire.helpers.QuestHelper;
import replayTheSpire.patches.NeowRewardPatches;
import replayTheSpire.quests.*;

public class infinitebs {
	public static void BlackCards() {
		infinitespire.helpers.CardHelper.addCard(new com.megacrit.cardcrawl.mod.replay.cards.replayxover.black.Haul());
		infinitespire.helpers.CardHelper.addCard(new com.megacrit.cardcrawl.mod.replay.cards.replayxover.black.EchoesOfTime());
		infinitespire.helpers.CardHelper.addCard(new com.megacrit.cardcrawl.mod.replay.cards.replayxover.black.DarkTransmutation());
		infinitespire.helpers.CardHelper.addCard(new com.megacrit.cardcrawl.mod.replay.cards.replayxover.black.ChaosVortex());
		infinitespire.helpers.CardHelper.addCard(new com.megacrit.cardcrawl.mod.replay.cards.replayxover.black.SuperSneckoCrazyCard());
	}
	public static void registerQuests() {
		QuestHelper.registerQuest(CurseQuest.class);
		QuestHelper.registerQuest(PortalQuest.class);
		QuestHelper.registerQuest(BonfireQuest.class);
	}
	public static void TriggerBonfireQuest() {
		for(int i = InfiniteSpire.questLog.size() - 1; i >= 0; i--) {
			Quest q = InfiniteSpire.questLog.get(i);
			if(q instanceof BonfireQuest) {
				q.incrementQuestSteps();
			}
		}
	}
	public static void TriggerPortalQuest() {
		for(int i = InfiniteSpire.questLog.size() - 1; i >= 0; i--) {
			Quest q = InfiniteSpire.questLog.get(i);
			if(q instanceof PortalQuest) {
				q.incrementQuestSteps();
			}
		}
	}
	public static void NeowEventNonsense() {
		NeowRewardPatches.possibleEvents.add(PrismEvent.ID);
	}
}
