This Mod is in flux, It will be a soft decoration Mod, that will focus on resource recovery.

Color shifting has not been finalized yet (method)

Vanilla material recovery will be focused on first.
-- addon mods will be made to support other mods with this one, to avoid insane bloat & conflicts
{
    This has been more than slightly taxing, and enlightening about how Minecraft uses its own textures and just how to work with it to preform results.
    Got to have love for my all the backbone work that helped make this easier from the start.
    This sort of rambling list is to help grow & show what I have done in progress & prevent being demotivated from not seeing progress.
}
==============================
Double-Checked, Checklist
-Not Final yet
---
Tested & verified
==========
Custom Template JSONs
- Stairs
== allows Insides to be different from the outsides (including the top)

- Walls
== Allows the walls to have separate textures between the side & top, (walls)
== Posts have sided & top textures

- Walls [Twisted]
== built to turn a vertical texture on it's side, & not stretch it.
== has single texture posts

- Fence / Fence Gates
== Custom Template in place
~~ fence side, alignment of texture on bars
~~ top & sided textures for two texture blocks
~~ manually assigned quartz(s) to built in template for fence side
== JSONs in place for all block variants now
~~ adjustments to be made on a few ones.
== use of built-in templates for single textured fences/gates
== Completed versions by type
~~ Wood & Log
~~ Stripped Wood & Stripped Logs
~~ quartz
~~ all planned fences/gates

- Asset Block model folder structure

- Tags Folder structure

- java class file structure

- java class separation for color changing

- Shortlist - todo list, for planing future moves

- Added burning times to ash/burnable custom blocks

- Color Logic
= Setup around Minecraft color mixing
= setup to swap around a set of blocks
= setup around enabling any missing blocks of that set.

- Color Swapping
= type selector used to call the color logic with a set of blocks, and is divided into types
= blockDye used to call the type selector with the  6 varying times.
== axis, slabs, stairs, walls, general blocks, gravity.
==~ Based on practical  differences in placement information & where they are in java classes.
== uses array sets to catch & use built in vanilla Minecraft blocks without doing a catch-all with something vast (Blocks catching Slabs, stairs, rotated pillars, as well as general blocks)
== Used of a interchanging & versatile color swap based on Built in MC colors & MC color mixing, allowing for leaving out of colors of a set

- Fence / Fence Gate
= Created NodeJS JSON maker for fences, and fence gates
== tweaked js file & own template files.

-Minor Fixes
= Modified dried_kelp texture for walls, removed band
= Fixed Bone Block texture
= Modified wall_post template
= fixed red sandstone & sandstone wall posts
= corrected chiseled_polished_blackstone
==- top swapped for polished blackstone
= Basalt walls tweaked
==- created cobbled basalt (tops)
== made basalt walls al around, left as is
= left polished basalt as is
= fixed dripstone texture typo
= Polished Basalt
==- adjusted top texture (side) to edit out bands, and even out the colors between e/w & n/s walls
= Corrected accidental duplication of json file contents
= tag file fix
==- fixed tag files for walls
====- [ smooth / cut / chiseled ] sand_stone & sand_stone
= changed bottom slab of colored sand_stone (top side to bottom texture)
= basalt_stair
==- fixed blockstate typos
=smooth_basalt_stair
==- blockstate reference fix
= dark_oak_stair
==- fix inside texture of outer_stair
= dripstone stair
==- fixed typo in texture name
= raw_copper stair
==- fixed typo in json file name
=chiseled_polished_blackstone_stair
==- fixed inside wall of stair to smooth blackstone
= many typo in fence JSONs
= fixed long standing missing language entries & typo
= adjusted fence side for dual textures to better align the looks of it.

-Texture work
=[Wall] top of wall side/tall side
==- made to look as if north/south looks the same as east/west
==- Animated Crimson stem texture
=kelp....  kelp
==- Centered the dried kelp bands
====- Wall Posts
====- Dried_kelp_Blocks
====- Stairs, uvlock = false
= Basalt Stairs
== split top into separate cobbled basalt stair
= Color Sands
==- Swapped to use concrete powders.
====- reworking planned
====- aligning custom texture to better match normal minecraft.
======- more practice needed, concrete power texture as stand-ins
= [Stairs/Block/wall_post/slab]
==- Texture centering for 16x16 textures, with a 'center band' at x px 8, y px 8
===- using kelp name, allows wider/larger pixels in game with minimal impact
===- allowing for effectively a 15x15 texture them in a 16x16 minimal input
= Log/Column stairs
==- adjusted all inside standing textures, with new textures (straight up)
==- own set of json model files (parent ones)


-Json Structure
= Sub folders are in use to clean up the insane amount of files & make it far easier to organized & know if a file is or is not missing/ and far easier & faster to find based on knowing what block it is.

Recipes
============


TAGS
============
all Wall
all Fences
all Stairs
all Stones
all wood
ash
"Below in Minecraft namespace"
axe mine-able
pickaxe mine-able
fences
walls


ITEMS
===============



Textures [excludes Normal Minecraft]
==================
texture animations ~
- crimson_hyphae wall tops
Planks
-log walls (top x-section)
Wood/Stripped Wood
-Wood wall (top x-section)
Inside Texture For Stairs
- bone block
- logs
- quartz versions
- polished blackstone (for chiseled blackstone)
Dried Kelp Fence & Fence Gate
- JSON adjusted for fence gates
- Fence gate Unique texture to allow alignment of 'doors'
- fence post JSON adjusted
- Share No band texture with walls for pieces of the fences/gates




Extra Functionality
===================
Burning Blocks turn into Ash Versions {Select Blocks}



Language File [Completion by java class registrations]
==================


Walls [By type] { Registered / Blockstate / Model files / loot table }
=============
Woods
Logs
quartz
sands
sandstone
smooth sandstone
chiseled sandstone
concrete
terracotta
MISC
-blackstone
-glowstone
-coal_block
-kelp_block
-raw gold/copper/iron
-dripstone
-end stone
-bone block

Stairs [By type]
==============
Wood
Stripped Wood
Log
Stripped Log
MISC
-blackstone
-glowstone
-coal_block
-kelp_block
-raw gold/copper/iron
-dripstone
-end stone
-bone block
chiseled sandstone
cut sandstone
concrete
sands
sandstones
smooth sandstone
terracotta
quartz

Stairs [By type]
================
chiseled sandstone
concrete
cut sandstone
quartz
sands
sandstone
smooth sandstone
terracotta
wood
logs
MISC
-blackstone
-glowstone
-coal_block
-kelp_block
-raw gold/copper/iron
-dripstone
-end stone
-bone block

Slabs [By type]
=================
chiseled sandstone / energy version
concrete
cut sandstone / energy versions
quartz
sands / energy versions
sandstone / energy versions
smooth sandstone / energy versions
terracotta
woods
logs
MISC
-blackstone
-glowstone
-coal_block
-kelp_block
-raw gold/copper/iron
-dripstone
-end stone
-bone block

Fences [By type]
===============
Woods
Logs
Quartz

Full Blocks [By Type]
======================
{axis} cut sandstone
{general} chiseled sandstone
{general} Ashed
{general} sandstone
{general} smooth sandstone
{Gravity} colored sands

Overrides [By Type] { To enable being burnt & replace by ash version }
====================
- Removed, in favor of using Crafting Recipes to get ash logs/blocks.
== Custom ones will still replace themselves with ash versions

Showcases
============
Acacia fountain sub-set