package game.data.chunk.version;

import config.Version;
import game.data.chunk.ChunkSection;
import game.data.chunk.palette.Palette;
import game.data.coordinates.CoordinateDim2D;
import se.llbit.nbt.SpecificTag;

public class Chunk_1_19_3 extends Chunk_1_19 {
    public static final Version VERSION = Version.V1_19_3;

    @Override
    public int getDataVersion() { return VERSION.dataVersion; }

    public Chunk_1_19_3(CoordinateDim2D location) {
        super(location);
    }

    @Override
    public ChunkSection createNewChunkSection(byte y, Palette palette) {
        return new ChunkSection_1_19_3(y, palette, this);
    }

    @Override
    protected ChunkSection parseSection(int sectionY, SpecificTag section) {
        return new ChunkSection_1_19_3(sectionY, section);
    }
}
