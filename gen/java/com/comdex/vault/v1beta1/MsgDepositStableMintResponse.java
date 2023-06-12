// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/vault/v1beta1/tx.proto

package com.comdex.vault.v1beta1;

/**
 * Protobuf type {@code comdex.vault.v1beta1.MsgDepositStableMintResponse}
 */
public final class MsgDepositStableMintResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:comdex.vault.v1beta1.MsgDepositStableMintResponse)
    MsgDepositStableMintResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgDepositStableMintResponse.newBuilder() to construct.
  private MsgDepositStableMintResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgDepositStableMintResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgDepositStableMintResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.comdex.vault.v1beta1.TxProto.internal_static_comdex_vault_v1beta1_MsgDepositStableMintResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.comdex.vault.v1beta1.TxProto.internal_static_comdex_vault_v1beta1_MsgDepositStableMintResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.comdex.vault.v1beta1.MsgDepositStableMintResponse.class, com.comdex.vault.v1beta1.MsgDepositStableMintResponse.Builder.class);
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
    if (!(obj instanceof com.comdex.vault.v1beta1.MsgDepositStableMintResponse)) {
      return super.equals(obj);
    }
    com.comdex.vault.v1beta1.MsgDepositStableMintResponse other = (com.comdex.vault.v1beta1.MsgDepositStableMintResponse) obj;

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

  public static com.comdex.vault.v1beta1.MsgDepositStableMintResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.vault.v1beta1.MsgDepositStableMintResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.vault.v1beta1.MsgDepositStableMintResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.vault.v1beta1.MsgDepositStableMintResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.vault.v1beta1.MsgDepositStableMintResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.vault.v1beta1.MsgDepositStableMintResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.vault.v1beta1.MsgDepositStableMintResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.vault.v1beta1.MsgDepositStableMintResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.comdex.vault.v1beta1.MsgDepositStableMintResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.comdex.vault.v1beta1.MsgDepositStableMintResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.comdex.vault.v1beta1.MsgDepositStableMintResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.vault.v1beta1.MsgDepositStableMintResponse parseFrom(
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
  public static Builder newBuilder(com.comdex.vault.v1beta1.MsgDepositStableMintResponse prototype) {
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
   * Protobuf type {@code comdex.vault.v1beta1.MsgDepositStableMintResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:comdex.vault.v1beta1.MsgDepositStableMintResponse)
      com.comdex.vault.v1beta1.MsgDepositStableMintResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.comdex.vault.v1beta1.TxProto.internal_static_comdex_vault_v1beta1_MsgDepositStableMintResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.comdex.vault.v1beta1.TxProto.internal_static_comdex_vault_v1beta1_MsgDepositStableMintResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.comdex.vault.v1beta1.MsgDepositStableMintResponse.class, com.comdex.vault.v1beta1.MsgDepositStableMintResponse.Builder.class);
    }

    // Construct using com.comdex.vault.v1beta1.MsgDepositStableMintResponse.newBuilder()
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
      return com.comdex.vault.v1beta1.TxProto.internal_static_comdex_vault_v1beta1_MsgDepositStableMintResponse_descriptor;
    }

    @java.lang.Override
    public com.comdex.vault.v1beta1.MsgDepositStableMintResponse getDefaultInstanceForType() {
      return com.comdex.vault.v1beta1.MsgDepositStableMintResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.comdex.vault.v1beta1.MsgDepositStableMintResponse build() {
      com.comdex.vault.v1beta1.MsgDepositStableMintResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.comdex.vault.v1beta1.MsgDepositStableMintResponse buildPartial() {
      com.comdex.vault.v1beta1.MsgDepositStableMintResponse result = new com.comdex.vault.v1beta1.MsgDepositStableMintResponse(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.comdex.vault.v1beta1.MsgDepositStableMintResponse) {
        return mergeFrom((com.comdex.vault.v1beta1.MsgDepositStableMintResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.comdex.vault.v1beta1.MsgDepositStableMintResponse other) {
      if (other == com.comdex.vault.v1beta1.MsgDepositStableMintResponse.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:comdex.vault.v1beta1.MsgDepositStableMintResponse)
  }

  // @@protoc_insertion_point(class_scope:comdex.vault.v1beta1.MsgDepositStableMintResponse)
  private static final com.comdex.vault.v1beta1.MsgDepositStableMintResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.comdex.vault.v1beta1.MsgDepositStableMintResponse();
  }

  public static com.comdex.vault.v1beta1.MsgDepositStableMintResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgDepositStableMintResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgDepositStableMintResponse>() {
    @java.lang.Override
    public MsgDepositStableMintResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgDepositStableMintResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgDepositStableMintResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.comdex.vault.v1beta1.MsgDepositStableMintResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

