//public static ArmorMaterial pants = EnumHelper.addArmorMaterial("pants", "spongebobmod:spongepants", 10, new int[] {0, 0, 5, 0}, );
//GameRegistry.registerItem(spongepants = new spongepants("spongepants", pants, 2, 2), "spongepants");
package spongebobmod;

//import [...];

public class spongepants extends ItemArmor {
  public static ArmorMaterial pants = EnumHelper.addArmorMaterial("pants", "spongebobmod:spongepants", 10, new int[] {0, 0, 5, 0}, );
  public static ArmorMaterial dome = EnumHelper.addArmorMaterial("dome", "spongebobmod:dome", 10, new int[] {7, 0, 0, 0}, );
    public spongepants(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
        GameRegistry.registerItem(spongepants = new spongepants("spongepants", pants, 2, 2), "spongepants");
        GameRegistry.registerItem(spongepants = new spongepants("spongepants", dome, 1, 0), "spongepants");
        this.setUnlocalizedName("spongepants");
    }
    //krusty krab pizza rock entity and pizza box with pizza and model for both
    //krabby patty - patty; tab goes in spongebobmod file

//public static final CreativeTabs spongebobmod = new CreativeTabs("spongebobmod") {
    //@Override public Item getTabIconItem() {
        //return spongebobmod.patty;
    //}
//};
