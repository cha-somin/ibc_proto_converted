// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/staking.proto

package com.cosmos.staking.v1beta1;

public interface DVPairsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.staking.v1beta1.DVPairs)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .cosmos.staking.v1beta1.DVPair pairs = 1 [json_name = "pairs", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  java.util.List<com.cosmos.staking.v1beta1.DVPair> 
      getPairsList();
  /**
   * <code>repeated .cosmos.staking.v1beta1.DVPair pairs = 1 [json_name = "pairs", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  com.cosmos.staking.v1beta1.DVPair getPairs(int index);
  /**
   * <code>repeated .cosmos.staking.v1beta1.DVPair pairs = 1 [json_name = "pairs", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  int getPairsCount();
  /**
   * <code>repeated .cosmos.staking.v1beta1.DVPair pairs = 1 [json_name = "pairs", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  java.util.List<? extends com.cosmos.staking.v1beta1.DVPairOrBuilder> 
      getPairsOrBuilderList();
  /**
   * <code>repeated .cosmos.staking.v1beta1.DVPair pairs = 1 [json_name = "pairs", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  com.cosmos.staking.v1beta1.DVPairOrBuilder getPairsOrBuilder(
      int index);
}
