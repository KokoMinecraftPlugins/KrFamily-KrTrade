package krmcplugins.kokored.website.krfamilykrtrade.menumanager;

import org.bukkit.entity.Player;

public class MenuUtility {
    
    private Player owner;

    public MenuUtility(Player owner) {
        this.owner = owner;
    }

    public Player getOwner() {
        return owner;
    }

}
