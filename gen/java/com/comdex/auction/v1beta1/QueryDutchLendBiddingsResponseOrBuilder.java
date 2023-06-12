// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/auction/v1beta1/query.proto

package com.comdex.auction.v1beta1;

public interface QueryDutchLendBiddingsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.auction.v1beta1.QueryDutchLendBiddingsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string bidder = 1 [json_name = "bidder", (.gogoproto.moretags) = "yaml:&#92;"bidder&#92;""];</code>
   * @return The bidder.
   */
  java.lang.String getBidder();
  /**
   * <code>string bidder = 1 [json_name = "bidder", (.gogoproto.moretags) = "yaml:&#92;"bidder&#92;""];</code>
   * @return The bytes for bidder.
   */
  com.google.protobuf.ByteString
      getBidderBytes();

  /**
   * <code>repeated .comdex.auction.v1beta1.DutchBiddings biddings = 2 [json_name = "biddings", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"biddings&#92;""];</code>
   */
  java.util.List<com.comdex.auction.v1beta1.DutchBiddings> 
      getBiddingsList();
  /**
   * <code>repeated .comdex.auction.v1beta1.DutchBiddings biddings = 2 [json_name = "biddings", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"biddings&#92;""];</code>
   */
  com.comdex.auction.v1beta1.DutchBiddings getBiddings(int index);
  /**
   * <code>repeated .comdex.auction.v1beta1.DutchBiddings biddings = 2 [json_name = "biddings", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"biddings&#92;""];</code>
   */
  int getBiddingsCount();
  /**
   * <code>repeated .comdex.auction.v1beta1.DutchBiddings biddings = 2 [json_name = "biddings", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"biddings&#92;""];</code>
   */
  java.util.List<? extends com.comdex.auction.v1beta1.DutchBiddingsOrBuilder> 
      getBiddingsOrBuilderList();
  /**
   * <code>repeated .comdex.auction.v1beta1.DutchBiddings biddings = 2 [json_name = "biddings", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"biddings&#92;""];</code>
   */
  com.comdex.auction.v1beta1.DutchBiddingsOrBuilder getBiddingsOrBuilder(
      int index);

  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 3 [json_name = "pagination", (.gogoproto.moretags) = "yaml:&#92;"pagination&#92;""];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 3 [json_name = "pagination", (.gogoproto.moretags) = "yaml:&#92;"pagination&#92;""];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 3 [json_name = "pagination", (.gogoproto.moretags) = "yaml:&#92;"pagination&#92;""];</code>
   */
  com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();
}
