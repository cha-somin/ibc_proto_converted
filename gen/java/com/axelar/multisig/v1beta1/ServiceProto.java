// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/multisig/v1beta1/service.proto

package com.axelar.multisig.v1beta1;

public final class ServiceProto {
  private ServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%axelar/multisig/v1beta1/service.proto\022" +
      "\027axelar.multisig.v1beta1\032\024gogoproto/gogo" +
      ".proto\032\034google/api/annotations.proto\032 ax" +
      "elar/multisig/v1beta1/tx.proto\032#axelar/m" +
      "ultisig/v1beta1/query.proto2\255\007\n\nMsgServi" +
      "ce\022\222\001\n\013StartKeygen\022+.axelar.multisig.v1b" +
      "eta1.StartKeygenRequest\032,.axelar.multisi" +
      "g.v1beta1.StartKeygenResponse\"(\202\323\344\223\002\"\"\035/" +
      "axelar/multisig/start_keygen:\001*\022\227\001\n\014Subm" +
      "itPubKey\022,.axelar.multisig.v1beta1.Submi" +
      "tPubKeyRequest\032-.axelar.multisig.v1beta1" +
      ".SubmitPubKeyResponse\"*\202\323\344\223\002$\"\037/axelar/m" +
      "ultisig/submit_pub_key:\001*\022\242\001\n\017SubmitSign" +
      "ature\022/.axelar.multisig.v1beta1.SubmitSi" +
      "gnatureRequest\0320.axelar.multisig.v1beta1" +
      ".SubmitSignatureResponse\",\202\323\344\223\002&\"!/axela" +
      "r/multisig/submit_signature:\001*\022\212\001\n\tRotat" +
      "eKey\022).axelar.multisig.v1beta1.RotateKey" +
      "Request\032*.axelar.multisig.v1beta1.Rotate" +
      "KeyResponse\"&\202\323\344\223\002 \"\033/axelar/multisig/ro" +
      "tate_key:\001*\022\237\001\n\014KeygenOptOut\022,.axelar.mu" +
      "ltisig.v1beta1.KeygenOptOutRequest\032-.axe" +
      "lar.multisig.v1beta1.KeygenOptOutRespons" +
      "e\"2\202\323\344\223\002,\"\'/axelar/multisig/v1beta1/keyg" +
      "en_opt_out:\001*\022\233\001\n\013KeygenOptIn\022+.axelar.m" +
      "ultisig.v1beta1.KeygenOptInRequest\032,.axe" +
      "lar.multisig.v1beta1.KeygenOptInResponse" +
      "\"1\202\323\344\223\002+\"&/axelar/multisig/v1beta1/keyge" +
      "n_opt_in:\001*2\315\004\n\014QueryService\022\207\001\n\005KeyID\022%" +
      ".axelar.multisig.v1beta1.KeyIDRequest\032&." +
      "axelar.multisig.v1beta1.KeyIDResponse\"/\202" +
      "\323\344\223\002)\022\'/axelar/multisig/v1beta1/key_id/{" +
      "chain}\022\230\001\n\tNextKeyID\022).axelar.multisig.v" +
      "1beta1.NextKeyIDRequest\032*.axelar.multisi" +
      "g.v1beta1.NextKeyIDResponse\"4\202\323\344\223\002.\022,/ax" +
      "elar/multisig/v1beta1/next_key_id/{chain" +
      "}\022v\n\003Key\022#.axelar.multisig.v1beta1.KeyRe" +
      "quest\032$.axelar.multisig.v1beta1.KeyRespo" +
      "nse\"$\202\323\344\223\002\036\022\034/axelar/multisig/v1beta1/ke" +
      "y\022\237\001\n\rKeygenSession\022-.axelar.multisig.v1" +
      "beta1.KeygenSessionRequest\032..axelar.mult" +
      "isig.v1beta1.KeygenSessionResponse\"/\202\323\344\223" +
      "\002)\022\'/axelar/multisig/v1beta1/keygen_sess" +
      "ionB\342\001\n\033com.axelar.multisig.v1beta1B\014Ser" +
      "viceProtoZ5github.com/axelarnetwork/axel" +
      "ar-core/x/multisig/types\242\002\003AMX\252\002\027Axelar." +
      "Multisig.V1beta1\312\002\027Axelar\\Multisig\\V1bet" +
      "a1\342\002#Axelar\\Multisig\\V1beta1\\GPBMetadata" +
      "\352\002\031Axelar::Multisig::V1beta1\300\343\036\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.axelar.multisig.v1beta1.TxProto.getDescriptor(),
          com.axelar.multisig.v1beta1.QueryProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoRegistration);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.axelar.multisig.v1beta1.TxProto.getDescriptor();
    com.axelar.multisig.v1beta1.QueryProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
