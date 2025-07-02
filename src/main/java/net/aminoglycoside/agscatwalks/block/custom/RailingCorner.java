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

public class RailingCorner extends HorizontalDirectionalBlock {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;


    public RailingCorner(Properties pProperties) {
        super(pProperties);
    }


    private static final VoxelShape SHAPE_E = Block.box(-1.0, 0.0, 0.0, 1.0, 16, 16.0);
    private static final VoxelShape SHAPE_W = Block.box(15.0, 0.0, 0.0, 17.0, 16, 16.0);
    private static final VoxelShape SHAPE_N = Block.box(0.0, 0.0, 15.0, 16.0, 16, 17.0);
    private static final VoxelShape SHAPE_S = Block.box(0.0, 0.0, -1, 16.0, 16, 1);

    public static VoxelShape CombineShape(VoxelShape shape1, VoxelShape shape2)
    {
        return (Shapes.joinUnoptimized(shape1, shape2, BooleanOp.OR)).optimize();
    }


    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        Direction direction = state.getValue(FACING);
        switch (direction) {
            case NORTH: return CombineShape(SHAPE_N, SHAPE_W);
            case SOUTH: return CombineShape(SHAPE_S, SHAPE_E);
            case EAST: return CombineShape(SHAPE_E, SHAPE_N);
            case WEST: return CombineShape(SHAPE_W, SHAPE_S);
            default: return CombineShape(SHAPE_W, SHAPE_N); // Fallback
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
