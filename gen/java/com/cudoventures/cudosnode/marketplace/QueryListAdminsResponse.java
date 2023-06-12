// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cudos/marketplace/query.proto

package com.cudoventures.cudosnode.marketplace;

/**
 * Protobuf type {@code cudoventures.cudosnode.marketplace.QueryListAdminsResponse}
 */
public final class QueryListAdminsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cudoventures.cudosnode.marketplace.QueryListAdminsResponse)
    QueryListAdminsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryListAdminsResponse.newBuilder() to construct.
  private QueryListAdminsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryListAdminsResponse() {
    admins_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryListAdminsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cudoventures.cudosnode.marketplace.QueryProto.internal_static_cudoventures_cudosnode_marketplace_QueryListAdminsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cudoventures.cudosnode.marketplace.QueryProto.internal_static_cudoventures_cudosnode_marketplace_QueryListAdminsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse.class, com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse.Builder.class);
  }

  public static final int ADMINS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList admins_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string Admins = 1 [json_name = "Admins", (.gogoproto.nullable) = false];</code>
   * @return A list containing the admins.
   */
  public com.google.protobuf.ProtocolStringList
      getAdminsList() {
    return admins_;
  }
  /**
   * <code>repeated string Admins = 1 [json_name = "Admins", (.gogoproto.nullable) = false];</code>
   * @return The count of admins.
   */
  public int getAdminsCount() {
    return admins_.size();
  }
  /**
   * <code>repeated string Admins = 1 [json_name = "Admins", (.gogoproto.nullable) = false];</code>
   * @param index The index of the element to return.
   * @return The admins at the given index.
   */
  public java.lang.String getAdmins(int index) {
    return admins_.get(index);
  }
  /**
   * <code>repeated string Admins = 1 [json_name = "Admins", (.gogoproto.nullable) = false];</code>
   * @param index The index of the value to return.
   * @return The bytes of the admins at the given index.
   */
  public com.google.protobuf.ByteString
      getAdminsBytes(int index) {
    return admins_.getByteString(index);
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
    for (int i = 0; i < admins_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, admins_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < admins_.size(); i++) {
        dataSize += computeStringSizeNoTag(admins_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAdminsList().size();
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
    if (!(obj instanceof com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse)) {
      return super.equals(obj);
    }
    com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse other = (com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse) obj;

    if (!getAdminsList()
        .equals(other.getAdminsList())) return false;
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
    if (getAdminsCount() > 0) {
      hash = (37 * hash) + ADMINS_FIELD_NUMBER;
      hash = (53 * hash) + getAdminsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse parseFrom(
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
  public static Builder newBuilder(com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse prototype) {
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
   * Protobuf type {@code cudoventures.cudosnode.marketplace.QueryListAdminsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cudoventures.cudosnode.marketplace.QueryListAdminsResponse)
      com.cudoventures.cudosnode.marketplace.QueryListAdminsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cudoventures.cudosnode.marketplace.QueryProto.internal_static_cudoventures_cudosnode_marketplace_QueryListAdminsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cudoventures.cudosnode.marketplace.QueryProto.internal_static_cudoventures_cudosnode_marketplace_QueryListAdminsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse.class, com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse.Builder.class);
    }

    // Construct using com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse.newBuilder()
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
      admins_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cudoventures.cudosnode.marketplace.QueryProto.internal_static_cudoventures_cudosnode_marketplace_QueryListAdminsResponse_descriptor;
    }

    @java.lang.Override
    public com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse getDefaultInstanceForType() {
      return com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse build() {
      com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse buildPartial() {
      com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse result = new com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        admins_.makeImmutable();
        result.admins_ = admins_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse) {
        return mergeFrom((com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse other) {
      if (other == com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse.getDefaultInstance()) return this;
      if (!other.admins_.isEmpty()) {
        if (admins_.isEmpty()) {
          admins_ = other.admins_;
          bitField0_ |= 0x00000001;
        } else {
          ensureAdminsIsMutable();
          admins_.addAll(other.admins_);
        }
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureAdminsIsMutable();
              admins_.add(s);
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

    private com.google.protobuf.LazyStringArrayList admins_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureAdminsIsMutable() {
      if (!admins_.isModifiable()) {
        admins_ = new com.google.protobuf.LazyStringArrayList(admins_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated string Admins = 1 [json_name = "Admins", (.gogoproto.nullable) = false];</code>
     * @return A list containing the admins.
     */
    public com.google.protobuf.ProtocolStringList
        getAdminsList() {
      admins_.makeImmutable();
      return admins_;
    }
    /**
     * <code>repeated string Admins = 1 [json_name = "Admins", (.gogoproto.nullable) = false];</code>
     * @return The count of admins.
     */
    public int getAdminsCount() {
      return admins_.size();
    }
    /**
     * <code>repeated string Admins = 1 [json_name = "Admins", (.gogoproto.nullable) = false];</code>
     * @param index The index of the element to return.
     * @return The admins at the given index.
     */
    public java.lang.String getAdmins(int index) {
      return admins_.get(index);
    }
    /**
     * <code>repeated string Admins = 1 [json_name = "Admins", (.gogoproto.nullable) = false];</code>
     * @param index The index of the value to return.
     * @return The bytes of the admins at the given index.
     */
    public com.google.protobuf.ByteString
        getAdminsBytes(int index) {
      return admins_.getByteString(index);
    }
    /**
     * <code>repeated string Admins = 1 [json_name = "Admins", (.gogoproto.nullable) = false];</code>
     * @param index The index to set the value at.
     * @param value The admins to set.
     * @return This builder for chaining.
     */
    public Builder setAdmins(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAdminsIsMutable();
      admins_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string Admins = 1 [json_name = "Admins", (.gogoproto.nullable) = false];</code>
     * @param value The admins to add.
     * @return This builder for chaining.
     */
    public Builder addAdmins(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAdminsIsMutable();
      admins_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string Admins = 1 [json_name = "Admins", (.gogoproto.nullable) = false];</code>
     * @param values The admins to add.
     * @return This builder for chaining.
     */
    public Builder addAllAdmins(
        java.lang.Iterable<java.lang.String> values) {
      ensureAdminsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, admins_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string Admins = 1 [json_name = "Admins", (.gogoproto.nullable) = false];</code>
     * @return This builder for chaining.
     */
    public Builder clearAdmins() {
      admins_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string Admins = 1 [json_name = "Admins", (.gogoproto.nullable) = false];</code>
     * @param value The bytes of the admins to add.
     * @return This builder for chaining.
     */
    public Builder addAdminsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureAdminsIsMutable();
      admins_.add(value);
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:cudoventures.cudosnode.marketplace.QueryListAdminsResponse)
  }

  // @@protoc_insertion_point(class_scope:cudoventures.cudosnode.marketplace.QueryListAdminsResponse)
  private static final com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse();
  }

  public static com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryListAdminsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryListAdminsResponse>() {
    @java.lang.Override
    public QueryListAdminsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryListAdminsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryListAdminsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cudoventures.cudosnode.marketplace.QueryListAdminsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

