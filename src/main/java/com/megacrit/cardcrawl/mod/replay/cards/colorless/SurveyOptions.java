package com.megacrit.cardcrawl.mod.replay.cards.colorless;

import com.megacrit.cardcrawl.localization.*;
import com.megacrit.cardcrawl.mod.replay.actions.*;
import com.megacrit.cardcrawl.mod.replay.actions.unique.*;
import com.megacrit.cardcrawl.mod.replay.cards.*;
import com.megacrit.cardcrawl.mod.replay.monsters.*;
import com.megacrit.cardcrawl.monsters.AbstractMonster;
import com.evacipated.cardcrawl.mod.stslib.variables.RefundVariable;
import com.megacrit.cardcrawl.cards.AbstractCard;
//import com.megacrit.cardcrawl.cards.CardColor;
//import com.megacrit.cardcrawl.cards.CardRarity;
//import com.megacrit.cardcrawl.cards.CardTarget;
//import com.megacrit.cardcrawl.cards.CardType;
import com.megacrit.cardcrawl.characters.*;
import com.megacrit.cardcrawl.dungeons.*;
import com.megacrit.cardcrawl.core.*;
import basemod.abstracts.*;

public class SurveyOptions extends CustomCard
{
    public static final String ID = "Survey Options";
    private static final CardStrings cardStrings;
    public static final String NAME;
    public static final String DESCRIPTION;
    private static final int COST = -1;
    private static final int BASE_BLOCK = 7;
    
    public SurveyOptions() {
        super("Survey Options", SurveyOptions.NAME, "cards/replay/Survey_Options.png", -1, SurveyOptions.DESCRIPTION, CardType.SKILL, CardColor.COLORLESS, CardRarity.UNCOMMON, CardTarget.SELF);
        RefundVariable.setBaseValue(this, 1);
    }
    
    @Override
    public void use(final AbstractPlayer p, final AbstractMonster m) {
        AbstractDungeon.actionManager.addToBottom(new RefundDrawAction(p, 0, this.freeToPlayOnce, this.energyOnUse));
    }
    
    @Override
    public AbstractCard makeCopy() {
        return new SurveyOptions();
    }
    
    @Override
    public void upgrade() {
        if (!this.upgraded) {
            this.upgradeName();
            RefundVariable.upgrade(this, 1);
        }
    }
    
    static {
        cardStrings = CardCrawlGame.languagePack.getCardStrings("Survey Options");
        NAME = SurveyOptions.cardStrings.NAME;
        DESCRIPTION = SurveyOptions.cardStrings.DESCRIPTION;
    }
}
