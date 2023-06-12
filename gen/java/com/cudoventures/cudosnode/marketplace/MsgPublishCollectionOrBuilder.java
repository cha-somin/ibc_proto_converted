// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cudos/marketplace/tx.proto

package com.cudoventures.cudosnode.marketplace;

public interface MsgPublishCollectionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cudoventures.cudosnode.marketplace.MsgPublishCollection)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string creator = 1 [json_name = "creator"];</code>
   * @return The creator.
   */
  java.lang.String getCreator();
  /**
   * <code>string creator = 1 [json_name = "creator"];</code>
   * @return The bytes for creator.
   */
  com.google.protobuf.ByteString
      getCreatorBytes();

  /**
   * <code>string denomId = 2 [json_name = "denomId"];</code>
   * @return The denomId.
   */
  java.lang.String getDenomId();
  /**
   * <code>string denomId = 2 [json_name = "denomId"];</code>
   * @return The bytes for denomId.
   */
  com.google.protobuf.ByteString
      getDenomIdBytes();

  /**
   * <code>repeated .cudoventures.cudosnode.marketplace.Royalty mintRoyalties = 3 [json_name = "mintRoyalties", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.cudoventures.cudosnode.marketplace.Royalty> 
      getMintRoyaltiesList();
  /**
   * <code>repeated .cudoventures.cudosnode.marketplace.Royalty mintRoyalties = 3 [json_name = "mintRoyalties", (.gogoproto.nullable) = false];</code>
   */
  com.cudoventures.cudosnode.marketplace.Royalty getMintRoyalties(int index);
  /**
   * <code>repeated .cudoventures.cudosnode.marketplace.Royalty mintRoyalties = 3 [json_name = "mintRoyalties", (.gogoproto.nullable) = false];</code>
   */
  int getMintRoyaltiesCount();
  /**
   * <code>repeated .cudoventures.cudosnode.marketplace.Royalty mintRoyalties = 3 [json_name = "mintRoyalties", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.cudoventures.cudosnode.marketplace.RoyaltyOrBuilder> 
      getMintRoyaltiesOrBuilderList();
  /**
   * <code>repeated .cudoventures.cudosnode.marketplace.Royalty mintRoyalties = 3 [json_name = "mintRoyalties", (.gogoproto.nullable) = false];</code>
   */
  com.cudoventures.cudosnode.marketplace.RoyaltyOrBuilder getMintRoyaltiesOrBuilder(
      int index);

  /**
   * <code>repeated .cudoventures.cudosnode.marketplace.Royalty resaleRoyalties = 4 [json_name = "resaleRoyalties", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.cudoventures.cudosnode.marketplace.Royalty> 
      getResaleRoyaltiesList();
  /**
   * <code>repeated .cudoventures.cudosnode.marketplace.Royalty resaleRoyalties = 4 [json_name = "resaleRoyalties", (.gogoproto.nullable) = false];</code>
   */
  com.cudoventures.cudosnode.marketplace.Royalty getResaleRoyalties(int index);
  /**
   * <code>repeated .cudoventures.cudosnode.marketplace.Royalty resaleRoyalties = 4 [json_name = "resaleRoyalties", (.gogoproto.nullable) = false];</code>
   */
  int getResaleRoyaltiesCount();
  /**
   * <code>repeated .cudoventures.cudosnode.marketplace.Royalty resaleRoyalties = 4 [json_name = "resaleRoyalties", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.cudoventures.cudosnode.marketplace.RoyaltyOrBuilder> 
      getResaleRoyaltiesOrBuilderList();
  /**
   * <code>repeated .cudoventures.cudosnode.marketplace.Royalty resaleRoyalties = 4 [json_name = "resaleRoyalties", (.gogoproto.nullable) = false];</code>
   */
  com.cudoventures.cudosnode.marketplace.RoyaltyOrBuilder getResaleRoyaltiesOrBuilder(
      int index);
}
