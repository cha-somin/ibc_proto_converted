// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crescent/lpfarm/v1beta1/genesis.proto

package com.crescent.lpfarm.v1beta1;

/**
 * Protobuf type {@code crescent.lpfarm.v1beta1.FarmRecord}
 */
public final class FarmRecord extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:crescent.lpfarm.v1beta1.FarmRecord)
    FarmRecordOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FarmRecord.newBuilder() to construct.
  private FarmRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FarmRecord() {
    denom_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FarmRecord();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.crescent.lpfarm.v1beta1.GenesisProto.internal_static_crescent_lpfarm_v1beta1_FarmRecord_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.crescent.lpfarm.v1beta1.GenesisProto.internal_static_crescent_lpfarm_v1beta1_FarmRecord_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.crescent.lpfarm.v1beta1.FarmRecord.class, com.crescent.lpfarm.v1beta1.FarmRecord.Builder.class);
  }

  public static final int DENOM_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object denom_ = "";
  /**
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The denom.
   */
  @java.lang.Override
  public java.lang.String getDenom() {
    java.lang.Object ref = denom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      denom_ = s;
      return s;
    }
  }
  /**
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The bytes for denom.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDenomBytes() {
    java.lang.Object ref = denom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      denom_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FARM_FIELD_NUMBER = 2;
  private com.crescent.lpfarm.v1beta1.Farm farm_;
  /**
   * <code>.crescent.lpfarm.v1beta1.Farm farm = 2 [json_name = "farm", (.gogoproto.nullable) = false];</code>
   * @return Whether the farm field is set.
   */
  @java.lang.Override
  public boolean hasFarm() {
    return farm_ != null;
  }
  /**
   * <code>.crescent.lpfarm.v1beta1.Farm farm = 2 [json_name = "farm", (.gogoproto.nullable) = false];</code>
   * @return The farm.
   */
  @java.lang.Override
  public com.crescent.lpfarm.v1beta1.Farm getFarm() {
    return farm_ == null ? com.crescent.lpfarm.v1beta1.Farm.getDefaultInstance() : farm_;
  }
  /**
   * <code>.crescent.lpfarm.v1beta1.Farm farm = 2 [json_name = "farm", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.crescent.lpfarm.v1beta1.FarmOrBuilder getFarmOrBuilder() {
    return farm_ == null ? com.crescent.lpfarm.v1beta1.Farm.getDefaultInstance() : farm_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, denom_);
    }
    if (farm_ != null) {
      output.writeMessage(2, getFarm());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, denom_);
    }
    if (farm_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFarm());
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
    if (!(obj instanceof com.crescent.lpfarm.v1beta1.FarmRecord)) {
      return super.equals(obj);
    }
    com.crescent.lpfarm.v1beta1.FarmRecord other = (com.crescent.lpfarm.v1beta1.FarmRecord) obj;

    if (!getDenom()
        .equals(other.getDenom())) return false;
    if (hasFarm() != other.hasFarm()) return false;
    if (hasFarm()) {
      if (!getFarm()
          .equals(other.getFarm())) return false;
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
    hash = (37 * hash) + DENOM_FIELD_NUMBER;
    hash = (53 * hash) + getDenom().hashCode();
    if (hasFarm()) {
      hash = (37 * hash) + FARM_FIELD_NUMBER;
      hash = (53 * hash) + getFarm().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.crescent.lpfarm.v1beta1.FarmRecord parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.lpfarm.v1beta1.FarmRecord parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.lpfarm.v1beta1.FarmRecord parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.lpfarm.v1beta1.FarmRecord parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.lpfarm.v1beta1.FarmRecord parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.lpfarm.v1beta1.FarmRecord parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.lpfarm.v1beta1.FarmRecord parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.crescent.lpfarm.v1beta1.FarmRecord parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.crescent.lpfarm.v1beta1.FarmRecord parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.crescent.lpfarm.v1beta1.FarmRecord parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.crescent.lpfarm.v1beta1.FarmRecord parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.crescent.lpfarm.v1beta1.FarmRecord parseFrom(
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
  public static Builder newBuilder(com.crescent.lpfarm.v1beta1.FarmRecord prototype) {
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
   * Protobuf type {@code crescent.lpfarm.v1beta1.FarmRecord}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:crescent.lpfarm.v1beta1.FarmRecord)
      com.crescent.lpfarm.v1beta1.FarmRecordOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.crescent.lpfarm.v1beta1.GenesisProto.internal_static_crescent_lpfarm_v1beta1_FarmRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.crescent.lpfarm.v1beta1.GenesisProto.internal_static_crescent_lpfarm_v1beta1_FarmRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.crescent.lpfarm.v1beta1.FarmRecord.class, com.crescent.lpfarm.v1beta1.FarmRecord.Builder.class);
    }

    // Construct using com.crescent.lpfarm.v1beta1.FarmRecord.newBuilder()
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
      denom_ = "";
      farm_ = null;
      if (farmBuilder_ != null) {
        farmBuilder_.dispose();
        farmBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.crescent.lpfarm.v1beta1.GenesisProto.internal_static_crescent_lpfarm_v1beta1_FarmRecord_descriptor;
    }

    @java.lang.Override
    public com.crescent.lpfarm.v1beta1.FarmRecord getDefaultInstanceForType() {
      return com.crescent.lpfarm.v1beta1.FarmRecord.getDefaultInstance();
    }

    @java.lang.Override
    public com.crescent.lpfarm.v1beta1.FarmRecord build() {
      com.crescent.lpfarm.v1beta1.FarmRecord result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.crescent.lpfarm.v1beta1.FarmRecord buildPartial() {
      com.crescent.lpfarm.v1beta1.FarmRecord result = new com.crescent.lpfarm.v1beta1.FarmRecord(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.crescent.lpfarm.v1beta1.FarmRecord result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.denom_ = denom_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.farm_ = farmBuilder_ == null
            ? farm_
            : farmBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.crescent.lpfarm.v1beta1.FarmRecord) {
        return mergeFrom((com.crescent.lpfarm.v1beta1.FarmRecord)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.crescent.lpfarm.v1beta1.FarmRecord other) {
      if (other == com.crescent.lpfarm.v1beta1.FarmRecord.getDefaultInstance()) return this;
      if (!other.getDenom().isEmpty()) {
        denom_ = other.denom_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasFarm()) {
        mergeFarm(other.getFarm());
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
              denom_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getFarmFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.lang.Object denom_ = "";
    /**
     * <code>string denom = 1 [json_name = "denom"];</code>
     * @return The denom.
     */
    public java.lang.String getDenom() {
      java.lang.Object ref = denom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        denom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string denom = 1 [json_name = "denom"];</code>
     * @return The bytes for denom.
     */
    public com.google.protobuf.ByteString
        getDenomBytes() {
      java.lang.Object ref = denom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        denom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string denom = 1 [json_name = "denom"];</code>
     * @param value The denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenom(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      denom_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string denom = 1 [json_name = "denom"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDenom() {
      denom_ = getDefaultInstance().getDenom();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string denom = 1 [json_name = "denom"];</code>
     * @param value The bytes for denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      denom_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.crescent.lpfarm.v1beta1.Farm farm_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.crescent.lpfarm.v1beta1.Farm, com.crescent.lpfarm.v1beta1.Farm.Builder, com.crescent.lpfarm.v1beta1.FarmOrBuilder> farmBuilder_;
    /**
     * <code>.crescent.lpfarm.v1beta1.Farm farm = 2 [json_name = "farm", (.gogoproto.nullable) = false];</code>
     * @return Whether the farm field is set.
     */
    public boolean hasFarm() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.crescent.lpfarm.v1beta1.Farm farm = 2 [json_name = "farm", (.gogoproto.nullable) = false];</code>
     * @return The farm.
     */
    public com.crescent.lpfarm.v1beta1.Farm getFarm() {
      if (farmBuilder_ == null) {
        return farm_ == null ? com.crescent.lpfarm.v1beta1.Farm.getDefaultInstance() : farm_;
      } else {
        return farmBuilder_.getMessage();
      }
    }
    /**
     * <code>.crescent.lpfarm.v1beta1.Farm farm = 2 [json_name = "farm", (.gogoproto.nullable) = false];</code>
     */
    public Builder setFarm(com.crescent.lpfarm.v1beta1.Farm value) {
      if (farmBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        farm_ = value;
      } else {
        farmBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.crescent.lpfarm.v1beta1.Farm farm = 2 [json_name = "farm", (.gogoproto.nullable) = false];</code>
     */
    public Builder setFarm(
        com.crescent.lpfarm.v1beta1.Farm.Builder builderForValue) {
      if (farmBuilder_ == null) {
        farm_ = builderForValue.build();
      } else {
        farmBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.crescent.lpfarm.v1beta1.Farm farm = 2 [json_name = "farm", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeFarm(com.crescent.lpfarm.v1beta1.Farm value) {
      if (farmBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          farm_ != null &&
          farm_ != com.crescent.lpfarm.v1beta1.Farm.getDefaultInstance()) {
          getFarmBuilder().mergeFrom(value);
        } else {
          farm_ = value;
        }
      } else {
        farmBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.crescent.lpfarm.v1beta1.Farm farm = 2 [json_name = "farm", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearFarm() {
      bitField0_ = (bitField0_ & ~0x00000002);
      farm_ = null;
      if (farmBuilder_ != null) {
        farmBuilder_.dispose();
        farmBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.crescent.lpfarm.v1beta1.Farm farm = 2 [json_name = "farm", (.gogoproto.nullable) = false];</code>
     */
    public com.crescent.lpfarm.v1beta1.Farm.Builder getFarmBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getFarmFieldBuilder().getBuilder();
    }
    /**
     * <code>.crescent.lpfarm.v1beta1.Farm farm = 2 [json_name = "farm", (.gogoproto.nullable) = false];</code>
     */
    public com.crescent.lpfarm.v1beta1.FarmOrBuilder getFarmOrBuilder() {
      if (farmBuilder_ != null) {
        return farmBuilder_.getMessageOrBuilder();
      } else {
        return farm_ == null ?
            com.crescent.lpfarm.v1beta1.Farm.getDefaultInstance() : farm_;
      }
    }
    /**
     * <code>.crescent.lpfarm.v1beta1.Farm farm = 2 [json_name = "farm", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.crescent.lpfarm.v1beta1.Farm, com.crescent.lpfarm.v1beta1.Farm.Builder, com.crescent.lpfarm.v1beta1.FarmOrBuilder> 
        getFarmFieldBuilder() {
      if (farmBuilder_ == null) {
        farmBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.crescent.lpfarm.v1beta1.Farm, com.crescent.lpfarm.v1beta1.Farm.Builder, com.crescent.lpfarm.v1beta1.FarmOrBuilder>(
                getFarm(),
                getParentForChildren(),
                isClean());
        farm_ = null;
      }
      return farmBuilder_;
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


    // @@protoc_insertion_point(builder_scope:crescent.lpfarm.v1beta1.FarmRecord)
  }

  // @@protoc_insertion_point(class_scope:crescent.lpfarm.v1beta1.FarmRecord)
  private static final com.crescent.lpfarm.v1beta1.FarmRecord DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.crescent.lpfarm.v1beta1.FarmRecord();
  }

  public static com.crescent.lpfarm.v1beta1.FarmRecord getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FarmRecord>
      PARSER = new com.google.protobuf.AbstractParser<FarmRecord>() {
    @java.lang.Override
    public FarmRecord parsePartialFrom(
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

  public static com.google.protobuf.Parser<FarmRecord> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FarmRecord> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.crescent.lpfarm.v1beta1.FarmRecord getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

