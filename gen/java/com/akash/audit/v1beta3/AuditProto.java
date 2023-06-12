// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/audit/v1beta3/audit.proto

package com.akash.audit.v1beta3;

public final class AuditProto {
  private AuditProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_audit_v1beta3_Provider_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_audit_v1beta3_Provider_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_audit_v1beta3_AuditedAttributes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_audit_v1beta3_AuditedAttributes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_audit_v1beta3_AttributesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_audit_v1beta3_AttributesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_audit_v1beta3_AttributesFilters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_audit_v1beta3_AttributesFilters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_audit_v1beta3_MsgSignProviderAttributes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_audit_v1beta3_MsgSignProviderAttributes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_audit_v1beta3_MsgSignProviderAttributesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_audit_v1beta3_MsgSignProviderAttributesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_audit_v1beta3_MsgDeleteProviderAttributes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_audit_v1beta3_MsgDeleteProviderAttributes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_audit_v1beta3_MsgDeleteProviderAttributesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_audit_v1beta3_MsgDeleteProviderAttributesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037akash/audit/v1beta3/audit.proto\022\023akash" +
      ".audit.v1beta3\032\024gogoproto/gogo.proto\032\"ak" +
      "ash/base/v1beta3/attribute.proto\"\244\002\n\010Pro" +
      "vider\022/\n\005owner\030\001 \001(\tB\031\352\336\037\005owner\362\336\037\014yaml:" +
      "\"owner\"R\005owner\0227\n\007auditor\030\002 \001(\tB\035\352\336\037\007aud" +
      "itor\362\336\037\016yaml:\"auditor\"R\007auditor\022\255\001\n\nattr" +
      "ibutes\030\004 \003(\0132\035.akash.base.v1beta3.Attrib" +
      "uteBn\310\336\037\000\352\336\037\nattributes\362\336\037\021yaml:\"attribu" +
      "tes\"\252\337\037Cgithub.com/akash-network/akash-a" +
      "pi/go/node/types/v1beta3.AttributesR\natt" +
      "ributes\"\267\002\n\021AuditedAttributes\022/\n\005owner\030\001" +
      " \001(\tB\031\352\336\037\005owner\362\336\037\014yaml:\"owner\"R\005owner\0227" +
      "\n\007auditor\030\002 \001(\tB\035\352\336\037\007auditor\362\336\037\016yaml:\"au" +
      "ditor\"R\007auditor\022\255\001\n\nattributes\030\003 \003(\0132\035.a" +
      "kash.base.v1beta3.AttributeBn\310\336\037\000\352\336\037\natt" +
      "ributes\362\336\037\021yaml:\"attributes\"\252\337\037Cgithub.c" +
      "om/akash-network/akash-api/go/node/types" +
      "/v1beta3.AttributesR\nattributes:\010\230\240\037\001\350\240\037" +
      "\000\"\217\001\n\022AttributesResponse\022o\n\nattributes\030\001" +
      " \003(\0132&.akash.audit.v1beta3.AuditedAttrib" +
      "utesB\'\310\336\037\000\352\336\037\nattributes\362\336\037\021yaml:\"attrib" +
      "utes\"R\nattributes:\010\230\240\037\001\350\240\037\000\"\217\001\n\021Attribut" +
      "esFilters\022;\n\010auditors\030\001 \003(\tB\037\352\336\037\010auditor" +
      "s\362\336\037\017yaml:\"auditors\"R\010auditors\0223\n\006owners" +
      "\030\002 \003(\tB\033\352\336\037\006owners\362\336\037\ryaml:\"owners\"R\006own" +
      "ers:\010\230\240\037\001\350\240\037\000\"\273\002\n\031MsgSignProviderAttribu" +
      "tes\022/\n\005owner\030\001 \001(\tB\031\352\336\037\005owner\362\336\037\014yaml:\"o" +
      "wner\"R\005owner\0227\n\007auditor\030\002 \001(\tB\035\352\336\037\007audit" +
      "or\362\336\037\016yaml:\"auditor\"R\007auditor\022\255\001\n\nattrib" +
      "utes\030\003 \003(\0132\035.akash.base.v1beta3.Attribut" +
      "eBn\310\336\037\000\352\336\037\nattributes\362\336\037\021yaml:\"attribute" +
      "s\"\252\337\037Cgithub.com/akash-network/akash-api" +
      "/go/node/types/v1beta3.AttributesR\nattri" +
      "butes:\004\350\240\037\000\"#\n!MsgSignProviderAttributes" +
      "Response\"\272\001\n\033MsgDeleteProviderAttributes" +
      "\022/\n\005owner\030\001 \001(\tB\031\352\336\037\005owner\362\336\037\014yaml:\"owne" +
      "r\"R\005owner\0227\n\007auditor\030\002 \001(\tB\035\352\336\037\007auditor\362" +
      "\336\037\016yaml:\"auditor\"R\007auditor\022+\n\004keys\030\003 \003(\t" +
      "B\027\352\336\037\004keys\362\336\037\013yaml:\"keys\"R\004keys:\004\350\240\037\000\"%\n" +
      "#MsgDeleteProviderAttributesResponse2\221\002\n" +
      "\003Msg\022\200\001\n\026SignProviderAttributes\022..akash." +
      "audit.v1beta3.MsgSignProviderAttributes\032" +
      "6.akash.audit.v1beta3.MsgSignProviderAtt" +
      "ributesResponse\022\206\001\n\030DeleteProviderAttrib" +
      "utes\0220.akash.audit.v1beta3.MsgDeleteProv" +
      "iderAttributes\0328.akash.audit.v1beta3.Msg" +
      "DeleteProviderAttributesResponseB\315\001\n\027com" +
      ".akash.audit.v1beta3B\nAuditProtoP\001Z8gith" +
      "ub.com/akash-network/akash-api/go/node/a" +
      "udit/v1beta3\242\002\003AAX\252\002\023Akash.Audit.V1beta3" +
      "\312\002\023Akash\\Audit\\V1beta3\342\002\037Akash\\Audit\\V1b" +
      "eta3\\GPBMetadata\352\002\025Akash::Audit::V1beta3" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.akash.base.v1beta3.AttributeProto.getDescriptor(),
        });
    internal_static_akash_audit_v1beta3_Provider_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_akash_audit_v1beta3_Provider_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_audit_v1beta3_Provider_descriptor,
        new java.lang.String[] { "Owner", "Auditor", "Attributes", });
    internal_static_akash_audit_v1beta3_AuditedAttributes_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_akash_audit_v1beta3_AuditedAttributes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_audit_v1beta3_AuditedAttributes_descriptor,
        new java.lang.String[] { "Owner", "Auditor", "Attributes", });
    internal_static_akash_audit_v1beta3_AttributesResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_akash_audit_v1beta3_AttributesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_audit_v1beta3_AttributesResponse_descriptor,
        new java.lang.String[] { "Attributes", });
    internal_static_akash_audit_v1beta3_AttributesFilters_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_akash_audit_v1beta3_AttributesFilters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_audit_v1beta3_AttributesFilters_descriptor,
        new java.lang.String[] { "Auditors", "Owners", });
    internal_static_akash_audit_v1beta3_MsgSignProviderAttributes_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_akash_audit_v1beta3_MsgSignProviderAttributes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_audit_v1beta3_MsgSignProviderAttributes_descriptor,
        new java.lang.String[] { "Owner", "Auditor", "Attributes", });
    internal_static_akash_audit_v1beta3_MsgSignProviderAttributesResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_akash_audit_v1beta3_MsgSignProviderAttributesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_audit_v1beta3_MsgSignProviderAttributesResponse_descriptor,
        new java.lang.String[] { });
    internal_static_akash_audit_v1beta3_MsgDeleteProviderAttributes_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_akash_audit_v1beta3_MsgDeleteProviderAttributes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_audit_v1beta3_MsgDeleteProviderAttributes_descriptor,
        new java.lang.String[] { "Owner", "Auditor", "Keys", });
    internal_static_akash_audit_v1beta3_MsgDeleteProviderAttributesResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_akash_audit_v1beta3_MsgDeleteProviderAttributesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_audit_v1beta3_MsgDeleteProviderAttributesResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.castrepeated);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.jsontag);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.akash.base.v1beta3.AttributeProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
