// NodeJS  
// default recipe for block
// non-sandstone blocks
// node ./pathToJSfile/defaultrecipe blockName 0
// sandstoneblocks
// node ./pathToJSfile/defaultrecipe color/varient 1

var fs = require('fs');
const { resolve } = require('path');
const pathing = require('path');
const myArgs = process.argv.slice(2);

var baseDrive = 'D:/';
var baseFolder = baseDrive+'MC_JSONS';
var customModID = 'delbase';
var vanillaModID= 'minecraft';
var baseItemModID;

var baseRecipe = baseFolder+'/Recipes';
var table = baseRecipe+'/table';
var fences = '/fence';
var fence_gates = '/fence_gate';
var walls = '/wall';
var stairs = '/stair';
var slabs = '/slab';

var sandStoneName = 'sand_stone'
var isSandstone = false;

var blockName;

function DirectoryKey(path) { fs.mkdirSync(path, { recursive: true }); }
async function setVariable(args) {
    blockName = args[0];
    if (args[1]==1) { isSandstone = true; }
    if (args[2]==1) { baseItemModID = customModID; } else { baseItemModID = vanillaModID; }
}
function fileOut(fileOut, message, newfile) {
    if (newfile) { fs.openSync(fileOut, 'w'); }
    fs.appendFileSync(fileOut, message+'\n');
}
function errorout(extmsg) {
    console.log(extmsg);
    process.exit();
}
function sandstone(path, name, type) {
    var tname;
    var altpath;
    var tpath = path+'/sandstone';
    for(i=0; i < 4; i++) {
        switch(i) {
            case 0:
                tname = name+'_chiseled_'+sandStoneName;
                altpath = tpath+'/chiseled';
                break;
            case 1:
                tname = name+'_cut_'+sandStoneName;
                altpath = tpath+'/cut';
                break;
            case 2:
                tname = name+'_smooth_'+sandStoneName;
                altpath = tpath+'/smooth';
                break;
            case 3:
                tname = name+'_'+sandStoneName;
                altpath = tpath+'/normal';
                break;
            default:
                errorout("Invalid SwitchState / Modified Code -- For i Loop")
        }
        switch(type) {
            case 'fence':
                fence(altpath, false, tname);
                break;
            case 'fenceGate':
                fence_gate(altpath, false, tname);
                break;
            case 'wall':
                wall(altpath, false, tname);
                break;
            case 'stair':
                stair(altpath, false, tname);
                break;
            case 'slab':
                slab(altpath, false, tname);
                break;
            default:
                errorout("Invalid SwitchState / Modified Code -- type Switch")
        }
    }
}
function Primer() {
    setVariable(myArgs)
    .then(fence(pathing.join(table+fences), isSandstone, blockName))
    .then(fence_gate(pathing.join(table+fence_gates), isSandstone, blockName))
    .then(wall(pathing.join(table+walls), isSandstone, blockName))
    .then(stair(pathing.join(table+stairs), isSandstone, blockName))
    .then(slab(pathing.join(table+slabs), isSandstone, blockName));
}
function fence(path, ToF_sand_stone, name){
    if (ToF_sand_stone) { sandstone(path, name, 'fence');
    } else {
        DirectoryKey(path);
        var tname = name+'_fence';
        var fout = pathing.join(path+'/'+tname+'.json');
        fileOut(fout, '{', true);
        fileOut(fout, '"type": "minecraft:crafting_shaped",', false);
        fileOut(fout, '"pattern": [', false);
        fileOut(fout, '"#S#",', false);
        fileOut(fout, '"#S#"', false);
        fileOut(fout, '],', false);
        fileOut(fout, '"key": {', false);
        fileOut(fout, '"S": {', false);
        fileOut(fout, '"item": "minecraft:stick"', false);
        fileOut(fout, '},', false);
        fileOut(fout, '"#": {', false);
        fileOut(fout, '"item": "'+baseItemModID+':'+name+'"', false);
        fileOut(fout, '}', false);
        fileOut(fout, '},', false);
        fileOut(fout, '"result": {', false);
        fileOut(fout, '"item": "'+customModID+':'+tname+'",', false);
        fileOut(fout, '"count": 2', false);
        fileOut(fout, '}', false);
        fileOut(fout, '}', false);
    }
}
function fence_gate(path, ToF_sand_stone, name){
    if (ToF_sand_stone) { sandstone(path, name, 'fenceGate');
    } else {
        DirectoryKey(path);
        var tname = name+'_fence_gate';
        var fout = pathing.join(path+'/'+tname+'.json');
        fileOut(fout, '{', true);
        fileOut(fout, '"type": "minecraft:crafting_shaped",', false);
        fileOut(fout, '"pattern": [', false);
        fileOut(fout, '"S#S",', false);
        fileOut(fout, '"S#S"', false);
        fileOut(fout, '],', false);
        fileOut(fout, '"key": {', false);
        fileOut(fout, '"S": {', false);
        fileOut(fout, '"item": "minecraft:stick"', false);
        fileOut(fout, '},', false);
        fileOut(fout, '"#": {', false);
        fileOut(fout, '"item": "'+baseItemModID+':'+name+'"', false);
        fileOut(fout, '}', false);
        fileOut(fout, '},', false);
        fileOut(fout, '"result": {', false);
        fileOut(fout, '"item": "'+customModID+':'+tname+'",', false);
        fileOut(fout, '"count": 4', false);
        fileOut(fout, '}', false);
        fileOut(fout, '}', false);
    }
}
function wall(path, ToF_sand_stone, name) {
    if (ToF_sand_stone) { sandstone(path, name, 'wall');
    } else {
        DirectoryKey(path);
        var tname = name+'_wall';
        var fout = pathing.join(path+'/'+tname+'.json');
        fileOut(fout, '{', true);
        fileOut(fout, '"type": "minecraft:crafting_shaped",', false);
        fileOut(fout, '"pattern": [', false);
        fileOut(fout, '"###",', false);
        fileOut(fout, '"###"', false);
        fileOut(fout, '],', false);
        fileOut(fout, '"key": {', false);
        fileOut(fout, '"#": {', false);
        fileOut(fout, '"item": "'+baseItemModID+':'+name+'"', false);
        fileOut(fout, '}', false);
        fileOut(fout, '},', false);
        fileOut(fout, '"result": {', false);
        fileOut(fout, '"item": "'+customModID+':'+tname+'",', false);
        fileOut(fout, '"count": 6', false);
        fileOut(fout, '}', false);
        fileOut(fout, '}', false);
    }
}
function slab(path, ToF_sand_stone, name) {
    if (ToF_sand_stone) { sandstone(path, name, 'slab');
    } else {
        DirectoryKey(path);
        var tname = name+'_slab';
        var fout = pathing.join(path+'/'+tname+'.json');
        fileOut(fout, '{', true);
        fileOut(fout, '"type": "minecraft:crafting_shaped",', false);
        fileOut(fout, '"pattern": [', false);
        fileOut(fout, '"###"', false);
        fileOut(fout, '],', false);
        fileOut(fout, '"key": {', false);
        fileOut(fout, '"#": {', false);
        fileOut(fout, '"item": "'+baseItemModID+':'+name+'"', false);
        fileOut(fout, '}', false);
        fileOut(fout, '},', false);
        fileOut(fout, '"result": {', false);
        fileOut(fout, '"item": "'+customModID+':'+tname+'",', false);
        fileOut(fout, '"count": 6', false);
        fileOut(fout, '}', false);
        fileOut(fout, '}', false);
    }
}
function stair(path, ToF_sand_stone, name) {
    if (ToF_sand_stone) { sandstone(path, name, 'stair');
    } else {
        DirectoryKey(path);
        var tname = name+'_stair';
        var fout = pathing.join(path+'/'+tname+'.json');
        fileOut(fout, '{', true);
        fileOut(fout, '"type": "minecraft:crafting_shaped",', false);
        fileOut(fout, '"pattern": [', false);
        fileOut(fout, '"#  ",', false);
        fileOut(fout, '"## ",', false);
        fileOut(fout, '"###"', false);
        fileOut(fout, '],', false);
        fileOut(fout, '"key": {', false);
        fileOut(fout, '"#": {', false);
        fileOut(fout, '"item": "'+baseItemModID+':'+name+'"', false);
        fileOut(fout, '}', false);
        fileOut(fout, '},', false);
        fileOut(fout, '"result": {', false);
        fileOut(fout, '"item": "'+customModID+':'+tname+'",', false);
        fileOut(fout, '"count": 4', false);
        fileOut(fout, '}', false);
        fileOut(fout, '}', false);
    }
}
Primer();