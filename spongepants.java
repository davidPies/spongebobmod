//public static ArmorMaterial pants = EnumHelper.addArmorMaterial("pants", "spongebobmod:spongepants", 10, new int[] {0, 0, 5, 0}, );
//GameRegistry.registerItem(tutorialLeggings = new ItemModArmor("tutorial_leggings", TUTORIALA, 2, 2), "tutorial_leggings");
package spongebobmod;

//import [...];

public class ItemModArmor extends ItemArmor {

    public ItemModArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
        GameRegistry.registerItem(spongepants = new spongepants("spongepants", pants, 2, 2), "spongepants");

        this.setUnlocalizedName(unlocalizedName);
    }
    //krusty krab pizza rock entity and pizza box with pizza and model for both