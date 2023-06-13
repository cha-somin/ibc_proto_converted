// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/nexus/v1beta1/service.proto

package com.axelar.nexus.v1beta1;

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
      "\n\"axelar/nexus/v1beta1/service.proto\022\024ax" +
      "elar.nexus.v1beta1\032\024gogoproto/gogo.proto" +
      "\032\034google/api/annotations.proto\032\035axelar/n" +
      "exus/v1beta1/tx.proto\032 axelar/nexus/v1be" +
      "ta1/query.proto2\221\010\n\nMsgService\022\272\001\n\027Regis" +
      "terChainMaintainer\0224.axelar.nexus.v1beta" +
      "1.RegisterChainMaintainerRequest\0325.axela" +
      "r.nexus.v1beta1.RegisterChainMaintainerR" +
      "esponse\"2\202\323\344\223\002,\"\'/axelar/nexus/register_" +
      "chain_maintainer:\001*\022\302\001\n\031DeregisterChainM" +
      "aintainer\0226.axelar.nexus.v1beta1.Deregis" +
      "terChainMaintainerRequest\0327.axelar.nexus" +
      ".v1beta1.DeregisterChainMaintainerRespon" +
      "se\"4\202\323\344\223\002.\")/axelar/nexus/deregister_cha" +
      "in_maintainer:\001*\022\221\001\n\rActivateChain\022*.axe" +
      "lar.nexus.v1beta1.ActivateChainRequest\032+" +
      ".axelar.nexus.v1beta1.ActivateChainRespo" +
      "nse\"\'\202\323\344\223\002!\"\034/axelar/nexus/activate_chai" +
      "n:\001*\022\231\001\n\017DeactivateChain\022,.axelar.nexus." +
      "v1beta1.DeactivateChainRequest\032-.axelar." +
      "nexus.v1beta1.DeactivateChainResponse\")\202" +
      "\323\344\223\002#\"\036/axelar/nexus/deactivate_chain:\001*" +
      "\022\236\001\n\020RegisterAssetFee\022-.axelar.nexus.v1b" +
      "eta1.RegisterAssetFeeRequest\032..axelar.ne" +
      "xus.v1beta1.RegisterAssetFeeResponse\"+\202\323" +
      "\344\223\002%\" /axelar/nexus/register_asset_fee:\001" +
      "*\022\257\001\n\024SetTransferRateLimit\0221.axelar.nexu" +
      "s.v1beta1.SetTransferRateLimitRequest\0322." +
      "axelar.nexus.v1beta1.SetTransferRateLimi" +
      "tResponse\"0\202\323\344\223\002*\"%/axelar/nexus/set_tra" +
      "nsfer_rate_limit:\001*2\242\020\n\014QueryService\022\346\001\n" +
      "\024LatestDepositAddress\0221.axelar.nexus.v1b" +
      "eta1.LatestDepositAddressRequest\0322.axela" +
      "r.nexus.v1beta1.LatestDepositAddressResp" +
      "onse\"g\202\323\344\223\002a\022_/axelar/nexus/v1beta1/late" +
      "st_deposit_address/{recipient_addr}/{rec" +
      "ipient_chain}/{deposit_chain}\022\267\001\n\021Transf" +
      "ersForChain\022..axelar.nexus.v1beta1.Trans" +
      "fersForChainRequest\032/.axelar.nexus.v1bet" +
      "a1.TransfersForChainResponse\"A\202\323\344\223\002;\0229/a" +
      "xelar/nexus/v1beta1/transfers_for_chain/" +
      "{chain}/{state}\022\253\001\n\007FeeInfo\022$.axelar.nex" +
      "us.v1beta1.FeeInfoRequest\032%.axelar.nexus" +
      ".v1beta1.FeeInfoResponse\"S\202\323\344\223\002M\022./axela" +
      "r/nexus/v1beta1/fee_info/{chain}/{asset}" +
      "Z\033\022\031/axelar/nexus/v1beta1/fee\022\340\001\n\013Transf" +
      "erFee\022(.axelar.nexus.v1beta1.TransferFee" +
      "Request\032).axelar.nexus.v1beta1.TransferF" +
      "eeResponse\"|\202\323\344\223\002v\022N/axelar/nexus/v1beta" +
      "1/transfer_fee/{source_chain}/{destinati" +
      "on_chain}/{amount}Z$\022\"/axelar/nexus/v1be" +
      "ta1/transfer_fee\022y\n\006Chains\022#.axelar.nexu" +
      "s.v1beta1.ChainsRequest\032$.axelar.nexus.v" +
      "1beta1.ChainsResponse\"$\202\323\344\223\002\036\022\034/axelar/n" +
      "exus/v1beta1/chains\022\201\001\n\006Assets\022#.axelar." +
      "nexus.v1beta1.AssetsRequest\032$.axelar.nex" +
      "us.v1beta1.AssetsResponse\",\202\323\344\223\002&\022$/axel" +
      "ar/nexus/v1beta1/assets/{chain}\022\222\001\n\nChai" +
      "nState\022\'.axelar.nexus.v1beta1.ChainState" +
      "Request\032(.axelar.nexus.v1beta1.ChainStat" +
      "eResponse\"1\202\323\344\223\002+\022)/axelar/nexus/v1beta1" +
      "/chain_state/{chain}\022\237\001\n\rChainsByAsset\022*" +
      ".axelar.nexus.v1beta1.ChainsByAssetReque" +
      "st\032+.axelar.nexus.v1beta1.ChainsByAssetR" +
      "esponse\"5\202\323\344\223\002/\022-/axelar/nexus/v1beta1/c" +
      "hains_by_asset/{asset}\022\301\001\n\020RecipientAddr" +
      "ess\022-.axelar.nexus.v1beta1.RecipientAddr" +
      "essRequest\032..axelar.nexus.v1beta1.Recipi" +
      "entAddressResponse\"N\202\323\344\223\002H\022F/axelar/nexu" +
      "s/v1beta1/recipient_address/{deposit_cha" +
      "in}/{deposit_addr}\022\252\001\n\020ChainMaintainers\022" +
      "-.axelar.nexus.v1beta1.ChainMaintainersR" +
      "equest\032..axelar.nexus.v1beta1.ChainMaint" +
      "ainersResponse\"7\202\323\344\223\0021\022//axelar/nexus/v1" +
      "beta1/chain_maintainers/{chain}\022\267\001\n\021Tran" +
      "sferRateLimit\022..axelar.nexus.v1beta1.Tra" +
      "nsferRateLimitRequest\032/.axelar.nexus.v1b" +
      "eta1.TransferRateLimitResponse\"A\202\323\344\223\002;\0229" +
      "/axelar/nexus/v1beta1/transfer_rate_limi" +
      "t/{chain}/{asset}\022}\n\007Message\022$.axelar.ne" +
      "xus.v1beta1.MessageRequest\032%.axelar.nexu" +
      "s.v1beta1.MessageResponse\"%\202\323\344\223\002\037\022\035/axel" +
      "ar/nexus/v1beta1/messageB\320\001\n\030com.axelar." +
      "nexus.v1beta1B\014ServiceProtoZ2github.com/" +
      "axelarnetwork/axelar-core/x/nexus/types\242" +
      "\002\003ANX\252\002\024Axelar.Nexus.V1beta1\312\002\024Axelar\\Ne" +
      "xus\\V1beta1\342\002 Axelar\\Nexus\\V1beta1\\GPBMe" +
      "tadata\352\002\026Axelar::Nexus::V1beta1\300\343\036\001b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.axelar.nexus.v1beta1.TxProto.getDescriptor(),
          com.axelar.nexus.v1beta1.QueryProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoRegistration);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.axelar.nexus.v1beta1.TxProto.getDescriptor();
    com.axelar.nexus.v1beta1.QueryProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
