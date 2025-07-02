package net.aminoglycoside.agscatwalks.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class RailingStairs extends HorizontalDirectionalBlock {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;


    public RailingStairs(Properties pProperties) {
        super(pProperties);
    }



    public static VoxelShape CombineShape(VoxelShape shape1, VoxelShape shape2)
    {
        return (Shapes.joinUnoptimized(shape1, shape2, BooleanOp.OR)).optimize();
    }


    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        Direction direction = state.getValue(FACING);
        switch (direction) {
            case NORTH: return CombineShape(CombineShape(Block.box(15.0, -8.0, 0.0, 17.0, 8, 8.0), Block.box(-1.0, -8.0, 0.0, 1.0, 8, 8.0)), CombineShape(Block.box(15.0, 0.0, 8.0, 17.0, 16, 16.0), Block.box(0.0, -1.0, 8.0, 1.0, 16, 16.0)));
            case SOUTH: return CombineShape(CombineShape(Block.box(15.0, -8.0, 8.0, 17.0, 8, 16), Block.box(-1.0, -8.0, 8, 1.0, 8, 16)), CombineShape(Block.box(15.0, 0.0, 0, 17.0, 16, 8), Block.box(0.0, -1.0, 0, 1.0, 16, 8)));
            case EAST: return CombineShape(CombineShape(Block.box(8, -8, 15, 16, 8, 17), Block.box(8, -8, -1, 16, 8, 1)), CombineShape(Block.box(0, 0, 15, 8, 16, 17), Block.box(0, 0, -1, 8, 16, 1)));
            case WEST: return CombineShape(CombineShape(Block.box(0, -8, 15, 8, 8, 17), Block.box(0, -8, -1, 8, 8, 1)), CombineShape(Block.box(8, 0, 15, 16, 16, 17), Block.box(8, 0, -1, 16, 16, 1)));
       default: return CombineShape(CombineShape(Block.box(15.0, -8.0, 0.0, 17.0, 8, 8.0), Block.box(-1.0, -8.0, 0.0, 1.0, 8, 8.0)), CombineShape(Block.box(15.0, 0.0, 8.0, 17.0, 16, 16.0), Block.box(0.0, -1.0, 8.0, 1.0, 16, 16.0))); // Fallback
        }
    }


    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite());


    }

    @Override
    public BlockState rotate(BlockState pState, Rotation pRotation) {
        return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));

    }

    @Override
    public BlockState mirror(BlockState pState, Mirror pMirror) {
        return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING);
    }


}
