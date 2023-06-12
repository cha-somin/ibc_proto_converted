// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/interchainquery/v1/genesis.proto

package com.stride.interchainquery.v1;

/**
 * <pre>
 * GenesisState defines the epochs module's genesis state.
 * </pre>
 *
 * Protobuf type {@code stride.interchainquery.v1.GenesisState}
 */
public final class GenesisState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:stride.interchainquery.v1.GenesisState)
    GenesisStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenesisState.newBuilder() to construct.
  private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenesisState() {
    queries_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenesisState();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.stride.interchainquery.v1.GenesisProto.internal_static_stride_interchainquery_v1_GenesisState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.stride.interchainquery.v1.GenesisProto.internal_static_stride_interchainquery_v1_GenesisState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.stride.interchainquery.v1.GenesisState.class, com.stride.interchainquery.v1.GenesisState.Builder.class);
  }

  public static final int QUERIES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.stride.interchainquery.v1.Query> queries_;
  /**
   * <code>repeated .stride.interchainquery.v1.Query queries = 1 [json_name = "queries", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.stride.interchainquery.v1.Query> getQueriesList() {
    return queries_;
  }
  /**
   * <code>repeated .stride.interchainquery.v1.Query queries = 1 [json_name = "queries", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.stride.interchainquery.v1.QueryOrBuilder> 
      getQueriesOrBuilderList() {
    return queries_;
  }
  /**
   * <code>repeated .stride.interchainquery.v1.Query queries = 1 [json_name = "queries", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getQueriesCount() {
    return queries_.size();
  }
  /**
   * <code>repeated .stride.interchainquery.v1.Query queries = 1 [json_name = "queries", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.stride.interchainquery.v1.Query getQueries(int index) {
    return queries_.get(index);
  }
  /**
   * <code>repeated .stride.interchainquery.v1.Query queries = 1 [json_name = "queries", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.stride.interchainquery.v1.QueryOrBuilder getQueriesOrBuilder(
      int index) {
    return queries_.get(index);
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
    for (int i = 0; i < queries_.size(); i++) {
      output.writeMessage(1, queries_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < queries_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, queries_.get(i));
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
    if (!(obj instanceof com.stride.interchainquery.v1.GenesisState)) {
      return super.equals(obj);
    }
    com.stride.interchainquery.v1.GenesisState other = (com.stride.interchainquery.v1.GenesisState) obj;

    if (!getQueriesList()
        .equals(other.getQueriesList())) return false;
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
    if (getQueriesCount() > 0) {
      hash = (37 * hash) + QUERIES_FIELD_NUMBER;
      hash = (53 * hash) + getQueriesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.stride.interchainquery.v1.GenesisState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stride.interchainquery.v1.GenesisState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stride.interchainquery.v1.GenesisState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stride.interchainquery.v1.GenesisState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stride.interchainquery.v1.GenesisState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stride.interchainquery.v1.GenesisState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stride.interchainquery.v1.GenesisState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stride.interchainquery.v1.GenesisState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.stride.interchainquery.v1.GenesisState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.stride.interchainquery.v1.GenesisState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stride.interchainquery.v1.GenesisState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stride.interchainquery.v1.GenesisState parseFrom(
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
  public static Builder newBuilder(com.stride.interchainquery.v1.GenesisState prototype) {
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
   * GenesisState defines the epochs module's genesis state.
   * </pre>
   *
   * Protobuf type {@code stride.interchainquery.v1.GenesisState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:stride.interchainquery.v1.GenesisState)
      com.stride.interchainquery.v1.GenesisStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stride.interchainquery.v1.GenesisProto.internal_static_stride_interchainquery_v1_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stride.interchainquery.v1.GenesisProto.internal_static_stride_interchainquery_v1_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stride.interchainquery.v1.GenesisState.class, com.stride.interchainquery.v1.GenesisState.Builder.class);
    }

    // Construct using com.stride.interchainquery.v1.GenesisState.newBuilder()
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
      if (queriesBuilder_ == null) {
        queries_ = java.util.Collections.emptyList();
      } else {
        queries_ = null;
        queriesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.stride.interchainquery.v1.GenesisProto.internal_static_stride_interchainquery_v1_GenesisState_descriptor;
    }

    @java.lang.Override
    public com.stride.interchainquery.v1.GenesisState getDefaultInstanceForType() {
      return com.stride.interchainquery.v1.GenesisState.getDefaultInstance();
    }

    @java.lang.Override
    public com.stride.interchainquery.v1.GenesisState build() {
      com.stride.interchainquery.v1.GenesisState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.stride.interchainquery.v1.GenesisState buildPartial() {
      com.stride.interchainquery.v1.GenesisState result = new com.stride.interchainquery.v1.GenesisState(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.stride.interchainquery.v1.GenesisState result) {
      if (queriesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          queries_ = java.util.Collections.unmodifiableList(queries_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.queries_ = queries_;
      } else {
        result.queries_ = queriesBuilder_.build();
      }
    }

    private void buildPartial0(com.stride.interchainquery.v1.GenesisState result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.stride.interchainquery.v1.GenesisState) {
        return mergeFrom((com.stride.interchainquery.v1.GenesisState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.stride.interchainquery.v1.GenesisState other) {
      if (other == com.stride.interchainquery.v1.GenesisState.getDefaultInstance()) return this;
      if (queriesBuilder_ == null) {
        if (!other.queries_.isEmpty()) {
          if (queries_.isEmpty()) {
            queries_ = other.queries_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureQueriesIsMutable();
            queries_.addAll(other.queries_);
          }
          onChanged();
        }
      } else {
        if (!other.queries_.isEmpty()) {
          if (queriesBuilder_.isEmpty()) {
            queriesBuilder_.dispose();
            queriesBuilder_ = null;
            queries_ = other.queries_;
            bitField0_ = (bitField0_ & ~0x00000001);
            queriesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getQueriesFieldBuilder() : null;
          } else {
            queriesBuilder_.addAllMessages(other.queries_);
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
              com.stride.interchainquery.v1.Query m =
                  input.readMessage(
                      com.stride.interchainquery.v1.Query.parser(),
                      extensionRegistry);
              if (queriesBuilder_ == null) {
                ensureQueriesIsMutable();
                queries_.add(m);
              } else {
                queriesBuilder_.addMessage(m);
              }
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

    private java.util.List<com.stride.interchainquery.v1.Query> queries_ =
      java.util.Collections.emptyList();
    private void ensureQueriesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        queries_ = new java.util.ArrayList<com.stride.interchainquery.v1.Query>(queries_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.stride.interchainquery.v1.Query, com.stride.interchainquery.v1.Query.Builder, com.stride.interchainquery.v1.QueryOrBuilder> queriesBuilder_;

    /**
     * <code>repeated .stride.interchainquery.v1.Query queries = 1 [json_name = "queries", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.stride.interchainquery.v1.Query> getQueriesList() {
      if (queriesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(queries_);
      } else {
        return queriesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .stride.interchainquery.v1.Query queries = 1 [json_name = "queries", (.gogoproto.nullable) = false];</code>
     */
    public int getQueriesCount() {
      if (queriesBuilder_ == null) {
        return queries_.size();
      } else {
        return queriesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .stride.interchainquery.v1.Query queries = 1 [json_name = "queries", (.gogoproto.nullable) = false];</code>
     */
    public com.stride.interchainquery.v1.Query getQueries(int index) {
      if (queriesBuilder_ == null) {
        return queries_.get(index);
      } else {
        return queriesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .stride.interchainquery.v1.Query queries = 1 [json_name = "queries", (.gogoproto.nullable) = false];</code>
     */
    public Builder setQueries(
        int index, com.stride.interchainquery.v1.Query value) {
      if (queriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureQueriesIsMutable();
        queries_.set(index, value);
        onChanged();
      } else {
        queriesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .stride.interchainquery.v1.Query queries = 1 [json_name = "queries", (.gogoproto.nullable) = false];</code>
     */
    public Builder setQueries(
        int index, com.stride.interchainquery.v1.Query.Builder builderForValue) {
      if (queriesBuilder_ == null) {
        ensureQueriesIsMutable();
        queries_.set(index, builderForValue.build());
        onChanged();
      } else {
        queriesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .stride.interchainquery.v1.Query queries = 1 [json_name = "queries", (.gogoproto.nullable) = false];</code>
     */
    public Builder addQueries(com.stride.interchainquery.v1.Query value) {
      if (queriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureQueriesIsMutable();
        queries_.add(value);
        onChanged();
      } else {
        queriesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .stride.interchainquery.v1.Query queries = 1 [json_name = "queries", (.gogoproto.nullable) = false];</code>
     */
    public Builder addQueries(
        int index, com.stride.interchainquery.v1.Query value) {
      if (queriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureQueriesIsMutable();
        queries_.add(index, value);
        onChanged();
      } else {
        queriesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .stride.interchainquery.v1.Query queries = 1 [json_name = "queries", (.gogoproto.nullable) = false];</code>
     */
    public Builder addQueries(
        com.stride.interchainquery.v1.Query.Builder builderForValue) {
      if (queriesBuilder_ == null) {
        ensureQueriesIsMutable();
        queries_.add(builderForValue.build());
        onChanged();
      } else {
        queriesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .stride.interchainquery.v1.Query queries = 1 [json_name = "queries", (.gogoproto.nullable) = false];</code>
     */
    public Builder addQueries(
        int index, com.stride.interchainquery.v1.Query.Builder builderForValue) {
      if (queriesBuilder_ == null) {
        ensureQueriesIsMutable();
        queries_.add(index, builderForValue.build());
        onChanged();
      } else {
        queriesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .stride.interchainquery.v1.Query queries = 1 [json_name = "queries", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllQueries(
        java.lang.Iterable<? extends com.stride.interchainquery.v1.Query> values) {
      if (queriesBuilder_ == null) {
        ensureQueriesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, queries_);
        onChanged();
      } else {
        queriesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .stride.interchainquery.v1.Query queries = 1 [json_name = "queries", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearQueries() {
      if (queriesBuilder_ == null) {
        queries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        queriesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .stride.interchainquery.v1.Query queries = 1 [json_name = "queries", (.gogoproto.nullable) = false];</code>
     */
    public Builder removeQueries(int index) {
      if (queriesBuilder_ == null) {
        ensureQueriesIsMutable();
        queries_.remove(index);
        onChanged();
      } else {
        queriesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .stride.interchainquery.v1.Query queries = 1 [json_name = "queries", (.gogoproto.nullable) = false];</code>
     */
    public com.stride.interchainquery.v1.Query.Builder getQueriesBuilder(
        int index) {
      return getQueriesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .stride.interchainquery.v1.Query queries = 1 [json_name = "queries", (.gogoproto.nullable) = false];</code>
     */
    public com.stride.interchainquery.v1.QueryOrBuilder getQueriesOrBuilder(
        int index) {
      if (queriesBuilder_ == null) {
        return queries_.get(index);  } else {
        return queriesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .stride.interchainquery.v1.Query queries = 1 [json_name = "queries", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.stride.interchainquery.v1.QueryOrBuilder> 
         getQueriesOrBuilderList() {
      if (queriesBuilder_ != null) {
        return queriesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(queries_);
      }
    }
    /**
     * <code>repeated .stride.interchainquery.v1.Query queries = 1 [json_name = "queries", (.gogoproto.nullable) = false];</code>
     */
    public com.stride.interchainquery.v1.Query.Builder addQueriesBuilder() {
      return getQueriesFieldBuilder().addBuilder(
          com.stride.interchainquery.v1.Query.getDefaultInstance());
    }
    /**
     * <code>repeated .stride.interchainquery.v1.Query queries = 1 [json_name = "queries", (.gogoproto.nullable) = false];</code>
     */
    public com.stride.interchainquery.v1.Query.Builder addQueriesBuilder(
        int index) {
      return getQueriesFieldBuilder().addBuilder(
          index, com.stride.interchainquery.v1.Query.getDefaultInstance());
    }
    /**
     * <code>repeated .stride.interchainquery.v1.Query queries = 1 [json_name = "queries", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.stride.interchainquery.v1.Query.Builder> 
         getQueriesBuilderList() {
      return getQueriesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.stride.interchainquery.v1.Query, com.stride.interchainquery.v1.Query.Builder, com.stride.interchainquery.v1.QueryOrBuilder> 
        getQueriesFieldBuilder() {
      if (queriesBuilder_ == null) {
        queriesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.stride.interchainquery.v1.Query, com.stride.interchainquery.v1.Query.Builder, com.stride.interchainquery.v1.QueryOrBuilder>(
                queries_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        queries_ = null;
      }
      return queriesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:stride.interchainquery.v1.GenesisState)
  }

  // @@protoc_insertion_point(class_scope:stride.interchainquery.v1.GenesisState)
  private static final com.stride.interchainquery.v1.GenesisState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.stride.interchainquery.v1.GenesisState();
  }

  public static com.stride.interchainquery.v1.GenesisState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenesisState>
      PARSER = new com.google.protobuf.AbstractParser<GenesisState>() {
    @java.lang.Override
    public GenesisState parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenesisState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenesisState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.stride.interchainquery.v1.GenesisState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

