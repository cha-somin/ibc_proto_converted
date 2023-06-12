package com.likechain.likenft.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: likechain/likenft/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "likechain.likenft.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgNewClass,
      com.likechain.likenft.v1.MsgNewClassResponse> getNewClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewClass",
      requestType = com.likechain.likenft.v1.MsgNewClass.class,
      responseType = com.likechain.likenft.v1.MsgNewClassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgNewClass,
      com.likechain.likenft.v1.MsgNewClassResponse> getNewClassMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgNewClass, com.likechain.likenft.v1.MsgNewClassResponse> getNewClassMethod;
    if ((getNewClassMethod = MsgGrpc.getNewClassMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getNewClassMethod = MsgGrpc.getNewClassMethod) == null) {
          MsgGrpc.getNewClassMethod = getNewClassMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.MsgNewClass, com.likechain.likenft.v1.MsgNewClassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewClass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgNewClass.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgNewClassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("NewClass"))
              .build();
        }
      }
    }
    return getNewClassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgUpdateClass,
      com.likechain.likenft.v1.MsgUpdateClassResponse> getUpdateClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateClass",
      requestType = com.likechain.likenft.v1.MsgUpdateClass.class,
      responseType = com.likechain.likenft.v1.MsgUpdateClassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgUpdateClass,
      com.likechain.likenft.v1.MsgUpdateClassResponse> getUpdateClassMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgUpdateClass, com.likechain.likenft.v1.MsgUpdateClassResponse> getUpdateClassMethod;
    if ((getUpdateClassMethod = MsgGrpc.getUpdateClassMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateClassMethod = MsgGrpc.getUpdateClassMethod) == null) {
          MsgGrpc.getUpdateClassMethod = getUpdateClassMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.MsgUpdateClass, com.likechain.likenft.v1.MsgUpdateClassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateClass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgUpdateClass.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgUpdateClassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateClass"))
              .build();
        }
      }
    }
    return getUpdateClassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgMintNFT,
      com.likechain.likenft.v1.MsgMintNFTResponse> getMintNFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MintNFT",
      requestType = com.likechain.likenft.v1.MsgMintNFT.class,
      responseType = com.likechain.likenft.v1.MsgMintNFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgMintNFT,
      com.likechain.likenft.v1.MsgMintNFTResponse> getMintNFTMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgMintNFT, com.likechain.likenft.v1.MsgMintNFTResponse> getMintNFTMethod;
    if ((getMintNFTMethod = MsgGrpc.getMintNFTMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMintNFTMethod = MsgGrpc.getMintNFTMethod) == null) {
          MsgGrpc.getMintNFTMethod = getMintNFTMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.MsgMintNFT, com.likechain.likenft.v1.MsgMintNFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MintNFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgMintNFT.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgMintNFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MintNFT"))
              .build();
        }
      }
    }
    return getMintNFTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgBurnNFT,
      com.likechain.likenft.v1.MsgBurnNFTResponse> getBurnNFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BurnNFT",
      requestType = com.likechain.likenft.v1.MsgBurnNFT.class,
      responseType = com.likechain.likenft.v1.MsgBurnNFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgBurnNFT,
      com.likechain.likenft.v1.MsgBurnNFTResponse> getBurnNFTMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgBurnNFT, com.likechain.likenft.v1.MsgBurnNFTResponse> getBurnNFTMethod;
    if ((getBurnNFTMethod = MsgGrpc.getBurnNFTMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBurnNFTMethod = MsgGrpc.getBurnNFTMethod) == null) {
          MsgGrpc.getBurnNFTMethod = getBurnNFTMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.MsgBurnNFT, com.likechain.likenft.v1.MsgBurnNFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BurnNFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgBurnNFT.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgBurnNFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BurnNFT"))
              .build();
        }
      }
    }
    return getBurnNFTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgCreateBlindBoxContent,
      com.likechain.likenft.v1.MsgCreateBlindBoxContentResponse> getCreateBlindBoxContentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBlindBoxContent",
      requestType = com.likechain.likenft.v1.MsgCreateBlindBoxContent.class,
      responseType = com.likechain.likenft.v1.MsgCreateBlindBoxContentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgCreateBlindBoxContent,
      com.likechain.likenft.v1.MsgCreateBlindBoxContentResponse> getCreateBlindBoxContentMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgCreateBlindBoxContent, com.likechain.likenft.v1.MsgCreateBlindBoxContentResponse> getCreateBlindBoxContentMethod;
    if ((getCreateBlindBoxContentMethod = MsgGrpc.getCreateBlindBoxContentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateBlindBoxContentMethod = MsgGrpc.getCreateBlindBoxContentMethod) == null) {
          MsgGrpc.getCreateBlindBoxContentMethod = getCreateBlindBoxContentMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.MsgCreateBlindBoxContent, com.likechain.likenft.v1.MsgCreateBlindBoxContentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBlindBoxContent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgCreateBlindBoxContent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgCreateBlindBoxContentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateBlindBoxContent"))
              .build();
        }
      }
    }
    return getCreateBlindBoxContentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgUpdateBlindBoxContent,
      com.likechain.likenft.v1.MsgUpdateBlindBoxContentResponse> getUpdateBlindBoxContentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBlindBoxContent",
      requestType = com.likechain.likenft.v1.MsgUpdateBlindBoxContent.class,
      responseType = com.likechain.likenft.v1.MsgUpdateBlindBoxContentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgUpdateBlindBoxContent,
      com.likechain.likenft.v1.MsgUpdateBlindBoxContentResponse> getUpdateBlindBoxContentMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgUpdateBlindBoxContent, com.likechain.likenft.v1.MsgUpdateBlindBoxContentResponse> getUpdateBlindBoxContentMethod;
    if ((getUpdateBlindBoxContentMethod = MsgGrpc.getUpdateBlindBoxContentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateBlindBoxContentMethod = MsgGrpc.getUpdateBlindBoxContentMethod) == null) {
          MsgGrpc.getUpdateBlindBoxContentMethod = getUpdateBlindBoxContentMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.MsgUpdateBlindBoxContent, com.likechain.likenft.v1.MsgUpdateBlindBoxContentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBlindBoxContent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgUpdateBlindBoxContent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgUpdateBlindBoxContentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateBlindBoxContent"))
              .build();
        }
      }
    }
    return getUpdateBlindBoxContentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgDeleteBlindBoxContent,
      com.likechain.likenft.v1.MsgDeleteBlindBoxContentResponse> getDeleteBlindBoxContentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBlindBoxContent",
      requestType = com.likechain.likenft.v1.MsgDeleteBlindBoxContent.class,
      responseType = com.likechain.likenft.v1.MsgDeleteBlindBoxContentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgDeleteBlindBoxContent,
      com.likechain.likenft.v1.MsgDeleteBlindBoxContentResponse> getDeleteBlindBoxContentMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgDeleteBlindBoxContent, com.likechain.likenft.v1.MsgDeleteBlindBoxContentResponse> getDeleteBlindBoxContentMethod;
    if ((getDeleteBlindBoxContentMethod = MsgGrpc.getDeleteBlindBoxContentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteBlindBoxContentMethod = MsgGrpc.getDeleteBlindBoxContentMethod) == null) {
          MsgGrpc.getDeleteBlindBoxContentMethod = getDeleteBlindBoxContentMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.MsgDeleteBlindBoxContent, com.likechain.likenft.v1.MsgDeleteBlindBoxContentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBlindBoxContent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgDeleteBlindBoxContent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgDeleteBlindBoxContentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteBlindBoxContent"))
              .build();
        }
      }
    }
    return getDeleteBlindBoxContentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgCreateOffer,
      com.likechain.likenft.v1.MsgCreateOfferResponse> getCreateOfferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOffer",
      requestType = com.likechain.likenft.v1.MsgCreateOffer.class,
      responseType = com.likechain.likenft.v1.MsgCreateOfferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgCreateOffer,
      com.likechain.likenft.v1.MsgCreateOfferResponse> getCreateOfferMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgCreateOffer, com.likechain.likenft.v1.MsgCreateOfferResponse> getCreateOfferMethod;
    if ((getCreateOfferMethod = MsgGrpc.getCreateOfferMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateOfferMethod = MsgGrpc.getCreateOfferMethod) == null) {
          MsgGrpc.getCreateOfferMethod = getCreateOfferMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.MsgCreateOffer, com.likechain.likenft.v1.MsgCreateOfferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOffer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgCreateOffer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgCreateOfferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateOffer"))
              .build();
        }
      }
    }
    return getCreateOfferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgUpdateOffer,
      com.likechain.likenft.v1.MsgUpdateOfferResponse> getUpdateOfferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOffer",
      requestType = com.likechain.likenft.v1.MsgUpdateOffer.class,
      responseType = com.likechain.likenft.v1.MsgUpdateOfferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgUpdateOffer,
      com.likechain.likenft.v1.MsgUpdateOfferResponse> getUpdateOfferMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgUpdateOffer, com.likechain.likenft.v1.MsgUpdateOfferResponse> getUpdateOfferMethod;
    if ((getUpdateOfferMethod = MsgGrpc.getUpdateOfferMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateOfferMethod = MsgGrpc.getUpdateOfferMethod) == null) {
          MsgGrpc.getUpdateOfferMethod = getUpdateOfferMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.MsgUpdateOffer, com.likechain.likenft.v1.MsgUpdateOfferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOffer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgUpdateOffer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgUpdateOfferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateOffer"))
              .build();
        }
      }
    }
    return getUpdateOfferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgDeleteOffer,
      com.likechain.likenft.v1.MsgDeleteOfferResponse> getDeleteOfferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOffer",
      requestType = com.likechain.likenft.v1.MsgDeleteOffer.class,
      responseType = com.likechain.likenft.v1.MsgDeleteOfferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgDeleteOffer,
      com.likechain.likenft.v1.MsgDeleteOfferResponse> getDeleteOfferMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgDeleteOffer, com.likechain.likenft.v1.MsgDeleteOfferResponse> getDeleteOfferMethod;
    if ((getDeleteOfferMethod = MsgGrpc.getDeleteOfferMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteOfferMethod = MsgGrpc.getDeleteOfferMethod) == null) {
          MsgGrpc.getDeleteOfferMethod = getDeleteOfferMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.MsgDeleteOffer, com.likechain.likenft.v1.MsgDeleteOfferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOffer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgDeleteOffer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgDeleteOfferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteOffer"))
              .build();
        }
      }
    }
    return getDeleteOfferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgCreateListing,
      com.likechain.likenft.v1.MsgCreateListingResponse> getCreateListingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateListing",
      requestType = com.likechain.likenft.v1.MsgCreateListing.class,
      responseType = com.likechain.likenft.v1.MsgCreateListingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgCreateListing,
      com.likechain.likenft.v1.MsgCreateListingResponse> getCreateListingMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgCreateListing, com.likechain.likenft.v1.MsgCreateListingResponse> getCreateListingMethod;
    if ((getCreateListingMethod = MsgGrpc.getCreateListingMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateListingMethod = MsgGrpc.getCreateListingMethod) == null) {
          MsgGrpc.getCreateListingMethod = getCreateListingMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.MsgCreateListing, com.likechain.likenft.v1.MsgCreateListingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateListing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgCreateListing.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgCreateListingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateListing"))
              .build();
        }
      }
    }
    return getCreateListingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgUpdateListing,
      com.likechain.likenft.v1.MsgUpdateListingResponse> getUpdateListingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateListing",
      requestType = com.likechain.likenft.v1.MsgUpdateListing.class,
      responseType = com.likechain.likenft.v1.MsgUpdateListingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgUpdateListing,
      com.likechain.likenft.v1.MsgUpdateListingResponse> getUpdateListingMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgUpdateListing, com.likechain.likenft.v1.MsgUpdateListingResponse> getUpdateListingMethod;
    if ((getUpdateListingMethod = MsgGrpc.getUpdateListingMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateListingMethod = MsgGrpc.getUpdateListingMethod) == null) {
          MsgGrpc.getUpdateListingMethod = getUpdateListingMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.MsgUpdateListing, com.likechain.likenft.v1.MsgUpdateListingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateListing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgUpdateListing.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgUpdateListingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateListing"))
              .build();
        }
      }
    }
    return getUpdateListingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgDeleteListing,
      com.likechain.likenft.v1.MsgDeleteListingResponse> getDeleteListingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteListing",
      requestType = com.likechain.likenft.v1.MsgDeleteListing.class,
      responseType = com.likechain.likenft.v1.MsgDeleteListingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgDeleteListing,
      com.likechain.likenft.v1.MsgDeleteListingResponse> getDeleteListingMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgDeleteListing, com.likechain.likenft.v1.MsgDeleteListingResponse> getDeleteListingMethod;
    if ((getDeleteListingMethod = MsgGrpc.getDeleteListingMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteListingMethod = MsgGrpc.getDeleteListingMethod) == null) {
          MsgGrpc.getDeleteListingMethod = getDeleteListingMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.MsgDeleteListing, com.likechain.likenft.v1.MsgDeleteListingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteListing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgDeleteListing.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgDeleteListingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteListing"))
              .build();
        }
      }
    }
    return getDeleteListingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgSellNFT,
      com.likechain.likenft.v1.MsgSellNFTResponse> getSellNFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SellNFT",
      requestType = com.likechain.likenft.v1.MsgSellNFT.class,
      responseType = com.likechain.likenft.v1.MsgSellNFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgSellNFT,
      com.likechain.likenft.v1.MsgSellNFTResponse> getSellNFTMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgSellNFT, com.likechain.likenft.v1.MsgSellNFTResponse> getSellNFTMethod;
    if ((getSellNFTMethod = MsgGrpc.getSellNFTMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSellNFTMethod = MsgGrpc.getSellNFTMethod) == null) {
          MsgGrpc.getSellNFTMethod = getSellNFTMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.MsgSellNFT, com.likechain.likenft.v1.MsgSellNFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SellNFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgSellNFT.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgSellNFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SellNFT"))
              .build();
        }
      }
    }
    return getSellNFTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgBuyNFT,
      com.likechain.likenft.v1.MsgBuyNFTResponse> getBuyNFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuyNFT",
      requestType = com.likechain.likenft.v1.MsgBuyNFT.class,
      responseType = com.likechain.likenft.v1.MsgBuyNFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgBuyNFT,
      com.likechain.likenft.v1.MsgBuyNFTResponse> getBuyNFTMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgBuyNFT, com.likechain.likenft.v1.MsgBuyNFTResponse> getBuyNFTMethod;
    if ((getBuyNFTMethod = MsgGrpc.getBuyNFTMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBuyNFTMethod = MsgGrpc.getBuyNFTMethod) == null) {
          MsgGrpc.getBuyNFTMethod = getBuyNFTMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.MsgBuyNFT, com.likechain.likenft.v1.MsgBuyNFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuyNFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgBuyNFT.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgBuyNFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BuyNFT"))
              .build();
        }
      }
    }
    return getBuyNFTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgCreateRoyaltyConfig,
      com.likechain.likenft.v1.MsgCreateRoyaltyConfigResponse> getCreateRoyaltyConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRoyaltyConfig",
      requestType = com.likechain.likenft.v1.MsgCreateRoyaltyConfig.class,
      responseType = com.likechain.likenft.v1.MsgCreateRoyaltyConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgCreateRoyaltyConfig,
      com.likechain.likenft.v1.MsgCreateRoyaltyConfigResponse> getCreateRoyaltyConfigMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgCreateRoyaltyConfig, com.likechain.likenft.v1.MsgCreateRoyaltyConfigResponse> getCreateRoyaltyConfigMethod;
    if ((getCreateRoyaltyConfigMethod = MsgGrpc.getCreateRoyaltyConfigMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateRoyaltyConfigMethod = MsgGrpc.getCreateRoyaltyConfigMethod) == null) {
          MsgGrpc.getCreateRoyaltyConfigMethod = getCreateRoyaltyConfigMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.MsgCreateRoyaltyConfig, com.likechain.likenft.v1.MsgCreateRoyaltyConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRoyaltyConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgCreateRoyaltyConfig.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgCreateRoyaltyConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateRoyaltyConfig"))
              .build();
        }
      }
    }
    return getCreateRoyaltyConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgUpdateRoyaltyConfig,
      com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse> getUpdateRoyaltyConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRoyaltyConfig",
      requestType = com.likechain.likenft.v1.MsgUpdateRoyaltyConfig.class,
      responseType = com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgUpdateRoyaltyConfig,
      com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse> getUpdateRoyaltyConfigMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgUpdateRoyaltyConfig, com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse> getUpdateRoyaltyConfigMethod;
    if ((getUpdateRoyaltyConfigMethod = MsgGrpc.getUpdateRoyaltyConfigMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateRoyaltyConfigMethod = MsgGrpc.getUpdateRoyaltyConfigMethod) == null) {
          MsgGrpc.getUpdateRoyaltyConfigMethod = getUpdateRoyaltyConfigMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.MsgUpdateRoyaltyConfig, com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRoyaltyConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgUpdateRoyaltyConfig.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateRoyaltyConfig"))
              .build();
        }
      }
    }
    return getUpdateRoyaltyConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgDeleteRoyaltyConfig,
      com.likechain.likenft.v1.MsgDeleteRoyaltyConfigResponse> getDeleteRoyaltyConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRoyaltyConfig",
      requestType = com.likechain.likenft.v1.MsgDeleteRoyaltyConfig.class,
      responseType = com.likechain.likenft.v1.MsgDeleteRoyaltyConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgDeleteRoyaltyConfig,
      com.likechain.likenft.v1.MsgDeleteRoyaltyConfigResponse> getDeleteRoyaltyConfigMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.MsgDeleteRoyaltyConfig, com.likechain.likenft.v1.MsgDeleteRoyaltyConfigResponse> getDeleteRoyaltyConfigMethod;
    if ((getDeleteRoyaltyConfigMethod = MsgGrpc.getDeleteRoyaltyConfigMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteRoyaltyConfigMethod = MsgGrpc.getDeleteRoyaltyConfigMethod) == null) {
          MsgGrpc.getDeleteRoyaltyConfigMethod = getDeleteRoyaltyConfigMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.MsgDeleteRoyaltyConfig, com.likechain.likenft.v1.MsgDeleteRoyaltyConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRoyaltyConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgDeleteRoyaltyConfig.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.MsgDeleteRoyaltyConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteRoyaltyConfig"))
              .build();
        }
      }
    }
    return getDeleteRoyaltyConfigMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MsgStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgStub>() {
        @java.lang.Override
        public MsgStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgStub(channel, callOptions);
        }
      };
    return MsgStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MsgBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgBlockingStub>() {
        @java.lang.Override
        public MsgBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgBlockingStub(channel, callOptions);
        }
      };
    return MsgBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MsgFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgFutureStub>() {
        @java.lang.Override
        public MsgFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgFutureStub(channel, callOptions);
        }
      };
    return MsgFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Msg defines the Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void newClass(com.likechain.likenft.v1.MsgNewClass request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgNewClassResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewClassMethod(), responseObserver);
    }

    /**
     */
    default void updateClass(com.likechain.likenft.v1.MsgUpdateClass request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgUpdateClassResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateClassMethod(), responseObserver);
    }

    /**
     */
    default void mintNFT(com.likechain.likenft.v1.MsgMintNFT request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgMintNFTResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMintNFTMethod(), responseObserver);
    }

    /**
     */
    default void burnNFT(com.likechain.likenft.v1.MsgBurnNFT request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgBurnNFTResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBurnNFTMethod(), responseObserver);
    }

    /**
     */
    default void createBlindBoxContent(com.likechain.likenft.v1.MsgCreateBlindBoxContent request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgCreateBlindBoxContentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBlindBoxContentMethod(), responseObserver);
    }

    /**
     */
    default void updateBlindBoxContent(com.likechain.likenft.v1.MsgUpdateBlindBoxContent request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgUpdateBlindBoxContentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBlindBoxContentMethod(), responseObserver);
    }

    /**
     */
    default void deleteBlindBoxContent(com.likechain.likenft.v1.MsgDeleteBlindBoxContent request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgDeleteBlindBoxContentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBlindBoxContentMethod(), responseObserver);
    }

    /**
     */
    default void createOffer(com.likechain.likenft.v1.MsgCreateOffer request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgCreateOfferResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOfferMethod(), responseObserver);
    }

    /**
     */
    default void updateOffer(com.likechain.likenft.v1.MsgUpdateOffer request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgUpdateOfferResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOfferMethod(), responseObserver);
    }

    /**
     */
    default void deleteOffer(com.likechain.likenft.v1.MsgDeleteOffer request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgDeleteOfferResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOfferMethod(), responseObserver);
    }

    /**
     */
    default void createListing(com.likechain.likenft.v1.MsgCreateListing request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgCreateListingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateListingMethod(), responseObserver);
    }

    /**
     */
    default void updateListing(com.likechain.likenft.v1.MsgUpdateListing request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgUpdateListingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateListingMethod(), responseObserver);
    }

    /**
     */
    default void deleteListing(com.likechain.likenft.v1.MsgDeleteListing request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgDeleteListingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteListingMethod(), responseObserver);
    }

    /**
     */
    default void sellNFT(com.likechain.likenft.v1.MsgSellNFT request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgSellNFTResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSellNFTMethod(), responseObserver);
    }

    /**
     */
    default void buyNFT(com.likechain.likenft.v1.MsgBuyNFT request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgBuyNFTResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuyNFTMethod(), responseObserver);
    }

    /**
     */
    default void createRoyaltyConfig(com.likechain.likenft.v1.MsgCreateRoyaltyConfig request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgCreateRoyaltyConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRoyaltyConfigMethod(), responseObserver);
    }

    /**
     */
    default void updateRoyaltyConfig(com.likechain.likenft.v1.MsgUpdateRoyaltyConfig request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRoyaltyConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    default void deleteRoyaltyConfig(com.likechain.likenft.v1.MsgDeleteRoyaltyConfig request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgDeleteRoyaltyConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRoyaltyConfigMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MsgGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the Msg service.
   * </pre>
   */
  public static final class MsgStub
      extends io.grpc.stub.AbstractAsyncStub<MsgStub> {
    private MsgStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgStub(channel, callOptions);
    }

    /**
     */
    public void newClass(com.likechain.likenft.v1.MsgNewClass request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgNewClassResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewClassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateClass(com.likechain.likenft.v1.MsgUpdateClass request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgUpdateClassResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateClassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mintNFT(com.likechain.likenft.v1.MsgMintNFT request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgMintNFTResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMintNFTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void burnNFT(com.likechain.likenft.v1.MsgBurnNFT request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgBurnNFTResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBurnNFTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createBlindBoxContent(com.likechain.likenft.v1.MsgCreateBlindBoxContent request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgCreateBlindBoxContentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBlindBoxContentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBlindBoxContent(com.likechain.likenft.v1.MsgUpdateBlindBoxContent request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgUpdateBlindBoxContentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBlindBoxContentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteBlindBoxContent(com.likechain.likenft.v1.MsgDeleteBlindBoxContent request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgDeleteBlindBoxContentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteBlindBoxContentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createOffer(com.likechain.likenft.v1.MsgCreateOffer request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgCreateOfferResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOfferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateOffer(com.likechain.likenft.v1.MsgUpdateOffer request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgUpdateOfferResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOfferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteOffer(com.likechain.likenft.v1.MsgDeleteOffer request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgDeleteOfferResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOfferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createListing(com.likechain.likenft.v1.MsgCreateListing request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgCreateListingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateListingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateListing(com.likechain.likenft.v1.MsgUpdateListing request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgUpdateListingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateListingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteListing(com.likechain.likenft.v1.MsgDeleteListing request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgDeleteListingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteListingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sellNFT(com.likechain.likenft.v1.MsgSellNFT request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgSellNFTResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSellNFTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void buyNFT(com.likechain.likenft.v1.MsgBuyNFT request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgBuyNFTResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuyNFTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createRoyaltyConfig(com.likechain.likenft.v1.MsgCreateRoyaltyConfig request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgCreateRoyaltyConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRoyaltyConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRoyaltyConfig(com.likechain.likenft.v1.MsgUpdateRoyaltyConfig request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRoyaltyConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void deleteRoyaltyConfig(com.likechain.likenft.v1.MsgDeleteRoyaltyConfig request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgDeleteRoyaltyConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRoyaltyConfigMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the Msg service.
   * </pre>
   */
  public static final class MsgBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MsgBlockingStub> {
    private MsgBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.likechain.likenft.v1.MsgNewClassResponse newClass(com.likechain.likenft.v1.MsgNewClass request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewClassMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.likechain.likenft.v1.MsgUpdateClassResponse updateClass(com.likechain.likenft.v1.MsgUpdateClass request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateClassMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.likechain.likenft.v1.MsgMintNFTResponse mintNFT(com.likechain.likenft.v1.MsgMintNFT request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMintNFTMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.likechain.likenft.v1.MsgBurnNFTResponse burnNFT(com.likechain.likenft.v1.MsgBurnNFT request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBurnNFTMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.likechain.likenft.v1.MsgCreateBlindBoxContentResponse createBlindBoxContent(com.likechain.likenft.v1.MsgCreateBlindBoxContent request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBlindBoxContentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.likechain.likenft.v1.MsgUpdateBlindBoxContentResponse updateBlindBoxContent(com.likechain.likenft.v1.MsgUpdateBlindBoxContent request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBlindBoxContentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.likechain.likenft.v1.MsgDeleteBlindBoxContentResponse deleteBlindBoxContent(com.likechain.likenft.v1.MsgDeleteBlindBoxContent request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteBlindBoxContentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.likechain.likenft.v1.MsgCreateOfferResponse createOffer(com.likechain.likenft.v1.MsgCreateOffer request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOfferMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.likechain.likenft.v1.MsgUpdateOfferResponse updateOffer(com.likechain.likenft.v1.MsgUpdateOffer request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOfferMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.likechain.likenft.v1.MsgDeleteOfferResponse deleteOffer(com.likechain.likenft.v1.MsgDeleteOffer request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOfferMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.likechain.likenft.v1.MsgCreateListingResponse createListing(com.likechain.likenft.v1.MsgCreateListing request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateListingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.likechain.likenft.v1.MsgUpdateListingResponse updateListing(com.likechain.likenft.v1.MsgUpdateListing request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateListingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.likechain.likenft.v1.MsgDeleteListingResponse deleteListing(com.likechain.likenft.v1.MsgDeleteListing request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteListingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.likechain.likenft.v1.MsgSellNFTResponse sellNFT(com.likechain.likenft.v1.MsgSellNFT request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSellNFTMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.likechain.likenft.v1.MsgBuyNFTResponse buyNFT(com.likechain.likenft.v1.MsgBuyNFT request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuyNFTMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.likechain.likenft.v1.MsgCreateRoyaltyConfigResponse createRoyaltyConfig(com.likechain.likenft.v1.MsgCreateRoyaltyConfig request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRoyaltyConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse updateRoyaltyConfig(com.likechain.likenft.v1.MsgUpdateRoyaltyConfig request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRoyaltyConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.likechain.likenft.v1.MsgDeleteRoyaltyConfigResponse deleteRoyaltyConfig(com.likechain.likenft.v1.MsgDeleteRoyaltyConfig request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRoyaltyConfigMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the Msg service.
   * </pre>
   */
  public static final class MsgFutureStub
      extends io.grpc.stub.AbstractFutureStub<MsgFutureStub> {
    private MsgFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.MsgNewClassResponse> newClass(
        com.likechain.likenft.v1.MsgNewClass request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewClassMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.MsgUpdateClassResponse> updateClass(
        com.likechain.likenft.v1.MsgUpdateClass request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateClassMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.MsgMintNFTResponse> mintNFT(
        com.likechain.likenft.v1.MsgMintNFT request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMintNFTMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.MsgBurnNFTResponse> burnNFT(
        com.likechain.likenft.v1.MsgBurnNFT request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBurnNFTMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.MsgCreateBlindBoxContentResponse> createBlindBoxContent(
        com.likechain.likenft.v1.MsgCreateBlindBoxContent request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBlindBoxContentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.MsgUpdateBlindBoxContentResponse> updateBlindBoxContent(
        com.likechain.likenft.v1.MsgUpdateBlindBoxContent request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBlindBoxContentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.MsgDeleteBlindBoxContentResponse> deleteBlindBoxContent(
        com.likechain.likenft.v1.MsgDeleteBlindBoxContent request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteBlindBoxContentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.MsgCreateOfferResponse> createOffer(
        com.likechain.likenft.v1.MsgCreateOffer request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOfferMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.MsgUpdateOfferResponse> updateOffer(
        com.likechain.likenft.v1.MsgUpdateOffer request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOfferMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.MsgDeleteOfferResponse> deleteOffer(
        com.likechain.likenft.v1.MsgDeleteOffer request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOfferMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.MsgCreateListingResponse> createListing(
        com.likechain.likenft.v1.MsgCreateListing request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateListingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.MsgUpdateListingResponse> updateListing(
        com.likechain.likenft.v1.MsgUpdateListing request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateListingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.MsgDeleteListingResponse> deleteListing(
        com.likechain.likenft.v1.MsgDeleteListing request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteListingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.MsgSellNFTResponse> sellNFT(
        com.likechain.likenft.v1.MsgSellNFT request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSellNFTMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.MsgBuyNFTResponse> buyNFT(
        com.likechain.likenft.v1.MsgBuyNFT request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuyNFTMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.MsgCreateRoyaltyConfigResponse> createRoyaltyConfig(
        com.likechain.likenft.v1.MsgCreateRoyaltyConfig request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRoyaltyConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse> updateRoyaltyConfig(
        com.likechain.likenft.v1.MsgUpdateRoyaltyConfig request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRoyaltyConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.MsgDeleteRoyaltyConfigResponse> deleteRoyaltyConfig(
        com.likechain.likenft.v1.MsgDeleteRoyaltyConfig request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRoyaltyConfigMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NEW_CLASS = 0;
  private static final int METHODID_UPDATE_CLASS = 1;
  private static final int METHODID_MINT_NFT = 2;
  private static final int METHODID_BURN_NFT = 3;
  private static final int METHODID_CREATE_BLIND_BOX_CONTENT = 4;
  private static final int METHODID_UPDATE_BLIND_BOX_CONTENT = 5;
  private static final int METHODID_DELETE_BLIND_BOX_CONTENT = 6;
  private static final int METHODID_CREATE_OFFER = 7;
  private static final int METHODID_UPDATE_OFFER = 8;
  private static final int METHODID_DELETE_OFFER = 9;
  private static final int METHODID_CREATE_LISTING = 10;
  private static final int METHODID_UPDATE_LISTING = 11;
  private static final int METHODID_DELETE_LISTING = 12;
  private static final int METHODID_SELL_NFT = 13;
  private static final int METHODID_BUY_NFT = 14;
  private static final int METHODID_CREATE_ROYALTY_CONFIG = 15;
  private static final int METHODID_UPDATE_ROYALTY_CONFIG = 16;
  private static final int METHODID_DELETE_ROYALTY_CONFIG = 17;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NEW_CLASS:
          serviceImpl.newClass((com.likechain.likenft.v1.MsgNewClass) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgNewClassResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CLASS:
          serviceImpl.updateClass((com.likechain.likenft.v1.MsgUpdateClass) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgUpdateClassResponse>) responseObserver);
          break;
        case METHODID_MINT_NFT:
          serviceImpl.mintNFT((com.likechain.likenft.v1.MsgMintNFT) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgMintNFTResponse>) responseObserver);
          break;
        case METHODID_BURN_NFT:
          serviceImpl.burnNFT((com.likechain.likenft.v1.MsgBurnNFT) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgBurnNFTResponse>) responseObserver);
          break;
        case METHODID_CREATE_BLIND_BOX_CONTENT:
          serviceImpl.createBlindBoxContent((com.likechain.likenft.v1.MsgCreateBlindBoxContent) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgCreateBlindBoxContentResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BLIND_BOX_CONTENT:
          serviceImpl.updateBlindBoxContent((com.likechain.likenft.v1.MsgUpdateBlindBoxContent) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgUpdateBlindBoxContentResponse>) responseObserver);
          break;
        case METHODID_DELETE_BLIND_BOX_CONTENT:
          serviceImpl.deleteBlindBoxContent((com.likechain.likenft.v1.MsgDeleteBlindBoxContent) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgDeleteBlindBoxContentResponse>) responseObserver);
          break;
        case METHODID_CREATE_OFFER:
          serviceImpl.createOffer((com.likechain.likenft.v1.MsgCreateOffer) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgCreateOfferResponse>) responseObserver);
          break;
        case METHODID_UPDATE_OFFER:
          serviceImpl.updateOffer((com.likechain.likenft.v1.MsgUpdateOffer) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgUpdateOfferResponse>) responseObserver);
          break;
        case METHODID_DELETE_OFFER:
          serviceImpl.deleteOffer((com.likechain.likenft.v1.MsgDeleteOffer) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgDeleteOfferResponse>) responseObserver);
          break;
        case METHODID_CREATE_LISTING:
          serviceImpl.createListing((com.likechain.likenft.v1.MsgCreateListing) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgCreateListingResponse>) responseObserver);
          break;
        case METHODID_UPDATE_LISTING:
          serviceImpl.updateListing((com.likechain.likenft.v1.MsgUpdateListing) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgUpdateListingResponse>) responseObserver);
          break;
        case METHODID_DELETE_LISTING:
          serviceImpl.deleteListing((com.likechain.likenft.v1.MsgDeleteListing) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgDeleteListingResponse>) responseObserver);
          break;
        case METHODID_SELL_NFT:
          serviceImpl.sellNFT((com.likechain.likenft.v1.MsgSellNFT) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgSellNFTResponse>) responseObserver);
          break;
        case METHODID_BUY_NFT:
          serviceImpl.buyNFT((com.likechain.likenft.v1.MsgBuyNFT) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgBuyNFTResponse>) responseObserver);
          break;
        case METHODID_CREATE_ROYALTY_CONFIG:
          serviceImpl.createRoyaltyConfig((com.likechain.likenft.v1.MsgCreateRoyaltyConfig) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgCreateRoyaltyConfigResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ROYALTY_CONFIG:
          serviceImpl.updateRoyaltyConfig((com.likechain.likenft.v1.MsgUpdateRoyaltyConfig) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse>) responseObserver);
          break;
        case METHODID_DELETE_ROYALTY_CONFIG:
          serviceImpl.deleteRoyaltyConfig((com.likechain.likenft.v1.MsgDeleteRoyaltyConfig) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.MsgDeleteRoyaltyConfigResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getNewClassMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.MsgNewClass,
              com.likechain.likenft.v1.MsgNewClassResponse>(
                service, METHODID_NEW_CLASS)))
        .addMethod(
          getUpdateClassMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.MsgUpdateClass,
              com.likechain.likenft.v1.MsgUpdateClassResponse>(
                service, METHODID_UPDATE_CLASS)))
        .addMethod(
          getMintNFTMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.MsgMintNFT,
              com.likechain.likenft.v1.MsgMintNFTResponse>(
                service, METHODID_MINT_NFT)))
        .addMethod(
          getBurnNFTMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.MsgBurnNFT,
              com.likechain.likenft.v1.MsgBurnNFTResponse>(
                service, METHODID_BURN_NFT)))
        .addMethod(
          getCreateBlindBoxContentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.MsgCreateBlindBoxContent,
              com.likechain.likenft.v1.MsgCreateBlindBoxContentResponse>(
                service, METHODID_CREATE_BLIND_BOX_CONTENT)))
        .addMethod(
          getUpdateBlindBoxContentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.MsgUpdateBlindBoxContent,
              com.likechain.likenft.v1.MsgUpdateBlindBoxContentResponse>(
                service, METHODID_UPDATE_BLIND_BOX_CONTENT)))
        .addMethod(
          getDeleteBlindBoxContentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.MsgDeleteBlindBoxContent,
              com.likechain.likenft.v1.MsgDeleteBlindBoxContentResponse>(
                service, METHODID_DELETE_BLIND_BOX_CONTENT)))
        .addMethod(
          getCreateOfferMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.MsgCreateOffer,
              com.likechain.likenft.v1.MsgCreateOfferResponse>(
                service, METHODID_CREATE_OFFER)))
        .addMethod(
          getUpdateOfferMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.MsgUpdateOffer,
              com.likechain.likenft.v1.MsgUpdateOfferResponse>(
                service, METHODID_UPDATE_OFFER)))
        .addMethod(
          getDeleteOfferMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.MsgDeleteOffer,
              com.likechain.likenft.v1.MsgDeleteOfferResponse>(
                service, METHODID_DELETE_OFFER)))
        .addMethod(
          getCreateListingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.MsgCreateListing,
              com.likechain.likenft.v1.MsgCreateListingResponse>(
                service, METHODID_CREATE_LISTING)))
        .addMethod(
          getUpdateListingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.MsgUpdateListing,
              com.likechain.likenft.v1.MsgUpdateListingResponse>(
                service, METHODID_UPDATE_LISTING)))
        .addMethod(
          getDeleteListingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.MsgDeleteListing,
              com.likechain.likenft.v1.MsgDeleteListingResponse>(
                service, METHODID_DELETE_LISTING)))
        .addMethod(
          getSellNFTMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.MsgSellNFT,
              com.likechain.likenft.v1.MsgSellNFTResponse>(
                service, METHODID_SELL_NFT)))
        .addMethod(
          getBuyNFTMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.MsgBuyNFT,
              com.likechain.likenft.v1.MsgBuyNFTResponse>(
                service, METHODID_BUY_NFT)))
        .addMethod(
          getCreateRoyaltyConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.MsgCreateRoyaltyConfig,
              com.likechain.likenft.v1.MsgCreateRoyaltyConfigResponse>(
                service, METHODID_CREATE_ROYALTY_CONFIG)))
        .addMethod(
          getUpdateRoyaltyConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.MsgUpdateRoyaltyConfig,
              com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse>(
                service, METHODID_UPDATE_ROYALTY_CONFIG)))
        .addMethod(
          getDeleteRoyaltyConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.MsgDeleteRoyaltyConfig,
              com.likechain.likenft.v1.MsgDeleteRoyaltyConfigResponse>(
                service, METHODID_DELETE_ROYALTY_CONFIG)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.likechain.likenft.v1.TxProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Msg");
    }
  }

  private static final class MsgFileDescriptorSupplier
      extends MsgBaseDescriptorSupplier {
    MsgFileDescriptorSupplier() {}
  }

  private static final class MsgMethodDescriptorSupplier
      extends MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MsgMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MsgGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MsgFileDescriptorSupplier())
              .addMethod(getNewClassMethod())
              .addMethod(getUpdateClassMethod())
              .addMethod(getMintNFTMethod())
              .addMethod(getBurnNFTMethod())
              .addMethod(getCreateBlindBoxContentMethod())
              .addMethod(getUpdateBlindBoxContentMethod())
              .addMethod(getDeleteBlindBoxContentMethod())
              .addMethod(getCreateOfferMethod())
              .addMethod(getUpdateOfferMethod())
              .addMethod(getDeleteOfferMethod())
              .addMethod(getCreateListingMethod())
              .addMethod(getUpdateListingMethod())
              .addMethod(getDeleteListingMethod())
              .addMethod(getSellNFTMethod())
              .addMethod(getBuyNFTMethod())
              .addMethod(getCreateRoyaltyConfigMethod())
              .addMethod(getUpdateRoyaltyConfigMethod())
              .addMethod(getDeleteRoyaltyConfigMethod())
              .build();
        }
      }
    }
    return result;
  }
}
