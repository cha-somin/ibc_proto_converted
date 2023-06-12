// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/tx.proto

package com.provenance.metadata.v1;

/**
 * <pre>
 * MsgWriteP8eContractSpecResponse  has been deprecated and is no longer usable.
 * Deprecated: This message is no longer part of any endpoint and cannot be used for anything.
 * </pre>
 *
 * Protobuf type {@code provenance.metadata.v1.MsgWriteP8eContractSpecResponse}
 */
@java.lang.Deprecated public final class MsgWriteP8eContractSpecResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.metadata.v1.MsgWriteP8eContractSpecResponse)
    MsgWriteP8eContractSpecResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgWriteP8eContractSpecResponse.newBuilder() to construct.
  private MsgWriteP8eContractSpecResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgWriteP8eContractSpecResponse() {
    recordSpecIdInfos_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgWriteP8eContractSpecResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.provenance.metadata.v1.TxProto.internal_static_provenance_metadata_v1_MsgWriteP8eContractSpecResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.provenance.metadata.v1.TxProto.internal_static_provenance_metadata_v1_MsgWriteP8eContractSpecResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse.class, com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse.Builder.class);
  }

  public static final int CONTRACT_SPEC_ID_INFO_FIELD_NUMBER = 1;
  private com.provenance.metadata.v1.ContractSpecIdInfo contractSpecIdInfo_;
  /**
   * <code>.provenance.metadata.v1.ContractSpecIdInfo contract_spec_id_info = 1 [json_name = "contractSpecIdInfo", (.gogoproto.moretags) = "yaml:&#92;"contract_spec_id_info&#92;""];</code>
   * @return Whether the contractSpecIdInfo field is set.
   */
  @java.lang.Override
  public boolean hasContractSpecIdInfo() {
    return contractSpecIdInfo_ != null;
  }
  /**
   * <code>.provenance.metadata.v1.ContractSpecIdInfo contract_spec_id_info = 1 [json_name = "contractSpecIdInfo", (.gogoproto.moretags) = "yaml:&#92;"contract_spec_id_info&#92;""];</code>
   * @return The contractSpecIdInfo.
   */
  @java.lang.Override
  public com.provenance.metadata.v1.ContractSpecIdInfo getContractSpecIdInfo() {
    return contractSpecIdInfo_ == null ? com.provenance.metadata.v1.ContractSpecIdInfo.getDefaultInstance() : contractSpecIdInfo_;
  }
  /**
   * <code>.provenance.metadata.v1.ContractSpecIdInfo contract_spec_id_info = 1 [json_name = "contractSpecIdInfo", (.gogoproto.moretags) = "yaml:&#92;"contract_spec_id_info&#92;""];</code>
   */
  @java.lang.Override
  public com.provenance.metadata.v1.ContractSpecIdInfoOrBuilder getContractSpecIdInfoOrBuilder() {
    return contractSpecIdInfo_ == null ? com.provenance.metadata.v1.ContractSpecIdInfo.getDefaultInstance() : contractSpecIdInfo_;
  }

  public static final int RECORD_SPEC_ID_INFOS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.provenance.metadata.v1.RecordSpecIdInfo> recordSpecIdInfos_;
  /**
   * <code>repeated .provenance.metadata.v1.RecordSpecIdInfo record_spec_id_infos = 2 [json_name = "recordSpecIdInfos", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_infos&#92;""];</code>
   */
  @java.lang.Override
  public java.util.List<com.provenance.metadata.v1.RecordSpecIdInfo> getRecordSpecIdInfosList() {
    return recordSpecIdInfos_;
  }
  /**
   * <code>repeated .provenance.metadata.v1.RecordSpecIdInfo record_spec_id_infos = 2 [json_name = "recordSpecIdInfos", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_infos&#92;""];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.provenance.metadata.v1.RecordSpecIdInfoOrBuilder> 
      getRecordSpecIdInfosOrBuilderList() {
    return recordSpecIdInfos_;
  }
  /**
   * <code>repeated .provenance.metadata.v1.RecordSpecIdInfo record_spec_id_infos = 2 [json_name = "recordSpecIdInfos", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_infos&#92;""];</code>
   */
  @java.lang.Override
  public int getRecordSpecIdInfosCount() {
    return recordSpecIdInfos_.size();
  }
  /**
   * <code>repeated .provenance.metadata.v1.RecordSpecIdInfo record_spec_id_infos = 2 [json_name = "recordSpecIdInfos", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_infos&#92;""];</code>
   */
  @java.lang.Override
  public com.provenance.metadata.v1.RecordSpecIdInfo getRecordSpecIdInfos(int index) {
    return recordSpecIdInfos_.get(index);
  }
  /**
   * <code>repeated .provenance.metadata.v1.RecordSpecIdInfo record_spec_id_infos = 2 [json_name = "recordSpecIdInfos", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_infos&#92;""];</code>
   */
  @java.lang.Override
  public com.provenance.metadata.v1.RecordSpecIdInfoOrBuilder getRecordSpecIdInfosOrBuilder(
      int index) {
    return recordSpecIdInfos_.get(index);
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
    if (contractSpecIdInfo_ != null) {
      output.writeMessage(1, getContractSpecIdInfo());
    }
    for (int i = 0; i < recordSpecIdInfos_.size(); i++) {
      output.writeMessage(2, recordSpecIdInfos_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (contractSpecIdInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getContractSpecIdInfo());
    }
    for (int i = 0; i < recordSpecIdInfos_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, recordSpecIdInfos_.get(i));
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
    if (!(obj instanceof com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse)) {
      return super.equals(obj);
    }
    com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse other = (com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse) obj;

    if (hasContractSpecIdInfo() != other.hasContractSpecIdInfo()) return false;
    if (hasContractSpecIdInfo()) {
      if (!getContractSpecIdInfo()
          .equals(other.getContractSpecIdInfo())) return false;
    }
    if (!getRecordSpecIdInfosList()
        .equals(other.getRecordSpecIdInfosList())) return false;
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
    if (hasContractSpecIdInfo()) {
      hash = (37 * hash) + CONTRACT_SPEC_ID_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getContractSpecIdInfo().hashCode();
    }
    if (getRecordSpecIdInfosCount() > 0) {
      hash = (37 * hash) + RECORD_SPEC_ID_INFOS_FIELD_NUMBER;
      hash = (53 * hash) + getRecordSpecIdInfosList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse parseFrom(
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
  public static Builder newBuilder(com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse prototype) {
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
   * MsgWriteP8eContractSpecResponse  has been deprecated and is no longer usable.
   * Deprecated: This message is no longer part of any endpoint and cannot be used for anything.
   * </pre>
   *
   * Protobuf type {@code provenance.metadata.v1.MsgWriteP8eContractSpecResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.metadata.v1.MsgWriteP8eContractSpecResponse)
      com.provenance.metadata.v1.MsgWriteP8eContractSpecResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.provenance.metadata.v1.TxProto.internal_static_provenance_metadata_v1_MsgWriteP8eContractSpecResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.provenance.metadata.v1.TxProto.internal_static_provenance_metadata_v1_MsgWriteP8eContractSpecResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse.class, com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse.Builder.class);
    }

    // Construct using com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse.newBuilder()
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
      contractSpecIdInfo_ = null;
      if (contractSpecIdInfoBuilder_ != null) {
        contractSpecIdInfoBuilder_.dispose();
        contractSpecIdInfoBuilder_ = null;
      }
      if (recordSpecIdInfosBuilder_ == null) {
        recordSpecIdInfos_ = java.util.Collections.emptyList();
      } else {
        recordSpecIdInfos_ = null;
        recordSpecIdInfosBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.provenance.metadata.v1.TxProto.internal_static_provenance_metadata_v1_MsgWriteP8eContractSpecResponse_descriptor;
    }

    @java.lang.Override
    public com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse getDefaultInstanceForType() {
      return com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse build() {
      com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse buildPartial() {
      com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse result = new com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse result) {
      if (recordSpecIdInfosBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          recordSpecIdInfos_ = java.util.Collections.unmodifiableList(recordSpecIdInfos_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.recordSpecIdInfos_ = recordSpecIdInfos_;
      } else {
        result.recordSpecIdInfos_ = recordSpecIdInfosBuilder_.build();
      }
    }

    private void buildPartial0(com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.contractSpecIdInfo_ = contractSpecIdInfoBuilder_ == null
            ? contractSpecIdInfo_
            : contractSpecIdInfoBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse) {
        return mergeFrom((com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse other) {
      if (other == com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse.getDefaultInstance()) return this;
      if (other.hasContractSpecIdInfo()) {
        mergeContractSpecIdInfo(other.getContractSpecIdInfo());
      }
      if (recordSpecIdInfosBuilder_ == null) {
        if (!other.recordSpecIdInfos_.isEmpty()) {
          if (recordSpecIdInfos_.isEmpty()) {
            recordSpecIdInfos_ = other.recordSpecIdInfos_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureRecordSpecIdInfosIsMutable();
            recordSpecIdInfos_.addAll(other.recordSpecIdInfos_);
          }
          onChanged();
        }
      } else {
        if (!other.recordSpecIdInfos_.isEmpty()) {
          if (recordSpecIdInfosBuilder_.isEmpty()) {
            recordSpecIdInfosBuilder_.dispose();
            recordSpecIdInfosBuilder_ = null;
            recordSpecIdInfos_ = other.recordSpecIdInfos_;
            bitField0_ = (bitField0_ & ~0x00000002);
            recordSpecIdInfosBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRecordSpecIdInfosFieldBuilder() : null;
          } else {
            recordSpecIdInfosBuilder_.addAllMessages(other.recordSpecIdInfos_);
          }
        }
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
                  getContractSpecIdInfoFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.provenance.metadata.v1.RecordSpecIdInfo m =
                  input.readMessage(
                      com.provenance.metadata.v1.RecordSpecIdInfo.parser(),
                      extensionRegistry);
              if (recordSpecIdInfosBuilder_ == null) {
                ensureRecordSpecIdInfosIsMutable();
                recordSpecIdInfos_.add(m);
              } else {
                recordSpecIdInfosBuilder_.addMessage(m);
              }
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

    private com.provenance.metadata.v1.ContractSpecIdInfo contractSpecIdInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.provenance.metadata.v1.ContractSpecIdInfo, com.provenance.metadata.v1.ContractSpecIdInfo.Builder, com.provenance.metadata.v1.ContractSpecIdInfoOrBuilder> contractSpecIdInfoBuilder_;
    /**
     * <code>.provenance.metadata.v1.ContractSpecIdInfo contract_spec_id_info = 1 [json_name = "contractSpecIdInfo", (.gogoproto.moretags) = "yaml:&#92;"contract_spec_id_info&#92;""];</code>
     * @return Whether the contractSpecIdInfo field is set.
     */
    public boolean hasContractSpecIdInfo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.provenance.metadata.v1.ContractSpecIdInfo contract_spec_id_info = 1 [json_name = "contractSpecIdInfo", (.gogoproto.moretags) = "yaml:&#92;"contract_spec_id_info&#92;""];</code>
     * @return The contractSpecIdInfo.
     */
    public com.provenance.metadata.v1.ContractSpecIdInfo getContractSpecIdInfo() {
      if (contractSpecIdInfoBuilder_ == null) {
        return contractSpecIdInfo_ == null ? com.provenance.metadata.v1.ContractSpecIdInfo.getDefaultInstance() : contractSpecIdInfo_;
      } else {
        return contractSpecIdInfoBuilder_.getMessage();
      }
    }
    /**
     * <code>.provenance.metadata.v1.ContractSpecIdInfo contract_spec_id_info = 1 [json_name = "contractSpecIdInfo", (.gogoproto.moretags) = "yaml:&#92;"contract_spec_id_info&#92;""];</code>
     */
    public Builder setContractSpecIdInfo(com.provenance.metadata.v1.ContractSpecIdInfo value) {
      if (contractSpecIdInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        contractSpecIdInfo_ = value;
      } else {
        contractSpecIdInfoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.provenance.metadata.v1.ContractSpecIdInfo contract_spec_id_info = 1 [json_name = "contractSpecIdInfo", (.gogoproto.moretags) = "yaml:&#92;"contract_spec_id_info&#92;""];</code>
     */
    public Builder setContractSpecIdInfo(
        com.provenance.metadata.v1.ContractSpecIdInfo.Builder builderForValue) {
      if (contractSpecIdInfoBuilder_ == null) {
        contractSpecIdInfo_ = builderForValue.build();
      } else {
        contractSpecIdInfoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.provenance.metadata.v1.ContractSpecIdInfo contract_spec_id_info = 1 [json_name = "contractSpecIdInfo", (.gogoproto.moretags) = "yaml:&#92;"contract_spec_id_info&#92;""];</code>
     */
    public Builder mergeContractSpecIdInfo(com.provenance.metadata.v1.ContractSpecIdInfo value) {
      if (contractSpecIdInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          contractSpecIdInfo_ != null &&
          contractSpecIdInfo_ != com.provenance.metadata.v1.ContractSpecIdInfo.getDefaultInstance()) {
          getContractSpecIdInfoBuilder().mergeFrom(value);
        } else {
          contractSpecIdInfo_ = value;
        }
      } else {
        contractSpecIdInfoBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.provenance.metadata.v1.ContractSpecIdInfo contract_spec_id_info = 1 [json_name = "contractSpecIdInfo", (.gogoproto.moretags) = "yaml:&#92;"contract_spec_id_info&#92;""];</code>
     */
    public Builder clearContractSpecIdInfo() {
      bitField0_ = (bitField0_ & ~0x00000001);
      contractSpecIdInfo_ = null;
      if (contractSpecIdInfoBuilder_ != null) {
        contractSpecIdInfoBuilder_.dispose();
        contractSpecIdInfoBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.provenance.metadata.v1.ContractSpecIdInfo contract_spec_id_info = 1 [json_name = "contractSpecIdInfo", (.gogoproto.moretags) = "yaml:&#92;"contract_spec_id_info&#92;""];</code>
     */
    public com.provenance.metadata.v1.ContractSpecIdInfo.Builder getContractSpecIdInfoBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getContractSpecIdInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.provenance.metadata.v1.ContractSpecIdInfo contract_spec_id_info = 1 [json_name = "contractSpecIdInfo", (.gogoproto.moretags) = "yaml:&#92;"contract_spec_id_info&#92;""];</code>
     */
    public com.provenance.metadata.v1.ContractSpecIdInfoOrBuilder getContractSpecIdInfoOrBuilder() {
      if (contractSpecIdInfoBuilder_ != null) {
        return contractSpecIdInfoBuilder_.getMessageOrBuilder();
      } else {
        return contractSpecIdInfo_ == null ?
            com.provenance.metadata.v1.ContractSpecIdInfo.getDefaultInstance() : contractSpecIdInfo_;
      }
    }
    /**
     * <code>.provenance.metadata.v1.ContractSpecIdInfo contract_spec_id_info = 1 [json_name = "contractSpecIdInfo", (.gogoproto.moretags) = "yaml:&#92;"contract_spec_id_info&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.provenance.metadata.v1.ContractSpecIdInfo, com.provenance.metadata.v1.ContractSpecIdInfo.Builder, com.provenance.metadata.v1.ContractSpecIdInfoOrBuilder> 
        getContractSpecIdInfoFieldBuilder() {
      if (contractSpecIdInfoBuilder_ == null) {
        contractSpecIdInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.provenance.metadata.v1.ContractSpecIdInfo, com.provenance.metadata.v1.ContractSpecIdInfo.Builder, com.provenance.metadata.v1.ContractSpecIdInfoOrBuilder>(
                getContractSpecIdInfo(),
                getParentForChildren(),
                isClean());
        contractSpecIdInfo_ = null;
      }
      return contractSpecIdInfoBuilder_;
    }

    private java.util.List<com.provenance.metadata.v1.RecordSpecIdInfo> recordSpecIdInfos_ =
      java.util.Collections.emptyList();
    private void ensureRecordSpecIdInfosIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        recordSpecIdInfos_ = new java.util.ArrayList<com.provenance.metadata.v1.RecordSpecIdInfo>(recordSpecIdInfos_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.provenance.metadata.v1.RecordSpecIdInfo, com.provenance.metadata.v1.RecordSpecIdInfo.Builder, com.provenance.metadata.v1.RecordSpecIdInfoOrBuilder> recordSpecIdInfosBuilder_;

    /**
     * <code>repeated .provenance.metadata.v1.RecordSpecIdInfo record_spec_id_infos = 2 [json_name = "recordSpecIdInfos", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_infos&#92;""];</code>
     */
    public java.util.List<com.provenance.metadata.v1.RecordSpecIdInfo> getRecordSpecIdInfosList() {
      if (recordSpecIdInfosBuilder_ == null) {
        return java.util.Collections.unmodifiableList(recordSpecIdInfos_);
      } else {
        return recordSpecIdInfosBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .provenance.metadata.v1.RecordSpecIdInfo record_spec_id_infos = 2 [json_name = "recordSpecIdInfos", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_infos&#92;""];</code>
     */
    public int getRecordSpecIdInfosCount() {
      if (recordSpecIdInfosBuilder_ == null) {
        return recordSpecIdInfos_.size();
      } else {
        return recordSpecIdInfosBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .provenance.metadata.v1.RecordSpecIdInfo record_spec_id_infos = 2 [json_name = "recordSpecIdInfos", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_infos&#92;""];</code>
     */
    public com.provenance.metadata.v1.RecordSpecIdInfo getRecordSpecIdInfos(int index) {
      if (recordSpecIdInfosBuilder_ == null) {
        return recordSpecIdInfos_.get(index);
      } else {
        return recordSpecIdInfosBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .provenance.metadata.v1.RecordSpecIdInfo record_spec_id_infos = 2 [json_name = "recordSpecIdInfos", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_infos&#92;""];</code>
     */
    public Builder setRecordSpecIdInfos(
        int index, com.provenance.metadata.v1.RecordSpecIdInfo value) {
      if (recordSpecIdInfosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecordSpecIdInfosIsMutable();
        recordSpecIdInfos_.set(index, value);
        onChanged();
      } else {
        recordSpecIdInfosBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .provenance.metadata.v1.RecordSpecIdInfo record_spec_id_infos = 2 [json_name = "recordSpecIdInfos", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_infos&#92;""];</code>
     */
    public Builder setRecordSpecIdInfos(
        int index, com.provenance.metadata.v1.RecordSpecIdInfo.Builder builderForValue) {
      if (recordSpecIdInfosBuilder_ == null) {
        ensureRecordSpecIdInfosIsMutable();
        recordSpecIdInfos_.set(index, builderForValue.build());
        onChanged();
      } else {
        recordSpecIdInfosBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .provenance.metadata.v1.RecordSpecIdInfo record_spec_id_infos = 2 [json_name = "recordSpecIdInfos", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_infos&#92;""];</code>
     */
    public Builder addRecordSpecIdInfos(com.provenance.metadata.v1.RecordSpecIdInfo value) {
      if (recordSpecIdInfosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecordSpecIdInfosIsMutable();
        recordSpecIdInfos_.add(value);
        onChanged();
      } else {
        recordSpecIdInfosBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .provenance.metadata.v1.RecordSpecIdInfo record_spec_id_infos = 2 [json_name = "recordSpecIdInfos", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_infos&#92;""];</code>
     */
    public Builder addRecordSpecIdInfos(
        int index, com.provenance.metadata.v1.RecordSpecIdInfo value) {
      if (recordSpecIdInfosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecordSpecIdInfosIsMutable();
        recordSpecIdInfos_.add(index, value);
        onChanged();
      } else {
        recordSpecIdInfosBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .provenance.metadata.v1.RecordSpecIdInfo record_spec_id_infos = 2 [json_name = "recordSpecIdInfos", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_infos&#92;""];</code>
     */
    public Builder addRecordSpecIdInfos(
        com.provenance.metadata.v1.RecordSpecIdInfo.Builder builderForValue) {
      if (recordSpecIdInfosBuilder_ == null) {
        ensureRecordSpecIdInfosIsMutable();
        recordSpecIdInfos_.add(builderForValue.build());
        onChanged();
      } else {
        recordSpecIdInfosBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .provenance.metadata.v1.RecordSpecIdInfo record_spec_id_infos = 2 [json_name = "recordSpecIdInfos", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_infos&#92;""];</code>
     */
    public Builder addRecordSpecIdInfos(
        int index, com.provenance.metadata.v1.RecordSpecIdInfo.Builder builderForValue) {
      if (recordSpecIdInfosBuilder_ == null) {
        ensureRecordSpecIdInfosIsMutable();
        recordSpecIdInfos_.add(index, builderForValue.build());
        onChanged();
      } else {
        recordSpecIdInfosBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .provenance.metadata.v1.RecordSpecIdInfo record_spec_id_infos = 2 [json_name = "recordSpecIdInfos", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_infos&#92;""];</code>
     */
    public Builder addAllRecordSpecIdInfos(
        java.lang.Iterable<? extends com.provenance.metadata.v1.RecordSpecIdInfo> values) {
      if (recordSpecIdInfosBuilder_ == null) {
        ensureRecordSpecIdInfosIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, recordSpecIdInfos_);
        onChanged();
      } else {
        recordSpecIdInfosBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .provenance.metadata.v1.RecordSpecIdInfo record_spec_id_infos = 2 [json_name = "recordSpecIdInfos", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_infos&#92;""];</code>
     */
    public Builder clearRecordSpecIdInfos() {
      if (recordSpecIdInfosBuilder_ == null) {
        recordSpecIdInfos_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        recordSpecIdInfosBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .provenance.metadata.v1.RecordSpecIdInfo record_spec_id_infos = 2 [json_name = "recordSpecIdInfos", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_infos&#92;""];</code>
     */
    public Builder removeRecordSpecIdInfos(int index) {
      if (recordSpecIdInfosBuilder_ == null) {
        ensureRecordSpecIdInfosIsMutable();
        recordSpecIdInfos_.remove(index);
        onChanged();
      } else {
        recordSpecIdInfosBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .provenance.metadata.v1.RecordSpecIdInfo record_spec_id_infos = 2 [json_name = "recordSpecIdInfos", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_infos&#92;""];</code>
     */
    public com.provenance.metadata.v1.RecordSpecIdInfo.Builder getRecordSpecIdInfosBuilder(
        int index) {
      return getRecordSpecIdInfosFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .provenance.metadata.v1.RecordSpecIdInfo record_spec_id_infos = 2 [json_name = "recordSpecIdInfos", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_infos&#92;""];</code>
     */
    public com.provenance.metadata.v1.RecordSpecIdInfoOrBuilder getRecordSpecIdInfosOrBuilder(
        int index) {
      if (recordSpecIdInfosBuilder_ == null) {
        return recordSpecIdInfos_.get(index);  } else {
        return recordSpecIdInfosBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .provenance.metadata.v1.RecordSpecIdInfo record_spec_id_infos = 2 [json_name = "recordSpecIdInfos", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_infos&#92;""];</code>
     */
    public java.util.List<? extends com.provenance.metadata.v1.RecordSpecIdInfoOrBuilder> 
         getRecordSpecIdInfosOrBuilderList() {
      if (recordSpecIdInfosBuilder_ != null) {
        return recordSpecIdInfosBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(recordSpecIdInfos_);
      }
    }
    /**
     * <code>repeated .provenance.metadata.v1.RecordSpecIdInfo record_spec_id_infos = 2 [json_name = "recordSpecIdInfos", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_infos&#92;""];</code>
     */
    public com.provenance.metadata.v1.RecordSpecIdInfo.Builder addRecordSpecIdInfosBuilder() {
      return getRecordSpecIdInfosFieldBuilder().addBuilder(
          com.provenance.metadata.v1.RecordSpecIdInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .provenance.metadata.v1.RecordSpecIdInfo record_spec_id_infos = 2 [json_name = "recordSpecIdInfos", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_infos&#92;""];</code>
     */
    public com.provenance.metadata.v1.RecordSpecIdInfo.Builder addRecordSpecIdInfosBuilder(
        int index) {
      return getRecordSpecIdInfosFieldBuilder().addBuilder(
          index, com.provenance.metadata.v1.RecordSpecIdInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .provenance.metadata.v1.RecordSpecIdInfo record_spec_id_infos = 2 [json_name = "recordSpecIdInfos", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_infos&#92;""];</code>
     */
    public java.util.List<com.provenance.metadata.v1.RecordSpecIdInfo.Builder> 
         getRecordSpecIdInfosBuilderList() {
      return getRecordSpecIdInfosFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.provenance.metadata.v1.RecordSpecIdInfo, com.provenance.metadata.v1.RecordSpecIdInfo.Builder, com.provenance.metadata.v1.RecordSpecIdInfoOrBuilder> 
        getRecordSpecIdInfosFieldBuilder() {
      if (recordSpecIdInfosBuilder_ == null) {
        recordSpecIdInfosBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.provenance.metadata.v1.RecordSpecIdInfo, com.provenance.metadata.v1.RecordSpecIdInfo.Builder, com.provenance.metadata.v1.RecordSpecIdInfoOrBuilder>(
                recordSpecIdInfos_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        recordSpecIdInfos_ = null;
      }
      return recordSpecIdInfosBuilder_;
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


    // @@protoc_insertion_point(builder_scope:provenance.metadata.v1.MsgWriteP8eContractSpecResponse)
  }

  // @@protoc_insertion_point(class_scope:provenance.metadata.v1.MsgWriteP8eContractSpecResponse)
  private static final com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse();
  }

  public static com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgWriteP8eContractSpecResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgWriteP8eContractSpecResponse>() {
    @java.lang.Override
    public MsgWriteP8eContractSpecResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgWriteP8eContractSpecResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgWriteP8eContractSpecResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.provenance.metadata.v1.MsgWriteP8eContractSpecResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

