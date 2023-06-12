// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: evmos/revenue/v1/query.proto

package com.evmos.revenue.v1;

/**
 * <pre>
 * QueryDeployerRevenuesResponse is the response type for the
 * Query/DeployerRevenues RPC method.
 * </pre>
 *
 * Protobuf type {@code evmos.revenue.v1.QueryDeployerRevenuesResponse}
 */
public final class QueryDeployerRevenuesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:evmos.revenue.v1.QueryDeployerRevenuesResponse)
    QueryDeployerRevenuesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryDeployerRevenuesResponse.newBuilder() to construct.
  private QueryDeployerRevenuesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryDeployerRevenuesResponse() {
    contractAddresses_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryDeployerRevenuesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.evmos.revenue.v1.QueryProto.internal_static_evmos_revenue_v1_QueryDeployerRevenuesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.evmos.revenue.v1.QueryProto.internal_static_evmos_revenue_v1_QueryDeployerRevenuesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.evmos.revenue.v1.QueryDeployerRevenuesResponse.class, com.evmos.revenue.v1.QueryDeployerRevenuesResponse.Builder.class);
  }

  public static final int CONTRACT_ADDRESSES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList contractAddresses_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * contract_addresses is the slice of registered contract addresses for a deployer
   * </pre>
   *
   * <code>repeated string contract_addresses = 1 [json_name = "contractAddresses"];</code>
   * @return A list containing the contractAddresses.
   */
  public com.google.protobuf.ProtocolStringList
      getContractAddressesList() {
    return contractAddresses_;
  }
  /**
   * <pre>
   * contract_addresses is the slice of registered contract addresses for a deployer
   * </pre>
   *
   * <code>repeated string contract_addresses = 1 [json_name = "contractAddresses"];</code>
   * @return The count of contractAddresses.
   */
  public int getContractAddressesCount() {
    return contractAddresses_.size();
  }
  /**
   * <pre>
   * contract_addresses is the slice of registered contract addresses for a deployer
   * </pre>
   *
   * <code>repeated string contract_addresses = 1 [json_name = "contractAddresses"];</code>
   * @param index The index of the element to return.
   * @return The contractAddresses at the given index.
   */
  public java.lang.String getContractAddresses(int index) {
    return contractAddresses_.get(index);
  }
  /**
   * <pre>
   * contract_addresses is the slice of registered contract addresses for a deployer
   * </pre>
   *
   * <code>repeated string contract_addresses = 1 [json_name = "contractAddresses"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the contractAddresses at the given index.
   */
  public com.google.protobuf.ByteString
      getContractAddressesBytes(int index) {
    return contractAddresses_.getByteString(index);
  }

  public static final int PAGINATION_FIELD_NUMBER = 2;
  private com.cosmos.base.query.v1beta1.PageResponse pagination_;
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  @java.lang.Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponse getPagination() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
  }
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
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
    for (int i = 0; i < contractAddresses_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, contractAddresses_.getRaw(i));
    }
    if (pagination_ != null) {
      output.writeMessage(2, getPagination());
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
      for (int i = 0; i < contractAddresses_.size(); i++) {
        dataSize += computeStringSizeNoTag(contractAddresses_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getContractAddressesList().size();
    }
    if (pagination_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPagination());
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
    if (!(obj instanceof com.evmos.revenue.v1.QueryDeployerRevenuesResponse)) {
      return super.equals(obj);
    }
    com.evmos.revenue.v1.QueryDeployerRevenuesResponse other = (com.evmos.revenue.v1.QueryDeployerRevenuesResponse) obj;

    if (!getContractAddressesList()
        .equals(other.getContractAddressesList())) return false;
    if (hasPagination() != other.hasPagination()) return false;
    if (hasPagination()) {
      if (!getPagination()
          .equals(other.getPagination())) return false;
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
    if (getContractAddressesCount() > 0) {
      hash = (37 * hash) + CONTRACT_ADDRESSES_FIELD_NUMBER;
      hash = (53 * hash) + getContractAddressesList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.evmos.revenue.v1.QueryDeployerRevenuesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.evmos.revenue.v1.QueryDeployerRevenuesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.evmos.revenue.v1.QueryDeployerRevenuesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.evmos.revenue.v1.QueryDeployerRevenuesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.evmos.revenue.v1.QueryDeployerRevenuesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.evmos.revenue.v1.QueryDeployerRevenuesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.evmos.revenue.v1.QueryDeployerRevenuesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.evmos.revenue.v1.QueryDeployerRevenuesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.evmos.revenue.v1.QueryDeployerRevenuesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.evmos.revenue.v1.QueryDeployerRevenuesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.evmos.revenue.v1.QueryDeployerRevenuesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.evmos.revenue.v1.QueryDeployerRevenuesResponse parseFrom(
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
  public static Builder newBuilder(com.evmos.revenue.v1.QueryDeployerRevenuesResponse prototype) {
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
   * QueryDeployerRevenuesResponse is the response type for the
   * Query/DeployerRevenues RPC method.
   * </pre>
   *
   * Protobuf type {@code evmos.revenue.v1.QueryDeployerRevenuesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:evmos.revenue.v1.QueryDeployerRevenuesResponse)
      com.evmos.revenue.v1.QueryDeployerRevenuesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.evmos.revenue.v1.QueryProto.internal_static_evmos_revenue_v1_QueryDeployerRevenuesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.evmos.revenue.v1.QueryProto.internal_static_evmos_revenue_v1_QueryDeployerRevenuesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.evmos.revenue.v1.QueryDeployerRevenuesResponse.class, com.evmos.revenue.v1.QueryDeployerRevenuesResponse.Builder.class);
    }

    // Construct using com.evmos.revenue.v1.QueryDeployerRevenuesResponse.newBuilder()
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
      contractAddresses_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      pagination_ = null;
      if (paginationBuilder_ != null) {
        paginationBuilder_.dispose();
        paginationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.evmos.revenue.v1.QueryProto.internal_static_evmos_revenue_v1_QueryDeployerRevenuesResponse_descriptor;
    }

    @java.lang.Override
    public com.evmos.revenue.v1.QueryDeployerRevenuesResponse getDefaultInstanceForType() {
      return com.evmos.revenue.v1.QueryDeployerRevenuesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.evmos.revenue.v1.QueryDeployerRevenuesResponse build() {
      com.evmos.revenue.v1.QueryDeployerRevenuesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.evmos.revenue.v1.QueryDeployerRevenuesResponse buildPartial() {
      com.evmos.revenue.v1.QueryDeployerRevenuesResponse result = new com.evmos.revenue.v1.QueryDeployerRevenuesResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.evmos.revenue.v1.QueryDeployerRevenuesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        contractAddresses_.makeImmutable();
        result.contractAddresses_ = contractAddresses_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.evmos.revenue.v1.QueryDeployerRevenuesResponse) {
        return mergeFrom((com.evmos.revenue.v1.QueryDeployerRevenuesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.evmos.revenue.v1.QueryDeployerRevenuesResponse other) {
      if (other == com.evmos.revenue.v1.QueryDeployerRevenuesResponse.getDefaultInstance()) return this;
      if (!other.contractAddresses_.isEmpty()) {
        if (contractAddresses_.isEmpty()) {
          contractAddresses_ = other.contractAddresses_;
          bitField0_ |= 0x00000001;
        } else {
          ensureContractAddressesIsMutable();
          contractAddresses_.addAll(other.contractAddresses_);
        }
        onChanged();
      }
      if (other.hasPagination()) {
        mergePagination(other.getPagination());
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
              ensureContractAddressesIsMutable();
              contractAddresses_.add(s);
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getPaginationFieldBuilder().getBuilder(),
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

    private com.google.protobuf.LazyStringArrayList contractAddresses_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureContractAddressesIsMutable() {
      if (!contractAddresses_.isModifiable()) {
        contractAddresses_ = new com.google.protobuf.LazyStringArrayList(contractAddresses_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * contract_addresses is the slice of registered contract addresses for a deployer
     * </pre>
     *
     * <code>repeated string contract_addresses = 1 [json_name = "contractAddresses"];</code>
     * @return A list containing the contractAddresses.
     */
    public com.google.protobuf.ProtocolStringList
        getContractAddressesList() {
      contractAddresses_.makeImmutable();
      return contractAddresses_;
    }
    /**
     * <pre>
     * contract_addresses is the slice of registered contract addresses for a deployer
     * </pre>
     *
     * <code>repeated string contract_addresses = 1 [json_name = "contractAddresses"];</code>
     * @return The count of contractAddresses.
     */
    public int getContractAddressesCount() {
      return contractAddresses_.size();
    }
    /**
     * <pre>
     * contract_addresses is the slice of registered contract addresses for a deployer
     * </pre>
     *
     * <code>repeated string contract_addresses = 1 [json_name = "contractAddresses"];</code>
     * @param index The index of the element to return.
     * @return The contractAddresses at the given index.
     */
    public java.lang.String getContractAddresses(int index) {
      return contractAddresses_.get(index);
    }
    /**
     * <pre>
     * contract_addresses is the slice of registered contract addresses for a deployer
     * </pre>
     *
     * <code>repeated string contract_addresses = 1 [json_name = "contractAddresses"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the contractAddresses at the given index.
     */
    public com.google.protobuf.ByteString
        getContractAddressesBytes(int index) {
      return contractAddresses_.getByteString(index);
    }
    /**
     * <pre>
     * contract_addresses is the slice of registered contract addresses for a deployer
     * </pre>
     *
     * <code>repeated string contract_addresses = 1 [json_name = "contractAddresses"];</code>
     * @param index The index to set the value at.
     * @param value The contractAddresses to set.
     * @return This builder for chaining.
     */
    public Builder setContractAddresses(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureContractAddressesIsMutable();
      contractAddresses_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * contract_addresses is the slice of registered contract addresses for a deployer
     * </pre>
     *
     * <code>repeated string contract_addresses = 1 [json_name = "contractAddresses"];</code>
     * @param value The contractAddresses to add.
     * @return This builder for chaining.
     */
    public Builder addContractAddresses(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureContractAddressesIsMutable();
      contractAddresses_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * contract_addresses is the slice of registered contract addresses for a deployer
     * </pre>
     *
     * <code>repeated string contract_addresses = 1 [json_name = "contractAddresses"];</code>
     * @param values The contractAddresses to add.
     * @return This builder for chaining.
     */
    public Builder addAllContractAddresses(
        java.lang.Iterable<java.lang.String> values) {
      ensureContractAddressesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, contractAddresses_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * contract_addresses is the slice of registered contract addresses for a deployer
     * </pre>
     *
     * <code>repeated string contract_addresses = 1 [json_name = "contractAddresses"];</code>
     * @return This builder for chaining.
     */
    public Builder clearContractAddresses() {
      contractAddresses_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * contract_addresses is the slice of registered contract addresses for a deployer
     * </pre>
     *
     * <code>repeated string contract_addresses = 1 [json_name = "contractAddresses"];</code>
     * @param value The bytes of the contractAddresses to add.
     * @return This builder for chaining.
     */
    public Builder addContractAddressesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureContractAddressesIsMutable();
      contractAddresses_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.cosmos.base.query.v1beta1.PageResponse pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> paginationBuilder_;
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     * @return The pagination.
     */
    public com.cosmos.base.query.v1beta1.PageResponse getPagination() {
      if (paginationBuilder_ == null) {
        return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
      } else {
        return paginationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder setPagination(com.cosmos.base.query.v1beta1.PageResponse value) {
      if (paginationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pagination_ = value;
      } else {
        paginationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder setPagination(
        com.cosmos.base.query.v1beta1.PageResponse.Builder builderForValue) {
      if (paginationBuilder_ == null) {
        pagination_ = builderForValue.build();
      } else {
        paginationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder mergePagination(com.cosmos.base.query.v1beta1.PageResponse value) {
      if (paginationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          pagination_ != null &&
          pagination_ != com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance()) {
          getPaginationBuilder().mergeFrom(value);
        } else {
          pagination_ = value;
        }
      } else {
        paginationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder clearPagination() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pagination_ = null;
      if (paginationBuilder_ != null) {
        paginationBuilder_.dispose();
        paginationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponse.Builder getPaginationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder() {
      if (paginationBuilder_ != null) {
        return paginationBuilder_.getMessageOrBuilder();
      } else {
        return pagination_ == null ?
            com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
      }
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> 
        getPaginationFieldBuilder() {
      if (paginationBuilder_ == null) {
        paginationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder>(
                getPagination(),
                getParentForChildren(),
                isClean());
        pagination_ = null;
      }
      return paginationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:evmos.revenue.v1.QueryDeployerRevenuesResponse)
  }

  // @@protoc_insertion_point(class_scope:evmos.revenue.v1.QueryDeployerRevenuesResponse)
  private static final com.evmos.revenue.v1.QueryDeployerRevenuesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.evmos.revenue.v1.QueryDeployerRevenuesResponse();
  }

  public static com.evmos.revenue.v1.QueryDeployerRevenuesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryDeployerRevenuesResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryDeployerRevenuesResponse>() {
    @java.lang.Override
    public QueryDeployerRevenuesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryDeployerRevenuesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryDeployerRevenuesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.evmos.revenue.v1.QueryDeployerRevenuesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

