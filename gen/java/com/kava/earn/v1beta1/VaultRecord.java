// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/earn/v1beta1/vault.proto

package com.kava.earn.v1beta1;

/**
 * <pre>
 * VaultRecord is the state of a vault.
 * </pre>
 *
 * Protobuf type {@code kava.earn.v1beta1.VaultRecord}
 */
public final class VaultRecord extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kava.earn.v1beta1.VaultRecord)
    VaultRecordOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VaultRecord.newBuilder() to construct.
  private VaultRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VaultRecord() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VaultRecord();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kava.earn.v1beta1.VaultProto.internal_static_kava_earn_v1beta1_VaultRecord_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kava.earn.v1beta1.VaultProto.internal_static_kava_earn_v1beta1_VaultRecord_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kava.earn.v1beta1.VaultRecord.class, com.kava.earn.v1beta1.VaultRecord.Builder.class);
  }

  public static final int TOTAL_SHARES_FIELD_NUMBER = 1;
  private com.kava.earn.v1beta1.VaultShare totalShares_;
  /**
   * <pre>
   * TotalShares is the total distributed number of shares in the vault.
   * </pre>
   *
   * <code>.kava.earn.v1beta1.VaultShare total_shares = 1 [json_name = "totalShares", (.gogoproto.nullable) = false];</code>
   * @return Whether the totalShares field is set.
   */
  @java.lang.Override
  public boolean hasTotalShares() {
    return totalShares_ != null;
  }
  /**
   * <pre>
   * TotalShares is the total distributed number of shares in the vault.
   * </pre>
   *
   * <code>.kava.earn.v1beta1.VaultShare total_shares = 1 [json_name = "totalShares", (.gogoproto.nullable) = false];</code>
   * @return The totalShares.
   */
  @java.lang.Override
  public com.kava.earn.v1beta1.VaultShare getTotalShares() {
    return totalShares_ == null ? com.kava.earn.v1beta1.VaultShare.getDefaultInstance() : totalShares_;
  }
  /**
   * <pre>
   * TotalShares is the total distributed number of shares in the vault.
   * </pre>
   *
   * <code>.kava.earn.v1beta1.VaultShare total_shares = 1 [json_name = "totalShares", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.kava.earn.v1beta1.VaultShareOrBuilder getTotalSharesOrBuilder() {
    return totalShares_ == null ? com.kava.earn.v1beta1.VaultShare.getDefaultInstance() : totalShares_;
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
    if (totalShares_ != null) {
      output.writeMessage(1, getTotalShares());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (totalShares_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTotalShares());
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
    if (!(obj instanceof com.kava.earn.v1beta1.VaultRecord)) {
      return super.equals(obj);
    }
    com.kava.earn.v1beta1.VaultRecord other = (com.kava.earn.v1beta1.VaultRecord) obj;

    if (hasTotalShares() != other.hasTotalShares()) return false;
    if (hasTotalShares()) {
      if (!getTotalShares()
          .equals(other.getTotalShares())) return false;
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
    if (hasTotalShares()) {
      hash = (37 * hash) + TOTAL_SHARES_FIELD_NUMBER;
      hash = (53 * hash) + getTotalShares().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kava.earn.v1beta1.VaultRecord parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.earn.v1beta1.VaultRecord parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.earn.v1beta1.VaultRecord parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.earn.v1beta1.VaultRecord parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.earn.v1beta1.VaultRecord parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.earn.v1beta1.VaultRecord parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.earn.v1beta1.VaultRecord parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kava.earn.v1beta1.VaultRecord parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.kava.earn.v1beta1.VaultRecord parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.kava.earn.v1beta1.VaultRecord parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kava.earn.v1beta1.VaultRecord parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kava.earn.v1beta1.VaultRecord parseFrom(
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
  public static Builder newBuilder(com.kava.earn.v1beta1.VaultRecord prototype) {
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
   * VaultRecord is the state of a vault.
   * </pre>
   *
   * Protobuf type {@code kava.earn.v1beta1.VaultRecord}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kava.earn.v1beta1.VaultRecord)
      com.kava.earn.v1beta1.VaultRecordOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kava.earn.v1beta1.VaultProto.internal_static_kava_earn_v1beta1_VaultRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kava.earn.v1beta1.VaultProto.internal_static_kava_earn_v1beta1_VaultRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kava.earn.v1beta1.VaultRecord.class, com.kava.earn.v1beta1.VaultRecord.Builder.class);
    }

    // Construct using com.kava.earn.v1beta1.VaultRecord.newBuilder()
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
      totalShares_ = null;
      if (totalSharesBuilder_ != null) {
        totalSharesBuilder_.dispose();
        totalSharesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kava.earn.v1beta1.VaultProto.internal_static_kava_earn_v1beta1_VaultRecord_descriptor;
    }

    @java.lang.Override
    public com.kava.earn.v1beta1.VaultRecord getDefaultInstanceForType() {
      return com.kava.earn.v1beta1.VaultRecord.getDefaultInstance();
    }

    @java.lang.Override
    public com.kava.earn.v1beta1.VaultRecord build() {
      com.kava.earn.v1beta1.VaultRecord result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kava.earn.v1beta1.VaultRecord buildPartial() {
      com.kava.earn.v1beta1.VaultRecord result = new com.kava.earn.v1beta1.VaultRecord(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.kava.earn.v1beta1.VaultRecord result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.totalShares_ = totalSharesBuilder_ == null
            ? totalShares_
            : totalSharesBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kava.earn.v1beta1.VaultRecord) {
        return mergeFrom((com.kava.earn.v1beta1.VaultRecord)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kava.earn.v1beta1.VaultRecord other) {
      if (other == com.kava.earn.v1beta1.VaultRecord.getDefaultInstance()) return this;
      if (other.hasTotalShares()) {
        mergeTotalShares(other.getTotalShares());
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
                  getTotalSharesFieldBuilder().getBuilder(),
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

    private com.kava.earn.v1beta1.VaultShare totalShares_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.kava.earn.v1beta1.VaultShare, com.kava.earn.v1beta1.VaultShare.Builder, com.kava.earn.v1beta1.VaultShareOrBuilder> totalSharesBuilder_;
    /**
     * <pre>
     * TotalShares is the total distributed number of shares in the vault.
     * </pre>
     *
     * <code>.kava.earn.v1beta1.VaultShare total_shares = 1 [json_name = "totalShares", (.gogoproto.nullable) = false];</code>
     * @return Whether the totalShares field is set.
     */
    public boolean hasTotalShares() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * TotalShares is the total distributed number of shares in the vault.
     * </pre>
     *
     * <code>.kava.earn.v1beta1.VaultShare total_shares = 1 [json_name = "totalShares", (.gogoproto.nullable) = false];</code>
     * @return The totalShares.
     */
    public com.kava.earn.v1beta1.VaultShare getTotalShares() {
      if (totalSharesBuilder_ == null) {
        return totalShares_ == null ? com.kava.earn.v1beta1.VaultShare.getDefaultInstance() : totalShares_;
      } else {
        return totalSharesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * TotalShares is the total distributed number of shares in the vault.
     * </pre>
     *
     * <code>.kava.earn.v1beta1.VaultShare total_shares = 1 [json_name = "totalShares", (.gogoproto.nullable) = false];</code>
     */
    public Builder setTotalShares(com.kava.earn.v1beta1.VaultShare value) {
      if (totalSharesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        totalShares_ = value;
      } else {
        totalSharesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TotalShares is the total distributed number of shares in the vault.
     * </pre>
     *
     * <code>.kava.earn.v1beta1.VaultShare total_shares = 1 [json_name = "totalShares", (.gogoproto.nullable) = false];</code>
     */
    public Builder setTotalShares(
        com.kava.earn.v1beta1.VaultShare.Builder builderForValue) {
      if (totalSharesBuilder_ == null) {
        totalShares_ = builderForValue.build();
      } else {
        totalSharesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TotalShares is the total distributed number of shares in the vault.
     * </pre>
     *
     * <code>.kava.earn.v1beta1.VaultShare total_shares = 1 [json_name = "totalShares", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeTotalShares(com.kava.earn.v1beta1.VaultShare value) {
      if (totalSharesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          totalShares_ != null &&
          totalShares_ != com.kava.earn.v1beta1.VaultShare.getDefaultInstance()) {
          getTotalSharesBuilder().mergeFrom(value);
        } else {
          totalShares_ = value;
        }
      } else {
        totalSharesBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TotalShares is the total distributed number of shares in the vault.
     * </pre>
     *
     * <code>.kava.earn.v1beta1.VaultShare total_shares = 1 [json_name = "totalShares", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearTotalShares() {
      bitField0_ = (bitField0_ & ~0x00000001);
      totalShares_ = null;
      if (totalSharesBuilder_ != null) {
        totalSharesBuilder_.dispose();
        totalSharesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TotalShares is the total distributed number of shares in the vault.
     * </pre>
     *
     * <code>.kava.earn.v1beta1.VaultShare total_shares = 1 [json_name = "totalShares", (.gogoproto.nullable) = false];</code>
     */
    public com.kava.earn.v1beta1.VaultShare.Builder getTotalSharesBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTotalSharesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * TotalShares is the total distributed number of shares in the vault.
     * </pre>
     *
     * <code>.kava.earn.v1beta1.VaultShare total_shares = 1 [json_name = "totalShares", (.gogoproto.nullable) = false];</code>
     */
    public com.kava.earn.v1beta1.VaultShareOrBuilder getTotalSharesOrBuilder() {
      if (totalSharesBuilder_ != null) {
        return totalSharesBuilder_.getMessageOrBuilder();
      } else {
        return totalShares_ == null ?
            com.kava.earn.v1beta1.VaultShare.getDefaultInstance() : totalShares_;
      }
    }
    /**
     * <pre>
     * TotalShares is the total distributed number of shares in the vault.
     * </pre>
     *
     * <code>.kava.earn.v1beta1.VaultShare total_shares = 1 [json_name = "totalShares", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.kava.earn.v1beta1.VaultShare, com.kava.earn.v1beta1.VaultShare.Builder, com.kava.earn.v1beta1.VaultShareOrBuilder> 
        getTotalSharesFieldBuilder() {
      if (totalSharesBuilder_ == null) {
        totalSharesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.kava.earn.v1beta1.VaultShare, com.kava.earn.v1beta1.VaultShare.Builder, com.kava.earn.v1beta1.VaultShareOrBuilder>(
                getTotalShares(),
                getParentForChildren(),
                isClean());
        totalShares_ = null;
      }
      return totalSharesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:kava.earn.v1beta1.VaultRecord)
  }

  // @@protoc_insertion_point(class_scope:kava.earn.v1beta1.VaultRecord)
  private static final com.kava.earn.v1beta1.VaultRecord DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kava.earn.v1beta1.VaultRecord();
  }

  public static com.kava.earn.v1beta1.VaultRecord getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VaultRecord>
      PARSER = new com.google.protobuf.AbstractParser<VaultRecord>() {
    @java.lang.Override
    public VaultRecord parsePartialFrom(
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

  public static com.google.protobuf.Parser<VaultRecord> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VaultRecord> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kava.earn.v1beta1.VaultRecord getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

