// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/pricefeed/v1beta1/tx.proto

package com.kava.pricefeed.v1beta1;

/**
 * <pre>
 * MsgPostPriceResponse defines the Msg/PostPrice response type.
 * </pre>
 *
 * Protobuf type {@code kava.pricefeed.v1beta1.MsgPostPriceResponse}
 */
public final class MsgPostPriceResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kava.pricefeed.v1beta1.MsgPostPriceResponse)
    MsgPostPriceResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgPostPriceResponse.newBuilder() to construct.
  private MsgPostPriceResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgPostPriceResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgPostPriceResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kava.pricefeed.v1beta1.TxProto.internal_static_kava_pricefeed_v1beta1_MsgPostPriceResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kava.pricefeed.v1beta1.TxProto.internal_static_kava_pricefeed_v1beta1_MsgPostPriceResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kava.pricefeed.v1beta1.MsgPostPriceResponse.class, com.kava.pricefeed.v1beta1.MsgPostPriceResponse.Builder.class);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.kava.pricefeed.v1beta1.MsgPostPriceResponse)) {
      return super.equals(obj);
    }
    com.kava.pricefeed.v1beta1.MsgPostPriceResponse other = (com.kava.pricefeed.v1beta1.MsgPostPriceResponse) obj;

    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kava.pricefeed.v1beta1.MsgPostPriceResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.pricefeed.v1beta1.MsgPostPriceResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.pricefeed.v1beta1.MsgPostPriceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.pricefeed.v1beta1.MsgPostPriceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.pricefeed.v1beta1.MsgPostPriceResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.pricefeed.v1beta1.MsgPostPriceResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.pricefeed.v1beta1.MsgPostPriceResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kava.pricefeed.v1beta1.MsgPostPriceResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.kava.pricefeed.v1beta1.MsgPostPriceResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.kava.pricefeed.v1beta1.MsgPostPriceResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kava.pricefeed.v1beta1.MsgPostPriceResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kava.pricefeed.v1beta1.MsgPostPriceResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.kava.pricefeed.v1beta1.MsgPostPriceResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * MsgPostPriceResponse defines the Msg/PostPrice response type.
   * </pre>
   *
   * Protobuf type {@code kava.pricefeed.v1beta1.MsgPostPriceResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kava.pricefeed.v1beta1.MsgPostPriceResponse)
      com.kava.pricefeed.v1beta1.MsgPostPriceResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kava.pricefeed.v1beta1.TxProto.internal_static_kava_pricefeed_v1beta1_MsgPostPriceResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kava.pricefeed.v1beta1.TxProto.internal_static_kava_pricefeed_v1beta1_MsgPostPriceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kava.pricefeed.v1beta1.MsgPostPriceResponse.class, com.kava.pricefeed.v1beta1.MsgPostPriceResponse.Builder.class);
    }

    // Construct using com.kava.pricefeed.v1beta1.MsgPostPriceResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kava.pricefeed.v1beta1.TxProto.internal_static_kava_pricefeed_v1beta1_MsgPostPriceResponse_descriptor;
    }

    @java.lang.Override
    public com.kava.pricefeed.v1beta1.MsgPostPriceResponse getDefaultInstanceForType() {
      return com.kava.pricefeed.v1beta1.MsgPostPriceResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.kava.pricefeed.v1beta1.MsgPostPriceResponse build() {
      com.kava.pricefeed.v1beta1.MsgPostPriceResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kava.pricefeed.v1beta1.MsgPostPriceResponse buildPartial() {
      com.kava.pricefeed.v1beta1.MsgPostPriceResponse result = new com.kava.pricefeed.v1beta1.MsgPostPriceResponse(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kava.pricefeed.v1beta1.MsgPostPriceResponse) {
        return mergeFrom((com.kava.pricefeed.v1beta1.MsgPostPriceResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kava.pricefeed.v1beta1.MsgPostPriceResponse other) {
      if (other == com.kava.pricefeed.v1beta1.MsgPostPriceResponse.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:kava.pricefeed.v1beta1.MsgPostPriceResponse)
  }

  // @@protoc_insertion_point(class_scope:kava.pricefeed.v1beta1.MsgPostPriceResponse)
  private static final com.kava.pricefeed.v1beta1.MsgPostPriceResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kava.pricefeed.v1beta1.MsgPostPriceResponse();
  }

  public static com.kava.pricefeed.v1beta1.MsgPostPriceResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgPostPriceResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgPostPriceResponse>() {
    @java.lang.Override
    public MsgPostPriceResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<MsgPostPriceResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgPostPriceResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kava.pricefeed.v1beta1.MsgPostPriceResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

