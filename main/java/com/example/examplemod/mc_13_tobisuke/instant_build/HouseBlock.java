package com.example.examplemod.mc_13_tobisuke.instant_build;


import com.example.examplemod.ExampleMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockWorldState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public class HouseBlock extends Block {

    public HouseBlock(){
        super(Material.ROCK);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setRegistryName("HouseBlock");
        setUnlocalizedName(ExampleMod.MODID + "house_block");
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {

        int x = 0;
        int y = 0;
        int z = 0;
        int s = 0;

        int[][] num =
                {
                        {
                                1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
                                1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1,
                                1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1,
                                1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1,
                                1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1,
                                1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1,
                                1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1,
                                1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1,
                                1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1,
                                1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1,
                                1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,1,
                                0,0,0,0,0,0,0,0,0,0,0,0,1,2,2,2,2,2,2,2,2,1,
                                0,0,0,0,0,0,0,0,0,0,0,0,1,2,2,2,2,2,2,2,2,1,
                                0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1
                        },
                        //2段目
                        {
                                1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,
                                1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,
                                0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,
                                0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,
                                0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1
                        },
                        //3段目
                        {
                                1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,
                                1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,
                                0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,
                                0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,
                                0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1
                        },
                        //4段目
                        {
                                1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,
                                1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,
                                0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,
                                0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,
                                0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1
                        },
                        //5段目
                        {
                                1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,3,3,3,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,3,3,3,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,3,3,3,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,3,3,3,1,
                                1,1,1,1,1,1,1,1,1,1,1,1,1,3,3,3,3,3,3,3,3,1,
                                0,0,0,0,0,0,0,0,0,0,0,0,1,3,3,3,3,3,3,3,3,1,
                                0,0,0,0,0,0,0,0,0,0,0,0,1,3,3,3,3,3,3,3,3,1,
                                0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1
                        },
                        //6段目
                        {
                                1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
                                1,3,3,3,3,3,3,3,3,3,3,3,1,0,0,0,0,0,0,0,0,1,
                                1,3,3,3,3,3,3,3,3,3,3,3,1,0,0,0,0,0,0,0,0,1,
                                1,3,3,3,3,3,3,3,3,3,3,3,1,0,0,0,0,0,0,0,0,1,
                                1,3,3,3,3,3,3,3,3,3,3,3,1,0,0,0,0,0,0,0,0,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,
                                1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,
                                1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,
                                0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,
                                0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,
                                0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1
                        }

                };



        List<ModelBlockData> blocksData = new ArrayList<>();

        int x_max = 22;
        int y_max = 5;
        int z_max = 14;

        for (int height = 0; height < y_max; height++) {
            for (int i = 0; i < z_max; i++) {
                for (int j = 0; j < x_max; j++) {
                    blocksData.add(new ModelBlockData(j, height, i, getIBlockState(num[height][i * x_max + j])));
                }
            }
        }

        for (int i = 0; i < num.length / 4; i++){
            //blocks.add(new TempModel(num[i * 4], num[i * 4 + 1], num[i * 4 + 2], num[i * 4 + 3]));
        }

    }

    private IBlockState getIBlockState(int num){
        switch (num){
            case 0:
                return Blocks.AIR.getDefaultState();
            case 1:
                return Blocks.QUARTZ_BLOCK.getDefaultState();
            case 2:
                return Blocks.BIRCH_STAIRS.getDefaultState();
            case 3:
                return Blocks.OAK_STAIRS.getDefaultState();
        }
        return Blocks.AIR.getDefaultState();
    }
    private


}
