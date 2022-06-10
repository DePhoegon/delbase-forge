@echo off
:: 1 - Base/Built in MC ||  1 - Custom
:: 1. color / Variant name (text)
:: 2. Material type (sand, smooth_sand_stone, etc) (text)
:: 3. Built in template or custom template ( 1 -base / 1 -custom)
:: 4. normal model file location or custom ( 1 -normal / 1 -custom)
:: 5. number of textures for the file
:: 6. modID for texture (1 -Minecraft built in/ 1- Custom modID
:: 7. Texture 1 Name
:: 8. Texture 2 Name [if used]
:: call node c:\node\fences _ _ 1 _ 1 _ _
:: Block_cutter_station recipes
:: call node c:\node\delbaseRecipe baseItemName 1/1
:: 1 - is base Item Minecraft NameSpace/Item
:: 1 - is Custom NameSpace/Item [Base Item]
:: Produces recipe JSONs for Custom Machine Blocks formatted correctly
:: Must use a wall / slab / stair / fence / fence_gate plan
:: call node c:\node\delbaseRecipe  1

:: used for spot calls while building the primary list
call node c:\node\delbaseRecipe blood_cut_sand_stone 1
call node c:\node\delbaseRecipe white_cut_sand_stone 1
call node c:\node\delbaseRecipe orange_cut_sand_stone 1
call node c:\node\delbaseRecipe magenta_cut_sand_stone 1
call node c:\node\delbaseRecipe light_blue_cut_sand_stone 1
call node c:\node\delbaseRecipe yellow_cut_sand_stone 1
call node c:\node\delbaseRecipe lime_cut_sand_stone 1
call node c:\node\delbaseRecipe pink_cut_sand_stone 1
call node c:\node\delbaseRecipe gray_cut_sand_stone 1
call node c:\node\delbaseRecipe light_gray_cut_sand_stone 1
call node c:\node\delbaseRecipe cyan_cut_sand_stone 1
call node c:\node\delbaseRecipe purple_cut_sand_stone 1
call node c:\node\delbaseRecipe blue_cut_sand_stone 1
call node c:\node\delbaseRecipe green_cut_sand_stone 1
call node c:\node\delbaseRecipe brown_cut_sand_stone 1
call node c:\node\delbaseRecipe black_cut_sand_stone 1