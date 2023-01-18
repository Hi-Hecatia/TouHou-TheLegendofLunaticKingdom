package com.github.hi_hecatia.th_legend_lk.tab;

import com.github.hi_hecatia.th_legend_lk.TouHou_TheLegendofLunaticKingdom;
import com.github.hi_hecatia.th_legend_lk.init.InitItems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.fml.RegistryObject;

public class TouHou_TheLegendofLunaticKingdom_Tab extends ItemGroup {

	// 创建物品栏实例
	public static ItemGroup itemTab = new TouHou_TheLegendofLunaticKingdom_Tab("items", InitItems.YINYANGORB);
	// 物品栏名字展示
	private final ITextComponent nameToDisplay;
	private final RegistryObject<Item> iconItem;
	private ItemStack icon= null;

	public TouHou_TheLegendofLunaticKingdom_Tab(String label, RegistryObject<Item> iconItem) {
		super(String.format("th_legend_lk.%s", label));
		//物品路径
		String fullName = String.format("itemgroup.%s.%s", TouHou_TheLegendofLunaticKingdom.MOD_ID, label);
		nameToDisplay = new TranslationTextComponent(fullName);
		this.iconItem = iconItem;
	}
	
	@Override
	public ItemStack makeIcon() {
		// TODO 自动生成的方法存根
		if(icon == null) {
			icon = iconItem.get().getDefaultInstance();
		}
		return icon;
	}

	public ITextComponent getNameToDisplay() {
		return nameToDisplay;
	}
}
