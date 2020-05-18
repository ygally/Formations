package geo;

public interface TransformableShape {
    /**
     * Reduces shape by given ratio
     *
     * @param ratio the ratio of reduction
     */
    void reduceBy(int ratio);

    /**
     * Rotates the shape by 90 degrees on the right
     */
    void rotateRight90();
}