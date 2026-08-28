package nl.pim16aap2.armoredElytra.util.itemInput;

import nl.pim16aap2.armoredElytra.util.ArmorTier;
import org.bukkit.Material;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ElytraInputTest
{
    @Test
    void unsupportedAnvilMaterialsAreIgnored()
    {
        Assertions.assertFalse(
            ElytraInput.isHandledArmoredAnvilMaterial(ArmorTier.NETHERITE, Material.NETHERITE_LEGGINGS));
        Assertions.assertFalse(ElytraInput.isHandledArmoredAnvilMaterial(ArmorTier.NETHERITE, Material.STONE));
    }

    @Test
    void supportedAnvilMaterialsRemainHandled()
    {
        Assertions.assertTrue(
            ElytraInput.isHandledArmoredAnvilMaterial(ArmorTier.NETHERITE, Material.ENCHANTED_BOOK));
        Assertions.assertTrue(
            ElytraInput.isHandledArmoredAnvilMaterial(ArmorTier.NETHERITE, Material.NETHERITE_INGOT));
        Assertions.assertTrue(ElytraInput.isHandledArmoredAnvilMaterial(ArmorTier.NETHERITE, Material.ELYTRA));
        Assertions.assertTrue(ElytraInput.isHandledArmoredAnvilMaterial(ArmorTier.NETHERITE, Material.LEATHER));
        Assertions.assertTrue(
            ElytraInput.isHandledArmoredAnvilMaterial(ArmorTier.NETHERITE, Material.PHANTOM_MEMBRANE));
    }
}
