// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kyve/bundles/v1beta1/params.proto

package com.kyve.bundles.v1beta1;

/**
 * <pre>
 * Params defines the bundles module parameters.
 * </pre>
 *
 * Protobuf type {@code kyve.bundles.v1beta1.Params}
 */
public final class Params extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kyve.bundles.v1beta1.Params)
    ParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Params.newBuilder() to construct.
  private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Params() {
    storageCost_ = "";
    networkFee_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Params();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kyve.bundles.v1beta1.ParamsProto.internal_static_kyve_bundles_v1beta1_Params_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kyve.bundles.v1beta1.ParamsProto.internal_static_kyve_bundles_v1beta1_Params_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kyve.bundles.v1beta1.Params.class, com.kyve.bundles.v1beta1.Params.Builder.class);
  }

  public static final int UPLOAD_TIMEOUT_FIELD_NUMBER = 1;
  private long uploadTimeout_ = 0L;
  /**
   * <pre>
   * upload_timeout ...
   * </pre>
   *
   * <code>uint64 upload_timeout = 1 [json_name = "uploadTimeout"];</code>
   * @return The uploadTimeout.
   */
  @java.lang.Override
  public long getUploadTimeout() {
    return uploadTimeout_;
  }

  public static final int STORAGE_COST_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object storageCost_ = "";
  /**
   * <pre>
   * storage_cost ...
   * </pre>
   *
   * <code>string storage_cost = 2 [json_name = "storageCost", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The storageCost.
   */
  @java.lang.Override
  public java.lang.String getStorageCost() {
    java.lang.Object ref = storageCost_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      storageCost_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * storage_cost ...
   * </pre>
   *
   * <code>string storage_cost = 2 [json_name = "storageCost", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for storageCost.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStorageCostBytes() {
    java.lang.Object ref = storageCost_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      storageCost_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NETWORK_FEE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object networkFee_ = "";
  /**
   * <pre>
   * network_fee ...
   * </pre>
   *
   * <code>string network_fee = 3 [json_name = "networkFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The networkFee.
   */
  @java.lang.Override
  public java.lang.String getNetworkFee() {
    java.lang.Object ref = networkFee_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      networkFee_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * network_fee ...
   * </pre>
   *
   * <code>string network_fee = 3 [json_name = "networkFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for networkFee.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNetworkFeeBytes() {
    java.lang.Object ref = networkFee_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      networkFee_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MAX_POINTS_FIELD_NUMBER = 4;
  private long maxPoints_ = 0L;
  /**
   * <pre>
   * max_points ...
   * </pre>
   *
   * <code>uint64 max_points = 4 [json_name = "maxPoints"];</code>
   * @return The maxPoints.
   */
  @java.lang.Override
  public long getMaxPoints() {
    return maxPoints_;
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
    if (uploadTimeout_ != 0L) {
      output.writeUInt64(1, uploadTimeout_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(storageCost_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, storageCost_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(networkFee_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, networkFee_);
    }
    if (maxPoints_ != 0L) {
      output.writeUInt64(4, maxPoints_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (uploadTimeout_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, uploadTimeout_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(storageCost_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, storageCost_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(networkFee_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, networkFee_);
    }
    if (maxPoints_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, maxPoints_);
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
    if (!(obj instanceof com.kyve.bundles.v1beta1.Params)) {
      return super.equals(obj);
    }
    com.kyve.bundles.v1beta1.Params other = (com.kyve.bundles.v1beta1.Params) obj;

    if (getUploadTimeout()
        != other.getUploadTimeout()) return false;
    if (!getStorageCost()
        .equals(other.getStorageCost())) return false;
    if (!getNetworkFee()
        .equals(other.getNetworkFee())) return false;
    if (getMaxPoints()
        != other.getMaxPoints()) return false;
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
    hash = (37 * hash) + UPLOAD_TIMEOUT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUploadTimeout());
    hash = (37 * hash) + STORAGE_COST_FIELD_NUMBER;
    hash = (53 * hash) + getStorageCost().hashCode();
    hash = (37 * hash) + NETWORK_FEE_FIELD_NUMBER;
    hash = (53 * hash) + getNetworkFee().hashCode();
    hash = (37 * hash) + MAX_POINTS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMaxPoints());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kyve.bundles.v1beta1.Params parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.bundles.v1beta1.Params parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.bundles.v1beta1.Params parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.bundles.v1beta1.Params parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.bundles.v1beta1.Params parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.bundles.v1beta1.Params parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.bundles.v1beta1.Params parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kyve.bundles.v1beta1.Params parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.kyve.bundles.v1beta1.Params parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.kyve.bundles.v1beta1.Params parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kyve.bundles.v1beta1.Params parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kyve.bundles.v1beta1.Params parseFrom(
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
  public static Builder newBuilder(com.kyve.bundles.v1beta1.Params prototype) {
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
   * Params defines the bundles module parameters.
   * </pre>
   *
   * Protobuf type {@code kyve.bundles.v1beta1.Params}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kyve.bundles.v1beta1.Params)
      com.kyve.bundles.v1beta1.ParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kyve.bundles.v1beta1.ParamsProto.internal_static_kyve_bundles_v1beta1_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kyve.bundles.v1beta1.ParamsProto.internal_static_kyve_bundles_v1beta1_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kyve.bundles.v1beta1.Params.class, com.kyve.bundles.v1beta1.Params.Builder.class);
    }

    // Construct using com.kyve.bundles.v1beta1.Params.newBuilder()
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
      uploadTimeout_ = 0L;
      storageCost_ = "";
      networkFee_ = "";
      maxPoints_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kyve.bundles.v1beta1.ParamsProto.internal_static_kyve_bundles_v1beta1_Params_descriptor;
    }

    @java.lang.Override
    public com.kyve.bundles.v1beta1.Params getDefaultInstanceForType() {
      return com.kyve.bundles.v1beta1.Params.getDefaultInstance();
    }

    @java.lang.Override
    public com.kyve.bundles.v1beta1.Params build() {
      com.kyve.bundles.v1beta1.Params result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kyve.bundles.v1beta1.Params buildPartial() {
      com.kyve.bundles.v1beta1.Params result = new com.kyve.bundles.v1beta1.Params(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.kyve.bundles.v1beta1.Params result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.uploadTimeout_ = uploadTimeout_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.storageCost_ = storageCost_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.networkFee_ = networkFee_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.maxPoints_ = maxPoints_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kyve.bundles.v1beta1.Params) {
        return mergeFrom((com.kyve.bundles.v1beta1.Params)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kyve.bundles.v1beta1.Params other) {
      if (other == com.kyve.bundles.v1beta1.Params.getDefaultInstance()) return this;
      if (other.getUploadTimeout() != 0L) {
        setUploadTimeout(other.getUploadTimeout());
      }
      if (!other.getStorageCost().isEmpty()) {
        storageCost_ = other.storageCost_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getNetworkFee().isEmpty()) {
        networkFee_ = other.networkFee_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getMaxPoints() != 0L) {
        setMaxPoints(other.getMaxPoints());
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
            case 8: {
              uploadTimeout_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              storageCost_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              networkFee_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              maxPoints_ = input.readUInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private long uploadTimeout_ ;
    /**
     * <pre>
     * upload_timeout ...
     * </pre>
     *
     * <code>uint64 upload_timeout = 1 [json_name = "uploadTimeout"];</code>
     * @return The uploadTimeout.
     */
    @java.lang.Override
    public long getUploadTimeout() {
      return uploadTimeout_;
    }
    /**
     * <pre>
     * upload_timeout ...
     * </pre>
     *
     * <code>uint64 upload_timeout = 1 [json_name = "uploadTimeout"];</code>
     * @param value The uploadTimeout to set.
     * @return This builder for chaining.
     */
    public Builder setUploadTimeout(long value) {

      uploadTimeout_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * upload_timeout ...
     * </pre>
     *
     * <code>uint64 upload_timeout = 1 [json_name = "uploadTimeout"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUploadTimeout() {
      bitField0_ = (bitField0_ & ~0x00000001);
      uploadTimeout_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object storageCost_ = "";
    /**
     * <pre>
     * storage_cost ...
     * </pre>
     *
     * <code>string storage_cost = 2 [json_name = "storageCost", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The storageCost.
     */
    public java.lang.String getStorageCost() {
      java.lang.Object ref = storageCost_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        storageCost_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * storage_cost ...
     * </pre>
     *
     * <code>string storage_cost = 2 [json_name = "storageCost", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The bytes for storageCost.
     */
    public com.google.protobuf.ByteString
        getStorageCostBytes() {
      java.lang.Object ref = storageCost_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        storageCost_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * storage_cost ...
     * </pre>
     *
     * <code>string storage_cost = 2 [json_name = "storageCost", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The storageCost to set.
     * @return This builder for chaining.
     */
    public Builder setStorageCost(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      storageCost_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * storage_cost ...
     * </pre>
     *
     * <code>string storage_cost = 2 [json_name = "storageCost", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStorageCost() {
      storageCost_ = getDefaultInstance().getStorageCost();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * storage_cost ...
     * </pre>
     *
     * <code>string storage_cost = 2 [json_name = "storageCost", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The bytes for storageCost to set.
     * @return This builder for chaining.
     */
    public Builder setStorageCostBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      storageCost_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object networkFee_ = "";
    /**
     * <pre>
     * network_fee ...
     * </pre>
     *
     * <code>string network_fee = 3 [json_name = "networkFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The networkFee.
     */
    public java.lang.String getNetworkFee() {
      java.lang.Object ref = networkFee_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        networkFee_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * network_fee ...
     * </pre>
     *
     * <code>string network_fee = 3 [json_name = "networkFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The bytes for networkFee.
     */
    public com.google.protobuf.ByteString
        getNetworkFeeBytes() {
      java.lang.Object ref = networkFee_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        networkFee_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * network_fee ...
     * </pre>
     *
     * <code>string network_fee = 3 [json_name = "networkFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The networkFee to set.
     * @return This builder for chaining.
     */
    public Builder setNetworkFee(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      networkFee_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * network_fee ...
     * </pre>
     *
     * <code>string network_fee = 3 [json_name = "networkFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNetworkFee() {
      networkFee_ = getDefaultInstance().getNetworkFee();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * network_fee ...
     * </pre>
     *
     * <code>string network_fee = 3 [json_name = "networkFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The bytes for networkFee to set.
     * @return This builder for chaining.
     */
    public Builder setNetworkFeeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      networkFee_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private long maxPoints_ ;
    /**
     * <pre>
     * max_points ...
     * </pre>
     *
     * <code>uint64 max_points = 4 [json_name = "maxPoints"];</code>
     * @return The maxPoints.
     */
    @java.lang.Override
    public long getMaxPoints() {
      return maxPoints_;
    }
    /**
     * <pre>
     * max_points ...
     * </pre>
     *
     * <code>uint64 max_points = 4 [json_name = "maxPoints"];</code>
     * @param value The maxPoints to set.
     * @return This builder for chaining.
     */
    public Builder setMaxPoints(long value) {

      maxPoints_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * max_points ...
     * </pre>
     *
     * <code>uint64 max_points = 4 [json_name = "maxPoints"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxPoints() {
      bitField0_ = (bitField0_ & ~0x00000008);
      maxPoints_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:kyve.bundles.v1beta1.Params)
  }

  // @@protoc_insertion_point(class_scope:kyve.bundles.v1beta1.Params)
  private static final com.kyve.bundles.v1beta1.Params DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kyve.bundles.v1beta1.Params();
  }

  public static com.kyve.bundles.v1beta1.Params getDefaultInstance() {
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
  public com.kyve.bundles.v1beta1.Params getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

