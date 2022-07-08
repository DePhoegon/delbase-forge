@echo off
:: 0 - Base/Built in MC ||  1 - Custom
:: 1. color / Variant name (text)
:: 2. Material type (sand, smooth_sand_stone, etc) (text)
:: 3. Built in template or custom template ( 0 -base / 1 -custom)
:: 4. normal model file location or custom ( 0 -normal / 1 -custom)
:: 5. number of textures for the file
:: 6. modID for texture (0 -Minecraft built in/ 1- Custom modID
:: 7. Texture 1 Name
:: 8. Texture 2 Name [if used]
:: call node c:\node\fences _ _ 1 _ 0 _ _
:: Block_cutter_station recipes
:: call node c:\node\delbaseRecipe baseItemName 0/1
:: 0 - is base Item Minecraft NameSpace/Item
:: 1 - is Custom NameSpace/Item [Base Item]
:: Produces recipe JSONs for Custom Machine Blocks formatted correctly
:: Must use a wall / slab / stair / fence / fence_gate plan
:: call node c:\node\delbaseRecipe  0
