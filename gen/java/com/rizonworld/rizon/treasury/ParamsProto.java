// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rizon/treasury/params.proto

package com.rizonworld.rizon.treasury;

public final class ParamsProto {
  private ParamsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rizonworld_rizon_treasury_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rizonworld_rizon_treasury_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033rizon/treasury/params.proto\022\031rizonworl" +
      "d.rizon.treasury\032\024gogoproto/gogo.proto\032\035" +
      "rizon/treasury/treasury.proto\"\330\001\n\006Params" +
      "\022/\n\010mintable\030\001 \001(\010B\023\362\336\037\017yaml:\"mintable\"R" +
      "\010mintable\022/\n\010sequence\030\002 \001(\003B\023\362\336\037\017yaml:\"s" +
      "equence\"R\010sequence\022f\n\rcurrency_list\030\003 \003(" +
      "\0132#.rizonworld.rizon.treasury.CurrencyB\034" +
      "\310\336\037\000\362\336\037\024yaml:\"currency_list\"R\014currencyLi" +
      "st:\004\230\240\037\000B\341\001\n\035com.rizonworld.rizon.treasu" +
      "ryB\013ParamsProtoP\001Z-github.com/rizon-worl" +
      "d/rizon/x/treasury/types\242\002\003RRT\252\002\031Rizonwo" +
      "rld.Rizon.Treasury\312\002\031Rizonworld\\Rizon\\Tr" +
      "easury\342\002%Rizonworld\\Rizon\\Treasury\\GPBMe" +
      "tadata\352\002\033Rizonworld::Rizon::Treasuryb\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.rizonworld.rizon.treasury.TreasuryProto.getDescriptor(),
        });
    internal_static_rizonworld_rizon_treasury_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_rizonworld_rizon_treasury_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rizonworld_rizon_treasury_Params_descriptor,
        new java.lang.String[] { "Mintable", "Sequence", "CurrencyList", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.rizonworld.rizon.treasury.TreasuryProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
