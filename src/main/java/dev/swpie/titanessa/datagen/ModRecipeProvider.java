package dev.swpie.titanessa.datagen;

import dev.swpie.titanessa.item.ModBlocks;
import dev.swpie.titanessa.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STARSTONE.get(), 3)
                .define('#', ModItems.CELESTIUM_INGOT.get())
                .define('s', Items.NETHER_STAR)
                .pattern("##")
                .pattern("#s")
                .showNotification(false)
                .unlockedBy(getHasName(ModItems.CELESTIUM_CHUNK.get()), has(ModItems.CELESTIUM_CHUNK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.COSMIC_CORE.get(), 3)
                .define('#', Items.DEEPSLATE)
                .define('l', Items.LAPIS_BLOCK)
                .pattern("###")
                .pattern("#l#")
                .pattern("###")
                .showNotification(false)
                .unlockedBy(getHasName(Items.DEEPSLATE), has(Items.DEEPSLATE))
                .save(pWriter);
    }
}
