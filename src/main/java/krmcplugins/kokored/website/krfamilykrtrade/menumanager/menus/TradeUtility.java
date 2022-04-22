package krmcplugins.kokored.website.krfamilykrtrade.menumanager.menus;

import org.bukkit.entity.Player;

public class TradeUtility {

    private Player tradeRequireCreater;
    private Player tradeRequireReceiver;

    public TradeUtility(Player tradeRequireCreater, Player tradeRequireReceiver) {
        this.tradeRequireCreater = tradeRequireCreater;
        this.tradeRequireReceiver = tradeRequireReceiver;
    }

    public Player getCreater() {
        return tradeRequireCreater;
    }

    public void setCreater(Player creater) {
        this.tradeRequireCreater = creater;
    }

    public Player getReceiver() {
        return tradeRequireReceiver;
    }

    public void setReceiver(Player receiver) {
        this.tradeRequireReceiver = receiver;
    }
    
}
