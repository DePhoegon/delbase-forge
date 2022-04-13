package com.dephoegon.delbase.aid.util;

import com.dephoegon.delbase.aid.event.blockReplacer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import static com.dephoegon.delbase.aid.util.dyeList.*;

public class colorMixInteraction {
    @SuppressWarnings("ConstantConditions")
    public static InteractionResult ColorLogic(Level world, BlockPos blockPos, BlockState TargetBlock, BlockState BaseDefaultBlock, BlockState RedBaseDefaultBlock, BlockState DarkRedDefaultBlock, BlockState WhiteDefaultBlock, BlockState OrangeDefaultBlock, BlockState MagentaDefaultBlock, BlockState LightBlueDefaultBlock, BlockState YellowDefaultBlock, BlockState LimeDefaultBlock, BlockState PinkDefaultBlock, BlockState GrayDefaultBlock, BlockState LightGrayDefaultBlock, BlockState CyanDefaultBlock, BlockState PurpleDefaultBlock, BlockState BlueDefaultBlock, BlockState GreenDefaultBlock, BlockState BrownDefaultBlock, BlockState BlackDefaultBlock, int DefaultBlockIndex, Item inHand, Player playerEntity) {
        BlockState place_me = null;
        boolean place = false;
        boolean lock_cut = false;
        if (inHand.equals(cleanse.getItem()) && BaseDefaultBlock != null) {
                if (TargetBlock != BaseDefaultBlock) {
                    place = true;
                }
                if (TargetBlock == RedBaseDefaultBlock) {
                    playerEntity.addItem(red);
                }
                if (TargetBlock == DarkRedDefaultBlock) {
                    playerEntity.addItem(blood);
                }
                if (TargetBlock == WhiteDefaultBlock) {
                    playerEntity.addItem(white);
                }
                if (TargetBlock == OrangeDefaultBlock) {
                    playerEntity.addItem(orange);
                }
                if (TargetBlock == MagentaDefaultBlock) {
                    playerEntity.addItem(magenta);
                }
                if (TargetBlock == LightBlueDefaultBlock) {
                    playerEntity.addItem(light_blue);
                }
                if (TargetBlock == YellowDefaultBlock) {
                    playerEntity.addItem(yellow);
                }
                if (TargetBlock == LimeDefaultBlock) {
                    playerEntity.addItem(lime);
                }
                if (TargetBlock == PinkDefaultBlock) {
                    playerEntity.addItem(pink);
                }
                if (TargetBlock == GrayDefaultBlock) {
                    playerEntity.addItem(gray);
                }
                if (TargetBlock == LightGrayDefaultBlock) {
                    playerEntity.addItem(light_gray);
                }
                if (TargetBlock == CyanDefaultBlock) {
                    playerEntity.addItem(cyan);
                }
                if (TargetBlock == PurpleDefaultBlock) {
                    playerEntity.addItem(purple);
                }
                if (TargetBlock == BlueDefaultBlock) {
                    playerEntity.addItem(blue);
                }
                if (TargetBlock == GreenDefaultBlock) {
                    playerEntity.addItem(green);
                }
                if (TargetBlock == BrownDefaultBlock) {
                    playerEntity.addItem(brown);
                }
                if (TargetBlock == BlackDefaultBlock) {
                    playerEntity.addItem(black);
                }
                if (place) {
                    place_me = BaseDefaultBlock;
                    lock_cut = true;
                }
        }
        if (inHand.equals(red.getItem())) {
            place = true;
            if (TargetBlock == RedBaseDefaultBlock && DarkRedDefaultBlock != null) {
                playerEntity.addItem(cleanse);
                place_me = DarkRedDefaultBlock;
                lock_cut = true;
            }
            if (TargetBlock == YellowDefaultBlock) {
                place_me = OrangeDefaultBlock;
                playerEntity.addItem(orange);
            }
            if (TargetBlock == BlueDefaultBlock) {
                place_me = PurpleDefaultBlock;
                playerEntity.addItem(purple);
            }
            if (TargetBlock == WhiteDefaultBlock) {
                place_me = PinkDefaultBlock;
                playerEntity.addItem(pink);
            }
            if (TargetBlock == DarkRedDefaultBlock) {
                place_me = RedBaseDefaultBlock;
                playerEntity.addItem(red);
            }
            if (place_me == null) {
                place_me = RedBaseDefaultBlock;
                lock_cut = true;
                playerEntity.addItem(cleanse);
            }
        }
        if (inHand.equals(blood.getItem()) && DarkRedDefaultBlock != null) {
            if (TargetBlock != DarkRedDefaultBlock) { place = true; }
            if (TargetBlock == BaseDefaultBlock) { lock_cut = true; }
            if (TargetBlock == RedBaseDefaultBlock) {
                lock_cut = true;
                playerEntity.addItem(red);
                place_me = DarkRedDefaultBlock;
            }
            if (TargetBlock == YellowDefaultBlock) {
                place_me = OrangeDefaultBlock;
                playerEntity.addItem(red);
            }
            if (TargetBlock == BlueDefaultBlock) {
                place_me = PurpleDefaultBlock;
                playerEntity.addItem(red);
            }
            if (TargetBlock == WhiteDefaultBlock) {
                place_me = PinkDefaultBlock;
                playerEntity.addItem(red);
            }
            if (place_me == null && place) {
                place_me = DarkRedDefaultBlock;
                playerEntity.addItem(cleanse);
            }
        }
        if (inHand.equals(white.getItem())) {
            if (TargetBlock != WhiteDefaultBlock) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock) {
                lock_cut = true;
                place_me = PinkDefaultBlock;
                playerEntity.addItem(pink);
            }
            if (TargetBlock == BaseDefaultBlock) { lock_cut = true; }
            if (TargetBlock == DarkRedDefaultBlock) {
                place_me = PinkDefaultBlock;
                playerEntity.addItem(pink);
            }
            if (TargetBlock == GreenDefaultBlock) {
                place_me = LimeDefaultBlock;
                playerEntity.addItem(lime);
            }
            if (TargetBlock == BlueDefaultBlock) {
                place_me = LightBlueDefaultBlock;
                playerEntity.addItem(light_blue);
            }
            if (TargetBlock == BlackDefaultBlock) {
                place_me = GrayDefaultBlock;
                playerEntity.addItem(gray);
            }
            if (TargetBlock == GrayDefaultBlock) {
                place_me = LightGrayDefaultBlock;
                playerEntity.addItem(light_gray);
            }
            if (place && place_me == null) {
                place_me = WhiteDefaultBlock;
                playerEntity.addItem(cleanse);
            }
        }
        if (inHand.equals(orange.getItem())) {
            if (TargetBlock != OrangeDefaultBlock) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock) { lock_cut = true; }
            if (place) {
                place_me = OrangeDefaultBlock;
                playerEntity.addItem(cleanse);
            }
        }
        if (inHand.equals(magenta.getItem())) {
            if (TargetBlock != MagentaDefaultBlock) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock) { lock_cut = true; }
            if (place) {
                place_me = MagentaDefaultBlock;
                playerEntity.addItem(cleanse);
            }
        }
        if (inHand.equals(light_blue.getItem())) {
            if (TargetBlock != LightBlueDefaultBlock) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock) { lock_cut = true; }
            if (place) {
                place_me = LightBlueDefaultBlock;
                playerEntity.addItem(cleanse);
            }
        }
        if (inHand.equals(yellow.getItem())) {
            if (TargetBlock != YellowDefaultBlock) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock) {
                lock_cut = true;
                place_me = OrangeDefaultBlock;
                playerEntity.addItem(orange);
            }
            if (TargetBlock == BaseDefaultBlock) { lock_cut = true; }
            if (TargetBlock == DarkRedDefaultBlock) {
                place_me = OrangeDefaultBlock;
                playerEntity.addItem(red);
            }
            if (place && place_me == null) {
                place_me = YellowDefaultBlock;
                playerEntity.addItem(cleanse);
            }
        }
        if (inHand.equals(lime.getItem())) {
            if (TargetBlock != LimeDefaultBlock) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock) { lock_cut = true; }
            if (place) {
                place_me = LimeDefaultBlock;
                playerEntity.addItem(cleanse);
            }
        }
        if (inHand.equals(pink.getItem())) {
            if (TargetBlock != PinkDefaultBlock) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock) { lock_cut = true; }
            if (TargetBlock == PurpleDefaultBlock) {
                place_me = MagentaDefaultBlock;
                playerEntity.addItem(magenta);
            }
            if (TargetBlock == BlackDefaultBlock) {
                place_me = RedBaseDefaultBlock;
                lock_cut = true;
                playerEntity.addItem(red);
            }
            if (place && place_me == null) {
                place_me = PinkDefaultBlock;
                playerEntity.addItem(cleanse);
            }
        }
        if (inHand.equals(gray.getItem())) {
            if (TargetBlock != GrayDefaultBlock) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock) { lock_cut = true; }
            if (TargetBlock == WhiteDefaultBlock) {
                place_me = LightGrayDefaultBlock;
                playerEntity.addItem(light_gray);
            }
            if (place && place_me == null) {
                place_me = GrayDefaultBlock;
                playerEntity.addItem(cleanse);
            }
        }
        if (inHand.equals(light_gray.getItem())) {
            if (TargetBlock != LightGrayDefaultBlock) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock) { lock_cut = true; }
            if (TargetBlock == BlackDefaultBlock) {
                place_me = GrayDefaultBlock;
                playerEntity.addItem(gray);
            }
            if (place && place_me == null) {
                place_me = LightGrayDefaultBlock;
                playerEntity.addItem(cleanse);
            }
        }
        if (inHand.equals(cyan.getItem())) {
            if (TargetBlock != CyanDefaultBlock) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock) { lock_cut = true; }
            if (place) {
                place_me = CyanDefaultBlock;
                playerEntity.addItem(cleanse);
            }
        }
        if (inHand.equals(purple.getItem())) {
            if (TargetBlock != PurpleDefaultBlock) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock) { lock_cut = true; }
            if (TargetBlock == PinkDefaultBlock) {
                place_me = MagentaDefaultBlock;
                playerEntity.addItem(magenta);
            }
            if (place && place_me == null) {
                place_me = PurpleDefaultBlock;
                playerEntity.addItem(cleanse);
            }
        }
        if (inHand.equals(blue.getItem())) {
            if (TargetBlock != BlueDefaultBlock) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock) {
                lock_cut = true;
                place_me = PurpleDefaultBlock;
                playerEntity.addItem(purple);
            }
            if (TargetBlock == BaseDefaultBlock) { lock_cut = true; }
            if (TargetBlock == GreenDefaultBlock) {
                place_me = CyanDefaultBlock;
                playerEntity.addItem(cyan);
            }
            if (TargetBlock == WhiteDefaultBlock) {
                place_me = LightBlueDefaultBlock;
                playerEntity.addItem(light_blue);
            }
            if (place && place_me == null) {
                place_me = BlueDefaultBlock;
                playerEntity.addItem(cleanse);
            }

        }
        if (inHand.equals(green.getItem())) {
            if (TargetBlock != GrayDefaultBlock) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock) { lock_cut = true; }
            if (TargetBlock == WhiteDefaultBlock) {
                place_me = LimeDefaultBlock;
                playerEntity.addItem(lime);
            }
            if (TargetBlock == BlueDefaultBlock) {
                place_me = PurpleDefaultBlock;
                playerEntity.addItem(purple);
            }
            if (place && place_me == null) {
                place_me = GreenDefaultBlock;
                playerEntity.addItem(cleanse);
            }
        }
        if (inHand.equals(brown.getItem())) {
            if (TargetBlock != BrownDefaultBlock) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock) { lock_cut = true; }
            if (place) {
                place_me = BrownDefaultBlock;
                playerEntity.addItem(cleanse);
            }
        }
        if (inHand.equals(black.getItem())) {
            if (TargetBlock != BlackDefaultBlock) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock) { lock_cut = true; }
            if (TargetBlock == LightGrayDefaultBlock) {
                place_me = GrayDefaultBlock;
                playerEntity.addItem(gray);
            }
            if (TargetBlock == LightBlueDefaultBlock) {
                place_me = BlueDefaultBlock;
                playerEntity.addItem(blue);
            }
            if (TargetBlock == LimeDefaultBlock) {
                place_me = GreenDefaultBlock;
                playerEntity.addItem(green);
            }
            if (TargetBlock == PinkDefaultBlock) {
                place_me = RedBaseDefaultBlock;
                playerEntity.addItem(red);
                lock_cut = true;
            }
            if (place && place_me == null) {
                place_me = BlackDefaultBlock;
                playerEntity.addItem(cleanse);
            }
        }

        if (place) {
            switch (DefaultBlockIndex) {
                case 1:
                    //walls
                    blockReplacer.wallPlacement(world, blockPos, place_me);
                    return InteractionResult.CONSUME;
                case 2:
                    //Stairs
                    blockReplacer.stairPlacement(world, blockPos, place_me);
                    return InteractionResult.CONSUME;
                case 3:
                    //Slabs
                    blockReplacer.slabPlacement(world, blockPos, place_me);
                    return InteractionResult.CONSUME;
                case 4:
                    //Axis, lock_cut used to mix 'non-axis' default blocks with axis blocks
                    //designed around cut_sandstone & cut_red_sandstone
                    blockReplacer.axisPlacement(world, blockPos, place_me, lock_cut);
                    return InteractionResult.CONSUME;
                case 5:
                    //DefaultBocks with no special placements
                    blockReplacer.axisPlacement(world, blockPos, place_me, true);
                    //AxisPlacement set to do default states on which suits default blocks
                    return InteractionResult.CONSUME;
                default:
                    //catch all, return fail
                    return InteractionResult.FAIL;
            }

        } else return InteractionResult.FAIL;
    }
}
