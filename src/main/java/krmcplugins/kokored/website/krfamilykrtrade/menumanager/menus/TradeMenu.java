package krmcplugins.kokored.website.krfamilykrtrade.menumanager.menus;

import org.bukkit.event.inventory.InventoryClickEvent;

import krmcplugins.kokored.website.krcore.util.PH;
import krmcplugins.kokored.website.krfamilykrtrade.KrTrade;
import krmcplugins.kokored.website.krfamilykrtrade.menumanager.Menu;
import krmcplugins.kokored.website.krfamilykrtrade.menumanager.MenuUtility;

public class TradeMenu extends Menu {

    TradeUtility tradeUtility;

    public TradeMenu(MenuUtility menuUtility, TradeUtility tradeUtility) {
        super(menuUtility);
        this.tradeUtility = tradeUtility;
    }

    @Override
    public String getMenuName() {
        return KrTrade.getLanguage().get("TRADE_MENU.MENU_TITLE", new PH("%otherplayer%", tradeUtility.getReceiver().getName()));
    }

    @Override
    public int getSlots() {
        return 54;
    }

    @Override
    public void menuClick(InventoryClickEvent e) {
        
    }

    @Override
    public void setMenuItems() {
    }
    
}
