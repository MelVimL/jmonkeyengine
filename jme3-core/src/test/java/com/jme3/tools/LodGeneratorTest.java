package com.jme3.tools;

import org.junit.Test;

import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.VertexBuffer;
import com.jme3.scene.shape.Box;
import com.jme3.scene.shape.Sphere;

import jme3tools.optimize.LodGenerator;

public class LodGeneratorTest {
    @Test
    public void testInit() {
        //Sphere sphere = new Sphere(2, 2, 1, false, false);
        //Node model = (Node) assetManager.loadModel("Models/Jaime/Jaime.j3o");
        LodGenerator lod = new LodGenerator(new Box(1f, 1f, 1f));
        assert true;
    }

    private int[] getBufferSizes(VertexBuffer[] buffers) {
        int[] result = new int[buffers.length];
        
        for(int i = 0; i< buffers.length; i++){
            result[i] = buffers[i].getComponentSize();
        }
    }
    
    @Test
    public void testSphereReduction(){
        Sphere sphere = new Sphere(6, 6, 1, false, false);
        LodGenerator lod = new LodGenerator(sphere);
        VertexBuffer[] buffer = lod.computeLods(LodGenerator.TriangleReductionMethod.PROPORTIONAL, 0.75f,
                0.5f, 0.25f, 0.0f);
        
        assert true;
    }
}
