// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/deployment/v1beta3/authz.proto

package com.akash.deployment.v1beta3;

/**
 * <pre>
 * DepositDeploymentAuthorization allows the grantee to deposit up to spend_limit coins from
 * the granter's account for a deployment.
 * </pre>
 *
 * Protobuf type {@code akash.deployment.v1beta3.DepositDeploymentAuthorization}
 */
public final class DepositDeploymentAuthorization extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:akash.deployment.v1beta3.DepositDeploymentAuthorization)
    DepositDeploymentAuthorizationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DepositDeploymentAuthorization.newBuilder() to construct.
  private DepositDeploymentAuthorization(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DepositDeploymentAuthorization() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DepositDeploymentAuthorization();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.akash.deployment.v1beta3.AuthzProto.internal_static_akash_deployment_v1beta3_DepositDeploymentAuthorization_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.akash.deployment.v1beta3.AuthzProto.internal_static_akash_deployment_v1beta3_DepositDeploymentAuthorization_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.akash.deployment.v1beta3.DepositDeploymentAuthorization.class, com.akash.deployment.v1beta3.DepositDeploymentAuthorization.Builder.class);
  }

  public static final int SPEND_LIMIT_FIELD_NUMBER = 1;
  private com.cosmos.base.v1beta1.Coin spendLimit_;
  /**
   * <pre>
   * SpendLimit is the amount the grantee is authorized to spend from the granter's account for
   * the purpose of deployment.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin spend_limit = 1 [json_name = "spendLimit", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spend_limit"];</code>
   * @return Whether the spendLimit field is set.
   */
  @java.lang.Override
  public boolean hasSpendLimit() {
    return spendLimit_ != null;
  }
  /**
   * <pre>
   * SpendLimit is the amount the grantee is authorized to spend from the granter's account for
   * the purpose of deployment.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin spend_limit = 1 [json_name = "spendLimit", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spend_limit"];</code>
   * @return The spendLimit.
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getSpendLimit() {
    return spendLimit_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : spendLimit_;
  }
  /**
   * <pre>
   * SpendLimit is the amount the grantee is authorized to spend from the granter's account for
   * the purpose of deployment.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin spend_limit = 1 [json_name = "spendLimit", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spend_limit"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getSpendLimitOrBuilder() {
    return spendLimit_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : spendLimit_;
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
    if (spendLimit_ != null) {
      output.writeMessage(1, getSpendLimit());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (spendLimit_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSpendLimit());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.akash.deployment.v1beta3.DepositDeploymentAuthorization)) {
      return super.equals(obj);
    }
    com.akash.deployment.v1beta3.DepositDeploymentAuthorization other = (com.akash.deployment.v1beta3.DepositDeploymentAuthorization) obj;

    if (hasSpendLimit() != other.hasSpendLimit()) return false;
    if (hasSpendLimit()) {
      if (!getSpendLimit()
          .equals(other.getSpendLimit())) return false;
    }
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
    if (hasSpendLimit()) {
      hash = (37 * hash) + SPEND_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getSpendLimit().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.akash.deployment.v1beta3.DepositDeploymentAuthorization parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.deployment.v1beta3.DepositDeploymentAuthorization parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.deployment.v1beta3.DepositDeploymentAuthorization parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.deployment.v1beta3.DepositDeploymentAuthorization parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.deployment.v1beta3.DepositDeploymentAuthorization parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.deployment.v1beta3.DepositDeploymentAuthorization parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.deployment.v1beta3.DepositDeploymentAuthorization parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.deployment.v1beta3.DepositDeploymentAuthorization parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.akash.deployment.v1beta3.DepositDeploymentAuthorization parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.akash.deployment.v1beta3.DepositDeploymentAuthorization parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.akash.deployment.v1beta3.DepositDeploymentAuthorization parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.deployment.v1beta3.DepositDeploymentAuthorization parseFrom(
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
  public static Builder newBuilder(com.akash.deployment.v1beta3.DepositDeploymentAuthorization prototype) {
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
   * DepositDeploymentAuthorization allows the grantee to deposit up to spend_limit coins from
   * the granter's account for a deployment.
   * </pre>
   *
   * Protobuf type {@code akash.deployment.v1beta3.DepositDeploymentAuthorization}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:akash.deployment.v1beta3.DepositDeploymentAuthorization)
      com.akash.deployment.v1beta3.DepositDeploymentAuthorizationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akash.deployment.v1beta3.AuthzProto.internal_static_akash_deployment_v1beta3_DepositDeploymentAuthorization_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akash.deployment.v1beta3.AuthzProto.internal_static_akash_deployment_v1beta3_DepositDeploymentAuthorization_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akash.deployment.v1beta3.DepositDeploymentAuthorization.class, com.akash.deployment.v1beta3.DepositDeploymentAuthorization.Builder.class);
    }

    // Construct using com.akash.deployment.v1beta3.DepositDeploymentAuthorization.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      spendLimit_ = null;
      if (spendLimitBuilder_ != null) {
        spendLimitBuilder_.dispose();
        spendLimitBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.akash.deployment.v1beta3.AuthzProto.internal_static_akash_deployment_v1beta3_DepositDeploymentAuthorization_descriptor;
    }

    @java.lang.Override
    public com.akash.deployment.v1beta3.DepositDeploymentAuthorization getDefaultInstanceForType() {
      return com.akash.deployment.v1beta3.DepositDeploymentAuthorization.getDefaultInstance();
    }

    @java.lang.Override
    public com.akash.deployment.v1beta3.DepositDeploymentAuthorization build() {
      com.akash.deployment.v1beta3.DepositDeploymentAuthorization result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.akash.deployment.v1beta3.DepositDeploymentAuthorization buildPartial() {
      com.akash.deployment.v1beta3.DepositDeploymentAuthorization result = new com.akash.deployment.v1beta3.DepositDeploymentAuthorization(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.akash.deployment.v1beta3.DepositDeploymentAuthorization result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.spendLimit_ = spendLimitBuilder_ == null
            ? spendLimit_
            : spendLimitBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.akash.deployment.v1beta3.DepositDeploymentAuthorization) {
        return mergeFrom((com.akash.deployment.v1beta3.DepositDeploymentAuthorization)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.akash.deployment.v1beta3.DepositDeploymentAuthorization other) {
      if (other == com.akash.deployment.v1beta3.DepositDeploymentAuthorization.getDefaultInstance()) return this;
      if (other.hasSpendLimit()) {
        mergeSpendLimit(other.getSpendLimit());
      }
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
            case 10: {
              input.readMessage(
                  getSpendLimitFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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
    private int bitField0_;

    private com.cosmos.base.v1beta1.Coin spendLimit_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> spendLimitBuilder_;
    /**
     * <pre>
     * SpendLimit is the amount the grantee is authorized to spend from the granter's account for
     * the purpose of deployment.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin spend_limit = 1 [json_name = "spendLimit", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spend_limit"];</code>
     * @return Whether the spendLimit field is set.
     */
    public boolean hasSpendLimit() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * SpendLimit is the amount the grantee is authorized to spend from the granter's account for
     * the purpose of deployment.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin spend_limit = 1 [json_name = "spendLimit", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spend_limit"];</code>
     * @return The spendLimit.
     */
    public com.cosmos.base.v1beta1.Coin getSpendLimit() {
      if (spendLimitBuilder_ == null) {
        return spendLimit_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : spendLimit_;
      } else {
        return spendLimitBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * SpendLimit is the amount the grantee is authorized to spend from the granter's account for
     * the purpose of deployment.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin spend_limit = 1 [json_name = "spendLimit", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spend_limit"];</code>
     */
    public Builder setSpendLimit(com.cosmos.base.v1beta1.Coin value) {
      if (spendLimitBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        spendLimit_ = value;
      } else {
        spendLimitBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * SpendLimit is the amount the grantee is authorized to spend from the granter's account for
     * the purpose of deployment.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin spend_limit = 1 [json_name = "spendLimit", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spend_limit"];</code>
     */
    public Builder setSpendLimit(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (spendLimitBuilder_ == null) {
        spendLimit_ = builderForValue.build();
      } else {
        spendLimitBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * SpendLimit is the amount the grantee is authorized to spend from the granter's account for
     * the purpose of deployment.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin spend_limit = 1 [json_name = "spendLimit", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spend_limit"];</code>
     */
    public Builder mergeSpendLimit(com.cosmos.base.v1beta1.Coin value) {
      if (spendLimitBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          spendLimit_ != null &&
          spendLimit_ != com.cosmos.base.v1beta1.Coin.getDefaultInstance()) {
          getSpendLimitBuilder().mergeFrom(value);
        } else {
          spendLimit_ = value;
        }
      } else {
        spendLimitBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * SpendLimit is the amount the grantee is authorized to spend from the granter's account for
     * the purpose of deployment.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin spend_limit = 1 [json_name = "spendLimit", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spend_limit"];</code>
     */
    public Builder clearSpendLimit() {
      bitField0_ = (bitField0_ & ~0x00000001);
      spendLimit_ = null;
      if (spendLimitBuilder_ != null) {
        spendLimitBuilder_.dispose();
        spendLimitBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * SpendLimit is the amount the grantee is authorized to spend from the granter's account for
     * the purpose of deployment.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin spend_limit = 1 [json_name = "spendLimit", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spend_limit"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getSpendLimitBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSpendLimitFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * SpendLimit is the amount the grantee is authorized to spend from the granter's account for
     * the purpose of deployment.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin spend_limit = 1 [json_name = "spendLimit", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spend_limit"];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getSpendLimitOrBuilder() {
      if (spendLimitBuilder_ != null) {
        return spendLimitBuilder_.getMessageOrBuilder();
      } else {
        return spendLimit_ == null ?
            com.cosmos.base.v1beta1.Coin.getDefaultInstance() : spendLimit_;
      }
    }
    /**
     * <pre>
     * SpendLimit is the amount the grantee is authorized to spend from the granter's account for
     * the purpose of deployment.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin spend_limit = 1 [json_name = "spendLimit", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spend_limit"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getSpendLimitFieldBuilder() {
      if (spendLimitBuilder_ == null) {
        spendLimitBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                getSpendLimit(),
                getParentForChildren(),
                isClean());
        spendLimit_ = null;
      }
      return spendLimitBuilder_;
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


    // @@protoc_insertion_point(builder_scope:akash.deployment.v1beta3.DepositDeploymentAuthorization)
  }

  // @@protoc_insertion_point(class_scope:akash.deployment.v1beta3.DepositDeploymentAuthorization)
  private static final com.akash.deployment.v1beta3.DepositDeploymentAuthorization DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.akash.deployment.v1beta3.DepositDeploymentAuthorization();
  }

  public static com.akash.deployment.v1beta3.DepositDeploymentAuthorization getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DepositDeploymentAuthorization>
      PARSER = new com.google.protobuf.AbstractParser<DepositDeploymentAuthorization>() {
    @java.lang.Override
    public DepositDeploymentAuthorization parsePartialFrom(
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

  public static com.google.protobuf.Parser<DepositDeploymentAuthorization> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DepositDeploymentAuthorization> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.akash.deployment.v1beta3.DepositDeploymentAuthorization getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

