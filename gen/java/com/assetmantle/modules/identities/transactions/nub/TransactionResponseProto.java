// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/identities/transactions/nub/transaction_response.proto

package com.assetmantle.modules.identities.transactions.nub;

public final class TransactionResponseProto {
  private TransactionResponseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TransactionResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:assetmantle.modules.identities.transactions.nub.TransactionResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.assetmantle.schema.ids.base.IdentityID nub_i_d = 1 [json_name = "nubID"];</code>
     * @return Whether the nubID field is set.
     */
    boolean hasNubID();
    /**
     * <code>.assetmantle.schema.ids.base.IdentityID nub_i_d = 1 [json_name = "nubID"];</code>
     * @return The nubID.
     */
    com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID getNubID();
    /**
     * <code>.assetmantle.schema.ids.base.IdentityID nub_i_d = 1 [json_name = "nubID"];</code>
     */
    com.assetmantle.schema.ids.base.IdentityIdProto.IdentityIDOrBuilder getNubIDOrBuilder();
  }
  /**
   * Protobuf type {@code assetmantle.modules.identities.transactions.nub.TransactionResponse}
   */
  public static final class TransactionResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:assetmantle.modules.identities.transactions.nub.TransactionResponse)
      TransactionResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TransactionResponse.newBuilder() to construct.
    private TransactionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TransactionResponse() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TransactionResponse();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.internal_static_assetmantle_modules_identities_transactions_nub_TransactionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.internal_static_assetmantle_modules_identities_transactions_nub_TransactionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse.class, com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse.Builder.class);
    }

    public static final int NUB_I_D_FIELD_NUMBER = 1;
    private com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID nubID_;
    /**
     * <code>.assetmantle.schema.ids.base.IdentityID nub_i_d = 1 [json_name = "nubID"];</code>
     * @return Whether the nubID field is set.
     */
    @java.lang.Override
    public boolean hasNubID() {
      return nubID_ != null;
    }
    /**
     * <code>.assetmantle.schema.ids.base.IdentityID nub_i_d = 1 [json_name = "nubID"];</code>
     * @return The nubID.
     */
    @java.lang.Override
    public com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID getNubID() {
      return nubID_ == null ? com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID.getDefaultInstance() : nubID_;
    }
    /**
     * <code>.assetmantle.schema.ids.base.IdentityID nub_i_d = 1 [json_name = "nubID"];</code>
     */
    @java.lang.Override
    public com.assetmantle.schema.ids.base.IdentityIdProto.IdentityIDOrBuilder getNubIDOrBuilder() {
      return nubID_ == null ? com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID.getDefaultInstance() : nubID_;
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
      if (nubID_ != null) {
        output.writeMessage(1, getNubID());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (nubID_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getNubID());
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
      if (!(obj instanceof com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse)) {
        return super.equals(obj);
      }
      com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse other = (com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse) obj;

      if (hasNubID() != other.hasNubID()) return false;
      if (hasNubID()) {
        if (!getNubID()
            .equals(other.getNubID())) return false;
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
      if (hasNubID()) {
        hash = (37 * hash) + NUB_I_D_FIELD_NUMBER;
        hash = (53 * hash) + getNubID().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse parseFrom(
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
    public static Builder newBuilder(com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse prototype) {
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
     * Protobuf type {@code assetmantle.modules.identities.transactions.nub.TransactionResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:assetmantle.modules.identities.transactions.nub.TransactionResponse)
        com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.internal_static_assetmantle_modules_identities_transactions_nub_TransactionResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.internal_static_assetmantle_modules_identities_transactions_nub_TransactionResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse.class, com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse.Builder.class);
      }

      // Construct using com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse.newBuilder()
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
        nubID_ = null;
        if (nubIDBuilder_ != null) {
          nubIDBuilder_.dispose();
          nubIDBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.internal_static_assetmantle_modules_identities_transactions_nub_TransactionResponse_descriptor;
      }

      @java.lang.Override
      public com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse getDefaultInstanceForType() {
        return com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse.getDefaultInstance();
      }

      @java.lang.Override
      public com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse build() {
        com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse buildPartial() {
        com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse result = new com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.nubID_ = nubIDBuilder_ == null
              ? nubID_
              : nubIDBuilder_.build();
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
        if (other instanceof com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse) {
          return mergeFrom((com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse other) {
        if (other == com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse.getDefaultInstance()) return this;
        if (other.hasNubID()) {
          mergeNubID(other.getNubID());
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
                    getNubIDFieldBuilder().getBuilder(),
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

      private com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID nubID_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID, com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID.Builder, com.assetmantle.schema.ids.base.IdentityIdProto.IdentityIDOrBuilder> nubIDBuilder_;
      /**
       * <code>.assetmantle.schema.ids.base.IdentityID nub_i_d = 1 [json_name = "nubID"];</code>
       * @return Whether the nubID field is set.
       */
      public boolean hasNubID() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.assetmantle.schema.ids.base.IdentityID nub_i_d = 1 [json_name = "nubID"];</code>
       * @return The nubID.
       */
      public com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID getNubID() {
        if (nubIDBuilder_ == null) {
          return nubID_ == null ? com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID.getDefaultInstance() : nubID_;
        } else {
          return nubIDBuilder_.getMessage();
        }
      }
      /**
       * <code>.assetmantle.schema.ids.base.IdentityID nub_i_d = 1 [json_name = "nubID"];</code>
       */
      public Builder setNubID(com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID value) {
        if (nubIDBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          nubID_ = value;
        } else {
          nubIDBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.ids.base.IdentityID nub_i_d = 1 [json_name = "nubID"];</code>
       */
      public Builder setNubID(
          com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID.Builder builderForValue) {
        if (nubIDBuilder_ == null) {
          nubID_ = builderForValue.build();
        } else {
          nubIDBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.ids.base.IdentityID nub_i_d = 1 [json_name = "nubID"];</code>
       */
      public Builder mergeNubID(com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID value) {
        if (nubIDBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            nubID_ != null &&
            nubID_ != com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID.getDefaultInstance()) {
            getNubIDBuilder().mergeFrom(value);
          } else {
            nubID_ = value;
          }
        } else {
          nubIDBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.ids.base.IdentityID nub_i_d = 1 [json_name = "nubID"];</code>
       */
      public Builder clearNubID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        nubID_ = null;
        if (nubIDBuilder_ != null) {
          nubIDBuilder_.dispose();
          nubIDBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.ids.base.IdentityID nub_i_d = 1 [json_name = "nubID"];</code>
       */
      public com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID.Builder getNubIDBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getNubIDFieldBuilder().getBuilder();
      }
      /**
       * <code>.assetmantle.schema.ids.base.IdentityID nub_i_d = 1 [json_name = "nubID"];</code>
       */
      public com.assetmantle.schema.ids.base.IdentityIdProto.IdentityIDOrBuilder getNubIDOrBuilder() {
        if (nubIDBuilder_ != null) {
          return nubIDBuilder_.getMessageOrBuilder();
        } else {
          return nubID_ == null ?
              com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID.getDefaultInstance() : nubID_;
        }
      }
      /**
       * <code>.assetmantle.schema.ids.base.IdentityID nub_i_d = 1 [json_name = "nubID"];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID, com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID.Builder, com.assetmantle.schema.ids.base.IdentityIdProto.IdentityIDOrBuilder> 
          getNubIDFieldBuilder() {
        if (nubIDBuilder_ == null) {
          nubIDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID, com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID.Builder, com.assetmantle.schema.ids.base.IdentityIdProto.IdentityIDOrBuilder>(
                  getNubID(),
                  getParentForChildren(),
                  isClean());
          nubID_ = null;
        }
        return nubIDBuilder_;
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


      // @@protoc_insertion_point(builder_scope:assetmantle.modules.identities.transactions.nub.TransactionResponse)
    }

    // @@protoc_insertion_point(class_scope:assetmantle.modules.identities.transactions.nub.TransactionResponse)
    private static final com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse();
    }

    public static com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TransactionResponse>
        PARSER = new com.google.protobuf.AbstractParser<TransactionResponse>() {
      @java.lang.Override
      public TransactionResponse parsePartialFrom(
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

    public static com.google.protobuf.Parser<TransactionResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TransactionResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.TransactionResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_modules_identities_transactions_nub_TransactionResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_modules_identities_transactions_nub_TransactionResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBassetmantle/identities/transactions/nu" +
      "b/transaction_response.proto\022/assetmantl" +
      "e.modules.identities.transactions.nub\032&a" +
      "ssetmantle/ids/base/identity_id.proto\"V\n" +
      "\023TransactionResponse\022?\n\007nub_i_d\030\001 \001(\0132\'." +
      "assetmantle.schema.ids.base.IdentityIDR\005" +
      "nubIDB\257\002\n3com.assetmantle.modules.identi" +
      "ties.transactions.nubB\030TransactionRespon" +
      "seProto\242\002\005AMITN\252\002/Assetmantle.Modules.Id" +
      "entities.Transactions.Nub\312\002/Assetmantle\\" +
      "Modules\\Identities\\Transactions\\Nub\342\002;As" +
      "setmantle\\Modules\\Identities\\Transaction" +
      "s\\Nub\\GPBMetadata\352\0023Assetmantle::Modules" +
      "::Identities::Transactions::Nubb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.assetmantle.schema.ids.base.IdentityIdProto.getDescriptor(),
        });
    internal_static_assetmantle_modules_identities_transactions_nub_TransactionResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_modules_identities_transactions_nub_TransactionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_modules_identities_transactions_nub_TransactionResponse_descriptor,
        new java.lang.String[] { "NubID", });
    com.assetmantle.schema.ids.base.IdentityIdProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
