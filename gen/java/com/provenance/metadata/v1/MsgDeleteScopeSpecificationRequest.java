// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/tx.proto

package com.provenance.metadata.v1;

/**
 * <pre>
 * MsgDeleteScopeSpecificationRequest is the request type for the Msg/DeleteScopeSpecification RPC method.
 * </pre>
 *
 * Protobuf type {@code provenance.metadata.v1.MsgDeleteScopeSpecificationRequest}
 */
public final class MsgDeleteScopeSpecificationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.metadata.v1.MsgDeleteScopeSpecificationRequest)
    MsgDeleteScopeSpecificationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgDeleteScopeSpecificationRequest.newBuilder() to construct.
  private MsgDeleteScopeSpecificationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgDeleteScopeSpecificationRequest() {
    specificationId_ = com.google.protobuf.ByteString.EMPTY;
    signers_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgDeleteScopeSpecificationRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.provenance.metadata.v1.TxProto.internal_static_provenance_metadata_v1_MsgDeleteScopeSpecificationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.provenance.metadata.v1.TxProto.internal_static_provenance_metadata_v1_MsgDeleteScopeSpecificationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest.class, com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest.Builder.class);
  }

  public static final int SPECIFICATION_ID_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString specificationId_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * MetadataAddress for the scope specification to delete.
   * </pre>
   *
   * <code>bytes specification_id = 1 [json_name = "specificationId", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"specification_id&#92;""];</code>
   * @return The specificationId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSpecificationId() {
    return specificationId_;
  }

  public static final int SIGNERS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList signers_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string signers = 2 [json_name = "signers"];</code>
   * @return A list containing the signers.
   */
  public com.google.protobuf.ProtocolStringList
      getSignersList() {
    return signers_;
  }
  /**
   * <code>repeated string signers = 2 [json_name = "signers"];</code>
   * @return The count of signers.
   */
  public int getSignersCount() {
    return signers_.size();
  }
  /**
   * <code>repeated string signers = 2 [json_name = "signers"];</code>
   * @param index The index of the element to return.
   * @return The signers at the given index.
   */
  public java.lang.String getSigners(int index) {
    return signers_.get(index);
  }
  /**
   * <code>repeated string signers = 2 [json_name = "signers"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the signers at the given index.
   */
  public com.google.protobuf.ByteString
      getSignersBytes(int index) {
    return signers_.getByteString(index);
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
    if (!specificationId_.isEmpty()) {
      output.writeBytes(1, specificationId_);
    }
    for (int i = 0; i < signers_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, signers_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!specificationId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, specificationId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < signers_.size(); i++) {
        dataSize += computeStringSizeNoTag(signers_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getSignersList().size();
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
    if (!(obj instanceof com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest)) {
      return super.equals(obj);
    }
    com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest other = (com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest) obj;

    if (!getSpecificationId()
        .equals(other.getSpecificationId())) return false;
    if (!getSignersList()
        .equals(other.getSignersList())) return false;
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
    hash = (37 * hash) + SPECIFICATION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSpecificationId().hashCode();
    if (getSignersCount() > 0) {
      hash = (37 * hash) + SIGNERS_FIELD_NUMBER;
      hash = (53 * hash) + getSignersList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest parseFrom(
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
  public static Builder newBuilder(com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest prototype) {
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
   * MsgDeleteScopeSpecificationRequest is the request type for the Msg/DeleteScopeSpecification RPC method.
   * </pre>
   *
   * Protobuf type {@code provenance.metadata.v1.MsgDeleteScopeSpecificationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.metadata.v1.MsgDeleteScopeSpecificationRequest)
      com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.provenance.metadata.v1.TxProto.internal_static_provenance_metadata_v1_MsgDeleteScopeSpecificationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.provenance.metadata.v1.TxProto.internal_static_provenance_metadata_v1_MsgDeleteScopeSpecificationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest.class, com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest.Builder.class);
    }

    // Construct using com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest.newBuilder()
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
      specificationId_ = com.google.protobuf.ByteString.EMPTY;
      signers_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.provenance.metadata.v1.TxProto.internal_static_provenance_metadata_v1_MsgDeleteScopeSpecificationRequest_descriptor;
    }

    @java.lang.Override
    public com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest getDefaultInstanceForType() {
      return com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest build() {
      com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest buildPartial() {
      com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest result = new com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.specificationId_ = specificationId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        signers_.makeImmutable();
        result.signers_ = signers_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest) {
        return mergeFrom((com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest other) {
      if (other == com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest.getDefaultInstance()) return this;
      if (other.getSpecificationId() != com.google.protobuf.ByteString.EMPTY) {
        setSpecificationId(other.getSpecificationId());
      }
      if (!other.signers_.isEmpty()) {
        if (signers_.isEmpty()) {
          signers_ = other.signers_;
          bitField0_ |= 0x00000002;
        } else {
          ensureSignersIsMutable();
          signers_.addAll(other.signers_);
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
              specificationId_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureSignersIsMutable();
              signers_.add(s);
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

    private com.google.protobuf.ByteString specificationId_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * MetadataAddress for the scope specification to delete.
     * </pre>
     *
     * <code>bytes specification_id = 1 [json_name = "specificationId", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"specification_id&#92;""];</code>
     * @return The specificationId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSpecificationId() {
      return specificationId_;
    }
    /**
     * <pre>
     * MetadataAddress for the scope specification to delete.
     * </pre>
     *
     * <code>bytes specification_id = 1 [json_name = "specificationId", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"specification_id&#92;""];</code>
     * @param value The specificationId to set.
     * @return This builder for chaining.
     */
    public Builder setSpecificationId(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      specificationId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MetadataAddress for the scope specification to delete.
     * </pre>
     *
     * <code>bytes specification_id = 1 [json_name = "specificationId", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"specification_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearSpecificationId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      specificationId_ = getDefaultInstance().getSpecificationId();
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList signers_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureSignersIsMutable() {
      if (!signers_.isModifiable()) {
        signers_ = new com.google.protobuf.LazyStringArrayList(signers_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <code>repeated string signers = 2 [json_name = "signers"];</code>
     * @return A list containing the signers.
     */
    public com.google.protobuf.ProtocolStringList
        getSignersList() {
      signers_.makeImmutable();
      return signers_;
    }
    /**
     * <code>repeated string signers = 2 [json_name = "signers"];</code>
     * @return The count of signers.
     */
    public int getSignersCount() {
      return signers_.size();
    }
    /**
     * <code>repeated string signers = 2 [json_name = "signers"];</code>
     * @param index The index of the element to return.
     * @return The signers at the given index.
     */
    public java.lang.String getSigners(int index) {
      return signers_.get(index);
    }
    /**
     * <code>repeated string signers = 2 [json_name = "signers"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the signers at the given index.
     */
    public com.google.protobuf.ByteString
        getSignersBytes(int index) {
      return signers_.getByteString(index);
    }
    /**
     * <code>repeated string signers = 2 [json_name = "signers"];</code>
     * @param index The index to set the value at.
     * @param value The signers to set.
     * @return This builder for chaining.
     */
    public Builder setSigners(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureSignersIsMutable();
      signers_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string signers = 2 [json_name = "signers"];</code>
     * @param value The signers to add.
     * @return This builder for chaining.
     */
    public Builder addSigners(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureSignersIsMutable();
      signers_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string signers = 2 [json_name = "signers"];</code>
     * @param values The signers to add.
     * @return This builder for chaining.
     */
    public Builder addAllSigners(
        java.lang.Iterable<java.lang.String> values) {
      ensureSignersIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, signers_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string signers = 2 [json_name = "signers"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSigners() {
      signers_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string signers = 2 [json_name = "signers"];</code>
     * @param value The bytes of the signers to add.
     * @return This builder for chaining.
     */
    public Builder addSignersBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureSignersIsMutable();
      signers_.add(value);
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


    // @@protoc_insertion_point(builder_scope:provenance.metadata.v1.MsgDeleteScopeSpecificationRequest)
  }

  // @@protoc_insertion_point(class_scope:provenance.metadata.v1.MsgDeleteScopeSpecificationRequest)
  private static final com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest();
  }

  public static com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgDeleteScopeSpecificationRequest>
      PARSER = new com.google.protobuf.AbstractParser<MsgDeleteScopeSpecificationRequest>() {
    @java.lang.Override
    public MsgDeleteScopeSpecificationRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgDeleteScopeSpecificationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgDeleteScopeSpecificationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

