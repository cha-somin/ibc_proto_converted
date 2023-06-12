// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/deployment/v1beta2/params.proto

package com.akash.deployment.v1beta2;

/**
 * <pre>
 * Params defines the parameters for the x/deployment package
 * </pre>
 *
 * Protobuf type {@code akash.deployment.v1beta2.Params}
 */
public final class Params extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:akash.deployment.v1beta2.Params)
    ParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Params.newBuilder() to construct.
  private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Params() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Params();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.akash.deployment.v1beta2.ParamsProto.internal_static_akash_deployment_v1beta2_Params_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.akash.deployment.v1beta2.ParamsProto.internal_static_akash_deployment_v1beta2_Params_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.akash.deployment.v1beta2.Params.class, com.akash.deployment.v1beta2.Params.Builder.class);
  }

  public static final int DEPLOYMENT_MIN_DEPOSIT_FIELD_NUMBER = 1;
  private com.cosmos.base.v1beta1.Coin deploymentMinDeposit_;
  /**
   * <code>.cosmos.base.v1beta1.Coin deployment_min_deposit = 1 [json_name = "deploymentMinDeposit", (.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentMinDeposit", (.gogoproto.jsontag) = "deployment_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"deployment_min_deposit&#92;""];</code>
   * @return Whether the deploymentMinDeposit field is set.
   */
  @java.lang.Override
  public boolean hasDeploymentMinDeposit() {
    return deploymentMinDeposit_ != null;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin deployment_min_deposit = 1 [json_name = "deploymentMinDeposit", (.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentMinDeposit", (.gogoproto.jsontag) = "deployment_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"deployment_min_deposit&#92;""];</code>
   * @return The deploymentMinDeposit.
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getDeploymentMinDeposit() {
    return deploymentMinDeposit_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : deploymentMinDeposit_;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin deployment_min_deposit = 1 [json_name = "deploymentMinDeposit", (.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentMinDeposit", (.gogoproto.jsontag) = "deployment_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"deployment_min_deposit&#92;""];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getDeploymentMinDepositOrBuilder() {
    return deploymentMinDeposit_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : deploymentMinDeposit_;
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
    if (deploymentMinDeposit_ != null) {
      output.writeMessage(1, getDeploymentMinDeposit());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (deploymentMinDeposit_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDeploymentMinDeposit());
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
    if (!(obj instanceof com.akash.deployment.v1beta2.Params)) {
      return super.equals(obj);
    }
    com.akash.deployment.v1beta2.Params other = (com.akash.deployment.v1beta2.Params) obj;

    if (hasDeploymentMinDeposit() != other.hasDeploymentMinDeposit()) return false;
    if (hasDeploymentMinDeposit()) {
      if (!getDeploymentMinDeposit()
          .equals(other.getDeploymentMinDeposit())) return false;
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
    if (hasDeploymentMinDeposit()) {
      hash = (37 * hash) + DEPLOYMENT_MIN_DEPOSIT_FIELD_NUMBER;
      hash = (53 * hash) + getDeploymentMinDeposit().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.akash.deployment.v1beta2.Params parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.deployment.v1beta2.Params parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.deployment.v1beta2.Params parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.deployment.v1beta2.Params parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.deployment.v1beta2.Params parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.deployment.v1beta2.Params parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.deployment.v1beta2.Params parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.deployment.v1beta2.Params parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.akash.deployment.v1beta2.Params parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.akash.deployment.v1beta2.Params parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.akash.deployment.v1beta2.Params parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.deployment.v1beta2.Params parseFrom(
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
  public static Builder newBuilder(com.akash.deployment.v1beta2.Params prototype) {
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
   * Params defines the parameters for the x/deployment package
   * </pre>
   *
   * Protobuf type {@code akash.deployment.v1beta2.Params}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:akash.deployment.v1beta2.Params)
      com.akash.deployment.v1beta2.ParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akash.deployment.v1beta2.ParamsProto.internal_static_akash_deployment_v1beta2_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akash.deployment.v1beta2.ParamsProto.internal_static_akash_deployment_v1beta2_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akash.deployment.v1beta2.Params.class, com.akash.deployment.v1beta2.Params.Builder.class);
    }

    // Construct using com.akash.deployment.v1beta2.Params.newBuilder()
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
      deploymentMinDeposit_ = null;
      if (deploymentMinDepositBuilder_ != null) {
        deploymentMinDepositBuilder_.dispose();
        deploymentMinDepositBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.akash.deployment.v1beta2.ParamsProto.internal_static_akash_deployment_v1beta2_Params_descriptor;
    }

    @java.lang.Override
    public com.akash.deployment.v1beta2.Params getDefaultInstanceForType() {
      return com.akash.deployment.v1beta2.Params.getDefaultInstance();
    }

    @java.lang.Override
    public com.akash.deployment.v1beta2.Params build() {
      com.akash.deployment.v1beta2.Params result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.akash.deployment.v1beta2.Params buildPartial() {
      com.akash.deployment.v1beta2.Params result = new com.akash.deployment.v1beta2.Params(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.akash.deployment.v1beta2.Params result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.deploymentMinDeposit_ = deploymentMinDepositBuilder_ == null
            ? deploymentMinDeposit_
            : deploymentMinDepositBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.akash.deployment.v1beta2.Params) {
        return mergeFrom((com.akash.deployment.v1beta2.Params)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.akash.deployment.v1beta2.Params other) {
      if (other == com.akash.deployment.v1beta2.Params.getDefaultInstance()) return this;
      if (other.hasDeploymentMinDeposit()) {
        mergeDeploymentMinDeposit(other.getDeploymentMinDeposit());
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
                  getDeploymentMinDepositFieldBuilder().getBuilder(),
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

    private com.cosmos.base.v1beta1.Coin deploymentMinDeposit_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> deploymentMinDepositBuilder_;
    /**
     * <code>.cosmos.base.v1beta1.Coin deployment_min_deposit = 1 [json_name = "deploymentMinDeposit", (.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentMinDeposit", (.gogoproto.jsontag) = "deployment_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"deployment_min_deposit&#92;""];</code>
     * @return Whether the deploymentMinDeposit field is set.
     */
    public boolean hasDeploymentMinDeposit() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin deployment_min_deposit = 1 [json_name = "deploymentMinDeposit", (.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentMinDeposit", (.gogoproto.jsontag) = "deployment_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"deployment_min_deposit&#92;""];</code>
     * @return The deploymentMinDeposit.
     */
    public com.cosmos.base.v1beta1.Coin getDeploymentMinDeposit() {
      if (deploymentMinDepositBuilder_ == null) {
        return deploymentMinDeposit_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : deploymentMinDeposit_;
      } else {
        return deploymentMinDepositBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin deployment_min_deposit = 1 [json_name = "deploymentMinDeposit", (.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentMinDeposit", (.gogoproto.jsontag) = "deployment_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"deployment_min_deposit&#92;""];</code>
     */
    public Builder setDeploymentMinDeposit(com.cosmos.base.v1beta1.Coin value) {
      if (deploymentMinDepositBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        deploymentMinDeposit_ = value;
      } else {
        deploymentMinDepositBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin deployment_min_deposit = 1 [json_name = "deploymentMinDeposit", (.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentMinDeposit", (.gogoproto.jsontag) = "deployment_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"deployment_min_deposit&#92;""];</code>
     */
    public Builder setDeploymentMinDeposit(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (deploymentMinDepositBuilder_ == null) {
        deploymentMinDeposit_ = builderForValue.build();
      } else {
        deploymentMinDepositBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin deployment_min_deposit = 1 [json_name = "deploymentMinDeposit", (.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentMinDeposit", (.gogoproto.jsontag) = "deployment_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"deployment_min_deposit&#92;""];</code>
     */
    public Builder mergeDeploymentMinDeposit(com.cosmos.base.v1beta1.Coin value) {
      if (deploymentMinDepositBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          deploymentMinDeposit_ != null &&
          deploymentMinDeposit_ != com.cosmos.base.v1beta1.Coin.getDefaultInstance()) {
          getDeploymentMinDepositBuilder().mergeFrom(value);
        } else {
          deploymentMinDeposit_ = value;
        }
      } else {
        deploymentMinDepositBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin deployment_min_deposit = 1 [json_name = "deploymentMinDeposit", (.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentMinDeposit", (.gogoproto.jsontag) = "deployment_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"deployment_min_deposit&#92;""];</code>
     */
    public Builder clearDeploymentMinDeposit() {
      bitField0_ = (bitField0_ & ~0x00000001);
      deploymentMinDeposit_ = null;
      if (deploymentMinDepositBuilder_ != null) {
        deploymentMinDepositBuilder_.dispose();
        deploymentMinDepositBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin deployment_min_deposit = 1 [json_name = "deploymentMinDeposit", (.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentMinDeposit", (.gogoproto.jsontag) = "deployment_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"deployment_min_deposit&#92;""];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getDeploymentMinDepositBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDeploymentMinDepositFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin deployment_min_deposit = 1 [json_name = "deploymentMinDeposit", (.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentMinDeposit", (.gogoproto.jsontag) = "deployment_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"deployment_min_deposit&#92;""];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getDeploymentMinDepositOrBuilder() {
      if (deploymentMinDepositBuilder_ != null) {
        return deploymentMinDepositBuilder_.getMessageOrBuilder();
      } else {
        return deploymentMinDeposit_ == null ?
            com.cosmos.base.v1beta1.Coin.getDefaultInstance() : deploymentMinDeposit_;
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin deployment_min_deposit = 1 [json_name = "deploymentMinDeposit", (.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentMinDeposit", (.gogoproto.jsontag) = "deployment_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"deployment_min_deposit&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getDeploymentMinDepositFieldBuilder() {
      if (deploymentMinDepositBuilder_ == null) {
        deploymentMinDepositBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                getDeploymentMinDeposit(),
                getParentForChildren(),
                isClean());
        deploymentMinDeposit_ = null;
      }
      return deploymentMinDepositBuilder_;
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


    // @@protoc_insertion_point(builder_scope:akash.deployment.v1beta2.Params)
  }

  // @@protoc_insertion_point(class_scope:akash.deployment.v1beta2.Params)
  private static final com.akash.deployment.v1beta2.Params DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.akash.deployment.v1beta2.Params();
  }

  public static com.akash.deployment.v1beta2.Params getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Params>
      PARSER = new com.google.protobuf.AbstractParser<Params>() {
    @java.lang.Override
    public Params parsePartialFrom(
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

  public static com.google.protobuf.Parser<Params> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Params> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.akash.deployment.v1beta2.Params getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

