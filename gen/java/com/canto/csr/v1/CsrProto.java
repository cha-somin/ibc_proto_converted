// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: canto/csr/v1/csr.proto

package com.canto.csr.v1;

public final class CsrProto {
  private CsrProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CSROrBuilder extends
      // @@protoc_insertion_point(interface_extends:canto.csr.v1.CSR)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Contracts is the list of all EVM address that are registered to this NFT
     * </pre>
     *
     * <code>repeated string contracts = 1 [json_name = "contracts"];</code>
     * @return A list containing the contracts.
     */
    java.util.List<java.lang.String>
        getContractsList();
    /**
     * <pre>
     * Contracts is the list of all EVM address that are registered to this NFT
     * </pre>
     *
     * <code>repeated string contracts = 1 [json_name = "contracts"];</code>
     * @return The count of contracts.
     */
    int getContractsCount();
    /**
     * <pre>
     * Contracts is the list of all EVM address that are registered to this NFT
     * </pre>
     *
     * <code>repeated string contracts = 1 [json_name = "contracts"];</code>
     * @param index The index of the element to return.
     * @return The contracts at the given index.
     */
    java.lang.String getContracts(int index);
    /**
     * <pre>
     * Contracts is the list of all EVM address that are registered to this NFT
     * </pre>
     *
     * <code>repeated string contracts = 1 [json_name = "contracts"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the contracts at the given index.
     */
    com.google.protobuf.ByteString
        getContractsBytes(int index);

    /**
     * <pre>
     * The NFT id which this CSR corresponds to
     * </pre>
     *
     * <code>uint64 id = 2 [json_name = "id"];</code>
     * @return The id.
     */
    long getId();

    /**
     * <pre>
     * The total number of transactions for this CSR NFT
     * </pre>
     *
     * <code>uint64 txs = 3 [json_name = "txs"];</code>
     * @return The txs.
     */
    long getTxs();

    /**
     * <pre>
     * The cumulative revenue for this CSR NFT -&gt; represented as a sdk.Int
     * </pre>
     *
     * <code>string revenue = 4 [json_name = "revenue", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The revenue.
     */
    java.lang.String getRevenue();
    /**
     * <pre>
     * The cumulative revenue for this CSR NFT -&gt; represented as a sdk.Int
     * </pre>
     *
     * <code>string revenue = 4 [json_name = "revenue", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for revenue.
     */
    com.google.protobuf.ByteString
        getRevenueBytes();
  }
  /**
   * <pre>
   * The CSR struct is a wrapper to all of the metadata associated with a given CST NFT
   * </pre>
   *
   * Protobuf type {@code canto.csr.v1.CSR}
   */
  public static final class CSR extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:canto.csr.v1.CSR)
      CSROrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CSR.newBuilder() to construct.
    private CSR(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CSR() {
      contracts_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      revenue_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CSR();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.canto.csr.v1.CsrProto.internal_static_canto_csr_v1_CSR_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.canto.csr.v1.CsrProto.internal_static_canto_csr_v1_CSR_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.canto.csr.v1.CsrProto.CSR.class, com.canto.csr.v1.CsrProto.CSR.Builder.class);
    }

    public static final int CONTRACTS_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private com.google.protobuf.LazyStringArrayList contracts_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    /**
     * <pre>
     * Contracts is the list of all EVM address that are registered to this NFT
     * </pre>
     *
     * <code>repeated string contracts = 1 [json_name = "contracts"];</code>
     * @return A list containing the contracts.
     */
    public com.google.protobuf.ProtocolStringList
        getContractsList() {
      return contracts_;
    }
    /**
     * <pre>
     * Contracts is the list of all EVM address that are registered to this NFT
     * </pre>
     *
     * <code>repeated string contracts = 1 [json_name = "contracts"];</code>
     * @return The count of contracts.
     */
    public int getContractsCount() {
      return contracts_.size();
    }
    /**
     * <pre>
     * Contracts is the list of all EVM address that are registered to this NFT
     * </pre>
     *
     * <code>repeated string contracts = 1 [json_name = "contracts"];</code>
     * @param index The index of the element to return.
     * @return The contracts at the given index.
     */
    public java.lang.String getContracts(int index) {
      return contracts_.get(index);
    }
    /**
     * <pre>
     * Contracts is the list of all EVM address that are registered to this NFT
     * </pre>
     *
     * <code>repeated string contracts = 1 [json_name = "contracts"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the contracts at the given index.
     */
    public com.google.protobuf.ByteString
        getContractsBytes(int index) {
      return contracts_.getByteString(index);
    }

    public static final int ID_FIELD_NUMBER = 2;
    private long id_ = 0L;
    /**
     * <pre>
     * The NFT id which this CSR corresponds to
     * </pre>
     *
     * <code>uint64 id = 2 [json_name = "id"];</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }

    public static final int TXS_FIELD_NUMBER = 3;
    private long txs_ = 0L;
    /**
     * <pre>
     * The total number of transactions for this CSR NFT
     * </pre>
     *
     * <code>uint64 txs = 3 [json_name = "txs"];</code>
     * @return The txs.
     */
    @java.lang.Override
    public long getTxs() {
      return txs_;
    }

    public static final int REVENUE_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private volatile java.lang.Object revenue_ = "";
    /**
     * <pre>
     * The cumulative revenue for this CSR NFT -&gt; represented as a sdk.Int
     * </pre>
     *
     * <code>string revenue = 4 [json_name = "revenue", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The revenue.
     */
    @java.lang.Override
    public java.lang.String getRevenue() {
      java.lang.Object ref = revenue_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        revenue_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * The cumulative revenue for this CSR NFT -&gt; represented as a sdk.Int
     * </pre>
     *
     * <code>string revenue = 4 [json_name = "revenue", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for revenue.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getRevenueBytes() {
      java.lang.Object ref = revenue_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        revenue_ = b;
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
      for (int i = 0; i < contracts_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, contracts_.getRaw(i));
      }
      if (id_ != 0L) {
        output.writeUInt64(2, id_);
      }
      if (txs_ != 0L) {
        output.writeUInt64(3, txs_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(revenue_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, revenue_);
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
        for (int i = 0; i < contracts_.size(); i++) {
          dataSize += computeStringSizeNoTag(contracts_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getContractsList().size();
      }
      if (id_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, id_);
      }
      if (txs_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, txs_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(revenue_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, revenue_);
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
      if (!(obj instanceof com.canto.csr.v1.CsrProto.CSR)) {
        return super.equals(obj);
      }
      com.canto.csr.v1.CsrProto.CSR other = (com.canto.csr.v1.CsrProto.CSR) obj;

      if (!getContractsList()
          .equals(other.getContractsList())) return false;
      if (getId()
          != other.getId()) return false;
      if (getTxs()
          != other.getTxs()) return false;
      if (!getRevenue()
          .equals(other.getRevenue())) return false;
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
      if (getContractsCount() > 0) {
        hash = (37 * hash) + CONTRACTS_FIELD_NUMBER;
        hash = (53 * hash) + getContractsList().hashCode();
      }
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getId());
      hash = (37 * hash) + TXS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTxs());
      hash = (37 * hash) + REVENUE_FIELD_NUMBER;
      hash = (53 * hash) + getRevenue().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.canto.csr.v1.CsrProto.CSR parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.canto.csr.v1.CsrProto.CSR parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.canto.csr.v1.CsrProto.CSR parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.canto.csr.v1.CsrProto.CSR parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.canto.csr.v1.CsrProto.CSR parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.canto.csr.v1.CsrProto.CSR parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.canto.csr.v1.CsrProto.CSR parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.canto.csr.v1.CsrProto.CSR parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.canto.csr.v1.CsrProto.CSR parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.canto.csr.v1.CsrProto.CSR parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.canto.csr.v1.CsrProto.CSR parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.canto.csr.v1.CsrProto.CSR parseFrom(
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
    public static Builder newBuilder(com.canto.csr.v1.CsrProto.CSR prototype) {
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
     * The CSR struct is a wrapper to all of the metadata associated with a given CST NFT
     * </pre>
     *
     * Protobuf type {@code canto.csr.v1.CSR}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:canto.csr.v1.CSR)
        com.canto.csr.v1.CsrProto.CSROrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.canto.csr.v1.CsrProto.internal_static_canto_csr_v1_CSR_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.canto.csr.v1.CsrProto.internal_static_canto_csr_v1_CSR_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.canto.csr.v1.CsrProto.CSR.class, com.canto.csr.v1.CsrProto.CSR.Builder.class);
      }

      // Construct using com.canto.csr.v1.CsrProto.CSR.newBuilder()
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
        contracts_ =
            com.google.protobuf.LazyStringArrayList.emptyList();
        id_ = 0L;
        txs_ = 0L;
        revenue_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.canto.csr.v1.CsrProto.internal_static_canto_csr_v1_CSR_descriptor;
      }

      @java.lang.Override
      public com.canto.csr.v1.CsrProto.CSR getDefaultInstanceForType() {
        return com.canto.csr.v1.CsrProto.CSR.getDefaultInstance();
      }

      @java.lang.Override
      public com.canto.csr.v1.CsrProto.CSR build() {
        com.canto.csr.v1.CsrProto.CSR result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.canto.csr.v1.CsrProto.CSR buildPartial() {
        com.canto.csr.v1.CsrProto.CSR result = new com.canto.csr.v1.CsrProto.CSR(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.canto.csr.v1.CsrProto.CSR result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          contracts_.makeImmutable();
          result.contracts_ = contracts_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.id_ = id_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.txs_ = txs_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.revenue_ = revenue_;
        }
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.canto.csr.v1.CsrProto.CSR) {
          return mergeFrom((com.canto.csr.v1.CsrProto.CSR)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.canto.csr.v1.CsrProto.CSR other) {
        if (other == com.canto.csr.v1.CsrProto.CSR.getDefaultInstance()) return this;
        if (!other.contracts_.isEmpty()) {
          if (contracts_.isEmpty()) {
            contracts_ = other.contracts_;
            bitField0_ |= 0x00000001;
          } else {
            ensureContractsIsMutable();
            contracts_.addAll(other.contracts_);
          }
          onChanged();
        }
        if (other.getId() != 0L) {
          setId(other.getId());
        }
        if (other.getTxs() != 0L) {
          setTxs(other.getTxs());
        }
        if (!other.getRevenue().isEmpty()) {
          revenue_ = other.revenue_;
          bitField0_ |= 0x00000008;
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
                ensureContractsIsMutable();
                contracts_.add(s);
                break;
              } // case 10
              case 16: {
                id_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                txs_ = input.readUInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 34: {
                revenue_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
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

      private com.google.protobuf.LazyStringArrayList contracts_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      private void ensureContractsIsMutable() {
        if (!contracts_.isModifiable()) {
          contracts_ = new com.google.protobuf.LazyStringArrayList(contracts_);
        }
        bitField0_ |= 0x00000001;
      }
      /**
       * <pre>
       * Contracts is the list of all EVM address that are registered to this NFT
       * </pre>
       *
       * <code>repeated string contracts = 1 [json_name = "contracts"];</code>
       * @return A list containing the contracts.
       */
      public com.google.protobuf.ProtocolStringList
          getContractsList() {
        contracts_.makeImmutable();
        return contracts_;
      }
      /**
       * <pre>
       * Contracts is the list of all EVM address that are registered to this NFT
       * </pre>
       *
       * <code>repeated string contracts = 1 [json_name = "contracts"];</code>
       * @return The count of contracts.
       */
      public int getContractsCount() {
        return contracts_.size();
      }
      /**
       * <pre>
       * Contracts is the list of all EVM address that are registered to this NFT
       * </pre>
       *
       * <code>repeated string contracts = 1 [json_name = "contracts"];</code>
       * @param index The index of the element to return.
       * @return The contracts at the given index.
       */
      public java.lang.String getContracts(int index) {
        return contracts_.get(index);
      }
      /**
       * <pre>
       * Contracts is the list of all EVM address that are registered to this NFT
       * </pre>
       *
       * <code>repeated string contracts = 1 [json_name = "contracts"];</code>
       * @param index The index of the value to return.
       * @return The bytes of the contracts at the given index.
       */
      public com.google.protobuf.ByteString
          getContractsBytes(int index) {
        return contracts_.getByteString(index);
      }
      /**
       * <pre>
       * Contracts is the list of all EVM address that are registered to this NFT
       * </pre>
       *
       * <code>repeated string contracts = 1 [json_name = "contracts"];</code>
       * @param index The index to set the value at.
       * @param value The contracts to set.
       * @return This builder for chaining.
       */
      public Builder setContracts(
          int index, java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureContractsIsMutable();
        contracts_.set(index, value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Contracts is the list of all EVM address that are registered to this NFT
       * </pre>
       *
       * <code>repeated string contracts = 1 [json_name = "contracts"];</code>
       * @param value The contracts to add.
       * @return This builder for chaining.
       */
      public Builder addContracts(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureContractsIsMutable();
        contracts_.add(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Contracts is the list of all EVM address that are registered to this NFT
       * </pre>
       *
       * <code>repeated string contracts = 1 [json_name = "contracts"];</code>
       * @param values The contracts to add.
       * @return This builder for chaining.
       */
      public Builder addAllContracts(
          java.lang.Iterable<java.lang.String> values) {
        ensureContractsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, contracts_);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Contracts is the list of all EVM address that are registered to this NFT
       * </pre>
       *
       * <code>repeated string contracts = 1 [json_name = "contracts"];</code>
       * @return This builder for chaining.
       */
      public Builder clearContracts() {
        contracts_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Contracts is the list of all EVM address that are registered to this NFT
       * </pre>
       *
       * <code>repeated string contracts = 1 [json_name = "contracts"];</code>
       * @param value The bytes of the contracts to add.
       * @return This builder for chaining.
       */
      public Builder addContractsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        ensureContractsIsMutable();
        contracts_.add(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private long id_ ;
      /**
       * <pre>
       * The NFT id which this CSR corresponds to
       * </pre>
       *
       * <code>uint64 id = 2 [json_name = "id"];</code>
       * @return The id.
       */
      @java.lang.Override
      public long getId() {
        return id_;
      }
      /**
       * <pre>
       * The NFT id which this CSR corresponds to
       * </pre>
       *
       * <code>uint64 id = 2 [json_name = "id"];</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(long value) {

        id_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The NFT id which this CSR corresponds to
       * </pre>
       *
       * <code>uint64 id = 2 [json_name = "id"];</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        id_ = 0L;
        onChanged();
        return this;
      }

      private long txs_ ;
      /**
       * <pre>
       * The total number of transactions for this CSR NFT
       * </pre>
       *
       * <code>uint64 txs = 3 [json_name = "txs"];</code>
       * @return The txs.
       */
      @java.lang.Override
      public long getTxs() {
        return txs_;
      }
      /**
       * <pre>
       * The total number of transactions for this CSR NFT
       * </pre>
       *
       * <code>uint64 txs = 3 [json_name = "txs"];</code>
       * @param value The txs to set.
       * @return This builder for chaining.
       */
      public Builder setTxs(long value) {

        txs_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The total number of transactions for this CSR NFT
       * </pre>
       *
       * <code>uint64 txs = 3 [json_name = "txs"];</code>
       * @return This builder for chaining.
       */
      public Builder clearTxs() {
        bitField0_ = (bitField0_ & ~0x00000004);
        txs_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object revenue_ = "";
      /**
       * <pre>
       * The cumulative revenue for this CSR NFT -&gt; represented as a sdk.Int
       * </pre>
       *
       * <code>string revenue = 4 [json_name = "revenue", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @return The revenue.
       */
      public java.lang.String getRevenue() {
        java.lang.Object ref = revenue_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          revenue_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * The cumulative revenue for this CSR NFT -&gt; represented as a sdk.Int
       * </pre>
       *
       * <code>string revenue = 4 [json_name = "revenue", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @return The bytes for revenue.
       */
      public com.google.protobuf.ByteString
          getRevenueBytes() {
        java.lang.Object ref = revenue_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          revenue_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * The cumulative revenue for this CSR NFT -&gt; represented as a sdk.Int
       * </pre>
       *
       * <code>string revenue = 4 [json_name = "revenue", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @param value The revenue to set.
       * @return This builder for chaining.
       */
      public Builder setRevenue(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        revenue_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The cumulative revenue for this CSR NFT -&gt; represented as a sdk.Int
       * </pre>
       *
       * <code>string revenue = 4 [json_name = "revenue", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @return This builder for chaining.
       */
      public Builder clearRevenue() {
        revenue_ = getDefaultInstance().getRevenue();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The cumulative revenue for this CSR NFT -&gt; represented as a sdk.Int
       * </pre>
       *
       * <code>string revenue = 4 [json_name = "revenue", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @param value The bytes for revenue to set.
       * @return This builder for chaining.
       */
      public Builder setRevenueBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        revenue_ = value;
        bitField0_ |= 0x00000008;
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


      // @@protoc_insertion_point(builder_scope:canto.csr.v1.CSR)
    }

    // @@protoc_insertion_point(class_scope:canto.csr.v1.CSR)
    private static final com.canto.csr.v1.CsrProto.CSR DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.canto.csr.v1.CsrProto.CSR();
    }

    public static com.canto.csr.v1.CsrProto.CSR getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CSR>
        PARSER = new com.google.protobuf.AbstractParser<CSR>() {
      @java.lang.Override
      public CSR parsePartialFrom(
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

    public static com.google.protobuf.Parser<CSR> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CSR> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.canto.csr.v1.CsrProto.CSR getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_canto_csr_v1_CSR_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_canto_csr_v1_CSR_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026canto/csr/v1/csr.proto\022\014canto.csr.v1\032\024" +
      "gogoproto/gogo.proto\"\217\001\n\003CSR\022\034\n\tcontract" +
      "s\030\001 \003(\tR\tcontracts\022\016\n\002id\030\002 \001(\004R\002id\022\020\n\003tx" +
      "s\030\003 \001(\004R\003txs\022H\n\007revenue\030\004 \001(\tB.\310\336\037\000\332\336\037&g" +
      "ithub.com/cosmos/cosmos-sdk/types.IntR\007r" +
      "evenueB\233\001\n\020com.canto.csr.v1B\010CsrProtoZ-g" +
      "ithub.com/Canto-Network/Canto/v6/x/csr/t" +
      "ypes\242\002\003CCX\252\002\014Canto.Csr.V1\312\002\014Canto\\Csr\\V1" +
      "\342\002\030Canto\\Csr\\V1\\GPBMetadata\352\002\016Canto::Csr" +
      "::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_canto_csr_v1_CSR_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_canto_csr_v1_CSR_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_canto_csr_v1_CSR_descriptor,
        new java.lang.String[] { "Contracts", "Id", "Txs", "Revenue", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
