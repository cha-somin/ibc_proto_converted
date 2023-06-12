// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: irismod/farm/query.proto

package com.irismod.farm;

/**
 * Protobuf type {@code irismod.farm.QueryFarmerRequest}
 */
public final class QueryFarmerRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:irismod.farm.QueryFarmerRequest)
    QueryFarmerRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryFarmerRequest.newBuilder() to construct.
  private QueryFarmerRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryFarmerRequest() {
    farmer_ = "";
    poolName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryFarmerRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.irismod.farm.QueryProto.internal_static_irismod_farm_QueryFarmerRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.irismod.farm.QueryProto.internal_static_irismod_farm_QueryFarmerRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.irismod.farm.QueryFarmerRequest.class, com.irismod.farm.QueryFarmerRequest.Builder.class);
  }

  public static final int FARMER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object farmer_ = "";
  /**
   * <code>string farmer = 1 [json_name = "farmer"];</code>
   * @return The farmer.
   */
  @java.lang.Override
  public java.lang.String getFarmer() {
    java.lang.Object ref = farmer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      farmer_ = s;
      return s;
    }
  }
  /**
   * <code>string farmer = 1 [json_name = "farmer"];</code>
   * @return The bytes for farmer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFarmerBytes() {
    java.lang.Object ref = farmer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      farmer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POOL_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object poolName_ = "";
  /**
   * <code>string pool_name = 2 [json_name = "poolName"];</code>
   * @return The poolName.
   */
  @java.lang.Override
  public java.lang.String getPoolName() {
    java.lang.Object ref = poolName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      poolName_ = s;
      return s;
    }
  }
  /**
   * <code>string pool_name = 2 [json_name = "poolName"];</code>
   * @return The bytes for poolName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPoolNameBytes() {
    java.lang.Object ref = poolName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      poolName_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(farmer_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, farmer_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(poolName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, poolName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(farmer_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, farmer_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(poolName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, poolName_);
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
    if (!(obj instanceof com.irismod.farm.QueryFarmerRequest)) {
      return super.equals(obj);
    }
    com.irismod.farm.QueryFarmerRequest other = (com.irismod.farm.QueryFarmerRequest) obj;

    if (!getFarmer()
        .equals(other.getFarmer())) return false;
    if (!getPoolName()
        .equals(other.getPoolName())) return false;
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
    hash = (37 * hash) + FARMER_FIELD_NUMBER;
    hash = (53 * hash) + getFarmer().hashCode();
    hash = (37 * hash) + POOL_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getPoolName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.irismod.farm.QueryFarmerRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.irismod.farm.QueryFarmerRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.irismod.farm.QueryFarmerRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.irismod.farm.QueryFarmerRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.irismod.farm.QueryFarmerRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.irismod.farm.QueryFarmerRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.irismod.farm.QueryFarmerRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.irismod.farm.QueryFarmerRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.irismod.farm.QueryFarmerRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.irismod.farm.QueryFarmerRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.irismod.farm.QueryFarmerRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.irismod.farm.QueryFarmerRequest parseFrom(
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
  public static Builder newBuilder(com.irismod.farm.QueryFarmerRequest prototype) {
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
   * Protobuf type {@code irismod.farm.QueryFarmerRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:irismod.farm.QueryFarmerRequest)
      com.irismod.farm.QueryFarmerRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.irismod.farm.QueryProto.internal_static_irismod_farm_QueryFarmerRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.irismod.farm.QueryProto.internal_static_irismod_farm_QueryFarmerRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.irismod.farm.QueryFarmerRequest.class, com.irismod.farm.QueryFarmerRequest.Builder.class);
    }

    // Construct using com.irismod.farm.QueryFarmerRequest.newBuilder()
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
      farmer_ = "";
      poolName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.irismod.farm.QueryProto.internal_static_irismod_farm_QueryFarmerRequest_descriptor;
    }

    @java.lang.Override
    public com.irismod.farm.QueryFarmerRequest getDefaultInstanceForType() {
      return com.irismod.farm.QueryFarmerRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.irismod.farm.QueryFarmerRequest build() {
      com.irismod.farm.QueryFarmerRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.irismod.farm.QueryFarmerRequest buildPartial() {
      com.irismod.farm.QueryFarmerRequest result = new com.irismod.farm.QueryFarmerRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.irismod.farm.QueryFarmerRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.farmer_ = farmer_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.poolName_ = poolName_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.irismod.farm.QueryFarmerRequest) {
        return mergeFrom((com.irismod.farm.QueryFarmerRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.irismod.farm.QueryFarmerRequest other) {
      if (other == com.irismod.farm.QueryFarmerRequest.getDefaultInstance()) return this;
      if (!other.getFarmer().isEmpty()) {
        farmer_ = other.farmer_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPoolName().isEmpty()) {
        poolName_ = other.poolName_;
        bitField0_ |= 0x00000002;
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
              farmer_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              poolName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object farmer_ = "";
    /**
     * <code>string farmer = 1 [json_name = "farmer"];</code>
     * @return The farmer.
     */
    public java.lang.String getFarmer() {
      java.lang.Object ref = farmer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        farmer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string farmer = 1 [json_name = "farmer"];</code>
     * @return The bytes for farmer.
     */
    public com.google.protobuf.ByteString
        getFarmerBytes() {
      java.lang.Object ref = farmer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        farmer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string farmer = 1 [json_name = "farmer"];</code>
     * @param value The farmer to set.
     * @return This builder for chaining.
     */
    public Builder setFarmer(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      farmer_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string farmer = 1 [json_name = "farmer"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFarmer() {
      farmer_ = getDefaultInstance().getFarmer();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string farmer = 1 [json_name = "farmer"];</code>
     * @param value The bytes for farmer to set.
     * @return This builder for chaining.
     */
    public Builder setFarmerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      farmer_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object poolName_ = "";
    /**
     * <code>string pool_name = 2 [json_name = "poolName"];</code>
     * @return The poolName.
     */
    public java.lang.String getPoolName() {
      java.lang.Object ref = poolName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        poolName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string pool_name = 2 [json_name = "poolName"];</code>
     * @return The bytes for poolName.
     */
    public com.google.protobuf.ByteString
        getPoolNameBytes() {
      java.lang.Object ref = poolName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        poolName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string pool_name = 2 [json_name = "poolName"];</code>
     * @param value The poolName to set.
     * @return This builder for chaining.
     */
    public Builder setPoolName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      poolName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string pool_name = 2 [json_name = "poolName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPoolName() {
      poolName_ = getDefaultInstance().getPoolName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string pool_name = 2 [json_name = "poolName"];</code>
     * @param value The bytes for poolName to set.
     * @return This builder for chaining.
     */
    public Builder setPoolNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      poolName_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:irismod.farm.QueryFarmerRequest)
  }

  // @@protoc_insertion_point(class_scope:irismod.farm.QueryFarmerRequest)
  private static final com.irismod.farm.QueryFarmerRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.irismod.farm.QueryFarmerRequest();
  }

  public static com.irismod.farm.QueryFarmerRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryFarmerRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryFarmerRequest>() {
    @java.lang.Override
    public QueryFarmerRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryFarmerRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryFarmerRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.irismod.farm.QueryFarmerRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

