// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/deployment/v1beta3/deploymentmsg.proto

package com.akash.deployment.v1beta3;

/**
 * <pre>
 * MsgDepositDeployment deposits more funds into the deposit account
 * </pre>
 *
 * Protobuf type {@code akash.deployment.v1beta3.MsgDepositDeployment}
 */
public final class MsgDepositDeployment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:akash.deployment.v1beta3.MsgDepositDeployment)
    MsgDepositDeploymentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgDepositDeployment.newBuilder() to construct.
  private MsgDepositDeployment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgDepositDeployment() {
    depositor_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgDepositDeployment();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.akash.deployment.v1beta3.DeploymentmsgProto.internal_static_akash_deployment_v1beta3_MsgDepositDeployment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.akash.deployment.v1beta3.DeploymentmsgProto.internal_static_akash_deployment_v1beta3_MsgDepositDeployment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.akash.deployment.v1beta3.MsgDepositDeployment.class, com.akash.deployment.v1beta3.MsgDepositDeployment.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private com.akash.deployment.v1beta3.DeploymentID id_;
  /**
   * <code>.akash.deployment.v1beta3.DeploymentID id = 1 [json_name = "id", (.gogoproto.nullable) = false, (.gogoproto.customname) = "ID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
   * @return Whether the id field is set.
   */
  @java.lang.Override
  public boolean hasId() {
    return id_ != null;
  }
  /**
   * <code>.akash.deployment.v1beta3.DeploymentID id = 1 [json_name = "id", (.gogoproto.nullable) = false, (.gogoproto.customname) = "ID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
   * @return The id.
   */
  @java.lang.Override
  public com.akash.deployment.v1beta3.DeploymentID getId() {
    return id_ == null ? com.akash.deployment.v1beta3.DeploymentID.getDefaultInstance() : id_;
  }
  /**
   * <code>.akash.deployment.v1beta3.DeploymentID id = 1 [json_name = "id", (.gogoproto.nullable) = false, (.gogoproto.customname) = "ID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
   */
  @java.lang.Override
  public com.akash.deployment.v1beta3.DeploymentIDOrBuilder getIdOrBuilder() {
    return id_ == null ? com.akash.deployment.v1beta3.DeploymentID.getDefaultInstance() : id_;
  }

  public static final int AMOUNT_FIELD_NUMBER = 2;
  private com.cosmos.base.v1beta1.Coin amount_;
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "amount", (.gogoproto.moretags) = "yaml:&#92;"amount&#92;""];</code>
   * @return Whether the amount field is set.
   */
  @java.lang.Override
  public boolean hasAmount() {
    return amount_ != null;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "amount", (.gogoproto.moretags) = "yaml:&#92;"amount&#92;""];</code>
   * @return The amount.
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getAmount() {
    return amount_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : amount_;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "amount", (.gogoproto.moretags) = "yaml:&#92;"amount&#92;""];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getAmountOrBuilder() {
    return amount_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : amount_;
  }

  public static final int DEPOSITOR_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object depositor_ = "";
  /**
   * <pre>
   * Depositor pays for the deposit
   * </pre>
   *
   * <code>string depositor = 3 [json_name = "depositor", (.gogoproto.jsontag) = "depositor", (.gogoproto.moretags) = "yaml:&#92;"depositor&#92;""];</code>
   * @return The depositor.
   */
  @java.lang.Override
  public java.lang.String getDepositor() {
    java.lang.Object ref = depositor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      depositor_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Depositor pays for the deposit
   * </pre>
   *
   * <code>string depositor = 3 [json_name = "depositor", (.gogoproto.jsontag) = "depositor", (.gogoproto.moretags) = "yaml:&#92;"depositor&#92;""];</code>
   * @return The bytes for depositor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDepositorBytes() {
    java.lang.Object ref = depositor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      depositor_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (id_ != null) {
      output.writeMessage(1, getId());
    }
    if (amount_ != null) {
      output.writeMessage(2, getAmount());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(depositor_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, depositor_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getId());
    }
    if (amount_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAmount());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(depositor_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, depositor_);
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
    if (!(obj instanceof com.akash.deployment.v1beta3.MsgDepositDeployment)) {
      return super.equals(obj);
    }
    com.akash.deployment.v1beta3.MsgDepositDeployment other = (com.akash.deployment.v1beta3.MsgDepositDeployment) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (!getId()
          .equals(other.getId())) return false;
    }
    if (hasAmount() != other.hasAmount()) return false;
    if (hasAmount()) {
      if (!getAmount()
          .equals(other.getAmount())) return false;
    }
    if (!getDepositor()
        .equals(other.getDepositor())) return false;
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
    if (hasId()) {
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId().hashCode();
    }
    if (hasAmount()) {
      hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getAmount().hashCode();
    }
    hash = (37 * hash) + DEPOSITOR_FIELD_NUMBER;
    hash = (53 * hash) + getDepositor().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.akash.deployment.v1beta3.MsgDepositDeployment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.deployment.v1beta3.MsgDepositDeployment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.deployment.v1beta3.MsgDepositDeployment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.deployment.v1beta3.MsgDepositDeployment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.deployment.v1beta3.MsgDepositDeployment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.deployment.v1beta3.MsgDepositDeployment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.deployment.v1beta3.MsgDepositDeployment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.deployment.v1beta3.MsgDepositDeployment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.akash.deployment.v1beta3.MsgDepositDeployment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.akash.deployment.v1beta3.MsgDepositDeployment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.akash.deployment.v1beta3.MsgDepositDeployment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.deployment.v1beta3.MsgDepositDeployment parseFrom(
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
  public static Builder newBuilder(com.akash.deployment.v1beta3.MsgDepositDeployment prototype) {
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
   * MsgDepositDeployment deposits more funds into the deposit account
   * </pre>
   *
   * Protobuf type {@code akash.deployment.v1beta3.MsgDepositDeployment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:akash.deployment.v1beta3.MsgDepositDeployment)
      com.akash.deployment.v1beta3.MsgDepositDeploymentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akash.deployment.v1beta3.DeploymentmsgProto.internal_static_akash_deployment_v1beta3_MsgDepositDeployment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akash.deployment.v1beta3.DeploymentmsgProto.internal_static_akash_deployment_v1beta3_MsgDepositDeployment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akash.deployment.v1beta3.MsgDepositDeployment.class, com.akash.deployment.v1beta3.MsgDepositDeployment.Builder.class);
    }

    // Construct using com.akash.deployment.v1beta3.MsgDepositDeployment.newBuilder()
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
      id_ = null;
      if (idBuilder_ != null) {
        idBuilder_.dispose();
        idBuilder_ = null;
      }
      amount_ = null;
      if (amountBuilder_ != null) {
        amountBuilder_.dispose();
        amountBuilder_ = null;
      }
      depositor_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.akash.deployment.v1beta3.DeploymentmsgProto.internal_static_akash_deployment_v1beta3_MsgDepositDeployment_descriptor;
    }

    @java.lang.Override
    public com.akash.deployment.v1beta3.MsgDepositDeployment getDefaultInstanceForType() {
      return com.akash.deployment.v1beta3.MsgDepositDeployment.getDefaultInstance();
    }

    @java.lang.Override
    public com.akash.deployment.v1beta3.MsgDepositDeployment build() {
      com.akash.deployment.v1beta3.MsgDepositDeployment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.akash.deployment.v1beta3.MsgDepositDeployment buildPartial() {
      com.akash.deployment.v1beta3.MsgDepositDeployment result = new com.akash.deployment.v1beta3.MsgDepositDeployment(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.akash.deployment.v1beta3.MsgDepositDeployment result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = idBuilder_ == null
            ? id_
            : idBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.amount_ = amountBuilder_ == null
            ? amount_
            : amountBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.depositor_ = depositor_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.akash.deployment.v1beta3.MsgDepositDeployment) {
        return mergeFrom((com.akash.deployment.v1beta3.MsgDepositDeployment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.akash.deployment.v1beta3.MsgDepositDeployment other) {
      if (other == com.akash.deployment.v1beta3.MsgDepositDeployment.getDefaultInstance()) return this;
      if (other.hasId()) {
        mergeId(other.getId());
      }
      if (other.hasAmount()) {
        mergeAmount(other.getAmount());
      }
      if (!other.getDepositor().isEmpty()) {
        depositor_ = other.depositor_;
        bitField0_ |= 0x00000004;
        onChanged();
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
                  getIdFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getAmountFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              depositor_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private com.akash.deployment.v1beta3.DeploymentID id_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.akash.deployment.v1beta3.DeploymentID, com.akash.deployment.v1beta3.DeploymentID.Builder, com.akash.deployment.v1beta3.DeploymentIDOrBuilder> idBuilder_;
    /**
     * <code>.akash.deployment.v1beta3.DeploymentID id = 1 [json_name = "id", (.gogoproto.nullable) = false, (.gogoproto.customname) = "ID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     * @return Whether the id field is set.
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.akash.deployment.v1beta3.DeploymentID id = 1 [json_name = "id", (.gogoproto.nullable) = false, (.gogoproto.customname) = "ID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     * @return The id.
     */
    public com.akash.deployment.v1beta3.DeploymentID getId() {
      if (idBuilder_ == null) {
        return id_ == null ? com.akash.deployment.v1beta3.DeploymentID.getDefaultInstance() : id_;
      } else {
        return idBuilder_.getMessage();
      }
    }
    /**
     * <code>.akash.deployment.v1beta3.DeploymentID id = 1 [json_name = "id", (.gogoproto.nullable) = false, (.gogoproto.customname) = "ID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     */
    public Builder setId(com.akash.deployment.v1beta3.DeploymentID value) {
      if (idBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        id_ = value;
      } else {
        idBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.deployment.v1beta3.DeploymentID id = 1 [json_name = "id", (.gogoproto.nullable) = false, (.gogoproto.customname) = "ID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     */
    public Builder setId(
        com.akash.deployment.v1beta3.DeploymentID.Builder builderForValue) {
      if (idBuilder_ == null) {
        id_ = builderForValue.build();
      } else {
        idBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.deployment.v1beta3.DeploymentID id = 1 [json_name = "id", (.gogoproto.nullable) = false, (.gogoproto.customname) = "ID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     */
    public Builder mergeId(com.akash.deployment.v1beta3.DeploymentID value) {
      if (idBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          id_ != null &&
          id_ != com.akash.deployment.v1beta3.DeploymentID.getDefaultInstance()) {
          getIdBuilder().mergeFrom(value);
        } else {
          id_ = value;
        }
      } else {
        idBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.deployment.v1beta3.DeploymentID id = 1 [json_name = "id", (.gogoproto.nullable) = false, (.gogoproto.customname) = "ID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = null;
      if (idBuilder_ != null) {
        idBuilder_.dispose();
        idBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.akash.deployment.v1beta3.DeploymentID id = 1 [json_name = "id", (.gogoproto.nullable) = false, (.gogoproto.customname) = "ID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     */
    public com.akash.deployment.v1beta3.DeploymentID.Builder getIdBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.akash.deployment.v1beta3.DeploymentID id = 1 [json_name = "id", (.gogoproto.nullable) = false, (.gogoproto.customname) = "ID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     */
    public com.akash.deployment.v1beta3.DeploymentIDOrBuilder getIdOrBuilder() {
      if (idBuilder_ != null) {
        return idBuilder_.getMessageOrBuilder();
      } else {
        return id_ == null ?
            com.akash.deployment.v1beta3.DeploymentID.getDefaultInstance() : id_;
      }
    }
    /**
     * <code>.akash.deployment.v1beta3.DeploymentID id = 1 [json_name = "id", (.gogoproto.nullable) = false, (.gogoproto.customname) = "ID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.akash.deployment.v1beta3.DeploymentID, com.akash.deployment.v1beta3.DeploymentID.Builder, com.akash.deployment.v1beta3.DeploymentIDOrBuilder> 
        getIdFieldBuilder() {
      if (idBuilder_ == null) {
        idBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.akash.deployment.v1beta3.DeploymentID, com.akash.deployment.v1beta3.DeploymentID.Builder, com.akash.deployment.v1beta3.DeploymentIDOrBuilder>(
                getId(),
                getParentForChildren(),
                isClean());
        id_ = null;
      }
      return idBuilder_;
    }

    private com.cosmos.base.v1beta1.Coin amount_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> amountBuilder_;
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "amount", (.gogoproto.moretags) = "yaml:&#92;"amount&#92;""];</code>
     * @return Whether the amount field is set.
     */
    public boolean hasAmount() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "amount", (.gogoproto.moretags) = "yaml:&#92;"amount&#92;""];</code>
     * @return The amount.
     */
    public com.cosmos.base.v1beta1.Coin getAmount() {
      if (amountBuilder_ == null) {
        return amount_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : amount_;
      } else {
        return amountBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "amount", (.gogoproto.moretags) = "yaml:&#92;"amount&#92;""];</code>
     */
    public Builder setAmount(com.cosmos.base.v1beta1.Coin value) {
      if (amountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        amount_ = value;
      } else {
        amountBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "amount", (.gogoproto.moretags) = "yaml:&#92;"amount&#92;""];</code>
     */
    public Builder setAmount(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (amountBuilder_ == null) {
        amount_ = builderForValue.build();
      } else {
        amountBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "amount", (.gogoproto.moretags) = "yaml:&#92;"amount&#92;""];</code>
     */
    public Builder mergeAmount(com.cosmos.base.v1beta1.Coin value) {
      if (amountBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          amount_ != null &&
          amount_ != com.cosmos.base.v1beta1.Coin.getDefaultInstance()) {
          getAmountBuilder().mergeFrom(value);
        } else {
          amount_ = value;
        }
      } else {
        amountBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "amount", (.gogoproto.moretags) = "yaml:&#92;"amount&#92;""];</code>
     */
    public Builder clearAmount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      amount_ = null;
      if (amountBuilder_ != null) {
        amountBuilder_.dispose();
        amountBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "amount", (.gogoproto.moretags) = "yaml:&#92;"amount&#92;""];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getAmountBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAmountFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "amount", (.gogoproto.moretags) = "yaml:&#92;"amount&#92;""];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getAmountOrBuilder() {
      if (amountBuilder_ != null) {
        return amountBuilder_.getMessageOrBuilder();
      } else {
        return amount_ == null ?
            com.cosmos.base.v1beta1.Coin.getDefaultInstance() : amount_;
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "amount", (.gogoproto.moretags) = "yaml:&#92;"amount&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getAmountFieldBuilder() {
      if (amountBuilder_ == null) {
        amountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                getAmount(),
                getParentForChildren(),
                isClean());
        amount_ = null;
      }
      return amountBuilder_;
    }

    private java.lang.Object depositor_ = "";
    /**
     * <pre>
     * Depositor pays for the deposit
     * </pre>
     *
     * <code>string depositor = 3 [json_name = "depositor", (.gogoproto.jsontag) = "depositor", (.gogoproto.moretags) = "yaml:&#92;"depositor&#92;""];</code>
     * @return The depositor.
     */
    public java.lang.String getDepositor() {
      java.lang.Object ref = depositor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        depositor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Depositor pays for the deposit
     * </pre>
     *
     * <code>string depositor = 3 [json_name = "depositor", (.gogoproto.jsontag) = "depositor", (.gogoproto.moretags) = "yaml:&#92;"depositor&#92;""];</code>
     * @return The bytes for depositor.
     */
    public com.google.protobuf.ByteString
        getDepositorBytes() {
      java.lang.Object ref = depositor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        depositor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Depositor pays for the deposit
     * </pre>
     *
     * <code>string depositor = 3 [json_name = "depositor", (.gogoproto.jsontag) = "depositor", (.gogoproto.moretags) = "yaml:&#92;"depositor&#92;""];</code>
     * @param value The depositor to set.
     * @return This builder for chaining.
     */
    public Builder setDepositor(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      depositor_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Depositor pays for the deposit
     * </pre>
     *
     * <code>string depositor = 3 [json_name = "depositor", (.gogoproto.jsontag) = "depositor", (.gogoproto.moretags) = "yaml:&#92;"depositor&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearDepositor() {
      depositor_ = getDefaultInstance().getDepositor();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Depositor pays for the deposit
     * </pre>
     *
     * <code>string depositor = 3 [json_name = "depositor", (.gogoproto.jsontag) = "depositor", (.gogoproto.moretags) = "yaml:&#92;"depositor&#92;""];</code>
     * @param value The bytes for depositor to set.
     * @return This builder for chaining.
     */
    public Builder setDepositorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      depositor_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:akash.deployment.v1beta3.MsgDepositDeployment)
  }

  // @@protoc_insertion_point(class_scope:akash.deployment.v1beta3.MsgDepositDeployment)
  private static final com.akash.deployment.v1beta3.MsgDepositDeployment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.akash.deployment.v1beta3.MsgDepositDeployment();
  }

  public static com.akash.deployment.v1beta3.MsgDepositDeployment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgDepositDeployment>
      PARSER = new com.google.protobuf.AbstractParser<MsgDepositDeployment>() {
    @java.lang.Override
    public MsgDepositDeployment parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgDepositDeployment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgDepositDeployment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.akash.deployment.v1beta3.MsgDepositDeployment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

