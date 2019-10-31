package com.clearspring.analytics.stream.membership;

import com.clearspring.analytics.stream.membership.BloomFilter;
import com.clearspring.analytics.stream.membership.BloomFilterSerializer;
import com.clearspring.analytics.stream.membership.Filter;
import com.clearspring.analytics.stream.membership.ICompactSerializer;
import java.util.BitSet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BloomFilter_addTest_2_Test {
//failed_compile   @Test
//  public void addTest() throws Exception {
//    // Arrange
//    BloomFilter bloomFilter = new BloomFilter(1, 1.0);
//    String key = "aaaaa";
//
//    // Act
//    bloomFilter.add(key);
//
//    // Assert
//    int bucketsResult = bloomFilter.buckets();
//    int hashCount = bloomFilter.getHashCount();
//    String toStringResult = bloomFilter.toString();
//    BitSet filterResult = bloomFilter.filter();
//    ICompactSerializer tserializerResult = bloomFilter.tserializer();
//    ICompactSerializer<Filter> serializer = bloomFilter.getSerializer();
//    Assert.assertEquals(64, bucketsResult);
//    Assert.assertTrue(serializer instanceof BloomFilterSerializer);
//    Assert.assertTrue(tserializerResult instanceof BloomFilterSerializer);
//    String toStringResult1 = ((BloomFilterSerializer) serializer).toString();
//    Assert.assertSame(serializer, tserializerResult);
//    Assert.assertEquals(2, hashCount);
//    String toStringResult2 = filterResult.toString();
//    boolean isEmptyResult = filterResult.isEmpty();
//    Assert.assertEquals("{28, 52}", toStringResult);
//    Assert.assertEquals(64, filterResult.size());
//    Assert.assertFalse(isEmptyResult);
//    Assert.assertEquals("{28, 52}", toStringResult2);
//    Assert.assertNotNull(toStringResult1);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
