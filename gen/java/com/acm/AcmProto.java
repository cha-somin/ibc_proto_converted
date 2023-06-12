// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shentu/burrow/acm.proto

package com.acm;

public final class AcmProto {
  private AcmProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_acm_Account_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_acm_Account_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_acm_ContractMeta_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_acm_ContractMeta_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027shentu/burrow/acm.proto\022\003acm\032\024gogoprot" +
      "o/gogo.proto\032\036shentu/burrow/permission.p" +
      "roto\032\032shentu/burrow/crypto.proto\"\211\005\n\007Acc" +
      "ount\022N\n\007Address\030\001 \001(\014B4\310\336\037\000\332\336\037,github.co" +
      "m/hyperledger/burrow/crypto.AddressR\007Add" +
      "ress\0225\n\tPublicKey\030\002 \001(\0132\021.crypto.PublicK" +
      "eyB\004\310\336\037\000R\tPublicKey\022\032\n\010Sequence\030\003 \001(\004R\010S" +
      "equence\022\030\n\007Balance\030\004 \001(\004R\007Balance\022*\n\007EVM" +
      "Code\030\005 \001(\014B\020\310\336\037\000\332\336\037\010BytecodeR\007EVMCode\022F\n" +
      "\013Permissions\030\006 \001(\0132\036.permission.AccountP" +
      "ermissionsB\004\310\336\037\000R\013Permissions\022:\n\010WASMCod" +
      "e\030\007 \001(\014B\036\310\336\037\000\332\336\037\010Bytecode\352\336\037\n,omitemptyR" +
      "\010WASMCode\022.\n\nNativeName\030\013 \001(\tB\016\352\336\037\n,omit" +
      "emptyR\nNativeName\022V\n\010CodeHash\030\010 \001(\014B:\310\336\037" +
      "\000\332\336\037-github.com/hyperledger/burrow/binar" +
      "y.HexBytes\352\336\037\001-R\010CodeHash\0225\n\014ContractMet" +
      "a\030\t \003(\0132\021.acm.ContractMetaR\014ContractMeta" +
      "\022L\n\010Forebear\030\n \001(\014B0\332\336\037,github.com/hyper" +
      "ledger/burrow/crypto.AddressR\010Forebear:\004" +
      "\230\240\037\000\"\330\001\n\014ContractMeta\022Q\n\010CodeHash\030\001 \001(\014B" +
      "5\310\336\037\000\332\336\037-github.com/hyperledger/burrow/b" +
      "inary.HexBytesR\010CodeHash\022Y\n\014MetadataHash" +
      "\030\002 \001(\014B5\310\336\037\000\332\336\037-github.com/hyperledger/b" +
      "urrow/binary.HexBytesR\014MetadataHash\022\032\n\010M" +
      "etadata\030\003 \001(\tR\010MetadataBz\n\007com.acmB\010AcmP" +
      "rotoP\001Z!github.com/hyperledger/burrow/ac" +
      "m\242\002\003AXX\252\002\003Acm\312\002\003Acm\342\002\017Acm\\GPBMetadata\352\002\003" +
      "Acm\310\342\036\001\320\342\036\001\330\342\036\001\340\342\036\001\300\343\036\001\310\343\036\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.permission.PermissionProto.getDescriptor(),
          com.crypto.CryptoProto.getDescriptor(),
        });
    internal_static_acm_Account_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_acm_Account_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_acm_Account_descriptor,
        new java.lang.String[] { "Address", "PublicKey", "Sequence", "Balance", "EVMCode", "Permissions", "WASMCode", "NativeName", "CodeHash", "ContractMeta", "Forebear", });
    internal_static_acm_ContractMeta_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_acm_ContractMeta_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_acm_ContractMeta_descriptor,
        new java.lang.String[] { "CodeHash", "MetadataHash", "Metadata", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.goprotoRegistration);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.jsontag);
    registry.add(com.gogoproto.GogoProto.marshalerAll);
    registry.add(com.gogoproto.GogoProto.messagenameAll);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.gogoproto.GogoProto.sizerAll);
    registry.add(com.gogoproto.GogoProto.stableMarshalerAll);
    registry.add(com.gogoproto.GogoProto.unmarshalerAll);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.permission.PermissionProto.getDescriptor();
    com.crypto.CryptoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
