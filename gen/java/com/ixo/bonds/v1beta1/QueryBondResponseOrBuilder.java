// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ixo/bonds/v1beta1/query.proto

package com.ixo.bonds.v1beta1;

public interface QueryBondResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ixo.bonds.v1beta1.QueryBondResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.ixo.bonds.v1beta1.Bond bond = 1 [json_name = "bond", (.gogoproto.moretags) = "yaml:&#92;"bond&#92;""];</code>
   * @return Whether the bond field is set.
   */
  boolean hasBond();
  /**
   * <code>.ixo.bonds.v1beta1.Bond bond = 1 [json_name = "bond", (.gogoproto.moretags) = "yaml:&#92;"bond&#92;""];</code>
   * @return The bond.
   */
  com.ixo.bonds.v1beta1.Bond getBond();
  /**
   * <code>.ixo.bonds.v1beta1.Bond bond = 1 [json_name = "bond", (.gogoproto.moretags) = "yaml:&#92;"bond&#92;""];</code>
   */
  com.ixo.bonds.v1beta1.BondOrBuilder getBondOrBuilder();
}
