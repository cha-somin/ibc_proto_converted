// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: confio/twasm/v1beta1/contract_extension.proto

package com.confio.twasm.v1beta1;

public interface TgradeContractDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:confio.twasm.v1beta1.TgradeContractDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .confio.twasm.v1beta1.RegisteredPrivilege registered_privileges = 1 [json_name = "registeredPrivileges", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.confio.twasm.v1beta1.RegisteredPrivilege> 
      getRegisteredPrivilegesList();
  /**
   * <code>repeated .confio.twasm.v1beta1.RegisteredPrivilege registered_privileges = 1 [json_name = "registeredPrivileges", (.gogoproto.nullable) = false];</code>
   */
  com.confio.twasm.v1beta1.RegisteredPrivilege getRegisteredPrivileges(int index);
  /**
   * <code>repeated .confio.twasm.v1beta1.RegisteredPrivilege registered_privileges = 1 [json_name = "registeredPrivileges", (.gogoproto.nullable) = false];</code>
   */
  int getRegisteredPrivilegesCount();
  /**
   * <code>repeated .confio.twasm.v1beta1.RegisteredPrivilege registered_privileges = 1 [json_name = "registeredPrivileges", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.confio.twasm.v1beta1.RegisteredPrivilegeOrBuilder> 
      getRegisteredPrivilegesOrBuilderList();
  /**
   * <code>repeated .confio.twasm.v1beta1.RegisteredPrivilege registered_privileges = 1 [json_name = "registeredPrivileges", (.gogoproto.nullable) = false];</code>
   */
  com.confio.twasm.v1beta1.RegisteredPrivilegeOrBuilder getRegisteredPrivilegesOrBuilder(
      int index);
}
