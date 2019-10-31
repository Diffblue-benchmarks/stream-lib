package com.clearspring.experimental.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.AdaptiveCounting;
import com.clearspring.analytics.stream.cardinality.ICardinality;
import com.clearspring.experimental.stream.cardinality.HyperBitBit;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class HyperBitBit_mergeTest_2_Test {
  @Test
  public void mergeTest() throws Exception {
    // Arrange
    HyperBitBit hyperBitBit = new HyperBitBit();
    AdaptiveCounting adaptiveCounting = new AdaptiveCounting(1);
    AdaptiveCounting adaptiveCounting1 = new AdaptiveCounting(1);
    AdaptiveCounting adaptiveCounting2 = new AdaptiveCounting(1);
    ICardinality[] iCardinalityArray = new ICardinality[]{adaptiveCounting, adaptiveCounting1, adaptiveCounting2};

    // Act and Assert
    thrown.expect(HyperBitBit.HyperBitBitMergeException.class);
    hyperBitBit.merge(iCardinalityArray);
    Assert.assertEquals(3, iCardinalityArray.length);
    ICardinality iCardinality = iCardinalityArray[0];
    ICardinality iCardinality1 = iCardinalityArray[1];
    ICardinality iCardinality2 = iCardinalityArray[2];
    Assert.assertSame(adaptiveCounting, iCardinality);
    Assert.assertTrue(iCardinality instanceof AdaptiveCounting);
    Assert.assertSame(adaptiveCounting2, iCardinality2);
    Assert.assertTrue(iCardinality2 instanceof AdaptiveCounting);
    Assert.assertSame(adaptiveCounting, iCardinality);
    Assert.assertSame(adaptiveCounting2, iCardinality2);
    Assert.assertSame(adaptiveCounting1, iCardinality1);
    Assert.assertTrue(iCardinality1 instanceof AdaptiveCounting);
    Assert.assertSame(adaptiveCounting1, iCardinality1);
    byte[] bytes = hyperBitBit.getBytes();
    int sizeofResult = hyperBitBit.sizeof();
    Assert.assertEquals(0, bytes.length);
    Assert.assertArrayEquals(new byte[]{}, bytes);
    Assert.assertNotNull(hyperBitBit.toString());
    Assert.assertEquals(0, sizeofResult);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
