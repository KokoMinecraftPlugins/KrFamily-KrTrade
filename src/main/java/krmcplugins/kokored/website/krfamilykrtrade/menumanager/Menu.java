package krmcplugins.kokored.website.krfamilykrtrade.menumanager;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public abstract class Menu implements InventoryHolder {

    protected MenuUtility menuUtility;
    protected Inventory inventory;
    protected ItemStack FILLER_GLASS = createItem(Material.LIGHT_GRAY_STAINED_GLASS_PANE, " ");

    public Menu(MenuUtility menuUtility) {
        this.menuUtility = menuUtility;
    }

    public abstract String getMenuName();

    public abstract int getSlots();

    public abstract void menuClick(InventoryClickEvent e);

    public abstract void setMenuItems();

    public void openMenu() {
        inventory = Bukkit.createInventory(this, getSlots(), getMenuName());
        this.setMenuItems();
        menuUtility.getOwner().openInventory(inventory);
    }

    @Override
    public Inventory getInventory() {
        return inventory;
    }

    public void setFillerGlass(){
        for (int i = 0; i < getSlots(); i++) {
            if (inventory.getItem(i) == null){
                inventory.setItem(i, FILLER_GLASS);
            }
        }
    }

    public ItemStack createItem(Material material, String displayName, String... lore) {
        ItemStack item = new ItemStack(material);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName(displayName);

        itemMeta.setLore(Arrays.asList(lore));
        item.setItemMeta(itemMeta);

        return item;
    }

}
