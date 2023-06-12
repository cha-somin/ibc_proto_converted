// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/superfluid/query.proto

package com.osmosis.superfluid;

/**
 * Protobuf type {@code osmosis.superfluid.AssetMultiplierResponse}
 */
public final class AssetMultiplierResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:osmosis.superfluid.AssetMultiplierResponse)
    AssetMultiplierResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssetMultiplierResponse.newBuilder() to construct.
  private AssetMultiplierResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssetMultiplierResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssetMultiplierResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.osmosis.superfluid.QueryProto.internal_static_osmosis_superfluid_AssetMultiplierResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.osmosis.superfluid.QueryProto.internal_static_osmosis_superfluid_AssetMultiplierResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.osmosis.superfluid.AssetMultiplierResponse.class, com.osmosis.superfluid.AssetMultiplierResponse.Builder.class);
  }

  public static final int OSMO_EQUIVALENT_MULTIPLIER_FIELD_NUMBER = 1;
  private com.osmosis.superfluid.OsmoEquivalentMultiplierRecord osmoEquivalentMultiplier_;
  /**
   * <code>.osmosis.superfluid.OsmoEquivalentMultiplierRecord osmo_equivalent_multiplier = 1 [json_name = "osmoEquivalentMultiplier"];</code>
   * @return Whether the osmoEquivalentMultiplier field is set.
   */
  @java.lang.Override
  public boolean hasOsmoEquivalentMultiplier() {
    return osmoEquivalentMultiplier_ != null;
  }
  /**
   * <code>.osmosis.superfluid.OsmoEquivalentMultiplierRecord osmo_equivalent_multiplier = 1 [json_name = "osmoEquivalentMultiplier"];</code>
   * @return The osmoEquivalentMultiplier.
   */
  @java.lang.Override
  public com.osmosis.superfluid.OsmoEquivalentMultiplierRecord getOsmoEquivalentMultiplier() {
    return osmoEquivalentMultiplier_ == null ? com.osmosis.superfluid.OsmoEquivalentMultiplierRecord.getDefaultInstance() : osmoEquivalentMultiplier_;
  }
  /**
   * <code>.osmosis.superfluid.OsmoEquivalentMultiplierRecord osmo_equivalent_multiplier = 1 [json_name = "osmoEquivalentMultiplier"];</code>
   */
  @java.lang.Override
  public com.osmosis.superfluid.OsmoEquivalentMultiplierRecordOrBuilder getOsmoEquivalentMultiplierOrBuilder() {
    return osmoEquivalentMultiplier_ == null ? com.osmosis.superfluid.OsmoEquivalentMultiplierRecord.getDefaultInstance() : osmoEquivalentMultiplier_;
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
    if (osmoEquivalentMultiplier_ != null) {
      output.writeMessage(1, getOsmoEquivalentMultiplier());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (osmoEquivalentMultiplier_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getOsmoEquivalentMultiplier());
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
    if (!(obj instanceof com.osmosis.superfluid.AssetMultiplierResponse)) {
      return super.equals(obj);
    }
    com.osmosis.superfluid.AssetMultiplierResponse other = (com.osmosis.superfluid.AssetMultiplierResponse) obj;

    if (hasOsmoEquivalentMultiplier() != other.hasOsmoEquivalentMultiplier()) return false;
    if (hasOsmoEquivalentMultiplier()) {
      if (!getOsmoEquivalentMultiplier()
          .equals(other.getOsmoEquivalentMultiplier())) return false;
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
    if (hasOsmoEquivalentMultiplier()) {
      hash = (37 * hash) + OSMO_EQUIVALENT_MULTIPLIER_FIELD_NUMBER;
      hash = (53 * hash) + getOsmoEquivalentMultiplier().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.osmosis.superfluid.AssetMultiplierResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.superfluid.AssetMultiplierResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.superfluid.AssetMultiplierResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.superfluid.AssetMultiplierResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.superfluid.AssetMultiplierResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.superfluid.AssetMultiplierResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.superfluid.AssetMultiplierResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.superfluid.AssetMultiplierResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.osmosis.superfluid.AssetMultiplierResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.osmosis.superfluid.AssetMultiplierResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.osmosis.superfluid.AssetMultiplierResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.superfluid.AssetMultiplierResponse parseFrom(
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
  public static Builder newBuilder(com.osmosis.superfluid.AssetMultiplierResponse prototype) {
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
   * Protobuf type {@code osmosis.superfluid.AssetMultiplierResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:osmosis.superfluid.AssetMultiplierResponse)
      com.osmosis.superfluid.AssetMultiplierResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.osmosis.superfluid.QueryProto.internal_static_osmosis_superfluid_AssetMultiplierResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.osmosis.superfluid.QueryProto.internal_static_osmosis_superfluid_AssetMultiplierResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.osmosis.superfluid.AssetMultiplierResponse.class, com.osmosis.superfluid.AssetMultiplierResponse.Builder.class);
    }

    // Construct using com.osmosis.superfluid.AssetMultiplierResponse.newBuilder()
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
      osmoEquivalentMultiplier_ = null;
      if (osmoEquivalentMultiplierBuilder_ != null) {
        osmoEquivalentMultiplierBuilder_.dispose();
        osmoEquivalentMultiplierBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.osmosis.superfluid.QueryProto.internal_static_osmosis_superfluid_AssetMultiplierResponse_descriptor;
    }

    @java.lang.Override
    public com.osmosis.superfluid.AssetMultiplierResponse getDefaultInstanceForType() {
      return com.osmosis.superfluid.AssetMultiplierResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.osmosis.superfluid.AssetMultiplierResponse build() {
      com.osmosis.superfluid.AssetMultiplierResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.osmosis.superfluid.AssetMultiplierResponse buildPartial() {
      com.osmosis.superfluid.AssetMultiplierResponse result = new com.osmosis.superfluid.AssetMultiplierResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.osmosis.superfluid.AssetMultiplierResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.osmoEquivalentMultiplier_ = osmoEquivalentMultiplierBuilder_ == null
            ? osmoEquivalentMultiplier_
            : osmoEquivalentMultiplierBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.osmosis.superfluid.AssetMultiplierResponse) {
        return mergeFrom((com.osmosis.superfluid.AssetMultiplierResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.osmosis.superfluid.AssetMultiplierResponse other) {
      if (other == com.osmosis.superfluid.AssetMultiplierResponse.getDefaultInstance()) return this;
      if (other.hasOsmoEquivalentMultiplier()) {
        mergeOsmoEquivalentMultiplier(other.getOsmoEquivalentMultiplier());
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
                  getOsmoEquivalentMultiplierFieldBuilder().getBuilder(),
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

    private com.osmosis.superfluid.OsmoEquivalentMultiplierRecord osmoEquivalentMultiplier_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.osmosis.superfluid.OsmoEquivalentMultiplierRecord, com.osmosis.superfluid.OsmoEquivalentMultiplierRecord.Builder, com.osmosis.superfluid.OsmoEquivalentMultiplierRecordOrBuilder> osmoEquivalentMultiplierBuilder_;
    /**
     * <code>.osmosis.superfluid.OsmoEquivalentMultiplierRecord osmo_equivalent_multiplier = 1 [json_name = "osmoEquivalentMultiplier"];</code>
     * @return Whether the osmoEquivalentMultiplier field is set.
     */
    public boolean hasOsmoEquivalentMultiplier() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.osmosis.superfluid.OsmoEquivalentMultiplierRecord osmo_equivalent_multiplier = 1 [json_name = "osmoEquivalentMultiplier"];</code>
     * @return The osmoEquivalentMultiplier.
     */
    public com.osmosis.superfluid.OsmoEquivalentMultiplierRecord getOsmoEquivalentMultiplier() {
      if (osmoEquivalentMultiplierBuilder_ == null) {
        return osmoEquivalentMultiplier_ == null ? com.osmosis.superfluid.OsmoEquivalentMultiplierRecord.getDefaultInstance() : osmoEquivalentMultiplier_;
      } else {
        return osmoEquivalentMultiplierBuilder_.getMessage();
      }
    }
    /**
     * <code>.osmosis.superfluid.OsmoEquivalentMultiplierRecord osmo_equivalent_multiplier = 1 [json_name = "osmoEquivalentMultiplier"];</code>
     */
    public Builder setOsmoEquivalentMultiplier(com.osmosis.superfluid.OsmoEquivalentMultiplierRecord value) {
      if (osmoEquivalentMultiplierBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        osmoEquivalentMultiplier_ = value;
      } else {
        osmoEquivalentMultiplierBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.osmosis.superfluid.OsmoEquivalentMultiplierRecord osmo_equivalent_multiplier = 1 [json_name = "osmoEquivalentMultiplier"];</code>
     */
    public Builder setOsmoEquivalentMultiplier(
        com.osmosis.superfluid.OsmoEquivalentMultiplierRecord.Builder builderForValue) {
      if (osmoEquivalentMultiplierBuilder_ == null) {
        osmoEquivalentMultiplier_ = builderForValue.build();
      } else {
        osmoEquivalentMultiplierBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.osmosis.superfluid.OsmoEquivalentMultiplierRecord osmo_equivalent_multiplier = 1 [json_name = "osmoEquivalentMultiplier"];</code>
     */
    public Builder mergeOsmoEquivalentMultiplier(com.osmosis.superfluid.OsmoEquivalentMultiplierRecord value) {
      if (osmoEquivalentMultiplierBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          osmoEquivalentMultiplier_ != null &&
          osmoEquivalentMultiplier_ != com.osmosis.superfluid.OsmoEquivalentMultiplierRecord.getDefaultInstance()) {
          getOsmoEquivalentMultiplierBuilder().mergeFrom(value);
        } else {
          osmoEquivalentMultiplier_ = value;
        }
      } else {
        osmoEquivalentMultiplierBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.osmosis.superfluid.OsmoEquivalentMultiplierRecord osmo_equivalent_multiplier = 1 [json_name = "osmoEquivalentMultiplier"];</code>
     */
    public Builder clearOsmoEquivalentMultiplier() {
      bitField0_ = (bitField0_ & ~0x00000001);
      osmoEquivalentMultiplier_ = null;
      if (osmoEquivalentMultiplierBuilder_ != null) {
        osmoEquivalentMultiplierBuilder_.dispose();
        osmoEquivalentMultiplierBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.osmosis.superfluid.OsmoEquivalentMultiplierRecord osmo_equivalent_multiplier = 1 [json_name = "osmoEquivalentMultiplier"];</code>
     */
    public com.osmosis.superfluid.OsmoEquivalentMultiplierRecord.Builder getOsmoEquivalentMultiplierBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getOsmoEquivalentMultiplierFieldBuilder().getBuilder();
    }
    /**
     * <code>.osmosis.superfluid.OsmoEquivalentMultiplierRecord osmo_equivalent_multiplier = 1 [json_name = "osmoEquivalentMultiplier"];</code>
     */
    public com.osmosis.superfluid.OsmoEquivalentMultiplierRecordOrBuilder getOsmoEquivalentMultiplierOrBuilder() {
      if (osmoEquivalentMultiplierBuilder_ != null) {
        return osmoEquivalentMultiplierBuilder_.getMessageOrBuilder();
      } else {
        return osmoEquivalentMultiplier_ == null ?
            com.osmosis.superfluid.OsmoEquivalentMultiplierRecord.getDefaultInstance() : osmoEquivalentMultiplier_;
      }
    }
    /**
     * <code>.osmosis.superfluid.OsmoEquivalentMultiplierRecord osmo_equivalent_multiplier = 1 [json_name = "osmoEquivalentMultiplier"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.osmosis.superfluid.OsmoEquivalentMultiplierRecord, com.osmosis.superfluid.OsmoEquivalentMultiplierRecord.Builder, com.osmosis.superfluid.OsmoEquivalentMultiplierRecordOrBuilder> 
        getOsmoEquivalentMultiplierFieldBuilder() {
      if (osmoEquivalentMultiplierBuilder_ == null) {
        osmoEquivalentMultiplierBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.osmosis.superfluid.OsmoEquivalentMultiplierRecord, com.osmosis.superfluid.OsmoEquivalentMultiplierRecord.Builder, com.osmosis.superfluid.OsmoEquivalentMultiplierRecordOrBuilder>(
                getOsmoEquivalentMultiplier(),
                getParentForChildren(),
                isClean());
        osmoEquivalentMultiplier_ = null;
      }
      return osmoEquivalentMultiplierBuilder_;
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


    // @@protoc_insertion_point(builder_scope:osmosis.superfluid.AssetMultiplierResponse)
  }

  // @@protoc_insertion_point(class_scope:osmosis.superfluid.AssetMultiplierResponse)
  private static final com.osmosis.superfluid.AssetMultiplierResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.osmosis.superfluid.AssetMultiplierResponse();
  }

  public static com.osmosis.superfluid.AssetMultiplierResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetMultiplierResponse>
      PARSER = new com.google.protobuf.AbstractParser<AssetMultiplierResponse>() {
    @java.lang.Override
    public AssetMultiplierResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<AssetMultiplierResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetMultiplierResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.osmosis.superfluid.AssetMultiplierResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

